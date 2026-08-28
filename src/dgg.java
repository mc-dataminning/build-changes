import com.mojang.serialization.MapCodec;

public class dgg extends diw implements dfl, dge {
   public static final MapCodec<dgg> c = b(dgg::new);

   @Override
   public MapCodec<dgg> a() {
      return c;
   }

   public dgg(dsk.d $$0) {
      super($$0, jf.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dix c() {
      return (dix)dfk.sv;
   }

   @Override
   protected dsl a(dsl $$0, dsl $$1) {
      return $$1.a(r_, $$0.c(r_));
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
