import java.util.List;
import java.util.function.Predicate;

public class cei extends cdm {
   private static final ajm<Integer> e = ajq.a(cei.class, ajo.b);
   int bY;
   int bZ;
   private static final Predicate<bsa> ca = $$0 -> {
      if ($$0 instanceof clh $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ai().a(avu.A);
   };
   static final ccq cb = ccq.b().e().d().a(ca);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cei(brn<? extends cei> $$0, dad $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gr() {
      return this.ao.a(e);
   }

   public void c(int $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   public void a(ajm<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gr());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public csz b() {
      return new csz(ctc.qF);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cei.a(this));
   }

   @Override
   public void l() {
      if (!this.dN().B && this.bB() && this.cZ()) {
         if (this.bY > 0) {
            if (this.gr() == 0) {
               this.b(avc.uD);
               this.c(1);
            } else if (this.bY > 40 && this.gr() == 1) {
               this.b(avc.uD);
               this.c(2);
            }

            this.bY++;
         } else if (this.gr() != 0) {
            if (this.bZ > 60 && this.gr() == 2) {
               this.b(avc.uC);
               this.c(1);
            } else if (this.bZ > 100 && this.gr() == 1) {
               this.b(avc.uC);
               this.c(0);
            }

            this.bZ++;
         }
      }

      super.l();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bB() && this.gr() > 0) {
         for (bsc $$1 : this.dN().a(bsc.class, this.cI().g(0.3), $$0 -> cb.a(this, $$0))) {
            if ($$1.bB()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bsc $$0) {
      int $$1 = this.gr();
      if ($$0.a(this.dO().b((bsa)this), (float)(1 + $$1))) {
         $$0.b(new bqt(bqv.s, 60 * $$1, 0), this);
         this.a(avc.uH, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(clh $$0) {
      int $$1 = this.gr();
      if ($$0 instanceof aqi && $$1 > 0 && $$0.a(this.dO().b((bsa)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((aqi)$$0).d.b(new act(act.k, 0.0F));
         }

         $$0.b(new bqt(bqv.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avb v() {
      return avc.uB;
   }

   @Override
   protected avb o_() {
      return avc.uE;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.uG;
   }

   @Override
   protected avb gq() {
      return avc.uF;
   }

   @Override
   public brk e(bsl $$0) {
      return super.e($$0).a(t(this.gr()));
   }

   private static float t(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends byx {
      private final cei a;

      public a(cei $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bsa> $$0 = this.a.dN().a(bsa.class, this.a.cI().g(2.0), $$0x -> cei.cb.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bY = 1;
         this.a.bZ = 0;
      }

      @Override
      public void d() {
         this.a.bY = 0;
      }
   }
}
