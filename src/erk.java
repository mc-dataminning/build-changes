import javax.annotation.Nullable;

public class erk implements ern {
   public static final int b = 1;
   public static final erk c = new erk();
   protected final dfo d;
   @Nullable
   private final erm<?, ?> a;
   @Nullable
   private final erm<?, ?> e;

   public erk(dyd $$0, boolean $$1, boolean $$2) {
      this.d = $$0.q();
      this.a = $$1 ? new erd($$0) : null;
      this.e = $$2 ? new ero($$0) : null;
   }

   private erk() {
      this.d = dfo.e(0, 0);
      this.a = null;
      this.e = null;
   }

   @Override
   public void a(jh $$0) {
      if (this.a != null) {
         this.a.a($$0);
      }

      if (this.e != null) {
         this.e.a($$0);
      }
   }

   @Override
   public boolean M_() {
      return this.e != null && this.e.M_() ? true : this.a != null && this.a.M_();
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
   public void a(kj $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void a(des $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void b(des $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.e != null) {
         this.e.b($$0);
      }
   }

   public eri a(dfv $$0) {
      if ($$0 == dfv.b) {
         return (eri)(this.a == null ? eri.a.a : this.a);
      } else {
         return (eri)(this.e == null ? eri.a.a : this.e);
      }
   }

   public String a(dfv $$0, kj $$1) {
      if ($$0 == dfv.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public erj.b b(dfv $$0, kj $$1) {
      if ($$0 == dfv.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.e != null) {
         return this.e.c($$1.s());
      }

      return erj.b.a;
   }

   public void a(dfv $$0, kj $$1, @Nullable dxv $$2) {
      if ($$0 == dfv.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2);
      }
   }

   public void b(des $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.e != null) {
         this.e.b($$0, $$1);
      }
   }

   public int a(jh $$0, int $$1) {
      int $$2 = this.e == null ? 0 : this.e.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(long $$0) {
      return this.a == null || this.a.f.k($$0) && (this.e == null || this.e.f.k($$0));
   }

   public int c() {
      return this.d.am() + 2;
   }

   public int d() {
      return this.d.an() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
