import com.mojang.serialization.MapCodec;

public class dgf extends dix implements dfl, dge {
   public static final MapCodec<dgf> c = b(dgf::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dgf> a() {
      return c;
   }

   public dgf(dsk.d $$0) {
      super($$0, jf.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(ayo $$0) {
      return 1;
   }

   @Override
   protected boolean g(dsl $$0) {
      return $$0.i();
   }

   @Override
   protected dfi b() {
      return dfk.sw;
   }

   @Override
   protected dsl a(dsl $$0, dsl $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dsl a(dsl $$0, ayo $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud(cug.wv);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      return dge.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
