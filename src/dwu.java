import javax.annotation.Nullable;

public abstract class dwu extends dve implements btw {
   @Nullable
   protected alc<exq> l;
   protected long m = 0L;

   protected dwu(dvn<?> $$0, jj $$1, dym $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public alc<exq> as_() {
      return this.l;
   }

   @Override
   public void a(@Nullable alc<exq> $$0) {
      this.l = $$0;
   }

   @Override
   public long av_() {
      return this.m;
   }

   @Override
   public void a(long $$0) {
      this.m = $$0;
   }

   @Override
   public boolean c() {
      this.d_(null);
      return super.c();
   }

   @Override
   public cxy a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cxy a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cxy b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cxy $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cqi $$0) {
      return super.d($$0) && (this.l == null || !$$0.U_());
   }

   @Nullable
   @Override
   public ctn createMenu(int $$0, cqh $$1, cqi $$2) {
      if (this.d($$2)) {
         this.d_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(kr $$0) {
      super.a($$0);
      dav $$1 = $$0.a(kx.ar);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kt.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kx.ar, new dav(this.l, this.m));
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
