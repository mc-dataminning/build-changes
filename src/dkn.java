import javax.annotation.Nullable;

public class dkn extends djl implements bmc, bmp {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bme e = new bme() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean aj_() {
         return dkn.this.g.b();
      }

      @Override
      public cpq a(int $$0) {
         return $$0 == 0 ? dkn.this.g : cpq.h;
      }

      @Override
      public cpq a(int $$0, int $$1) {
         if ($$0 == 0) {
            cpq $$2 = dkn.this.g.a($$1);
            if (dkn.this.g.b()) {
               dkn.this.k();
            }

            return $$2;
         } else {
            return cpq.h;
         }
      }

      @Override
      public cpq b(int $$0) {
         if ($$0 == 0) {
            cpq $$1 = dkn.this.g;
            dkn.this.g = cpq.h;
            dkn.this.k();
            return $$1;
         } else {
            return cpq.h;
         }
      }

      @Override
      public void a(int $$0, cpq $$1) {
      }

      @Override
      public int al_() {
         return 1;
      }

      @Override
      public void e() {
         dkn.this.e();
      }

      @Override
      public boolean a(cia $$0) {
         return bme.a(dkn.this, $$0) && dkn.this.c();
      }

      @Override
      public boolean b(int $$0, cpq $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cle f = new cle() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dkn.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dkn.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cpq g = cpq.h;
   int h;
   private int i;

   public dkn(ib $$0, dme $$1) {
      super(djn.D, $$0, $$1);
   }

   public cpq b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cpt.tW) || this.g.a(cpt.tX);
   }

   public void a(cpq $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      ddp.a(null, this.i(), this.aD_(), this.n(), false);
   }

   public void a(cpq $$0, @Nullable cia $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = crl.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = awm.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         ddp.a(this.i(), this.aD_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return awm.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cpq b(cpq $$0, @Nullable cia $$1) {
      if (this.o instanceof apa && $$0.a(cpt.tX)) {
         crl.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private du a(@Nullable cia $$0) {
      String $$1;
      vs $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = vs.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.Q_();
      }

      eov $$5 = eov.b(this.p);
      return new du(dt.a, $$5, eou.a, (apa)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cpq.a($$0.p("Book")), null);
      } else {
         this.g = cpq.h;
      }

      this.i = crl.k(this.g);
      this.h = awm.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b().b()) {
         $$0.a("Book", this.b().b(new sy()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cpq.h);
   }

   @Override
   public cku createMenu(int $$0, chz $$1, cia $$2) {
      return new cly($$0, this.e, this.f);
   }

   @Override
   public vs Q_() {
      return vs.c("container.lectern");
   }
}
