import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class cbd extends cal implements cad, cbj {
   private static final afc<Boolean> d = aff.a(cbd.class, afe.k);
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
   protected static final ImmutableList<? extends bup<? extends buo<? super cbd>>> b = ImmutableList.of(bup.c, bup.d);
   protected static final ImmutableList<? extends btk<?>> c = ImmutableList.of(btk.g, btk.h, btk.k, btk.l, btk.n, btk.m, btk.E, btk.t, btk.o, btk.p);

   public cbd(bjx<? extends cbd> $$0, cqz $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected blj.b<cbd> dO() {
      return blj.a(c, b);
   }

   @Override
   protected blj<?> a(Dynamic<?> $$0) {
      blj<cbd> $$1 = this.dO().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cei.a));
      $$1.b(cei.b);
      $$1.f();
      return $$1;
   }

   private static void a(blj<cbd> $$0) {
      $$0.a(cei.a, 0, ImmutableList.of(new bnf(45, 90), new bnj()));
   }

   private static void b(blj<cbd> $$0) {
      $$0.a(
         cei.b,
         10,
         ImmutableList.of(
            bol.a(cbd::gg),
            bnz.a(8.0F, bhm.a(30, 60)),
            new bnw(ImmutableList.of(Pair.of(bnr.a(0.4F), 2), Pair.of(bog.a(0.4F, 3), 2), Pair.of(new bmk(30, 60), 1)))
         )
      );
   }

   private static void c(blj<cbd> $$0) {
      $$0.a(cei.k, 10, ImmutableList.of(boe.a(1.0F), bpm.a(cbd::t, bng.a(40)), bpm.a(cbd::n_, bng.a(15)), boo.a()), btk.o);
   }

   private Optional<? extends bkj> gg() {
      return this.dN().c(btk.h).orElse(btm.a()).a(this::j);
   }

   private boolean j(bkj $$0) {
      bjx<?> $$1 = $$0.ag();
      return $$1 != bjx.bo && $$1 != bjx.u && buo.c(this, $$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, false);
   }

   @Override
   public void a(afc<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static blo.a s() {
      return cal.gk().a(blp.l, 40.0).a(blp.m, 0.3F).a(blp.i, 0.6F).a(blp.d, 1.0).a(blp.c, 6.0);
   }

   public boolean t() {
      return !this.n_();
   }

   @Override
   public boolean C(bjt $$0) {
      if (!($$0 instanceof bkj)) {
         return false;
      } else {
         this.cc = 10;
         this.dL().a(this, (byte)4);
         this.a(aqd.AZ, 1.0F, this.eW());
         return cbj.a(this, (bkj)$$0);
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return !this.fS();
   }

   @Override
   protected void e(bkj $$0) {
      if (!this.n_()) {
         cbj.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bkj) {
         bkj $$3 = (bkj)$$0.d();
         if (this.c($$3) && !bmc.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bkj $$0) {
      this.bz.b(btk.E);
      this.bz.a(btk.o, $$0, 200L);
   }

   @Override
   public blj<cbd> dN() {
      return (blj<cbd>)super.dN();
   }

   protected void y() {
      cei $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cei.k, cei.b));
      cei $$1 = this.bz.g().orElse(null);
      if ($$1 == cei.k && $$0 != cei.k) {
         this.gf();
      }

      this.v(this.bz.a(btk.o));
   }

   @Override
   protected void X() {
      this.dL().ad().a("zoglinBrain");
      this.dN().a((alq)this.dL(), this);
      this.dL().ad().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (!this.dL().B && $$0) {
         this.a(blp.c).a(0.5);
      }
   }

   @Override
   public boolean n_() {
      return this.al().b(d);
   }

   @Override
   public void c_() {
      if (this.cc > 0) {
         this.cc--;
      }

      super.c_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cc = 10;
         this.a(aqd.AZ, 1.0F, this.eW());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ge() {
      return this.cc;
   }

   @Override
   protected aqc w() {
      if (this.dL().B) {
         return null;
      } else {
         return this.bz.a(btk.o) ? aqd.AY : aqd.AX;
      }
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.Bb;
   }

   @Override
   protected aqc m_() {
      return aqd.Ba;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.Bc, 0.15F, 1.0F);
   }

   protected void gf() {
      this.a(aqd.AY, 1.0F, this.eW());
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
   }

   @Override
   public bko eR() {
      return bko.b;
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
