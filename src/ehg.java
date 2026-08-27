import javax.annotation.Nullable;

public class ehg implements ehj {
   public static final int b = 1;
   protected final cwg c;
   @Nullable
   private final ehi<?, ?> a;
   @Nullable
   private final ehi<?, ?> d;

   public ehg(doo $$0, boolean $$1, boolean $$2) {
      this.c = $$0.q();
      this.a = $$1 ? new egz($$0) : null;
      this.d = $$2 ? new ehk($$0) : null;
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
   public void a(jd $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void a(cvl $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void b(cvl $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.d != null) {
         this.d.b($$0);
      }
   }

   public ehe a(cwn $$0) {
      if ($$0 == cwn.b) {
         return (ehe)(this.a == null ? ehe.a.a : this.a);
      } else {
         return (ehe)(this.d == null ? ehe.a.a : this.d);
      }
   }

   public String a(cwn $$0, jd $$1) {
      if ($$0 == cwn.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.d != null) {
         return this.d.b($$1.s());
      }

      return "n/a";
   }

   public ehf.b b(cwn $$0, jd $$1) {
      if ($$0 == cwn.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.d != null) {
         return this.d.c($$1.s());
      }

      return ehf.b.a;
   }

   public void a(cwn $$0, jd $$1, @Nullable dog $$2) {
      if ($$0 == cwn.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.d != null) {
         this.d.a($$1.s(), $$2);
      }
   }

   public void b(cvl $$0, boolean $$1) {
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

   public boolean a(jd $$0) {
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
