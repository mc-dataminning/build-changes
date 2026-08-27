import javax.annotation.Nullable;

public class ech implements eck {
   public static final int b = 1;
   protected final csc c;
   @Nullable
   private final ecj<?, ?> a;
   @Nullable
   private final ecj<?, ?> d;

   public ech(djs $$0, boolean $$1, boolean $$2) {
      this.c = $$0.q();
      this.a = $$1 ? new eca($$0) : null;
      this.d = $$2 ? new ecl($$0) : null;
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
   public void a(crh $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.d != null) {
         this.d.a($$0, $$1);
      }
   }

   @Override
   public void b(crh $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.d != null) {
         this.d.b($$0);
      }
   }

   public ecf a(csj $$0) {
      if ($$0 == csj.b) {
         return (ecf)(this.a == null ? ecf.a.a : this.a);
      } else {
         return (ecf)(this.d == null ? ecf.a.a : this.d);
      }
   }

   public String a(csj $$0, iu $$1) {
      if ($$0 == csj.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.d != null) {
         return this.d.b($$1.s());
      }

      return "n/a";
   }

   public ecg.b b(csj $$0, iu $$1) {
      if ($$0 == csj.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.d != null) {
         return this.d.c($$1.s());
      }

      return ecg.b.a;
   }

   public void a(csj $$0, iu $$1, @Nullable djk $$2) {
      if ($$0 == csj.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.d != null) {
         this.d.a($$1.s(), $$2);
      }
   }

   public void b(crh $$0, boolean $$1) {
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
      return this.c.al() + 2;
   }

   public int d() {
      return this.c.am() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
