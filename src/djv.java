import javax.annotation.Nullable;

public class djv extends dit implements bll, bly {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bln e = new bln() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean aj_() {
         return djv.this.g.b();
      }

      @Override
      public coz a(int $$0) {
         return $$0 == 0 ? djv.this.g : coz.h;
      }

      @Override
      public coz a(int $$0, int $$1) {
         if ($$0 == 0) {
            coz $$2 = djv.this.g.a($$1);
            if (djv.this.g.b()) {
               djv.this.l();
            }

            return $$2;
         } else {
            return coz.h;
         }
      }

      @Override
      public coz b(int $$0) {
         if ($$0 == 0) {
            coz $$1 = djv.this.g;
            djv.this.g = coz.h;
            djv.this.l();
            return $$1;
         } else {
            return coz.h;
         }
      }

      @Override
      public void a(int $$0, coz $$1) {
      }

      @Override
      public int al_() {
         return 1;
      }

      @Override
      public void e() {
         djv.this.e();
      }

      @Override
      public boolean a(chh $$0) {
         return bln.a(djv.this, $$0) && djv.this.f();
      }

      @Override
      public boolean b(int $$0, coz $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final ckl f = new ckl() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? djv.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            djv.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   coz g = coz.h;
   int h;
   private int i;

   public djv(hz $$0, dlf $$1) {
      super(div.D, $$0, $$1);
   }

   public coz c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cpc.tW) || this.g.a(cpc.tX);
   }

   public void a(coz $$0) {
      this.a($$0, null);
   }

   void l() {
      this.h = 0;
      this.i = 0;
      dcy.a(null, this.i(), this.aE_(), this.r(), false);
   }

   public void a(coz $$0, @Nullable chh $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cqu.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = awh.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dcy.a(this.i(), this.aE_(), this.r());
      }
   }

   public int g() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return awh.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private coz b(coz $$0, @Nullable chh $$1) {
      if (this.o instanceof aov && $$0.a(cpc.tX)) {
         cqu.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private du a(@Nullable chh $$0) {
      String $$1;
      vq $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = vq.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.Q_();
      }

      ens $$5 = ens.b(this.p);
      return new du(dt.a, $$5, enr.a, (aov)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(coz.a($$0.p("Book")), null);
      } else {
         this.g = coz.h;
      }

      this.i = cqu.k(this.g);
      this.h = awh.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new sw()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(coz.h);
   }

   @Override
   public ckb createMenu(int $$0, chg $$1, chh $$2) {
      return new clf($$0, this.e, this.f);
   }

   @Override
   public vq Q_() {
      return vq.c("container.lectern");
   }
}
