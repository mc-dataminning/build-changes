import java.util.List;
import java.util.function.Predicate;

public class cfx extends cfb {
   private static final ajw<Integer> e = aka.a(cfx.class, ajy.b);
   int cc;
   int cd;
   private static final Predicate<btn> ce = $$0 -> {
      if ($$0 instanceof cmx $$1 && $$1.f()) {
         return false;
      }

      return !$$0.am().a(awi.A);
   };
   static final cef cf = cef.b().e().d().a(ce);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cfx(bsx<? extends cfx> $$0, dcw $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gm() {
      return this.ao.a(e);
   }

   public void c(int $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   public void a(ajw<?> $$0) {
      if (e.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gm());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cuq b() {
      return new cuq(cut.qF);
   }

   @Override
   protected void B() {
      super.B();
      this.bW.a(1, new cfx.a(this));
   }

   @Override
   public void l() {
      if (!this.dO().B && this.bE() && this.db()) {
         if (this.cc > 0) {
            if (this.gm() == 0) {
               this.b(avp.uR);
               this.c(1);
            } else if (this.cc > 40 && this.gm() == 1) {
               this.b(avp.uR);
               this.c(2);
            }

            this.cc++;
         } else if (this.gm() != 0) {
            if (this.cd > 60 && this.gm() == 2) {
               this.b(avp.uQ);
               this.c(1);
            } else if (this.cd > 100 && this.gm() == 1) {
               this.b(avp.uQ);
               this.c(0);
            }

            this.cd++;
         }
      }

      super.l();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bE() && this.gm() > 0) {
         for (btp $$1 : this.dO().a(btp.class, this.cK().g(0.3), $$0 -> cf.a(this, $$0))) {
            if ($$1.bE()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(btp $$0) {
      int $$1 = this.gm();
      if ($$0.a(this.dP().b((btn)this), (float)(1 + $$1))) {
         $$0.b(new brz(bsb.s, 60 * $$1, 0), this);
         this.a(avp.uV, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cmx $$0) {
      int $$1 = this.gm();
      if ($$0 instanceof aqv && $$1 > 0 && $$0.a(this.dP().b((btn)this), (float)(1 + $$1))) {
         if (!this.aX()) {
            ((aqv)$$0).c.b(new adb(adb.k, 0.0F));
         }

         $$0.b(new brz(bsb.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avo v() {
      return avp.uP;
   }

   @Override
   protected avo n_() {
      return avp.uS;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.uU;
   }

   @Override
   protected avo gl() {
      return avp.uT;
   }

   @Override
   public bsu e(bua $$0) {
      return super.e($$0).a(s(this.gm()));
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

   static class a extends cam {
      private final cfx a;

      public a(cfx $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<btn> $$0 = this.a.dO().a(btn.class, this.a.cK().g(2.0), $$0x -> cfx.cf.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.cc = 1;
         this.a.cd = 0;
      }

      @Override
      public void e() {
         this.a.cc = 0;
      }
   }
}
