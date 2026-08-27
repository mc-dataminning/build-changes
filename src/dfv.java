import javax.annotation.Nullable;

public abstract class dfv extends del {
   public static final String k = "LootTable";
   public static final String l = "LootTableSeed";
   @Nullable
   protected agg m;
   protected long n;

   protected dfv(det<?> $$0, ht $$1, dgw $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(cqy $$0, ato $$1, ht $$2, agg $$3) {
      der $$4 = $$0.c_($$2);
      if ($$4 instanceof dfv) {
         ((dfv)$$4).a($$3, $$1.g());
      }
   }

   protected boolean d(rz $$0) {
      if ($$0.b("LootTable", 8)) {
         this.m = new agg($$0.l("LootTable"));
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

   public void e(@Nullable cdm $$0) {
      if (this.m != null && this.o.n() != null) {
         eet $$1 = this.o.n().aH().getLootTable(this.m);
         if ($$0 instanceof amb) {
            al.N.a((amb)$$0, this.m);
         }

         this.m = null;
         eer.a $$2 = new eer.a((ama)this.o).a(egw.f, eji.b(this.p));
         if ($$0 != null) {
            $$2.a($$0.go()).a(egw.a, $$0);
         }

         $$1.a(this, $$2.a(egv.c), this.n);
      }
   }

   public void a(agg $$0, long $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public boolean ai_() {
      this.e(null);
      return this.f().stream().allMatch(clb::b);
   }

   @Override
   public clb a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public clb a(int $$0, int $$1) {
      this.e(null);
      clb $$2 = bik.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public clb b(int $$0) {
      this.e(null);
      return bik.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, clb $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }

      this.e();
   }

   @Override
   public boolean a(cdm $$0) {
      return bij.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract il<clb> f();

   protected abstract void a(il<clb> var1);

   @Override
   public boolean d(cdm $$0) {
      return super.d($$0) && (this.m == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cge createMenu(int $$0, cdl $$1, cdm $$2) {
      if (this.d($$2)) {
         this.e($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
