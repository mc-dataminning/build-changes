import javax.annotation.Nullable;

public class dwb extends duw implements bsz, btk {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final btb e = new btb() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dwb.this.g.f();
      }

      @Override
      public cxo a(int $$0) {
         return $$0 == 0 ? dwb.this.g : cxo.j;
      }

      @Override
      public cxo a(int $$0, int $$1) {
         if ($$0 == 0) {
            cxo $$2 = dwb.this.g.a($$1);
            if (dwb.this.g.f()) {
               dwb.this.k();
            }

            return $$2;
         } else {
            return cxo.j;
         }
      }

      @Override
      public cxo b(int $$0) {
         if ($$0 == 0) {
            cxo $$1 = dwb.this.g;
            dwb.this.g = cxo.j;
            dwb.this.k();
            return $$1;
         } else {
            return cxo.j;
         }
      }

      @Override
      public void a(int $$0, cxo $$1) {
      }

      @Override
      public int ao_() {
         return 1;
      }

      @Override
      public void e() {
         dwb.this.e();
      }

      @Override
      public boolean a(cpw $$0) {
         return btb.a(dwb.this, $$0) && dwb.this.c();
      }

      @Override
      public boolean b(int $$0, cxo $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final ctn f = new ctn() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dwb.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dwb.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cxo g = cxo.j;
   int h;
   private int i;

   public dwb(jh $$0, dxu $$1) {
      super(duy.E, $$0, $$1);
   }

   public cxo b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(ku.S) || this.g.b(ku.T);
   }

   public void b(cxo $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      doy.a(null, this.i(), this.aB_(), this.m(), false);
   }

   public void a(cxo $$0, @Nullable cpw $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = bae.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         doy.a(this.i(), this.aB_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return bae.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cxo b(cxo $$0, @Nullable cpw $$1) {
      if (this.o instanceof ash $$2) {
         czk.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ew a(@Nullable cpw $$0, ash $$1) {
      String $$2;
      xv $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = xv.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.p_();
      }

      fbx $$6 = fbx.b(this.p);
      return new ew(ev.a, $$6, fbw.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cxo.a($$1, (vu)$$0.p("Book")).orElse(cxo.j), null);
      } else {
         this.g = cxo.j;
      }

      this.i = c(this.g);
      this.h = bae.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cxo.j);
   }

   @Override
   public ctb createMenu(int $$0, cpv $$1, cpw $$2) {
      return new cuh($$0, this.e, this.f);
   }

   @Override
   public xv p_() {
      return xv.c("container.lectern");
   }

   private static int c(cxo $$0) {
      daw $$1 = $$0.a(ku.T);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         dav $$2 = $$0.a(ku.S);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
