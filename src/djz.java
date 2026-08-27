import javax.annotation.Nullable;

public class djz extends dix implements bln, bma {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final blp e = new blp() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean aj_() {
         return djz.this.g.b();
      }

      @Override
      public cpd a(int $$0) {
         return $$0 == 0 ? djz.this.g : cpd.h;
      }

      @Override
      public cpd a(int $$0, int $$1) {
         if ($$0 == 0) {
            cpd $$2 = djz.this.g.a($$1);
            if (djz.this.g.b()) {
               djz.this.l();
            }

            return $$2;
         } else {
            return cpd.h;
         }
      }

      @Override
      public cpd b(int $$0) {
         if ($$0 == 0) {
            cpd $$1 = djz.this.g;
            djz.this.g = cpd.h;
            djz.this.l();
            return $$1;
         } else {
            return cpd.h;
         }
      }

      @Override
      public void a(int $$0, cpd $$1) {
      }

      @Override
      public int al_() {
         return 1;
      }

      @Override
      public void e() {
         djz.this.e();
      }

      @Override
      public boolean a(chl $$0) {
         return blp.a(djz.this, $$0) && djz.this.f();
      }

      @Override
      public boolean b(int $$0, cpd $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final ckp f = new ckp() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? djz.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            djz.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cpd g = cpd.h;
   int h;
   private int i;

   public djz(hz $$0, dlj $$1) {
      super(diz.D, $$0, $$1);
   }

   public cpd c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cpg.tW) || this.g.a(cpg.tX);
   }

   public void a(cpd $$0) {
      this.a($$0, null);
   }

   void l() {
      this.h = 0;
      this.i = 0;
      ddc.a(null, this.i(), this.aE_(), this.r(), false);
   }

   public void a(cpd $$0, @Nullable chl $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cqy.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = awi.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         ddc.a(this.i(), this.aE_(), this.r());
      }
   }

   public int g() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return awi.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cpd b(cpd $$0, @Nullable chl $$1) {
      if (this.o instanceof aow && $$0.a(cpg.tX)) {
         cqy.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private du a(@Nullable chl $$0) {
      String $$1;
      vq $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = vq.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.Q_();
      }

      enz $$5 = enz.b(this.p);
      return new du(dt.a, $$5, eny.a, (aow)this.o, 2, $$1, $$2, this.o.o(), $$0);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cpd.a($$0.p("Book")), null);
      } else {
         this.g = cpd.h;
      }

      this.i = cqy.k(this.g);
      this.h = awi.a($$0.h("Page"), 0, this.i - 1);
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
      this.a(cpd.h);
   }

   @Override
   public ckf createMenu(int $$0, chk $$1, chl $$2) {
      return new clj($$0, this.e, this.f);
   }

   @Override
   public vq Q_() {
      return vq.c("container.lectern");
   }
}
