import javax.annotation.Nullable;

public class eie implements eih {
   public static final int b = 1;
   protected final cxd c;
   @Nullable
   private final eig<?, ?> a;
   @Nullable
   private final eig<?, ?> d;

   public eie(dpl $$0, boolean $$1, boolean $$2) {
      this.c = $$0.q();
      this.a = $$1 ? new ehx($$0) : null;
      this.d = $$2 ? new eii($$0) : null;
   }

   @Override
   public void a(ib $$0) {
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
   public void a(je $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void a(cwi $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void b(cwi $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.d != null) {
         this.d.b($$0);
      }
   }

   public eic a(cxk $$0) {
      if ($$0 == cxk.b) {
         return (eic)(this.a == null ? eic.a.a : this.a);
      } else {
         return (eic)(this.d == null ? eic.a.a : this.d);
      }
   }

   public String a(cxk $$0, je $$1) {
      if ($$0 == cxk.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.d != null) {
         return this.d.b($$1.s());
      }

      return "n/a";
   }

   public eid.b b(cxk $$0, je $$1) {
      if ($$0 == cxk.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.d != null) {
         return this.d.c($$1.s());
      }

      return eid.b.a;
   }

   public void a(cxk $$0, je $$1, @Nullable dpd $$2) {
      if ($$0 == cxk.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.d != null) {
         this.d.a($$1.s(), $$2);
      }
   }

   public void b(cwi $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.d != null) {
         this.d.b($$0, $$1);
      }
   }

   public int a(ib $$0, int $$1) {
      int $$2 = this.d == null ? 0 : this.d.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(je $$0) {
      long $$1 = $$0.s();
      return this.a == null || this.a.f.j($$1) && (this.d == null || this.d.f.j($$1));
   }

   public int c() {
      return this.c.al() + 2;
   }

   public int d() {
      return this.c.am() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
