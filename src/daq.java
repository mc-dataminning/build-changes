import javax.annotation.Nullable;

public abstract class daq extends czh {
   public static final String d = "LootTable";
   public static final String e = "LootTableSeed";
   @Nullable
   protected acq h;
   protected long i;

   protected daq(czp<?> $$0, gu $$1, dcb $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(cls $$0, apf $$1, gu $$2, acq $$3) {
      czn $$4 = $$0.c_($$2);
      if ($$4 instanceof daq) {
         ((daq)$$4).a($$3, $$1.g());
      }
   }

   protected boolean d(qr $$0) {
      if ($$0.b("LootTable", 8)) {
         this.h = new acq($$0.l("LootTable"));
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

   public void e(@Nullable byo $$0) {
      if (this.h != null && this.o.n() != null) {
         dzs $$1 = this.o.n().aH().getLootTable(this.h);
         if ($$0 instanceof aig) {
            ai.N.a((aig)$$0, this.h);
         }

         this.h = null;
         dzq.a $$2 = new dzq.a((aif)this.o).a(ebw.f, eei.b(this.p));
         if ($$0 != null) {
            $$2.a($$0.gj()).a(ebw.a, $$0);
         }

         $$1.a(this, $$2.a(ebv.b), this.i);
      }
   }

   public void a(acq $$0, long $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public boolean ab_() {
      this.e(null);
      return this.f().stream().allMatch(cfz::b);
   }

   @Override
   public cfz a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public cfz a(int $$0, int $$1) {
      this.e(null);
      cfz $$2 = bdr.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cfz b(int $$0) {
      this.e(null);
      return bdr.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cfz $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ac_()) {
         $$1.f(this.ac_());
      }

      this.e();
   }

   @Override
   public boolean a(byo $$0) {
      return bdq.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract hn<cfz> f();

   protected abstract void a(hn<cfz> var1);

   @Override
   public boolean d(byo $$0) {
      return super.d($$0) && (this.h == null || !$$0.G_());
   }

   @Nullable
   @Override
   public cbf createMenu(int $$0, byn $$1, byo $$2) {
      if (this.d($$2)) {
         this.e($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
