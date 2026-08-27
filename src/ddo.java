import javax.annotation.Nullable;

public abstract class ddo extends dcf {
   public static final String d = "LootTable";
   public static final String e = "LootTableSeed";
   @Nullable
   protected aer h;
   protected long i;

   protected ddo(dcn<?> $$0, gu $$1, dez $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(cor $$0, aru $$1, gu $$2, aer $$3) {
      dcl $$4 = $$0.c_($$2);
      if ($$4 instanceof ddo) {
         ((ddo)$$4).a($$3, $$1.g());
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

   public void e(@Nullable cbm $$0) {
      if (this.h != null && this.o.n() != null) {
         eco $$1 = this.o.n().aH().getLootTable(this.h);
         if ($$0 instanceof akl) {
            ai.N.a((akl)$$0, this.h);
         }

         this.h = null;
         ecm.a $$2 = new ecm.a((akk)this.o).a(eer.f, ehd.b(this.p));
         if ($$0 != null) {
            $$2.a($$0.gm()).a(eer.a, $$0);
         }

         $$1.a(this, $$2.a(eeq.c), this.i);
      }
   }

   public void a(aer $$0, long $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public boolean aa_() {
      this.e(null);
      return this.f().stream().allMatch(cix::b);
   }

   @Override
   public cix a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public cix a(int $$0, int $$1) {
      this.e(null);
      cix $$2 = bgk.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cix b(int $$0) {
      this.e(null);
      return bgk.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cix $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ab_()) {
         $$1.f(this.ab_());
      }

      this.e();
   }

   @Override
   public boolean a(cbm $$0) {
      return bgj.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract hn<cix> f();

   protected abstract void a(hn<cix> var1);

   @Override
   public boolean d(cbm $$0) {
      return super.d($$0) && (this.h == null || !$$0.G_());
   }

   @Nullable
   @Override
   public ced createMenu(int $$0, cbl $$1, cbm $$2) {
      if (this.d($$2)) {
         this.e($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
