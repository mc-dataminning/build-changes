import javax.annotation.Nullable;

public class drk extends dqh implements bqi, bqv {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bqk e = new bqk() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return drk.this.g.e();
      }

      @Override
      public cuq a(int $$0) {
         return $$0 == 0 ? drk.this.g : cuq.l;
      }

      @Override
      public cuq a(int $$0, int $$1) {
         if ($$0 == 0) {
            cuq $$2 = drk.this.g.a($$1);
            if (drk.this.g.e()) {
               drk.this.k();
            }

            return $$2;
         } else {
            return cuq.l;
         }
      }

      @Override
      public cuq b(int $$0) {
         if ($$0 == 0) {
            cuq $$1 = drk.this.g;
            drk.this.g = cuq.l;
            drk.this.k();
            return $$1;
         } else {
            return cuq.l;
         }
      }

      @Override
      public void a(int $$0, cuq $$1) {
      }

      @Override
      public int al_() {
         return 1;
      }

      @Override
      public void e() {
         drk.this.e();
      }

      @Override
      public boolean a(cmx $$0) {
         return bqk.a(drk.this, $$0) && drk.this.c();
      }

      @Override
      public boolean b(int $$0, cuq $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cqf f = new cqf() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? drk.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            drk.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cuq g = cuq.l;
   int h;
   private int i;

   public drk(jd $$0, dtc $$1) {
      super(dqj.D, $$0, $$1);
   }

   public cuq b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cut.tZ) || this.g.a(cut.ua);
   }

   public void b(cuq $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dkj.a(null, this.i(), this.aD_(), this.n(), false);
   }

   public void a(cuq $$0, @Nullable cmx $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ayo.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dkj.a(this.i(), this.aD_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayo.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cuq b(cuq $$0, @Nullable cmx $$1) {
      if (this.n instanceof aqu && $$0.a(cut.ua)) {
         cwr.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private et a(@Nullable cmx $$0) {
      String $$1;
      wz $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = wz.b("Lectern");
      } else {
         $$1 = $$0.ah().getString();
         $$2 = $$0.S_();
      }

      exc $$5 = exc.b(this.o);
      return new et(es.a, $$5, exb.a, (aqu)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cuq.a($$1, (uy)$$0.p("Book")).orElse(cuq.l), null);
      } else {
         this.g = cuq.l;
      }

      this.i = c(this.g);
      this.h = ayo.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.b().e()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cuq.l);
   }

   @Override
   public cpu createMenu(int $$0, cmw $$1, cmx $$2) {
      return new cqz($$0, this.e, this.f);
   }

   @Override
   public wz S_() {
      return wz.c("container.lectern");
   }

   private static int c(cuq $$0) {
      cyb $$1 = $$0.a(kq.J);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cya $$2 = $$0.a(kq.I);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
