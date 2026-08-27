import javax.annotation.Nullable;

public class eeg implements eej {
   public static final int b = 1;
   protected final ctr c;
   @Nullable
   private final eei<?, ?> a;
   @Nullable
   private final eei<?, ?> d;

   public eeg(dlr $$0, boolean $$1, boolean $$2) {
      this.c = $$0.q();
      this.a = $$1 ? new edz($$0) : null;
      this.d = $$2 ? new eek($$0) : null;
   }

   @Override
   public void a(hx $$0) {
      if (this.a != null) {
         this.a.a($$0);
      }

      if (this.d != null) {
         this.d.a($$0);
      }
   }

   @Override
   public boolean L_() {
      return this.d != null && this.d.L_() ? true : this.a != null && this.a.L_();
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
   public void a(iz $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void a(csw $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void b(csw $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.d != null) {
         this.d.b($$0);
      }
   }

   public eee a(cty $$0) {
      if ($$0 == cty.b) {
         return (eee)(this.a == null ? eee.a.a : this.a);
      } else {
         return (eee)(this.d == null ? eee.a.a : this.d);
      }
   }

   public String a(cty $$0, iz $$1) {
      if ($$0 == cty.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.d != null) {
         return this.d.b($$1.s());
      }

      return "n/a";
   }

   public eef.b b(cty $$0, iz $$1) {
      if ($$0 == cty.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.d != null) {
         return this.d.c($$1.s());
      }

      return eef.b.a;
   }

   public void a(cty $$0, iz $$1, @Nullable dlj $$2) {
      if ($$0 == cty.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.d != null) {
         this.d.a($$1.s(), $$2);
      }
   }

   public void b(csw $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.d != null) {
         this.d.b($$0, $$1);
      }
   }

   public int a(hx $$0, int $$1) {
      int $$2 = this.d == null ? 0 : this.d.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(iz $$0) {
      long $$1 = $$0.s();
      return this.a == null || this.a.f.j($$1) && (this.d == null || this.d.f.j($$1));
   }

   public int c() {
      return this.c.am() + 2;
   }

   public int d() {
      return this.c.an() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
