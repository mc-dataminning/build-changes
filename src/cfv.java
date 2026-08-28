import java.util.List;
import java.util.function.Predicate;

public class cfv extends cez {
   private static final ajv<Integer> e = ajz.a(cfv.class, ajx.b);
   int ca;
   int cb;
   private static final Predicate<btl> cc = $$0 -> {
      if ($$0 instanceof cmv $$1 && $$1.f()) {
         return false;
      }

      return !$$0.am().a(awh.A);
   };
   static final ced cd = ced.b().e().d().a(cc);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cfv(bsw<? extends cfv> $$0, dcu $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int go() {
      return this.ao.a(e);
   }

   public void c(int $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   public void a(ajv<?> $$0) {
      if (e.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("PuffState", this.go());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cuo b() {
      return new cuo(cur.qF);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(1, new cfv.a(this));
   }

   @Override
   public void l() {
      if (!this.dQ().B && this.bE() && this.dc()) {
         if (this.ca > 0) {
            if (this.go() == 0) {
               this.b(avo.uR);
               this.c(1);
            } else if (this.ca > 40 && this.go() == 1) {
               this.b(avo.uR);
               this.c(2);
            }

            this.ca++;
         } else if (this.go() != 0) {
            if (this.cb > 60 && this.go() == 2) {
               this.b(avo.uQ);
               this.c(1);
            } else if (this.cb > 100 && this.go() == 1) {
               this.b(avo.uQ);
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
      if (this.bE() && this.go() > 0) {
         for (btn $$1 : this.dQ().a(btn.class, this.cL().g(0.3), $$0 -> cd.a(this, $$0))) {
            if ($$1.bE()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(btn $$0) {
      int $$1 = this.go();
      if ($$0.a(this.dR().b((btl)this), (float)(1 + $$1))) {
         $$0.b(new bry(bsa.s, 60 * $$1, 0), this);
         this.a(avo.uV, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cmv $$0) {
      int $$1 = this.go();
      if ($$0 instanceof aqu && $$1 > 0 && $$0.a(this.dR().b((btl)this), (float)(1 + $$1))) {
         if (!this.aX()) {
            ((aqu)$$0).c.b(new ada(ada.k, 0.0F));
         }

         $$0.b(new bry(bsa.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avn v() {
      return avo.uP;
   }

   @Override
   protected avn n_() {
      return avo.uS;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.uU;
   }

   @Override
   protected avn gn() {
      return avo.uT;
   }

   @Override
   public bst e(bty $$0) {
      return super.e($$0).a(s(this.go()));
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

   static class a extends cak {
      private final cfv a;

      public a(cfv $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<btl> $$0 = this.a.dQ().a(btl.class, this.a.cL().g(2.0), $$0x -> cfv.cd.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.ca = 1;
         this.a.cb = 0;
      }

      @Override
      public void e() {
         this.a.ca = 0;
      }
   }
}
