import javax.annotation.Nullable;

public class etf implements eti {
   public static final int b = 1;
   public static final etf c = new etf();
   protected final dhb d;
   @Nullable
   private final eth<?, ?> a;
   @Nullable
   private final eth<?, ?> e;

   public etf(dzw $$0, boolean $$1, boolean $$2) {
      this.d = $$0.q();
      this.a = $$1 ? new esy($$0) : null;
      this.e = $$2 ? new etj($$0) : null;
   }

   private etf() {
      this.d = dhb.e(0, 0);
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
   public void a(dgf $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void b(dgf $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.e != null) {
         this.e.b($$0);
      }
   }

   public etd a(dhi $$0) {
      if ($$0 == dhi.b) {
         return (etd)(this.a == null ? etd.a.a : this.a);
      } else {
         return (etd)(this.e == null ? etd.a.a : this.e);
      }
   }

   public String a(dhi $$0, kj $$1) {
      if ($$0 == dhi.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public ete.b b(dhi $$0, kj $$1) {
      if ($$0 == dhi.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.e != null) {
         return this.e.c($$1.s());
      }

      return ete.b.a;
   }

   public void a(dhi $$0, kj $$1, @Nullable dzo $$2) {
      if ($$0 == dhi.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2);
      }
   }

   public void b(dgf $$0, boolean $$1) {
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
      return this.d.ao() + 2;
   }

   public int d() {
      return this.d.ap() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
