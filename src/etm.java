import javax.annotation.Nullable;

public class etm implements etp {
   public static final int b = 1;
   public static final etm c = new etm();
   protected final dhk d;
   @Nullable
   private final eto<?, ?> a;
   @Nullable
   private final eto<?, ?> e;

   public etm(ead $$0, boolean $$1, boolean $$2) {
      this.d = $$0.q();
      this.a = $$1 ? new etf($$0) : null;
      this.e = $$2 ? new etq($$0) : null;
   }

   private etm() {
      this.d = dhk.e(0, 0);
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
   public boolean N_() {
      return this.e != null && this.e.N_() ? true : this.a != null && this.a.N_();
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
   public void a(dgo $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void b(dgo $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.e != null) {
         this.e.b($$0);
      }
   }

   public etk a(dhr $$0) {
      if ($$0 == dhr.b) {
         return (etk)(this.a == null ? etk.a.a : this.a);
      } else {
         return (etk)(this.e == null ? etk.a.a : this.e);
      }
   }

   public String a(dhr $$0, kj $$1) {
      if ($$0 == dhr.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public etl.b b(dhr $$0, kj $$1) {
      if ($$0 == dhr.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.e != null) {
         return this.e.c($$1.s());
      }

      return etl.b.a;
   }

   public void a(dhr $$0, kj $$1, @Nullable dzv $$2) {
      if ($$0 == dhr.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2);
      }
   }

   public void b(dgo $$0, boolean $$1) {
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
      return this.d.an() + 2;
   }

   public int d() {
      return this.d.ao() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
