import javax.annotation.Nullable;

public class etl implements eto {
   public static final int b = 1;
   public static final etl c = new etl();
   protected final dhj d;
   @Nullable
   private final etn<?, ?> a;
   @Nullable
   private final etn<?, ?> e;

   public etl(eac $$0, boolean $$1, boolean $$2) {
      this.d = $$0.q();
      this.a = $$1 ? new ete($$0) : null;
      this.e = $$2 ? new etp($$0) : null;
   }

   private etl() {
      this.d = dhj.e(0, 0);
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
   public void a(dgn $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void b(dgn $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.e != null) {
         this.e.b($$0);
      }
   }

   public etj a(dhq $$0) {
      if ($$0 == dhq.b) {
         return (etj)(this.a == null ? etj.a.a : this.a);
      } else {
         return (etj)(this.e == null ? etj.a.a : this.e);
      }
   }

   public String a(dhq $$0, kj $$1) {
      if ($$0 == dhq.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public etk.b b(dhq $$0, kj $$1) {
      if ($$0 == dhq.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.e != null) {
         return this.e.c($$1.s());
      }

      return etk.b.a;
   }

   public void a(dhq $$0, kj $$1, @Nullable dzu $$2) {
      if ($$0 == dhq.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2);
      }
   }

   public void b(dgn $$0, boolean $$1) {
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
