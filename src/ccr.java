import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class ccr extends cbz implements cbr, cdd {
   private static final afz<Boolean> d = agc.a(ccr.class, agb.k);
   private static final int e = 40;
   private static final int bT = 1;
   private static final float bU = 0.6F;
   private static final int bV = 6;
   private static final float bW = 0.5F;
   private static final int bX = 40;
   private static final int bY = 15;
   private static final int bZ = 200;
   private static final float ca = 0.3F;
   private static final float cb = 0.4F;
   private int cc;
   protected static final ImmutableList<? extends bwd<? extends bwc<? super ccr>>> b = ImmutableList.of(bwd.c, bwd.d);
   protected static final ImmutableList<? extends bux<?>> c = ImmutableList.of(bux.g, bux.h, bux.k, bux.l, bux.n, bux.m, bux.E, bux.t, bux.o, bux.p);

   public ccr(blj<? extends ccr> $$0, csy $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bmv.b<ccr> dP() {
      return bmv.a(c, b);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      bmv<ccr> $$1 = this.dP().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cgd.a));
      $$1.b(cgd.b);
      $$1.f();
      return $$1;
   }

   private static void a(bmv<ccr> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bos(45, 90), new bow()));
   }

   private static void b(bmv<ccr> $$0) {
      $$0.a(
         cgd.b,
         10,
         ImmutableList.of(
            bpy.a(ccr::gg),
            bpm.a(8.0F, biw.a(30, 60)),
            new bpj(ImmutableList.of(Pair.of(bpe.a(0.4F), 2), Pair.of(bpt.a(0.4F, 3), 2), Pair.of(new bnw(30, 60), 1)))
         )
      );
   }

   private static void c(bmv<ccr> $$0) {
      $$0.a(cgd.k, 10, ImmutableList.of(bpr.a(1.0F), bqz.a(ccr::w, bot.a(40)), bqz.a(ccr::o_, bot.a(15)), bqb.a()), bux.o);
   }

   private Optional<? extends blv> gg() {
      return this.dO().c(bux.h).orElse(buz.a()).a(this::j);
   }

   private boolean j(blv $$0) {
      blj<?> $$1 = $$0.ai();
      return $$1 != blj.bq && $$1 != blj.v && bwc.c(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, false);
   }

   @Override
   public void a(afz<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.k_();
      }
   }

   public static bna.a u() {
      return cbz.gk().a(bnb.l, 40.0).a(bnb.m, 0.3F).a(bnb.i, 0.6F).a(bnb.d, 1.0).a(bnb.c, 6.0);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   public boolean C(blf $$0) {
      if (!($$0 instanceof blv)) {
         return false;
      } else {
         this.cc = 10;
         this.dM().a(this, (byte)4);
         this.a(arc.BY, 1.0F, this.eX());
         return cdd.a(this, (blv)$$0);
      }
   }

   @Override
   public boolean a(cer $$0) {
      return !this.fS();
   }

   @Override
   protected void e(blv $$0) {
      if (!this.o_()) {
         cdd.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof blv) {
         blv $$3 = (blv)$$0.d();
         if (this.c($$3) && !bno.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(blv $$0) {
      this.bz.b(bux.E);
      this.bz.a(bux.o, $$0, 200L);
   }

   @Override
   public bmv<ccr> dO() {
      return (bmv<ccr>)super.dO();
   }

   protected void A() {
      cgd $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cgd.k, cgd.b));
      cgd $$1 = this.bz.g().orElse(null);
      if ($$1 == cgd.k && $$0 != cgd.k) {
         this.gf();
      }

      this.v(this.bz.a(bux.o));
   }

   @Override
   protected void Z() {
      this.dM().ae().a("zoglinBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().c();
      this.A();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (!this.dM().B && $$0) {
         this.a(bnb.c).a(0.5);
      }
   }

   @Override
   public boolean o_() {
      return this.an().b(d);
   }

   @Override
   public void d_() {
      if (this.cc > 0) {
         this.cc--;
      }

      super.d_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cc = 10;
         this.a(arc.BY, 1.0F, this.eX());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ge() {
      return this.cc;
   }

   @Override
   protected arb y() {
      if (this.dM().B) {
         return null;
      } else {
         return this.bz.a(bux.o) ? arc.BX : arc.BW;
      }
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.Ca;
   }

   @Override
   protected arb n_() {
      return arc.BZ;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.Cb, 0.15F, 1.0F);
   }

   protected void gf() {
      this.a(arc.BX, 1.0F, this.eX());
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
   }

   @Override
   public bma eS() {
      return bma.b;
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
