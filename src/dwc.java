import javax.annotation.Nullable;

public class dwc extends dux implements bta, btl {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final btc e = new btc() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dwc.this.g.f();
      }

      @Override
      public cxp a(int $$0) {
         return $$0 == 0 ? dwc.this.g : cxp.j;
      }

      @Override
      public cxp a(int $$0, int $$1) {
         if ($$0 == 0) {
            cxp $$2 = dwc.this.g.a($$1);
            if (dwc.this.g.f()) {
               dwc.this.k();
            }

            return $$2;
         } else {
            return cxp.j;
         }
      }

      @Override
      public cxp b(int $$0) {
         if ($$0 == 0) {
            cxp $$1 = dwc.this.g;
            dwc.this.g = cxp.j;
            dwc.this.k();
            return $$1;
         } else {
            return cxp.j;
         }
      }

      @Override
      public void a(int $$0, cxp $$1) {
      }

      @Override
      public int ao_() {
         return 1;
      }

      @Override
      public void e() {
         dwc.this.e();
      }

      @Override
      public boolean a(cpx $$0) {
         return btc.a(dwc.this, $$0) && dwc.this.c();
      }

      @Override
      public boolean b(int $$0, cxp $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cto f = new cto() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dwc.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dwc.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cxp g = cxp.j;
   int h;
   private int i;

   public dwc(jh $$0, dxv $$1) {
      super(duz.E, $$0, $$1);
   }

   public cxp b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(ku.S) || this.g.b(ku.T);
   }

   public void b(cxp $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      doz.a(null, this.i(), this.aB_(), this.m(), false);
   }

   public void a(cxp $$0, @Nullable cpx $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = bae.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         doz.a(this.i(), this.aB_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return bae.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cxp b(cxp $$0, @Nullable cpx $$1) {
      if (this.o instanceof ash $$2) {
         czl.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ew a(@Nullable cpx $$0, ash $$1) {
      String $$2;
      xv $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = xv.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.p_();
      }

      fby $$6 = fby.b(this.p);
      return new ew(ev.a, $$6, fbx.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cxp.a($$1, (vu)$$0.p("Book")).orElse(cxp.j), null);
      } else {
         this.g = cxp.j;
      }

      this.i = c(this.g);
      this.h = bae.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cxp.j);
   }

   @Override
   public ctc createMenu(int $$0, cpw $$1, cpx $$2) {
      return new cui($$0, this.e, this.f);
   }

   @Override
   public xv p_() {
      return xv.c("container.lectern");
   }

   private static int c(cxp $$0) {
      dax $$1 = $$0.a(ku.T);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         daw $$2 = $$0.a(ku.S);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
