import javax.annotation.Nullable;

public class eat implements eaw {
   public static final int b = 1;
   protected final crb c;
   @Nullable
   private final eav<?, ?> a;
   @Nullable
   private final eav<?, ?> d;

   public eat(dil $$0, boolean $$1, boolean $$2) {
      this.c = $$0.q();
      this.a = $$1 ? new eam($$0) : null;
      this.d = $$2 ? new eax($$0) : null;
   }

   @Override
   public void a(ht $$0) {
      if (this.a != null) {
         this.a.a($$0);
      }

      if (this.d != null) {
         this.d.a($$0);
      }
   }

   @Override
   public boolean K_() {
      return this.d != null && this.d.K_() ? true : this.a != null && this.a.K_();
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
   public void a(iu $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void a(cqg $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void b(cqg $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.d != null) {
         this.d.b($$0);
      }
   }

   public ear a(cri $$0) {
      if ($$0 == cri.b) {
         return (ear)(this.a == null ? ear.a.a : this.a);
      } else {
         return (ear)(this.d == null ? ear.a.a : this.d);
      }
   }

   public String a(cri $$0, iu $$1) {
      if ($$0 == cri.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.d != null) {
         return this.d.b($$1.s());
      }

      return "n/a";
   }

   public eas.b b(cri $$0, iu $$1) {
      if ($$0 == cri.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.d != null) {
         return this.d.c($$1.s());
      }

      return eas.b.a;
   }

   public void a(cri $$0, iu $$1, @Nullable did $$2) {
      if ($$0 == cri.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.d != null) {
         this.d.a($$1.s(), $$2);
      }
   }

   public void b(cqg $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.d != null) {
         this.d.b($$0, $$1);
      }
   }

   public int a(ht $$0, int $$1) {
      int $$2 = this.d == null ? 0 : this.d.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(iu $$0) {
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
