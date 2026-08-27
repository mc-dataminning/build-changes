import javax.annotation.Nullable;

public class dgk extends dfi implements bis, bje {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final biu e = new biu() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean aj_() {
         return dgk.this.g.b();
      }

      @Override
      public clo a(int $$0) {
         return $$0 == 0 ? dgk.this.g : clo.b;
      }

      @Override
      public clo a(int $$0, int $$1) {
         if ($$0 == 0) {
            clo $$2 = dgk.this.g.a($$1);
            if (dgk.this.g.b()) {
               dgk.this.l();
            }

            return $$2;
         } else {
            return clo.b;
         }
      }

      @Override
      public clo b(int $$0) {
         if ($$0 == 0) {
            clo $$1 = dgk.this.g;
            dgk.this.g = clo.b;
            dgk.this.l();
            return $$1;
         } else {
            return clo.b;
         }
      }

      @Override
      public void a(int $$0, clo $$1) {
      }

      @Override
      public int al_() {
         return 1;
      }

      @Override
      public void e() {
         dgk.this.e();
      }

      @Override
      public boolean a(cdz $$0) {
         return biu.a(dgk.this, $$0) && dgk.this.f();
      }

      @Override
      public boolean b(int $$0, clo $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final chb f = new chb() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dgk.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dgk.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   clo g = clo.b;
   int h;
   private int i;

   public dgk(hx $$0, dhn $$1) {
      super(dfk.D, $$0, $$1);
   }

   public clo c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(clr.tS) || this.g.a(clr.tT);
   }

   public void a(clo $$0) {
      this.a($$0, null);
   }

   void l() {
      this.h = 0;
      this.i = 0;
      czp.a(null, this.i(), this.aC_(), this.r(), false);
   }

   public void a(clo $$0, @Nullable cdz $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cnk.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = atq.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         czp.a(this.i(), this.aC_(), this.r());
      }
   }

   public int g() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return atq.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private clo b(clo $$0, @Nullable cdz $$1) {
      if (this.o instanceof ami && $$0.a(clr.tT)) {
         cnk.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private du a(@Nullable cdz $$0) {
      String $$1;
      uv $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = uv.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.Q_();
      }

      ejz $$5 = ejz.b(this.p);
      return new du(dt.a, $$5, ejy.a, (ami)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(clo.a($$0.p("Book")), null);
      } else {
         this.g = clo.b;
      }

      this.i = cnk.k(this.g);
      this.h = atq.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new sd()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(clo.b);
   }

   @Override
   public cgr createMenu(int $$0, cdy $$1, cdz $$2) {
      return new chv($$0, this.e, this.f);
   }

   @Override
   public uv Q_() {
      return uv.c("container.lectern");
   }
}
