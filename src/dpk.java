import javax.annotation.Nullable;

public class dpk extends doi implements bpn, bqa {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bpp e = new bpp() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dpk.this.g.e();
      }

      @Override
      public ctq a(int $$0) {
         return $$0 == 0 ? dpk.this.g : ctq.i;
      }

      @Override
      public ctq a(int $$0, int $$1) {
         if ($$0 == 0) {
            ctq $$2 = dpk.this.g.a($$1);
            if (dpk.this.g.e()) {
               dpk.this.k();
            }

            return $$2;
         } else {
            return ctq.i;
         }
      }

      @Override
      public ctq b(int $$0) {
         if ($$0 == 0) {
            ctq $$1 = dpk.this.g;
            dpk.this.g = ctq.i;
            dpk.this.k();
            return $$1;
         } else {
            return ctq.i;
         }
      }

      @Override
      public void a(int $$0, ctq $$1) {
      }

      @Override
      public int ai_() {
         return 1;
      }

      @Override
      public void e() {
         dpk.this.e();
      }

      @Override
      public boolean a(cly $$0) {
         return bpp.a(dpk.this, $$0) && dpk.this.c();
      }

      @Override
      public boolean b(int $$0, ctq $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cpf f = new cpf() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dpk.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dpk.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   ctq g = ctq.i;
   int h;
   private int i;

   public dpk(io $$0, drd $$1) {
      super(dok.D, $$0, $$1);
   }

   public ctq b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(ctt.tZ) || this.g.a(ctt.ua);
   }

   public void b(ctq $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dil.a(null, this.i(), this.aA_(), this.n(), false);
   }

   public void a(ctq $$0, @Nullable cly $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ayf.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dil.a(this.i(), this.aA_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayf.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private ctq b(ctq $$0, @Nullable cly $$1) {
      if (this.n instanceof aqn && $$0.a(ctt.ua)) {
         cvo.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ee a(@Nullable cly $$0) {
      String $$1;
      wx $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = wx.b("Lectern");
      } else {
         $$1 = $$0.af().getString();
         $$2 = $$0.O_();
      }

      eum $$5 = eum.b(this.o);
      return new ee(ed.a, $$5, eul.a, (aqn)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(ctq.a($$1, (va)$$0.p("Book")).orElse(ctq.i), null);
      } else {
         this.g = ctq.i;
      }

      this.i = c(this.g);
      this.h = ayf.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (!this.b().e()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(ctq.i);
   }

   @Override
   public cov createMenu(int $$0, clx $$1, cly $$2) {
      return new cpz($$0, this.e, this.f);
   }

   @Override
   public wx O_() {
      return wx.c("container.lectern");
   }

   private static int c(ctq $$0) {
      cwz $$1 = $$0.a(kb.I);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cwy $$2 = $$0.a(kb.H);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
