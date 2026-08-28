import javax.annotation.Nullable;

public class eqi implements eql {
   public static final int b = 1;
   public static final eqi c = new eqi();
   protected final del d;
   @Nullable
   private final eqk<?, ?> a;
   @Nullable
   private final eqk<?, ?> e;

   public eqi(dxb $$0, boolean $$1, boolean $$2) {
      this.d = $$0.q();
      this.a = $$1 ? new eqb($$0) : null;
      this.e = $$2 ? new eqm($$0) : null;
   }

   private eqi() {
      this.d = del.e(0, 0);
      this.a = null;
      this.e = null;
   }

   @Override
   public void a(jf $$0) {
      if (this.a != null) {
         this.a.a($$0);
      }

      if (this.e != null) {
         this.e.a($$0);
      }
   }

   @Override
   public boolean J_() {
      return this.e != null && this.e.J_() ? true : this.a != null && this.a.J_();
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
   public void a(kh $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void a(ddp $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void b(ddp $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.e != null) {
         this.e.b($$0);
      }
   }

   public eqg a(des $$0) {
      if ($$0 == des.b) {
         return (eqg)(this.a == null ? eqg.a.a : this.a);
      } else {
         return (eqg)(this.e == null ? eqg.a.a : this.e);
      }
   }

   public String a(des $$0, kh $$1) {
      if ($$0 == des.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public eqh.b b(des $$0, kh $$1) {
      if ($$0 == des.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.e != null) {
         return this.e.c($$1.s());
      }

      return eqh.b.a;
   }

   public void a(des $$0, kh $$1, @Nullable dwt $$2) {
      if ($$0 == des.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2);
      }
   }

   public void b(ddp $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.e != null) {
         this.e.b($$0, $$1);
      }
   }

   public int a(jf $$0, int $$1) {
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
