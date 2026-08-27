import javax.annotation.Nullable;

public class dli extends dkg implements bmt, bng {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bmv e = new bmv() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ai_() {
         return dli.this.g.b();
      }

      @Override
      public cqk a(int $$0) {
         return $$0 == 0 ? dli.this.g : cqk.h;
      }

      @Override
      public cqk a(int $$0, int $$1) {
         if ($$0 == 0) {
            cqk $$2 = dli.this.g.a($$1);
            if (dli.this.g.b()) {
               dli.this.k();
            }

            return $$2;
         } else {
            return cqk.h;
         }
      }

      @Override
      public cqk b(int $$0) {
         if ($$0 == 0) {
            cqk $$1 = dli.this.g;
            dli.this.g = cqk.h;
            dli.this.k();
            return $$1;
         } else {
            return cqk.h;
         }
      }

      @Override
      public void a(int $$0, cqk $$1) {
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public void e() {
         dli.this.e();
      }

      @Override
      public boolean a(cis $$0) {
         return bmv.a(dli.this, $$0) && dli.this.c();
      }

      @Override
      public boolean b(int $$0, cqk $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cly f = new cly() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dli.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dli.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cqk g = cqk.h;
   int h;
   private int i;

   public dli(ib $$0, dmz $$1) {
      super(dki.D, $$0, $$1);
   }

   public cqk b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cqn.tX) || this.g.a(cqn.tY);
   }

   public void a(cqk $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dek.a(null, this.i(), this.aC_(), this.n(), false);
   }

   public void a(cqk $$0, @Nullable cis $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = csg.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = aww.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dek.a(this.i(), this.aC_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return aww.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cqk b(cqk $$0, @Nullable cis $$1) {
      if (this.o instanceof apf && $$0.a(cqn.tY)) {
         csg.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private du a(@Nullable cis $$0) {
      String $$1;
      vu $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = vu.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.O_();
      }

      epr $$5 = epr.b(this.p);
      return new du(dt.a, $$5, epq.a, (apf)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cqk.a($$0.p("Book")), null);
      } else {
         this.g = cqk.h;
      }

      this.i = csg.k(this.g);
      this.h = aww.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b().b()) {
         $$0.a("Book", this.b().b(new ta()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(cqk.h);
   }

   @Override
   public clo createMenu(int $$0, cir $$1, cis $$2) {
      return new cms($$0, this.e, this.f);
   }

   @Override
   public vu O_() {
      return vu.c("container.lectern");
   }
}
