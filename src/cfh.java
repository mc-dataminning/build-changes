import java.util.List;
import java.util.function.Predicate;

public class cfh extends cel {
   private static final ajp<Integer> e = ajt.a(cfh.class, ajr.b);
   int ca;
   int cb;
   private static final Predicate<bsy> cc = $$0 -> {
      if ($$0 instanceof cmh $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ak().a(avy.A);
   };
   static final cdp cd = cdp.b().e().d().a(cc);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cfh(bsj<? extends cfh> $$0, dcd $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gp() {
      return this.ao.a(e);
   }

   public void c(int $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gp());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cua b() {
      return new cua(cud.qF);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(1, new cfh.a(this));
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && this.db()) {
         if (this.ca > 0) {
            if (this.gp() == 0) {
               this.b(avf.uR);
               this.c(1);
            } else if (this.ca > 40 && this.gp() == 1) {
               this.b(avf.uR);
               this.c(2);
            }

            this.ca++;
         } else if (this.gp() != 0) {
            if (this.cb > 60 && this.gp() == 2) {
               this.b(avf.uQ);
               this.c(1);
            } else if (this.cb > 100 && this.gp() == 1) {
               this.b(avf.uQ);
               this.c(0);
            }

            this.cb++;
         }
      }

      super.l();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bD() && this.gp() > 0) {
         for (bta $$1 : this.dP().a(bta.class, this.cK().g(0.3), $$0 -> cd.a(this, $$0))) {
            if ($$1.bD()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bta $$0) {
      int $$1 = this.gp();
      if ($$0.a(this.dQ().b((bsy)this), (float)(1 + $$1))) {
         $$0.b(new brl(brn.s, 60 * $$1, 0), this);
         this.a(avf.uV, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cmh $$0) {
      int $$1 = this.gp();
      if ($$0 instanceof aql && $$1 > 0 && $$0.a(this.dQ().b((bsy)this), (float)(1 + $$1))) {
         if (!this.aW()) {
            ((aql)$$0).c.b(new acu(acu.k, 0.0F));
         }

         $$0.b(new brl(brn.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected ave v() {
      return avf.uP;
   }

   @Override
   protected ave o_() {
      return avf.uS;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.uU;
   }

   @Override
   protected ave go() {
      return avf.uT;
   }

   @Override
   public bsg e(btk $$0) {
      return super.e($$0).a(s(this.gp()));
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

   static class a extends bzw {
      private final cfh a;

      public a(cfh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bsy> $$0 = this.a.dP().a(bsy.class, this.a.cK().g(2.0), $$0x -> cfh.cd.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.ca = 1;
         this.a.cb = 0;
      }

      @Override
      public void d() {
         this.a.ca = 0;
      }
   }
}
