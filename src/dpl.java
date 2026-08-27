import javax.annotation.Nullable;

public abstract class dpl extends doa implements bqc {
   @Nullable
   protected akl<epk> l;
   protected long m = 0L;

   protected dpl(doi<?> $$0, io $$1, drb $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public akl<epk> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable akl<epk> $$0) {
      this.l = $$0;
   }

   @Override
   public long ay_() {
      return this.m;
   }

   @Override
   public void a(long $$0) {
      this.m = $$0;
   }

   @Override
   public boolean c() {
      this.e_(null);
      return super.c();
   }

   @Override
   public cto a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cto a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cto b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cto $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(clw $$0) {
      return super.d($$0) && (this.l == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cot createMenu(int $$0, clv $$1, clw $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dog.b $$0) {
      super.a($$0);
      cwr $$1 = $$0.a(kb.ad);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(jx.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kb.ad, new cwr(this.l, this.m));
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
