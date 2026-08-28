import javax.annotation.Nullable;

public class esp implements ess {
   public static final int b = 1;
   public static final esp c = new esp();
   protected final dgl d;
   @Nullable
   private final esr<?, ?> a;
   @Nullable
   private final esr<?, ?> e;

   public esp(dzg $$0, boolean $$1, boolean $$2) {
      this.d = $$0.q();
      this.a = $$1 ? new esi($$0) : null;
      this.e = $$2 ? new est($$0) : null;
   }

   private esp() {
      this.d = dgl.e(0, 0);
      this.a = null;
      this.e = null;
   }

   @Override
   public void a(ji $$0) {
      if (this.a != null) {
         this.a.a($$0);
      }

      if (this.e != null) {
         this.e.a($$0);
      }
   }

   @Override
   public boolean N_() {
      return this.e != null && this.e.N_() ? true : this.a != null && this.a.N_();
   }

   @Override
   public int a() {
      int $$0 = 0;
      if (this.a != null) {
         $$0 += this.a.a();
      }

      if (this.e != null) {
         $$0 += this.e.a();
      }

      return $$0;
   }

   @Override
   public void a(kk $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void a(dfp $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void b(dfp $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.e != null) {
         this.e.b($$0);
      }
   }

   public esn a(dgs $$0) {
      if ($$0 == dgs.b) {
         return (esn)(this.a == null ? esn.a.a : this.a);
      } else {
         return (esn)(this.e == null ? esn.a.a : this.e);
      }
   }

   public String a(dgs $$0, kk $$1) {
      if ($$0 == dgs.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public eso.b b(dgs $$0, kk $$1) {
      if ($$0 == dgs.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.e != null) {
         return this.e.c($$1.s());
      }

      return eso.b.a;
   }

   public void a(dgs $$0, kk $$1, @Nullable dyy $$2) {
      if ($$0 == dgs.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2);
      }
   }

   public void b(dfp $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.e != null) {
         this.e.b($$0, $$1);
      }
   }

   public int a(ji $$0, int $$1) {
      int $$2 = this.e == null ? 0 : this.e.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(long $$0) {
      return this.a == null || this.a.f.k($$0) && (this.e == null || this.e.f.k($$0));
   }

   public int c() {
      return this.d.ao() + 2;
   }

   public int d() {
      return this.d.ap() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
