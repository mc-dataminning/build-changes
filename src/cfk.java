import java.util.List;
import java.util.function.Predicate;

public class cfk extends ceo {
   private static final ajp<Integer> e = ajt.a(cfk.class, ajr.b);
   int ca;
   int cb;
   private static final Predicate<btb> cc = $$0 -> {
      if ($$0 instanceof cmk $$1 && $$1.f()) {
         return false;
      }

      return !$$0.al().a(awa.A);
   };
   static final cds cd = cds.b().e().d().a(cc);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cfk(bsm<? extends cfk> $$0, dcf $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gq() {
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
      $$0.a("PuffState", this.gq());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cuc b() {
      return new cuc(cuf.qF);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(1, new cfk.a(this));
   }

   @Override
   public void l() {
      if (!this.dQ().B && this.bE() && this.dc()) {
         if (this.ca > 0) {
            if (this.gq() == 0) {
               this.b(avh.uR);
               this.c(1);
            } else if (this.ca > 40 && this.gq() == 1) {
               this.b(avh.uR);
               this.c(2);
            }

            this.ca++;
         } else if (this.gq() != 0) {
            if (this.cb > 60 && this.gq() == 2) {
               this.b(avh.uQ);
               this.c(1);
            } else if (this.cb > 100 && this.gq() == 1) {
               this.b(avh.uQ);
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
      if (this.bE() && this.gq() > 0) {
         for (btd $$1 : this.dQ().a(btd.class, this.cL().g(0.3), $$0 -> cd.a(this, $$0))) {
            if ($$1.bE()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(btd $$0) {
      int $$1 = this.gq();
      if ($$0.a(this.dR().b((btb)this), (float)(1 + $$1))) {
         $$0.b(new bro(brq.s, 60 * $$1, 0), this);
         this.a(avh.uV, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cmk $$0) {
      int $$1 = this.gq();
      if ($$0 instanceof aqn && $$1 > 0 && $$0.a(this.dR().b((btb)this), (float)(1 + $$1))) {
         if (!this.aX()) {
            ((aqn)$$0).c.b(new acu(acu.k, 0.0F));
         }

         $$0.b(new bro(brq.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avg v() {
      return avh.uP;
   }

   @Override
   protected avg o_() {
      return avh.uS;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.uU;
   }

   @Override
   protected avg gp() {
      return avh.uT;
   }

   @Override
   public bsj e(btn $$0) {
      return super.e($$0).a(s(this.gq()));
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

   static class a extends bzz {
      private final cfk a;

      public a(cfk $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<btb> $$0 = this.a.dQ().a(btb.class, this.a.cL().g(2.0), $$0x -> cfk.cd.a(this.a, $$0x));
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
