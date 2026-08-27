import javax.annotation.Nullable;

public abstract class ddy extends dcp {
   public static final String d = "LootTable";
   public static final String e = "LootTableSeed";
   @Nullable
   protected aew h;
   protected long i;

   protected ddy(dcx<?> $$0, gw $$1, dfj $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(cpb $$0, asc $$1, gw $$2, aew $$3) {
      dcv $$4 = $$0.c_($$2);
      if ($$4 instanceof ddy) {
         ((ddy)$$4).a($$3, $$1.g());
      }
   }

   protected boolean d(qw $$0) {
      if ($$0.b("LootTable", 8)) {
         this.h = new aew($$0.l("LootTable"));
         this.i = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   protected boolean e(qw $$0) {
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

   public void e(@Nullable cbu $$0) {
      if (this.h != null && this.o.n() != null) {
         ecy $$1 = this.o.n().aH().getLootTable(this.h);
         if ($$0 instanceof akr) {
            al.N.a((akr)$$0, this.h);
         }

         this.h = null;
         ecw.a $$2 = new ecw.a((akq)this.o).a(efb.f, ehn.b(this.p));
         if ($$0 != null) {
            $$2.a($$0.gn()).a(efb.a, $$0);
         }

         $$1.a(this, $$2.a(efa.c), this.i);
      }
   }

   public void a(aew $$0, long $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public boolean af_() {
      this.e(null);
      return this.f().stream().allMatch(cjf::b);
   }

   @Override
   public cjf a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public cjf a(int $$0, int $$1) {
      this.e(null);
      cjf $$2 = bgs.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cjf b(int $$0) {
      this.e(null);
      return bgs.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cjf $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }

      this.e();
   }

   @Override
   public boolean a(cbu $$0) {
      return bgr.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract hn<cjf> f();

   protected abstract void a(hn<cjf> var1);

   @Override
   public boolean d(cbu $$0) {
      return super.d($$0) && (this.h == null || !$$0.M_());
   }

   @Nullable
   @Override
   public cel createMenu(int $$0, cbt $$1, cbu $$2) {
      if (this.d($$2)) {
         this.e($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
