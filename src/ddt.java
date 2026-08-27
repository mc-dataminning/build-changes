import javax.annotation.Nullable;

public abstract class ddt extends dck {
   public static final String d = "LootTable";
   public static final String e = "LootTableSeed";
   @Nullable
   protected aeu h;
   protected long i;

   protected ddt(dcs<?> $$0, gw $$1, dfe $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(cow $$0, arx $$1, gw $$2, aeu $$3) {
      dcq $$4 = $$0.c_($$2);
      if ($$4 instanceof ddt) {
         ((ddt)$$4).a($$3, $$1.g());
      }
   }

   protected boolean d(qu $$0) {
      if ($$0.b("LootTable", 8)) {
         this.h = new aeu($$0.l("LootTable"));
         this.i = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   protected boolean e(qu $$0) {
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

   public void e(@Nullable cbp $$0) {
      if (this.h != null && this.o.n() != null) {
         ect $$1 = this.o.n().aH().getLootTable(this.h);
         if ($$0 instanceof ako) {
            al.N.a((ako)$$0, this.h);
         }

         this.h = null;
         ecr.a $$2 = new ecr.a((akn)this.o).a(eew.f, ehi.b(this.p));
         if ($$0 != null) {
            $$2.a($$0.gm()).a(eew.a, $$0);
         }

         $$1.a(this, $$2.a(eev.c), this.i);
      }
   }

   public void a(aeu $$0, long $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public boolean aa_() {
      this.e(null);
      return this.f().stream().allMatch(cja::b);
   }

   @Override
   public cja a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public cja a(int $$0, int $$1) {
      this.e(null);
      cja $$2 = bgn.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cja b(int $$0) {
      this.e(null);
      return bgn.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cja $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ab_()) {
         $$1.f(this.ab_());
      }

      this.e();
   }

   @Override
   public boolean a(cbp $$0) {
      return bgm.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract hp<cja> f();

   protected abstract void a(hp<cja> var1);

   @Override
   public boolean d(cbp $$0) {
      return super.d($$0) && (this.h == null || !$$0.G_());
   }

   @Nullable
   @Override
   public ceg createMenu(int $$0, cbo $$1, cbp $$2) {
      if (this.d($$2)) {
         this.e($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
