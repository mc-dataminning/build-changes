import javax.annotation.Nullable;

public class eab implements eae {
   public static final int b = 1;
   protected final cpx c;
   @Nullable
   private final ead<?, ?> a;
   @Nullable
   private final ead<?, ?> d;

   public eab(dht $$0, boolean $$1, boolean $$2) {
      this.c = $$0.q();
      this.a = $$1 ? new dzu($$0) : null;
      this.d = $$2 ? new eaf($$0) : null;
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
   public void a(hw $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void a(cpc $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void b(cpc $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.d != null) {
         this.d.b($$0);
      }
   }

   public dzz a(cqe $$0) {
      if ($$0 == cqe.b) {
         return (dzz)(this.a == null ? dzz.a.a : this.a);
      } else {
         return (dzz)(this.d == null ? dzz.a.a : this.d);
      }
   }

   public String a(cqe $$0, hw $$1) {
      if ($$0 == cqe.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.d != null) {
         return this.d.b($$1.s());
      }

      return "n/a";
   }

   public eaa.b b(cqe $$0, hw $$1) {
      if ($$0 == cqe.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.d != null) {
         return this.d.c($$1.s());
      }

      return eaa.b.a;
   }

   public void a(cqe $$0, hw $$1, @Nullable dhl $$2) {
      if ($$0 == cqe.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.d != null) {
         this.d.a($$1.s(), $$2);
      }
   }

   public void b(cpc $$0, boolean $$1) {
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

   public boolean a(hw $$0) {
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
