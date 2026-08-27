import javax.annotation.Nullable;

public class ddn extends dcm implements bgh, bgt {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bgj e = new bgj() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ab_() {
         return ddn.this.g.b();
      }

      @Override
      public ciy a(int $$0) {
         return $$0 == 0 ? ddn.this.g : ciy.b;
      }

      @Override
      public ciy a(int $$0, int $$1) {
         if ($$0 == 0) {
            ciy $$2 = ddn.this.g.a($$1);
            if (ddn.this.g.b()) {
               ddn.this.j();
            }

            return $$2;
         } else {
            return ciy.b;
         }
      }

      @Override
      public ciy b(int $$0) {
         if ($$0 == 0) {
            ciy $$1 = ddn.this.g;
            ddn.this.g = ciy.b;
            ddn.this.j();
            return $$1;
         } else {
            return ciy.b;
         }
      }

      @Override
      public void a(int $$0, ciy $$1) {
      }

      @Override
      public int ac_() {
         return 1;
      }

      @Override
      public void e() {
         ddn.this.e();
      }

      @Override
      public boolean a(cbn $$0) {
         return bgj.a(ddn.this, $$0) && ddn.this.f();
      }

      @Override
      public boolean b(int $$0, ciy $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final ceo f = new ceo() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? ddn.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            ddn.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   ciy g = ciy.b;
   int h;
   private int i;

   public ddn(gu $$0, dfa $$1) {
      super(dco.D, $$0, $$1);
   }

   public ciy c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cjb.tg) || this.g.a(cjb.th);
   }

   public void a(ciy $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      cwu.a(null, this.k(), this.p(), this.q(), false);
   }

   public void a(ciy $$0, @Nullable cbn $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cku.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = arp.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         cwu.a(this.k(), this.p(), this.q());
      }
   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return arp.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private ciy b(ciy $$0, @Nullable cbn $$1) {
      if (this.o instanceof akk && $$0.a(cjb.th)) {
         cku.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private dr a(@Nullable cbn $$0) {
      String $$1;
      tf $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = tf.b("Lectern");
      } else {
         $$1 = $$0.ab().getString();
         $$2 = $$0.H_();
      }

      ehe $$5 = ehe.b(this.p);
      return new dr(dq.a, $$5, ehd.a, (akk)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(ciy.a($$0.p("Book")), null);
      } else {
         this.g = ciy.b;
      }

      this.i = cku.k(this.g);
      this.h = arp.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new qr()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(ciy.b);
   }

   @Override
   public cee createMenu(int $$0, cbm $$1, cbn $$2) {
      return new cfg($$0, this.e, this.f);
   }

   @Override
   public tf H_() {
      return tf.c("container.lectern");
   }
}
