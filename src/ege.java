import javax.annotation.Nullable;

public class ege implements egh {
   public static final int b = 1;
   protected final cvp c;
   @Nullable
   private final egg<?, ?> a;
   @Nullable
   private final egg<?, ?> d;

   public ege(dnp $$0, boolean $$1, boolean $$2) {
      this.c = $$0.q();
      this.a = $$1 ? new efx($$0) : null;
      this.d = $$2 ? new egi($$0) : null;
   }

   @Override
   public void a(hz $$0) {
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
   public void a(jb $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void a(cuu $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void b(cuu $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.d != null) {
         this.d.b($$0);
      }
   }

   public egc a(cvw $$0) {
      if ($$0 == cvw.b) {
         return (egc)(this.a == null ? egc.a.a : this.a);
      } else {
         return (egc)(this.d == null ? egc.a.a : this.d);
      }
   }

   public String a(cvw $$0, jb $$1) {
      if ($$0 == cvw.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.d != null) {
         return this.d.b($$1.s());
      }

      return "n/a";
   }

   public egd.b b(cvw $$0, jb $$1) {
      if ($$0 == cvw.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.d != null) {
         return this.d.c($$1.s());
      }

      return egd.b.a;
   }

   public void a(cvw $$0, jb $$1, @Nullable dnh $$2) {
      if ($$0 == cvw.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.d != null) {
         this.d.a($$1.s(), $$2);
      }
   }

   public void b(cuu $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.d != null) {
         this.d.b($$0, $$1);
      }
   }

   public int a(hz $$0, int $$1) {
      int $$2 = this.d == null ? 0 : this.d.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(jb $$0) {
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
