import javax.annotation.Nullable;

public abstract class dgh extends dex {
   public static final String k = "LootTable";
   public static final String l = "LootTableSeed";
   @Nullable
   protected agi m;
   protected long n;

   protected dgh(dff<?> $$0, ht $$1, dhi $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(crg $$0, ats $$1, ht $$2, agi $$3) {
      dfd $$4 = $$0.c_($$2);
      if ($$4 instanceof dgh) {
         ((dgh)$$4).a($$3, $$1.g());
      }
   }

   protected boolean d(rz $$0) {
      if ($$0.b("LootTable", 8)) {
         this.m = new agi($$0.l("LootTable"));
         this.n = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   protected boolean e(rz $$0) {
      if (this.m == null) {
         return false;
      } else {
         $$0.a("LootTable", this.m.toString());
         if (this.n != 0L) {
            $$0.a("LootTableSeed", this.n);
         }

         return true;
      }
   }

   public void e(@Nullable cdu $$0) {
      if (this.m != null && this.o.n() != null) {
         eff $$1 = this.o.n().aJ().getLootTable(this.m);
         if ($$0 instanceof amf) {
            al.N.a((amf)$$0, this.m);
         }

         this.m = null;
         efd.a $$2 = new efd.a((ame)this.o).a(ehi.f, eju.b(this.p));
         if ($$0 != null) {
            $$2.a($$0.gp()).a(ehi.a, $$0);
         }

         $$1.a(this, $$2.a(ehh.c), this.n);
      }
   }

   public void a(agi $$0, long $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public boolean ai_() {
      this.e(null);
      return this.f().stream().allMatch(clj::b);
   }

   @Override
   public clj a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public clj a(int $$0, int $$1) {
      this.e(null);
      clj $$2 = bir.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public clj b(int $$0) {
      this.e(null);
      return bir.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, clj $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }

      this.e();
   }

   @Override
   public boolean a(cdu $$0) {
      return biq.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract il<clj> f();

   protected abstract void a(il<clj> var1);

   @Override
   public boolean d(cdu $$0) {
      return super.d($$0) && (this.m == null || !$$0.O_());
   }

   @Nullable
   @Override
   public cgm createMenu(int $$0, cdt $$1, cdu $$2) {
      if (this.d($$2)) {
         this.e($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
