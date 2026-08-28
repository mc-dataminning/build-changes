import com.mojang.serialization.MapCodec;

public class djs extends deu implements dex {
   public static final MapCodec<djs> a = b(djs::new);

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(drw.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      $$0.H_().c(lq.aC).flatMap($$0x -> $$0x.b(sf.n)).ifPresent($$3x -> ((eag)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dex.a ar_() {
      return dex.a.a;
   }
}
