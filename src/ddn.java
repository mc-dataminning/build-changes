import javax.annotation.Nullable;

public abstract class ddn extends dce {
   public static final String d = "LootTable";
   public static final String e = "LootTableSeed";
   @Nullable
   protected aep h;
   protected long i;

   protected ddn(dcm<?> $$0, gv $$1, dey $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(coq $$0, art $$1, gv $$2, aep $$3) {
      dck $$4 = $$0.c_($$2);
      if ($$4 instanceof ddn) {
         ((ddn)$$4).a($$3, $$1.g());
      }
   }

   protected boolean d(qs $$0) {
      if ($$0.b("LootTable", 8)) {
         this.h = new aep($$0.l("LootTable"));
         this.i = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   protected boolean e(qs $$0) {
      if (this.h == null) {
         return false;
      } else {
         $$0.a("LootTable", this.h.toString());
         if (this.i != 0L) {
            $$0.a("LootTableSeed", this.i);
         }

         return true;
      }
   }

   public void e(@Nullable cbl $$0) {
      if (this.h != null && this.o.n() != null) {
         ecp $$1 = this.o.n().aH().getLootTable(this.h);
         if ($$0 instanceof akj) {
            ai.N.a((akj)$$0, this.h);
         }

         this.h = null;
         ecn.a $$2 = new ecn.a((aki)this.o).a(eet.f, ehf.b(this.p));
         if ($$0 != null) {
            $$2.a($$0.gm()).a(eet.a, $$0);
         }

         $$1.a(this, $$2.a(ees.b), this.i);
      }
   }

   public void a(aep $$0, long $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public boolean ab_() {
      this.e(null);
      return this.f().stream().allMatch(ciw::b);
   }

   @Override
   public ciw a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public ciw a(int $$0, int $$1) {
      this.e(null);
      ciw $$2 = bgi.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public ciw b(int $$0) {
      this.e(null);
      return bgi.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, ciw $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ac_()) {
         $$1.f(this.ac_());
      }

      this.e();
   }

   @Override
   public boolean a(cbl $$0) {
      return bgh.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract ho<ciw> f();

   protected abstract void a(ho<ciw> var1);

   @Override
   public boolean d(cbl $$0) {
      return super.d($$0) && (this.h == null || !$$0.G_());
   }

   @Nullable
   @Override
   public cec createMenu(int $$0, cbk $$1, cbl $$2) {
      if (this.d($$2)) {
         this.e($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
