import javax.annotation.Nullable;

public class duc extends dsy implements bsb, bsm {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bsd e = new bsd() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return duc.this.g.f();
      }

      @Override
      public cwm a(int $$0) {
         return $$0 == 0 ? duc.this.g : cwm.k;
      }

      @Override
      public cwm a(int $$0, int $$1) {
         if ($$0 == 0) {
            cwm $$2 = duc.this.g.a($$1);
            if (duc.this.g.f()) {
               duc.this.k();
            }

            return $$2;
         } else {
            return cwm.k;
         }
      }

      @Override
      public cwm b(int $$0) {
         if ($$0 == 0) {
            cwm $$1 = duc.this.g;
            duc.this.g = cwm.k;
            duc.this.k();
            return $$1;
         } else {
            return cwm.k;
         }
      }

      @Override
      public void a(int $$0, cwm $$1) {
      }

      @Override
      public int an_() {
         return 1;
      }

      @Override
      public void e() {
         duc.this.e();
      }

      @Override
      public boolean a(cou $$0) {
         return bsd.a(duc.this, $$0) && duc.this.c();
      }

      @Override
      public boolean b(int $$0, cwm $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final csl f = new csl() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? duc.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            duc.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cwm g = cwm.k;
   int h;
   private int i;

   public duc(jh $$0, dvv $$1) {
      super(dta.D, $$0, $$1);
   }

   public cwm b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(ku.S) || this.g.b(ku.T);
   }

   public void b(cwm $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dna.a(null, this.i(), this.aA_(), this.m(), false);
   }

   public void a(cwm $$0, @Nullable cou $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azm.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dna.a(this.i(), this.aA_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return azm.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cwm b(cwm $$0, @Nullable cou $$1) {
      if (this.o instanceof arp $$2) {
         cyi.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ew a(@Nullable cou $$0, arp $$1) {
      String $$2;
      xj $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = xj.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.o_();
      }

      ezy $$6 = ezy.b(this.p);
      return new ew(ev.a, $$6, ezx.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cwm.a($$1, (vi)$$0.p("Book")).orElse(cwm.k), null);
      } else {
         this.g = cwm.k;
      }

      this.i = c(this.g);
      this.h = azm.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cwm.k);
   }

   @Override
   public crz createMenu(int $$0, cot $$1, cou $$2) {
      return new ctf($$0, this.e, this.f);
   }

   @Override
   public xj o_() {
      return xj.c("container.lectern");
   }

   private static int c(cwm $$0) {
      czu $$1 = $$0.a(ku.T);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         czt $$2 = $$0.a(ku.S);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
