import javax.annotation.Nullable;

public abstract class dec extends dct {
   public static final String d = "LootTable";
   public static final String e = "LootTableSeed";
   @Nullable
   protected aez h;
   protected long i;

   protected dec(ddb<?> $$0, gw $$1, dfd $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(cph $$0, ash $$1, gw $$2, aez $$3) {
      dcz $$4 = $$0.c_($$2);
      if ($$4 instanceof dec) {
         ((dec)$$4).a($$3, $$1.g());
      }
   }

   protected boolean d(qw $$0) {
      if ($$0.b("LootTable", 8)) {
         this.h = new aez($$0.l("LootTable"));
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

   public void e(@Nullable cca $$0) {
      if (this.h != null && this.o.n() != null) {
         ecs $$1 = this.o.n().aH().getLootTable(this.h);
         if ($$0 instanceof aku) {
            al.N.a((aku)$$0, this.h);
         }

         this.h = null;
         ecq.a $$2 = new ecq.a((akt)this.o).a(eev.f, ehh.b(this.p));
         if ($$0 != null) {
            $$2.a($$0.go()).a(eev.a, $$0);
         }

         $$1.a(this, $$2.a(eeu.c), this.i);
      }
   }

   public void a(aez $$0, long $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public boolean af_() {
      this.e(null);
      return this.f().stream().allMatch(cjl::b);
   }

   @Override
   public cjl a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public cjl a(int $$0, int $$1) {
      this.e(null);
      cjl $$2 = bgy.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cjl b(int $$0) {
      this.e(null);
      return bgy.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cjl $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }

      this.e();
   }

   @Override
   public boolean a(cca $$0) {
      return bgx.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract hn<cjl> f();

   protected abstract void a(hn<cjl> var1);

   @Override
   public boolean d(cca $$0) {
      return super.d($$0) && (this.h == null || !$$0.M_());
   }

   @Nullable
   @Override
   public cer createMenu(int $$0, cbz $$1, cca $$2) {
      if (this.d($$2)) {
         this.e($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
