import java.util.List;

public class chr extends cgu {
   private static final akm<Integer> bY = akq.a(chr.class, ako.b);
   int bZ;
   int ca;
   private static final cfy.a cb = ($$0, $$1) -> {
      if ($$0 instanceof cou $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(axg.A);
   };
   static final cfy cc = cfy.b().e().d().a(cb);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public chr(bus<? extends chr> $$0, dfm $$1) {
      super($$0, $$1);
      this.l_();
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   public int go() {
      return this.al.a(bY);
   }

   public void b(int $$0) {
      this.al.a(bY, $$0);
   }

   @Override
   public void a(akm<?> $$0) {
      if (bY.equals($$0)) {
         this.l_();
      }

      super.a($$0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("PuffState", this.go());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cwm V_() {
      return new cwm(cwq.qG);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(1, new chr.a(this));
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bL() && this.dj()) {
         if (this.bZ > 0) {
            if (this.go() == 0) {
               this.b(awn.uQ);
               this.b(1);
            } else if (this.bZ > 40 && this.go() == 1) {
               this.b(awn.uQ);
               this.b(2);
            }

            this.bZ++;
         } else if (this.go() != 0) {
            if (this.ca > 60 && this.go() == 2) {
               this.b(awn.uP);
               this.b(1);
            } else if (this.ca > 100 && this.go() == 1) {
               this.b(awn.uP);
               this.b(0);
            }

            this.ca++;
         }
      }

      super.h();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dV() instanceof arp $$0 && this.bL() && this.go() > 0) {
         for (bvj $$2 : this.dV().a(bvj.class, this.cR().g(0.3), $$1 -> cc.a($$0, this, $$1))) {
            if ($$2.bL()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(arp $$0, bvj $$1) {
      int $$2 = this.go();
      if ($$1.a($$0, this.dW().b((bvh)this), (float)(1 + $$2))) {
         $$1.b(new btq(bts.s, 60 * $$2, 0), this);
         this.a(awn.uU, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(cou $$0) {
      int $$1 = this.go();
      if ($$0 instanceof arq $$2 && $$1 > 0 && $$0.a($$2.y(), this.dW().b((bvh)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new adm(adm.k, 0.0F));
         }

         $$0.b(new btq(bts.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awm t() {
      return awn.uO;
   }

   @Override
   protected awm n_() {
      return awn.uR;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.uT;
   }

   @Override
   protected awm gn() {
      return awn.uS;
   }

   @Override
   public buo e(bvt $$0) {
      return super.e($$0).a(c(this.go()));
   }

   private static float c(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends ccf {
      private final chr a;

      public a(chr $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bvh> $$0 = this.a.dV().a(bvh.class, this.a.cR().g(2.0), $$0x -> chr.cc.a(a(this.a), this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.bZ = 1;
         this.a.ca = 0;
      }

      @Override
      public void e() {
         this.a.bZ = 0;
      }
   }
}
