import javax.annotation.Nullable;

public class dqe extends dpc implements bqg, bqt {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bqi e = new bqi() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dqe.this.g.e();
      }

      @Override
      public cuk a(int $$0) {
         return $$0 == 0 ? dqe.this.g : cuk.l;
      }

      @Override
      public cuk a(int $$0, int $$1) {
         if ($$0 == 0) {
            cuk $$2 = dqe.this.g.a($$1);
            if (dqe.this.g.e()) {
               dqe.this.k();
            }

            return $$2;
         } else {
            return cuk.l;
         }
      }

      @Override
      public cuk b(int $$0) {
         if ($$0 == 0) {
            cuk $$1 = dqe.this.g;
            dqe.this.g = cuk.l;
            dqe.this.k();
            return $$1;
         } else {
            return cuk.l;
         }
      }

      @Override
      public void a(int $$0, cuk $$1) {
      }

      @Override
      public int ai_() {
         return 1;
      }

      @Override
      public void e() {
         dqe.this.e();
      }

      @Override
      public boolean a(cms $$0) {
         return bqi.a(dqe.this, $$0) && dqe.this.c();
      }

      @Override
      public boolean b(int $$0, cuk $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cpz f = new cpz() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dqe.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dqe.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cuk g = cuk.l;
   int h;
   private int i;

   public dqe(iz $$0, drx $$1) {
      super(dpe.D, $$0, $$1);
   }

   public cuk b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cun.tZ) || this.g.a(cun.ua);
   }

   public void b(cuk $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      djf.a(null, this.i(), this.aA_(), this.n(), false);
   }

   public void a(cuk $$0, @Nullable cms $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ayu.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         djf.a(this.i(), this.aA_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayu.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cuk b(cuk $$0, @Nullable cms $$1) {
      if (this.n instanceof arb && $$0.a(cun.ua)) {
         cwi.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ep a(@Nullable cms $$0) {
      String $$1;
      xl $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = xl.b("Lectern");
      } else {
         $$1 = $$0.af().getString();
         $$2 = $$0.O_();
      }

      evm $$5 = evm.b(this.o);
      return new ep(eo.a, $$5, evl.a, (arb)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cuk.a($$1, (vo)$$0.p("Book")).orElse(cuk.l), null);
      } else {
         this.g = cuk.l;
      }

      this.i = c(this.g);
      this.h = ayu.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b().e()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cuk.l);
   }

   @Override
   public cpp createMenu(int $$0, cmr $$1, cms $$2) {
      return new cqt($$0, this.e, this.f);
   }

   @Override
   public xl O_() {
      return xl.c("container.lectern");
   }

   private static int c(cuk $$0) {
      cxt $$1 = $$0.a(km.I);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cxs $$2 = $$0.a(km.H);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
