import javax.annotation.Nullable;

public class dzi extends dyc implements bui, but {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final buk e = new buk() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dzi.this.g.f();
      }

      @Override
      public czy a(int $$0) {
         return $$0 == 0 ? dzi.this.g : czy.k;
      }

      @Override
      public czy a(int $$0, int $$1) {
         if ($$0 == 0) {
            czy $$2 = dzi.this.g.a($$1);
            if (dzi.this.g.f()) {
               dzi.this.s();
            }

            return $$2;
         } else {
            return czy.k;
         }
      }

      @Override
      public czy b(int $$0) {
         if ($$0 == 0) {
            czy $$1 = dzi.this.g;
            dzi.this.g = czy.k;
            dzi.this.s();
            return $$1;
         } else {
            return czy.k;
         }
      }

      @Override
      public void a(int $$0, czy $$1) {
      }

      @Override
      public int ao_() {
         return 1;
      }

      @Override
      public void e() {
         dzi.this.e();
      }

      @Override
      public boolean a(crx $$0) {
         return buk.a(dzi.this, $$0) && dzi.this.f();
      }

      @Override
      public boolean b(int $$0, czy $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cwc f = new cwc() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dzi.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dzi.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   czy g = czy.k;
   int h;
   private int i;

   public dzi(iv $$0, ebe $$1) {
      super(dye.E, $$0, $$1);
   }

   public czy c() {
      return this.g;
   }

   public boolean f() {
      return this.g.c(kk.U) || this.g.c(kk.V);
   }

   public void b(czy $$0) {
      this.a($$0, null);
   }

   void s() {
      this.h = 0;
      this.i = 0;
      drt.a(null, this.i(), this.aB_(), this.m(), false);
   }

   public void a(czy $$0, @Nullable crx $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azo.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         drt.a(this.i(), this.aB_(), this.m());
      }
   }

   public int j() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.j() / ((float)this.i - 1.0F) : 1.0F;
      return azo.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private czy b(czy $$0, @Nullable crx $$1) {
      if (this.n instanceof ars $$2) {
         ddi.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ej a(@Nullable crx $$0, ars $$1) {
      String $$2;
      xa $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = xa.b("Lectern");
      } else {
         $$2 = $$0.ai().getString();
         $$3 = $$0.m_();
      }

      ffq $$6 = ffq.b(this.o);
      return new ej(ei.a, $$6, ffp.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      alg<uy> $$2 = $$1.a(un.a);
      this.g = $$0.<czy>a("Book", czy.b, $$2).map($$0x -> this.b($$0x, null)).orElse(czy.k);
      this.i = c(this.g);
      this.h = azo.a($$0.b("Page", 0), 0, this.i - 1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.c().f()) {
         alg<uy> $$2 = $$1.a(un.a);
         $$0.a("Book", czy.b, $$2, this.c());
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(czy.k);
   }

   @Override
   public void a(iv $$0, ebe $$1) {
      if ($$1.c(drt.d) && this.n != null) {
         jb $$2 = $$1.c(drt.b);
         czy $$3 = this.c().v();
         float $$4 = 0.25F * (float)$$2.j();
         float $$5 = 0.25F * (float)$$2.l();
         coc $$6 = new coc(this.n, (double)$$0.u() + 0.5 + (double)$$4, (double)($$0.v() + 1), (double)$$0.w() + 0.5 + (double)$$5, $$3);
         $$6.j();
         this.n.b($$6);
      }
   }

   @Override
   public cvq createMenu(int $$0, crw $$1, crx $$2) {
      return new cww($$0, this.e, this.f);
   }

   @Override
   public xa m_() {
      return xa.c("container.lectern");
   }

   private static int c(czy $$0) {
      ddi $$1 = $$0.a(kk.V);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         ddh $$2 = $$0.a(kk.U);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
