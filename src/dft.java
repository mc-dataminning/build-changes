import javax.annotation.Nullable;

public class dft extends der implements bih, bit {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bij e = new bij() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ai_() {
         return dft.this.g.b();
      }

      @Override
      public clb a(int $$0) {
         return $$0 == 0 ? dft.this.g : clb.b;
      }

      @Override
      public clb a(int $$0, int $$1) {
         if ($$0 == 0) {
            clb $$2 = dft.this.g.a($$1);
            if (dft.this.g.b()) {
               dft.this.j();
            }

            return $$2;
         } else {
            return clb.b;
         }
      }

      @Override
      public clb b(int $$0) {
         if ($$0 == 0) {
            clb $$1 = dft.this.g;
            dft.this.g = clb.b;
            dft.this.j();
            return $$1;
         } else {
            return clb.b;
         }
      }

      @Override
      public void a(int $$0, clb $$1) {
      }

      @Override
      public int aj_() {
         return 1;
      }

      @Override
      public void e() {
         dft.this.e();
      }

      @Override
      public boolean a(cdm $$0) {
         return bij.a(dft.this, $$0) && dft.this.f();
      }

      @Override
      public boolean b(int $$0, clb $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cgo f = new cgo() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dft.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dft.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   clb g = clb.b;
   int h;
   private int i;

   public dft(ht $$0, dgw $$1) {
      super(det.D, $$0, $$1);
   }

   public clb c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(cle.th) || this.g.a(cle.ti);
   }

   public void a(clb $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      czd.a(null, this.k(), this.p(), this.q(), false);
   }

   public void a(clb $$0, @Nullable cdm $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cmx.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ati.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         czd.a(this.k(), this.p(), this.q());
      }
   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return ati.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private clb b(clb $$0, @Nullable cdm $$1) {
      if (this.o instanceof ama && $$0.a(cle.ti)) {
         cmx.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private du a(@Nullable cdm $$0) {
      String $$1;
      ur $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = ur.b("Lectern");
      } else {
         $$1 = $$0.ab().getString();
         $$2 = $$0.O_();
      }

      eji $$5 = eji.b(this.p);
      return new du(dt.a, $$5, ejh.a, (ama)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(clb.a($$0.p("Book")), null);
      } else {
         this.g = clb.b;
      }

      this.i = cmx.k(this.g);
      this.h = ati.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new rz()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(clb.b);
   }

   @Override
   public cge createMenu(int $$0, cdl $$1, cdm $$2) {
      return new chi($$0, this.e, this.f);
   }

   @Override
   public ur O_() {
      return ur.c("container.lectern");
   }
}
