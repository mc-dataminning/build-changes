import javax.annotation.Nullable;

public class dtq extends dsm implements bru, bsf {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final brw e = new brw() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dtq.this.g.f();
      }

      @Override
      public cwb a(int $$0) {
         return $$0 == 0 ? dtq.this.g : cwb.k;
      }

      @Override
      public cwb a(int $$0, int $$1) {
         if ($$0 == 0) {
            cwb $$2 = dtq.this.g.a($$1);
            if (dtq.this.g.f()) {
               dtq.this.k();
            }

            return $$2;
         } else {
            return cwb.k;
         }
      }

      @Override
      public cwb b(int $$0) {
         if ($$0 == 0) {
            cwb $$1 = dtq.this.g;
            dtq.this.g = cwb.k;
            dtq.this.k();
            return $$1;
         } else {
            return cwb.k;
         }
      }

      @Override
      public void a(int $$0, cwb $$1) {
      }

      @Override
      public int am_() {
         return 1;
      }

      @Override
      public void e() {
         dtq.this.e();
      }

      @Override
      public boolean a(com $$0) {
         return brw.a(dtq.this, $$0) && dtq.this.c();
      }

      @Override
      public boolean b(int $$0, cwb $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final csa f = new csa() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dtq.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dtq.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cwb g = cwb.k;
   int h;
   private int i;

   public dtq(jh $$0, dvj $$1) {
      super(dso.D, $$0, $$1);
   }

   public cwb b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(ku.S) || this.g.b(ku.T);
   }

   public void b(cwb $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dmo.a(null, this.i(), this.aB_(), this.m(), false);
   }

   public void a(cwb $$0, @Nullable com $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azk.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dmo.a(this.i(), this.aB_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return azk.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cwb b(cwb $$0, @Nullable com $$1) {
      if (this.o instanceof arn $$2) {
         cxx.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ew a(@Nullable com $$0, arn $$1) {
      String $$2;
      xi $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = xi.b("Lectern");
      } else {
         $$2 = $$0.am().getString();
         $$3 = $$0.S_();
      }

      ezn $$6 = ezn.b(this.p);
      return new ew(ev.a, $$6, ezm.a, $$1, 2, $$2, $$3, $$1.o(), $$0);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cwb.a($$1, (vh)$$0.p("Book")).orElse(cwb.k), null);
      } else {
         this.g = cwb.k;
      }

      this.i = c(this.g);
      this.h = azk.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cwb.k);
   }

   @Override
   public cro createMenu(int $$0, col $$1, com $$2) {
      return new csu($$0, this.e, this.f);
   }

   @Override
   public xi S_() {
      return xi.c("container.lectern");
   }

   private static int c(cwb $$0) {
      czj $$1 = $$0.a(ku.T);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         czi $$2 = $$0.a(ku.S);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
