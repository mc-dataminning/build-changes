import com.mojang.serialization.MapCodec;

public class dfs extends dii implements dex, dfq {
   public static final MapCodec<dfs> c = b(dfs::new);

   @Override
   public MapCodec<dfs> a() {
      return c;
   }

   public dfs(drw.d $$0) {
      super($$0, je.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dij c() {
      return (dij)dew.sv;
   }

   @Override
   protected drx a(drx $$0, drx $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk(cun.ws);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      return dfq.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
