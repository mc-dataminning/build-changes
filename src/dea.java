import javax.annotation.Nullable;

public abstract class dea extends dcr {
   public static final String d = "LootTable";
   public static final String e = "LootTableSeed";
   @Nullable
   protected aey h;
   protected long i;

   protected dea(dcz<?> $$0, gw $$1, dfl $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(cpd $$0, ase $$1, gw $$2, aey $$3) {
      dcx $$4 = $$0.c_($$2);
      if ($$4 instanceof dea) {
         ((dea)$$4).a($$3, $$1.g());
      }
   }

   protected boolean d(qy $$0) {
      if ($$0.b("LootTable", 8)) {
         this.h = new aey($$0.l("LootTable"));
         this.i = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   protected boolean e(qy $$0) {
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

   public void e(@Nullable cbw $$0) {
      if (this.h != null && this.o.n() != null) {
         eda $$1 = this.o.n().aH().getLootTable(this.h);
         if ($$0 instanceof akt) {
            al.N.a((akt)$$0, this.h);
         }

         this.h = null;
         ecy.a $$2 = new ecy.a((aks)this.o).a(efd.f, ehp.b(this.p));
         if ($$0 != null) {
            $$2.a($$0.gn()).a(efd.a, $$0);
         }

         $$1.a(this, $$2.a(efc.c), this.i);
      }
   }

   public void a(aey $$0, long $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public boolean af_() {
      this.e(null);
      return this.f().stream().allMatch(cjh::b);
   }

   @Override
   public cjh a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public cjh a(int $$0, int $$1) {
      this.e(null);
      cjh $$2 = bgu.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cjh b(int $$0) {
      this.e(null);
      return bgu.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cjh $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }

      this.e();
   }

   @Override
   public boolean a(cbw $$0) {
      return bgt.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract hp<cjh> f();

   protected abstract void a(hp<cjh> var1);

   @Override
   public boolean d(cbw $$0) {
      return super.d($$0) && (this.h == null || !$$0.M_());
   }

   @Nullable
   @Override
   public cen createMenu(int $$0, cbv $$1, cbw $$2) {
      if (this.d($$2)) {
         this.e($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
