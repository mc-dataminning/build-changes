import java.util.List;
import java.util.function.Predicate;

public class byr extends bxv {
   private static final agm<Integer> e = agp.a(byr.class, ago.b);
   int bT;
   int bU;
   private static final Predicate<bml> bV = $$0 -> $$0 instanceof cfi && ((cfi)$$0).f() ? false : $$0.ai() == blz.f || $$0.eS() != bmq.e;
   static final bwz bW = bwz.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public byr(blz<? extends byr> $$0, ctp $$1) {
      super($$0, $$1);
      this.k_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, 0);
   }

   public int gg() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public void a(agm<?> $$0) {
      if (e.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gg());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cmy b() {
      return new cmy(cnb.qC);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new byr.a(this));
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bx() && this.cY()) {
         if (this.bT > 0) {
            if (this.gg() == 0) {
               this.a(ars.tU, this.eW(), this.eX());
               this.c(1);
            } else if (this.bT > 40 && this.gg() == 1) {
               this.a(ars.tU, this.eW(), this.eX());
               this.c(2);
            }

            this.bT++;
         } else if (this.gg() != 0) {
            if (this.bU > 60 && this.gg() == 2) {
               this.a(ars.tT, this.eW(), this.eX());
               this.c(1);
            } else if (this.bU > 100 && this.gg() == 1) {
               this.a(ars.tT, this.eW(), this.eX());
               this.c(0);
            }

            this.bU++;
         }
      }

      super.l();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.gg() > 0) {
         for (bmn $$1 : this.dM().a(bmn.class, this.cH().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bx()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bmn $$0) {
      int $$1 = this.gg();
      if ($$0.a(this.dN().b((bml)this), (float)(1 + $$1))) {
         $$0.b(new bli(blk.s, 60 * $$1, 0), this);
         this.a(ars.tY, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cfi $$0) {
      int $$1 = this.gg();
      if ($$0 instanceof ane && $$1 > 0 && $$0.a(this.dN().b((bml)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((ane)$$0).c.b(new aaf(aaf.j, 0.0F));
         }

         $$0.b(new bli(blk.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected arr y() {
      return ars.tS;
   }

   @Override
   protected arr n_() {
      return ars.tV;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.tX;
   }

   @Override
   protected arr gf() {
      return ars.tW;
   }

   @Override
   public blw a(bmx $$0) {
      return super.a($$0).a(s(this.gg()));
   }

   private static float s(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends bth {
      private final byr a;

      public a(byr $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bml> $$0 = this.a.dM().a(bml.class, this.a.cH().g(2.0), $$0x -> byr.bW.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bT = 1;
         this.a.bU = 0;
      }

      @Override
      public void d() {
         this.a.bT = 0;
      }
   }
}
