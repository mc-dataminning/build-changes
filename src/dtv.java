import javax.annotation.Nullable;

public class dtv extends dsr implements bry, bsj {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bsa e = new bsa() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dtv.this.g.f();
      }

      @Override
      public cwf a(int $$0) {
         return $$0 == 0 ? dtv.this.g : cwf.k;
      }

      @Override
      public cwf a(int $$0, int $$1) {
         if ($$0 == 0) {
            cwf $$2 = dtv.this.g.a($$1);
            if (dtv.this.g.f()) {
               dtv.this.k();
            }

            return $$2;
         } else {
            return cwf.k;
         }
      }

      @Override
      public cwf b(int $$0) {
         if ($$0 == 0) {
            cwf $$1 = dtv.this.g;
            dtv.this.g = cwf.k;
            dtv.this.k();
            return $$1;
         } else {
            return cwf.k;
         }
      }

      @Override
      public void a(int $$0, cwf $$1) {
      }

      @Override
      public int am_() {
         return 1;
      }

      @Override
      public void e() {
         dtv.this.e();
      }

      @Override
      public boolean a(cor $$0) {
         return bsa.a(dtv.this, $$0) && dtv.this.c();
      }

      @Override
      public boolean b(int $$0, cwf $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cse f = new cse() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dtv.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dtv.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cwf g = cwf.k;
   int h;
   private int i;

   public dtv(jh $$0, dvo $$1) {
      super(dst.D, $$0, $$1);
   }

   public cwf b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(ku.S) || this.g.b(ku.T);
   }

   public void b(cwf $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dmt.a(null, this.i(), this.aB_(), this.m(), false);
   }

   public void a(cwf $$0, @Nullable cor $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azn.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dmt.a(this.i(), this.aB_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return azn.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cwf b(cwf $$0, @Nullable cor $$1) {
      if (this.o instanceof arq $$2) {
         cyb.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ew a(@Nullable cor $$0, arq $$1) {
      String $$2;
      xl $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = xl.b("Lectern");
      } else {
         $$2 = $$0.am().getString();
         $$3 = $$0.S_();
      }

      ezr $$6 = ezr.b(this.p);
      return new ew(ev.a, $$6, ezq.a, $$1, 2, $$2, $$3, $$1.o(), $$0);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cwf.a($$1, (vk)$$0.p("Book")).orElse(cwf.k), null);
      } else {
         this.g = cwf.k;
      }

      this.i = c(this.g);
      this.h = azn.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cwf.k);
   }

   @Override
   public crs createMenu(int $$0, coq $$1, cor $$2) {
      return new csy($$0, this.e, this.f);
   }

   @Override
   public xl S_() {
      return xl.c("container.lectern");
   }

   private static int c(cwf $$0) {
      czn $$1 = $$0.a(ku.T);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         czm $$2 = $$0.a(ku.S);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
