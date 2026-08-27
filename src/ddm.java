import javax.annotation.Nullable;

public class ddm extends dcl implements bgh, bgt {
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
      public boolean aa_() {
         return ddm.this.g.b();
      }

      @Override
      public cix a(int $$0) {
         return $$0 == 0 ? ddm.this.g : cix.b;
      }

      @Override
      public cix a(int $$0, int $$1) {
         if ($$0 == 0) {
            cix $$2 = ddm.this.g.a($$1);
            if (ddm.this.g.b()) {
               ddm.this.j();
            }

            return $$2;
         } else {
            return cix.b;
         }
      }

      @Override
      public cix b(int $$0) {
         if ($$0 == 0) {
            cix $$1 = ddm.this.g;
            ddm.this.g = cix.b;
            ddm.this.j();
            return $$1;
         } else {
            return cix.b;
         }
      }

      @Override
      public void a(int $$0, cix $$1) {
      }

      @Override
      public int ab_() {
         return 1;
      }

      @Override
      public void e() {
         ddm.this.e();
      }

      @Override
      public boolean a(cbm $$0) {
         return bgj.a(ddm.this, $$0) && ddm.this.f();
      }

      @Override
      public boolean b(int $$0, cix $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cen f = new cen() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? ddm.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            ddm.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cix g = cix.b;
   int h;
   private int i;

   public ddm(gu $$0, dez $$1) {
      super(dcn.D, $$0, $$1);
   }

   public cix c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cja.tg) || this.g.a(cja.th);
   }

   public void a(cix $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      cwt.a(null, this.k(), this.p(), this.q(), false);
   }

   public void a(cix $$0, @Nullable cbm $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = ckt.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = arp.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         cwt.a(this.k(), this.p(), this.q());
      }
   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return arp.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cix b(cix $$0, @Nullable cbm $$1) {
      if (this.o instanceof akk && $$0.a(cja.th)) {
         ckt.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private dr a(@Nullable cbm $$0) {
      String $$1;
      tf $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = tf.b("Lectern");
      } else {
         $$1 = $$0.ab().getString();
         $$2 = $$0.H_();
      }

      ehd $$5 = ehd.b(this.p);
      return new dr(dq.a, $$5, ehc.a, (akk)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cix.a($$0.p("Book")), null);
      } else {
         this.g = cix.b;
      }

      this.i = ckt.k(this.g);
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
      this.a(cix.b);
   }

   @Override
   public ced createMenu(int $$0, cbl $$1, cbm $$2) {
      return new cff($$0, this.e, this.f);
   }

   @Override
   public tf H_() {
      return tf.c("container.lectern");
   }
}
