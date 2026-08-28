import javax.annotation.Nullable;

public class eqe implements eqh {
   public static final int b = 1;
   public static final eqe c = new eqe();
   protected final dei d;
   @Nullable
   private final eqg<?, ?> a;
   @Nullable
   private final eqg<?, ?> e;

   public eqe(dwx $$0, boolean $$1, boolean $$2) {
      this.d = $$0.q();
      this.a = $$1 ? new epx($$0) : null;
      this.e = $$2 ? new eqi($$0) : null;
   }

   private eqe() {
      this.d = dei.e(0, 0);
      this.a = null;
      this.e = null;
   }

   @Override
   public void a(je $$0) {
      if (this.a != null) {
         this.a.a($$0);
      }

      if (this.e != null) {
         this.e.a($$0);
      }
   }

   @Override
   public boolean I_() {
      return this.e != null && this.e.I_() ? true : this.a != null && this.a.I_();
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
   public void a(kg $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void a(ddm $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void b(ddm $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.e != null) {
         this.e.b($$0);
      }
   }

   public eqc a(dep $$0) {
      if ($$0 == dep.b) {
         return (eqc)(this.a == null ? eqc.a.a : this.a);
      } else {
         return (eqc)(this.e == null ? eqc.a.a : this.e);
      }
   }

   public String a(dep $$0, kg $$1) {
      if ($$0 == dep.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public eqd.b b(dep $$0, kg $$1) {
      if ($$0 == dep.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.e != null) {
         return this.e.c($$1.s());
      }

      return eqd.b.a;
   }

   public void a(dep $$0, kg $$1, @Nullable dwp $$2) {
      if ($$0 == dep.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2);
      }
   }

   public void b(ddm $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.e != null) {
         this.e.b($$0, $$1);
      }
   }

   public int a(je $$0, int $$1) {
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
