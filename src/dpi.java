import javax.annotation.Nullable;

public class dpi extends dog implements bpl, bpy {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bpn e = new bpn() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dpi.this.g.e();
      }

      @Override
      public cto a(int $$0) {
         return $$0 == 0 ? dpi.this.g : cto.i;
      }

      @Override
      public cto a(int $$0, int $$1) {
         if ($$0 == 0) {
            cto $$2 = dpi.this.g.a($$1);
            if (dpi.this.g.e()) {
               dpi.this.k();
            }

            return $$2;
         } else {
            return cto.i;
         }
      }

      @Override
      public cto b(int $$0) {
         if ($$0 == 0) {
            cto $$1 = dpi.this.g;
            dpi.this.g = cto.i;
            dpi.this.k();
            return $$1;
         } else {
            return cto.i;
         }
      }

      @Override
      public void a(int $$0, cto $$1) {
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public void e() {
         dpi.this.e();
      }

      @Override
      public boolean a(clw $$0) {
         return bpn.a(dpi.this, $$0) && dpi.this.c();
      }

      @Override
      public boolean b(int $$0, cto $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cpd f = new cpd() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dpi.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dpi.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cto g = cto.i;
   int h;
   private int i;

   public dpi(io $$0, drb $$1) {
      super(doi.D, $$0, $$1);
   }

   public cto b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(ctr.tZ) || this.g.a(ctr.ua);
   }

   public void b(cto $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dij.a(null, this.i(), this.az_(), this.n(), false);
   }

   public void a(cto $$0, @Nullable clw $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ayd.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dij.a(this.i(), this.az_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayd.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cto b(cto $$0, @Nullable clw $$1) {
      if (this.n instanceof aqm && $$0.a(ctr.ua)) {
         cvm.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ee a(@Nullable clw $$0) {
      String $$1;
      wx $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = wx.b("Lectern");
      } else {
         $$1 = $$0.af().getString();
         $$2 = $$0.O_();
      }

      euk $$5 = euk.b(this.o);
      return new ee(ed.a, $$5, euj.a, (aqm)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cto.a($$1, (va)$$0.p("Book")).orElse(cto.i), null);
      } else {
         this.g = cto.i;
      }

      this.i = c(this.g);
      this.h = ayd.a($$0.h("Page"), 0, this.i - 1);
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
      this.b(cto.i);
   }

   @Override
   public cot createMenu(int $$0, clv $$1, clw $$2) {
      return new cpx($$0, this.e, this.f);
   }

   @Override
   public wx O_() {
      return wx.c("container.lectern");
   }

   private static int c(cto $$0) {
      cwx $$1 = $$0.a(kb.I);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cww $$2 = $$0.a(kb.H);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
