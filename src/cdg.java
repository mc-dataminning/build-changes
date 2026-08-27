import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class cdg extends cco implements ccg, cdt {
   private static final agm<Boolean> d = agp.a(cdg.class, ago.k);
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
   protected static final ImmutableList<? extends bws<? extends bwr<? super cdg>>> b = ImmutableList.of(bws.c, bws.d);
   protected static final ImmutableList<? extends bvm<?>> c = ImmutableList.of(bvm.g, bvm.h, bvm.k, bvm.l, bvm.n, bvm.m, bvm.E, bvm.t, bvm.o, bvm.p);

   public cdg(bly<? extends cdg> $$0, cto $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bnk.b<cdg> dP() {
      return bnk.a(c, b);
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      bnk<cdg> $$1 = this.dP().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cgt.a));
      $$1.b(cgt.b);
      $$1.f();
      return $$1;
   }

   private static void a(bnk<cdg> $$0) {
      $$0.a(cgt.a, 0, ImmutableList.of(new bph(45, 90), new bpl()));
   }

   private static void b(bnk<cdg> $$0) {
      $$0.a(
         cgt.b,
         10,
         ImmutableList.of(
            bqn.a(cdg::gg),
            bqb.a(8.0F, bjl.a(30, 60)),
            new bpy(ImmutableList.of(Pair.of(bpt.a(0.4F), 2), Pair.of(bqi.a(0.4F, 3), 2), Pair.of(new bol(30, 60), 1)))
         )
      );
   }

   private static void c(bnk<cdg> $$0) {
      $$0.a(cgt.k, 10, ImmutableList.of(bqg.a(1.0F), bro.a(cdg::w, bpi.a(40)), bro.a(cdg::o_, bpi.a(15)), bqq.a()), bvm.o);
   }

   private Optional<? extends bmk> gg() {
      return this.dO().c(bvm.h).orElse(bvo.a()).a(this::j);
   }

   private boolean j(bmk $$0) {
      bly<?> $$1 = $$0.ai();
      return $$1 != bly.bq && $$1 != bly.v && bwr.c(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, false);
   }

   @Override
   public void a(agm<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.k_();
      }
   }

   public static bnp.a u() {
      return cco.gk().a(bnq.l, 40.0).a(bnq.m, 0.3F).a(bnq.i, 0.6F).a(bnq.d, 1.0).a(bnq.c, 6.0);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   public boolean C(blu $$0) {
      if (!($$0 instanceof bmk)) {
         return false;
      } else {
         this.cc = 10;
         this.dM().a(this, (byte)4);
         this.a(arr.BY, 1.0F, this.eX());
         return cdt.a(this, (bmk)$$0);
      }
   }

   @Override
   public boolean a(cfh $$0) {
      return !this.fS();
   }

   @Override
   protected void e(bmk $$0) {
      if (!this.o_()) {
         cdt.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bmk) {
         bmk $$3 = (bmk)$$0.d();
         if (this.c($$3) && !bod.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bmk $$0) {
      this.bz.b(bvm.E);
      this.bz.a(bvm.o, $$0, 200L);
   }

   @Override
   public bnk<cdg> dO() {
      return (bnk<cdg>)super.dO();
   }

   protected void A() {
      cgt $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cgt.k, cgt.b));
      cgt $$1 = this.bz.g().orElse(null);
      if ($$1 == cgt.k && $$0 != cgt.k) {
         this.gf();
      }

      this.v(this.bz.a(bvm.o));
   }

   @Override
   protected void Z() {
      this.dM().af().a("zoglinBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      this.A();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (!this.dM().B && $$0) {
         this.a(bnq.c).a(0.5);
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
         this.a(arr.BY, 1.0F, this.eX());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ge() {
      return this.cc;
   }

   @Override
   protected arq y() {
      if (this.dM().B) {
         return null;
      } else {
         return this.bz.a(bvm.o) ? arr.BX : arr.BW;
      }
   }

   @Override
   protected arq d(bks $$0) {
      return arr.Ca;
   }

   @Override
   protected arq n_() {
      return arr.BZ;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.Cb, 0.15F, 1.0F);
   }

   protected void gf() {
      this.a(arr.BX, 1.0F, this.eX());
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public bmp eS() {
      return bmp.b;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
