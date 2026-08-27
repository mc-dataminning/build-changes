import javax.annotation.Nullable;

public class ead implements eag {
   public static final int b = 1;
   protected final cpz c;
   @Nullable
   private final eaf<?, ?> a;
   @Nullable
   private final eaf<?, ?> d;

   public ead(dhv $$0, boolean $$1, boolean $$2) {
      this.c = $$0.q();
      this.a = $$1 ? new dzw($$0) : null;
      this.d = $$2 ? new eah($$0) : null;
   }

   @Override
   public void a(gw $$0) {
      if (this.a != null) {
         this.a.a($$0);
      }

      if (this.d != null) {
         this.d.a($$0);
      }
   }

   @Override
   public boolean J_() {
      return this.d != null && this.d.J_() ? true : this.a != null && this.a.J_();
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
   public void a(hz $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void a(cpe $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void b(cpe $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.d != null) {
         this.d.b($$0);
      }
   }

   public eab a(cqg $$0) {
      if ($$0 == cqg.b) {
         return (eab)(this.a == null ? eab.a.a : this.a);
      } else {
         return (eab)(this.d == null ? eab.a.a : this.d);
      }
   }

   public String a(cqg $$0, hz $$1) {
      if ($$0 == cqg.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.d != null) {
         return this.d.b($$1.s());
      }

      return "n/a";
   }

   public eac.b b(cqg $$0, hz $$1) {
      if ($$0 == cqg.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.d != null) {
         return this.d.c($$1.s());
      }

      return eac.b.a;
   }

   public void a(cqg $$0, hz $$1, @Nullable dhn $$2) {
      if ($$0 == cqg.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.d != null) {
         this.d.a($$1.s(), $$2);
      }
   }

   public void b(cpe $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.d != null) {
         this.d.b($$0, $$1);
      }
   }

   public int a(gw $$0, int $$1) {
      int $$2 = this.d == null ? 0 : this.d.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(hz $$0) {
      long $$1 = $$0.s();
      return this.a == null || this.a.f.j($$1) && (this.d == null || this.d.f.j($$1));
   }

   public int c() {
      return this.c.ak() + 2;
   }

   public int d() {
      return this.c.al() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
