import javax.annotation.Nullable;

public class evv implements evy {
   public static final int b = 1;
   public static final evv c = new evv();
   protected final dix d;
   @Nullable
   private final evx<?, ?> a;
   @Nullable
   private final evx<?, ?> e;

   public evv(ecj $$0, boolean $$1, boolean $$2) {
      this.d = $$0.r();
      this.a = $$1 ? new evo($$0) : null;
      this.e = $$2 ? new evz($$0) : null;
   }

   private evv() {
      this.d = dix.e(0, 0);
      this.a = null;
      this.e = null;
   }

   @Override
   public void a(iu $$0) {
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
   public void a(jx $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void a(dic $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void b(dic $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.e != null) {
         this.e.b($$0);
      }
   }

   public evt a(dje $$0) {
      if ($$0 == dje.b) {
         return (evt)(this.a == null ? evt.a.a : this.a);
      } else {
         return (evt)(this.e == null ? evt.a.a : this.e);
      }
   }

   public String a(dje $$0, jx $$1) {
      if ($$0 == dje.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public evu.b b(dje $$0, jx $$1) {
      if ($$0 == dje.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.e != null) {
         return this.e.c($$1.s());
      }

      return evu.b.a;
   }

   public void a(dje $$0, jx $$1, @Nullable ecb $$2) {
      if ($$0 == dje.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2);
      }
   }

   public void b(dic $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.e != null) {
         this.e.b($$0, $$1);
      }
   }

   public int a(iu $$0, int $$1) {
      int $$2 = this.e == null ? 0 : this.e.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(long $$0) {
      return this.a == null || this.a.f.k($$0) && (this.e == null || this.e.f.k($$0));
   }

   public int c() {
      return this.d.ap() + 2;
   }

   public int d() {
      return this.d.aq() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
