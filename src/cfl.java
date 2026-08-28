import java.util.List;
import java.util.function.Predicate;

public class cfl extends cep {
   private static final ajp<Integer> e = ajt.a(cfl.class, ajr.b);
   int ca;
   int cb;
   private static final Predicate<btc> cc = $$0 -> {
      if ($$0 instanceof cml $$1 && $$1.f()) {
         return false;
      }

      return !$$0.am().a(awa.A);
   };
   static final cdt cd = cdt.b().e().d().a(cc);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cfl(bsn<? extends cfl> $$0, dcg $$1) {
      super($$0, $$1);
      this.i_();
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
         this.i_();
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
   public cud b() {
      return new cud(cug.qF);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(1, new cfl.a(this));
   }

   @Override
   public void l() {
      if (!this.dR().B && this.bF() && this.dd()) {
         if (this.ca > 0) {
            if (this.gp() == 0) {
               this.b(avh.uR);
               this.c(1);
            } else if (this.ca > 40 && this.gp() == 1) {
               this.b(avh.uR);
               this.c(2);
            }

            this.ca++;
         } else if (this.gp() != 0) {
            if (this.cb > 60 && this.gp() == 2) {
               this.b(avh.uQ);
               this.c(1);
            } else if (this.cb > 100 && this.gp() == 1) {
               this.b(avh.uQ);
               this.c(0);
            }

            this.cb++;
         }
      }

      super.l();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bF() && this.gp() > 0) {
         for (bte $$1 : this.dR().a(bte.class, this.cM().g(0.3), $$0 -> cd.a(this, $$0))) {
            if ($$1.bF()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bte $$0) {
      int $$1 = this.gp();
      if ($$0.a(this.dS().b((btc)this), (float)(1 + $$1))) {
         $$0.b(new brp(brr.s, 60 * $$1, 0), this);
         this.a(avh.uV, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cml $$0) {
      int $$1 = this.gp();
      if ($$0 instanceof aqn && $$1 > 0 && $$0.a(this.dS().b((btc)this), (float)(1 + $$1))) {
         if (!this.aY()) {
            ((aqn)$$0).c.b(new acu(acu.k, 0.0F));
         }

         $$0.b(new brp(brr.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avg v() {
      return avh.uP;
   }

   @Override
   protected avg n_() {
      return avh.uS;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.uU;
   }

   @Override
   protected avg go() {
      return avh.uT;
   }

   @Override
   public bsk e(bto $$0) {
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

   static class a extends caa {
      private final cfl a;

      public a(cfl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<btc> $$0 = this.a.dR().a(btc.class, this.a.cM().g(2.0), $$0x -> cfl.cd.a(this.a, $$0x));
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
