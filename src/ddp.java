import javax.annotation.Nullable;

public abstract class ddp extends dcg {
   public static final String d = "LootTable";
   public static final String e = "LootTableSeed";
   @Nullable
   protected aer h;
   protected long i;

   protected ddp(dco<?> $$0, gu $$1, dfa $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(cos $$0, aru $$1, gu $$2, aer $$3) {
      dcm $$4 = $$0.c_($$2);
      if ($$4 instanceof ddp) {
         ((ddp)$$4).a($$3, $$1.g());
      }
   }

   protected boolean d(qr $$0) {
      if ($$0.b("LootTable", 8)) {
         this.h = new aer($$0.l("LootTable"));
         this.i = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   protected boolean e(qr $$0) {
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

   public void e(@Nullable cbn $$0) {
      if (this.h != null && this.o.n() != null) {
         ecp $$1 = this.o.n().aH().getLootTable(this.h);
         if ($$0 instanceof akl) {
            ai.N.a((akl)$$0, this.h);
         }

         this.h = null;
         ecn.a $$2 = new ecn.a((akk)this.o).a(ees.f, ehe.b(this.p));
         if ($$0 != null) {
            $$2.a($$0.gm()).a(ees.a, $$0);
         }

         $$1.a(this, $$2.a(eer.c), this.i);
      }
   }

   public void a(aer $$0, long $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public boolean ab_() {
      this.e(null);
      return this.f().stream().allMatch(ciy::b);
   }

   @Override
   public ciy a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public ciy a(int $$0, int $$1) {
      this.e(null);
      ciy $$2 = bgk.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public ciy b(int $$0) {
      this.e(null);
      return bgk.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, ciy $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ac_()) {
         $$1.f(this.ac_());
      }

      this.e();
   }

   @Override
   public boolean a(cbn $$0) {
      return bgj.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract hn<ciy> f();

   protected abstract void a(hn<ciy> var1);

   @Override
   public boolean d(cbn $$0) {
      return super.d($$0) && (this.h == null || !$$0.G_());
   }

   @Nullable
   @Override
   public cee createMenu(int $$0, cbm $$1, cbn $$2) {
      if (this.d($$2)) {
         this.e($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
