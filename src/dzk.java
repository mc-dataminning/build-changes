import javax.annotation.Nullable;

public class dzk extends dye implements buk, buv {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bum e = new bum() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dzk.this.g.f();
      }

      @Override
      public daa a(int $$0) {
         return $$0 == 0 ? dzk.this.g : daa.k;
      }

      @Override
      public daa a(int $$0, int $$1) {
         if ($$0 == 0) {
            daa $$2 = dzk.this.g.a($$1);
            if (dzk.this.g.f()) {
               dzk.this.s();
            }

            return $$2;
         } else {
            return daa.k;
         }
      }

      @Override
      public daa b(int $$0) {
         if ($$0 == 0) {
            daa $$1 = dzk.this.g;
            dzk.this.g = daa.k;
            dzk.this.s();
            return $$1;
         } else {
            return daa.k;
         }
      }

      @Override
      public void a(int $$0, daa $$1) {
      }

      @Override
      public int ao_() {
         return 1;
      }

      @Override
      public void e() {
         dzk.this.e();
      }

      @Override
      public boolean a(crz $$0) {
         return bum.a(dzk.this, $$0) && dzk.this.f();
      }

      @Override
      public boolean b(int $$0, daa $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cwe f = new cwe() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dzk.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dzk.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   daa g = daa.k;
   int h;
   private int i;

   public dzk(iw $$0, ebg $$1) {
      super(dyg.E, $$0, $$1);
   }

   public daa c() {
      return this.g;
   }

   public boolean f() {
      return this.g.c(kl.U) || this.g.c(kl.V);
   }

   public void b(daa $$0) {
      this.a($$0, null);
   }

   void s() {
      this.h = 0;
      this.i = 0;
      drv.a(null, this.i(), this.aB_(), this.m(), false);
   }

   public void a(daa $$0, @Nullable crz $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azq.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         drv.a(this.i(), this.aB_(), this.m());
      }
   }

   public int j() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? (float)this.j() / ((float)this.i - 1.0F) : 1.0F;
      return azq.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private daa b(daa $$0, @Nullable crz $$1) {
      if (this.n instanceof aru $$2) {
         ddk.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ek a(@Nullable crz $$0, aru $$1) {
      String $$2;
      xc $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = xc.b("Lectern");
      } else {
         $$2 = $$0.ai().getString();
         $$3 = $$0.m_();
      }

      ffs $$6 = ffs.b(this.o);
      return new ek(ej.a, $$6, ffr.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      ali<va> $$2 = $$1.a(uo.a);
      this.g = $$0.<daa>a("Book", daa.b, $$2).map($$0x -> this.b($$0x, null)).orElse(daa.k);
      this.i = c(this.g);
      this.h = azq.a($$0.b("Page", 0), 0, this.i - 1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.c().f()) {
         ali<va> $$2 = $$1.a(uo.a);
         $$0.a("Book", daa.b, $$2, this.c());
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(daa.k);
   }

   @Override
   public void a(iw $$0, ebg $$1) {
      if ($$1.c(drv.d) && this.n != null) {
         jc $$2 = $$1.c(drv.b);
         daa $$3 = this.c().v();
         float $$4 = 0.25F * (float)$$2.j();
         float $$5 = 0.25F * (float)$$2.l();
         coe $$6 = new coe(this.n, (double)$$0.u() + 0.5 + (double)$$4, (double)($$0.v() + 1), (double)$$0.w() + 0.5 + (double)$$5, $$3);
         $$6.j();
         this.n.b($$6);
      }
   }

   @Override
   public cvs createMenu(int $$0, cry $$1, crz $$2) {
      return new cwy($$0, this.e, this.f);
   }

   @Override
   public xc m_() {
      return xc.c("container.lectern");
   }

   private static int c(daa $$0) {
      ddk $$1 = $$0.a(kl.V);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         ddj $$2 = $$0.a(kl.U);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
