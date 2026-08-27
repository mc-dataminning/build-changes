import javax.annotation.Nullable;

public class dey extends ddx implements bhs, bie {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bhu e = new bhu() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ai_() {
         return dey.this.g.b();
      }

      @Override
      public ckj a(int $$0) {
         return $$0 == 0 ? dey.this.g : ckj.b;
      }

      @Override
      public ckj a(int $$0, int $$1) {
         if ($$0 == 0) {
            ckj $$2 = dey.this.g.a($$1);
            if (dey.this.g.b()) {
               dey.this.j();
            }

            return $$2;
         } else {
            return ckj.b;
         }
      }

      @Override
      public ckj b(int $$0) {
         if ($$0 == 0) {
            ckj $$1 = dey.this.g;
            dey.this.g = ckj.b;
            dey.this.j();
            return $$1;
         } else {
            return ckj.b;
         }
      }

      @Override
      public void a(int $$0, ckj $$1) {
      }

      @Override
      public int aj_() {
         return 1;
      }

      @Override
      public void e() {
         dey.this.e();
      }

      @Override
      public boolean a(ccx $$0) {
         return bhu.a(dey.this, $$0) && dey.this.f();
      }

      @Override
      public boolean b(int $$0, ckj $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cfz f = new cfz() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dey.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dey.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   ckj g = ckj.b;
   int h;
   private int i;

   public dey(ht $$0, dgb $$1) {
      super(ddz.D, $$0, $$1);
   }

   public ckj c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(ckm.tg) || this.g.a(ckm.th);
   }

   public void a(ckj $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      cyj.a(null, this.k(), this.p(), this.q(), false);
   }

   public void a(ckj $$0, @Nullable ccx $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cmf.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = asy.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         cyj.a(this.k(), this.p(), this.q());
      }
   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return asy.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private ckj b(ckj $$0, @Nullable ccx $$1) {
      if (this.o instanceof alq && $$0.a(ckm.th)) {
         cmf.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private du a(@Nullable ccx $$0) {
      String $$1;
      ui $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = ui.b("Lectern");
      } else {
         $$1 = $$0.ab().getString();
         $$2 = $$0.O_();
      }

      eif $$5 = eif.b(this.p);
      return new du(dt.a, $$5, eie.a, (alq)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(ckj.a($$0.p("Book")), null);
      } else {
         this.g = ckj.b;
      }

      this.i = cmf.k(this.g);
      this.h = asy.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new rt()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(ckj.b);
   }

   @Override
   public cfp createMenu(int $$0, ccw $$1, ccx $$2) {
      return new cgr($$0, this.e, this.f);
   }

   @Override
   public ui O_() {
      return ui.c("container.lectern");
   }
}
