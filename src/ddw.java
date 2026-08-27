import javax.annotation.Nullable;

public class ddw extends dcv implements bgp, bhb {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bgr e = new bgr() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean af_() {
         return ddw.this.g.b();
      }

      @Override
      public cjf a(int $$0) {
         return $$0 == 0 ? ddw.this.g : cjf.b;
      }

      @Override
      public cjf a(int $$0, int $$1) {
         if ($$0 == 0) {
            cjf $$2 = ddw.this.g.a($$1);
            if (ddw.this.g.b()) {
               ddw.this.j();
            }

            return $$2;
         } else {
            return cjf.b;
         }
      }

      @Override
      public cjf b(int $$0) {
         if ($$0 == 0) {
            cjf $$1 = ddw.this.g;
            ddw.this.g = cjf.b;
            ddw.this.j();
            return $$1;
         } else {
            return cjf.b;
         }
      }

      @Override
      public void a(int $$0, cjf $$1) {
      }

      @Override
      public int ag_() {
         return 1;
      }

      @Override
      public void e() {
         ddw.this.e();
      }

      @Override
      public boolean a(cbu $$0) {
         return bgr.a(ddw.this, $$0) && ddw.this.f();
      }

      @Override
      public boolean b(int $$0, cjf $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cev f = new cev() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? ddw.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            ddw.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cjf g = cjf.b;
   int h;
   private int i;

   public ddw(gw $$0, dfj $$1) {
      super(dcx.D, $$0, $$1);
   }

   public cjf c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cji.tg) || this.g.a(cji.th);
   }

   public void a(cjf $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      cxd.a(null, this.k(), this.p(), this.q(), false);
   }

   public void a(cjf $$0, @Nullable cbu $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = clb.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = arx.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         cxd.a(this.k(), this.p(), this.q());
      }
   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return arx.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cjf b(cjf $$0, @Nullable cbu $$1) {
      if (this.o instanceof akr && $$0.a(cji.th)) {
         clb.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private dt a(@Nullable cbu $$0) {
      String $$1;
      tm $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = tm.b("Lectern");
      } else {
         $$1 = $$0.ab().getString();
         $$2 = $$0.N_();
      }

      ehn $$5 = ehn.b(this.p);
      return new dt(ds.a, $$5, ehm.a, (akr)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cjf.a($$0.p("Book")), null);
      } else {
         this.g = cjf.b;
      }

      this.i = clb.k(this.g);
      this.h = arx.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new qy()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cjf.b);
   }

   @Override
   public cel createMenu(int $$0, cbt $$1, cbu $$2) {
      return new cfn($$0, this.e, this.f);
   }

   @Override
   public tm N_() {
      return tm.c("container.lectern");
   }
}
