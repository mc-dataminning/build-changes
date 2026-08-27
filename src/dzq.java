import javax.annotation.Nullable;

public class dzq implements dzt {
   public static final int b = 1;
   protected final cpm c;
   @Nullable
   private final dzs<?, ?> a;
   @Nullable
   private final dzs<?, ?> d;

   public dzq(dhi $$0, boolean $$1, boolean $$2) {
      this.c = $$0.q();
      this.a = $$1 ? new dzj($$0) : null;
      this.d = $$2 ? new dzu($$0) : null;
   }

   @Override
   public void a(gv $$0) {
      if (this.a != null) {
         this.a.a($$0);
      }

      if (this.d != null) {
         this.d.a($$0);
      }
   }

   @Override
   public boolean E_() {
      return this.d != null && this.d.E_() ? true : this.a != null && this.a.E_();
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
   public void a(hy $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void a(cor $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void b(cor $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.d != null) {
         this.d.b($$0);
      }
   }

   public dzo a(cpt $$0) {
      if ($$0 == cpt.b) {
         return (dzo)(this.a == null ? dzo.a.a : this.a);
      } else {
         return (dzo)(this.d == null ? dzo.a.a : this.d);
      }
   }

   public String a(cpt $$0, hy $$1) {
      if ($$0 == cpt.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.d != null) {
         return this.d.b($$1.s());
      }

      return "n/a";
   }

   public dzp.b b(cpt $$0, hy $$1) {
      if ($$0 == cpt.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.d != null) {
         return this.d.c($$1.s());
      }

      return dzp.b.a;
   }

   public void a(cpt $$0, hy $$1, @Nullable dha $$2) {
      if ($$0 == cpt.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.d != null) {
         this.d.a($$1.s(), $$2);
      }
   }

   public void b(cor $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.d != null) {
         this.d.b($$0, $$1);
      }
   }

   public int a(gv $$0, int $$1) {
      int $$2 = this.d == null ? 0 : this.d.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(hy $$0) {
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
