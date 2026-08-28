import javax.annotation.Nullable;

public class eui implements eul {
   public static final int b = 1;
   public static final eui c = new eui();
   protected final dhr d;
   @Nullable
   private final euk<?, ?> a;
   @Nullable
   private final euk<?, ?> e;

   public eui(eaw $$0, boolean $$1, boolean $$2) {
      this.d = $$0.r();
      this.a = $$1 ? new eub($$0) : null;
      this.e = $$2 ? new eum($$0) : null;
   }

   private eui() {
      this.d = dhr.e(0, 0);
      this.a = null;
      this.e = null;
   }

   @Override
   public void a(jj $$0) {
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
   public void a(kl $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void a(dgw $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void b(dgw $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.e != null) {
         this.e.b($$0);
      }
   }

   public eug a(dhy $$0) {
      if ($$0 == dhy.b) {
         return (eug)(this.a == null ? eug.a.a : this.a);
      } else {
         return (eug)(this.e == null ? eug.a.a : this.e);
      }
   }

   public String a(dhy $$0, kl $$1) {
      if ($$0 == dhy.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public euh.b b(dhy $$0, kl $$1) {
      if ($$0 == dhy.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.e != null) {
         return this.e.c($$1.s());
      }

      return euh.b.a;
   }

   public void a(dhy $$0, kl $$1, @Nullable eao $$2) {
      if ($$0 == dhy.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2);
      }
   }

   public void b(dgw $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.e != null) {
         this.e.b($$0, $$1);
      }
   }

   public int a(jj $$0, int $$1) {
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
