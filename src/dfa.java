import javax.annotation.Nullable;

public abstract class dfa extends ddr {
   public static final String d = "LootTable";
   public static final String e = "LootTableSeed";
   @Nullable
   protected afw h;
   protected long i;

   protected dfa(ddz<?> $$0, ht $$1, dgb $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(cqf $$0, ate $$1, ht $$2, afw $$3) {
      ddx $$4 = $$0.c_($$2);
      if ($$4 instanceof dfa) {
         ((dfa)$$4).a($$3, $$1.g());
      }
   }

   protected boolean d(rt $$0) {
      if ($$0.b("LootTable", 8)) {
         this.h = new afw($$0.l("LootTable"));
         this.i = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   protected boolean e(rt $$0) {
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

   public void e(@Nullable ccx $$0) {
      if (this.h != null && this.o.n() != null) {
         edq $$1 = this.o.n().aH().getLootTable(this.h);
         if ($$0 instanceof alr) {
            al.N.a((alr)$$0, this.h);
         }

         this.h = null;
         edo.a $$2 = new edo.a((alq)this.o).a(eft.f, eif.b(this.p));
         if ($$0 != null) {
            $$2.a($$0.go()).a(eft.a, $$0);
         }

         $$1.a(this, $$2.a(efs.c), this.i);
      }
   }

   public void a(afw $$0, long $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public boolean ai_() {
      this.e(null);
      return this.f().stream().allMatch(ckj::b);
   }

   @Override
   public ckj a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public ckj a(int $$0, int $$1) {
      this.e(null);
      ckj $$2 = bhv.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public ckj b(int $$0) {
      this.e(null);
      return bhv.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, ckj $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }

      this.e();
   }

   @Override
   public boolean a(ccx $$0) {
      return bhu.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract il<ckj> f();

   protected abstract void a(il<ckj> var1);

   @Override
   public boolean d(ccx $$0) {
      return super.d($$0) && (this.h == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cfp createMenu(int $$0, ccw $$1, ccx $$2) {
      if (this.d($$2)) {
         this.e($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
