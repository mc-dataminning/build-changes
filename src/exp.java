import javax.annotation.Nullable;

public class exp implements exs {
   public static final int b = 1;
   public static final exp c = new exp();
   protected final dkl d;
   @Nullable
   private final exr<?, ?> a;
   @Nullable
   private final exr<?, ?> e;

   public exp(eea $$0, boolean $$1, boolean $$2) {
      this.d = $$0.r();
      this.a = $$1 ? new exi($$0) : null;
      this.e = $$2 ? new ext($$0) : null;
   }

   private exp() {
      this.d = dkl.e(0, 0);
      this.a = null;
      this.e = null;
   }

   @Override
   public void a(iw $$0) {
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
   public void a(jz $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void a(djo $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void b(djo $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.e != null) {
         this.e.b($$0);
      }
   }

   public exn a(dks $$0) {
      if ($$0 == dks.b) {
         return (exn)(this.a == null ? exn.a.a : this.a);
      } else {
         return (exn)(this.e == null ? exn.a.a : this.e);
      }
   }

   public String a(dks $$0, jz $$1) {
      if ($$0 == dks.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public exo.b b(dks $$0, jz $$1) {
      if ($$0 == dks.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.e != null) {
         return this.e.c($$1.s());
      }

      return exo.b.a;
   }

   public void a(dks $$0, jz $$1, @Nullable eds $$2) {
      if ($$0 == dks.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2);
      }
   }

   public void b(djo $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.e != null) {
         this.e.b($$0, $$1);
      }
   }

   public int a(iw $$0, int $$1) {
      int $$2 = this.e == null ? 0 : this.e.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(long $$0) {
      return this.a == null || this.a.f.k($$0) && (this.e == null || this.e.f.k($$0));
   }

   public int c() {
      return this.d.ap() + 2;
   }

   public int d() {
      return this.d.aq() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
