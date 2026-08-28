import javax.annotation.Nullable;

public class dqs extends dpp implements bpx, bqk {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bpz e = new bpz() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dqs.this.g.e();
      }

      @Override
      public cuc a(int $$0) {
         return $$0 == 0 ? dqs.this.g : cuc.l;
      }

      @Override
      public cuc a(int $$0, int $$1) {
         if ($$0 == 0) {
            cuc $$2 = dqs.this.g.a($$1);
            if (dqs.this.g.e()) {
               dqs.this.k();
            }

            return $$2;
         } else {
            return cuc.l;
         }
      }

      @Override
      public cuc b(int $$0) {
         if ($$0 == 0) {
            cuc $$1 = dqs.this.g;
            dqs.this.g = cuc.l;
            dqs.this.k();
            return $$1;
         } else {
            return cuc.l;
         }
      }

      @Override
      public void a(int $$0, cuc $$1) {
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public void e() {
         dqs.this.e();
      }

      @Override
      public boolean a(cmk $$0) {
         return bpz.a(dqs.this, $$0) && dqs.this.c();
      }

      @Override
      public boolean b(int $$0, cuc $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cps f = new cps() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dqs.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dqs.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cuc g = cuc.l;
   int h;
   private int i;

   public dqs(ja $$0, dsk $$1) {
      super(dpr.D, $$0, $$1);
   }

   public cuc b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cuf.tZ) || this.g.a(cuf.ua);
   }

   public void b(cuc $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      djs.a(null, this.i(), this.az_(), this.n(), false);
   }

   public void a(cuc $$0, @Nullable cmk $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ayg.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         djs.a(this.i(), this.az_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayg.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cuc b(cuc $$0, @Nullable cmk $$1) {
      if (this.n instanceof aqm && $$0.a(cuf.ua)) {
         cwa.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private eq a(@Nullable cmk $$0) {
      String $$1;
      wu $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = wu.b("Lectern");
      } else {
         $$1 = $$0.ag().getString();
         $$2 = $$0.O_();
      }

      ewf $$5 = ewf.b(this.o);
      return new eq(ep.a, $$5, ewe.a, (aqm)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cuc.a($$1, (uu)$$0.p("Book")).orElse(cuc.l), null);
      } else {
         this.g = cuc.l;
      }

      this.i = c(this.g);
      this.h = ayg.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b().e()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cuc.l);
   }

   @Override
   public cph createMenu(int $$0, cmj $$1, cmk $$2) {
      return new cqm($$0, this.e, this.f);
   }

   @Override
   public wu O_() {
      return wu.c("container.lectern");
   }

   private static int c(cuc $$0) {
      cxk $$1 = $$0.a(kn.J);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cxj $$2 = $$0.a(kn.I);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
