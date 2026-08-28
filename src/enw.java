import javax.annotation.Nullable;

public class enw implements enz {
   public static final int b = 1;
   protected final dch c;
   @Nullable
   private final eny<?, ?> a;
   @Nullable
   private final eny<?, ?> d;

   public enw(dut $$0, boolean $$1, boolean $$2) {
      this.c = $$0.q();
      this.a = $$1 ? new enp($$0) : null;
      this.d = $$2 ? new eoa($$0) : null;
   }

   @Override
   public void a(ja $$0) {
      if (this.a != null) {
         this.a.a($$0);
      }

      if (this.d != null) {
         this.d.a($$0);
      }
   }

   @Override
   public boolean K_() {
      return this.d != null && this.d.K_() ? true : this.a != null && this.a.K_();
   }

   @Override
   public int a() {
      int $$0 = 0;
      if (this.a != null) {
         $$0 += this.a.a();
      }

      if (this.d != null) {
         $$0 += this.d.a();
      }

      return $$0;
   }

   @Override
   public void a(kc $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void a(dbm $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void b(dbm $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.d != null) {
         this.d.b($$0);
      }
   }

   public enu a(dco $$0) {
      if ($$0 == dco.b) {
         return (enu)(this.a == null ? enu.a.a : this.a);
      } else {
         return (enu)(this.d == null ? enu.a.a : this.d);
      }
   }

   public String a(dco $$0, kc $$1) {
      if ($$0 == dco.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.d != null) {
         return this.d.b($$1.s());
      }

      return "n/a";
   }

   public env.b b(dco $$0, kc $$1) {
      if ($$0 == dco.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.d != null) {
         return this.d.c($$1.s());
      }

      return env.b.a;
   }

   public void a(dco $$0, kc $$1, @Nullable dul $$2) {
      if ($$0 == dco.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.d != null) {
         this.d.a($$1.s(), $$2);
      }
   }

   public void b(dbm $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.d != null) {
         this.d.b($$0, $$1);
      }
   }

   public int a(ja $$0, int $$1) {
      int $$2 = this.d == null ? 0 : this.d.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(kc $$0) {
      long $$1 = $$0.s();
      return this.a == null || this.a.f.j($$1) && (this.d == null || this.d.f.j($$1));
   }

   public int c() {
      return this.c.an() + 2;
   }

   public int d() {
      return this.c.ao() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
