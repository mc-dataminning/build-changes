import com.mojang.serialization.MapCodec;

public class dmy extends dhc implements dex {
   public static final MapCodec<dmy> c = b(dmy::new);

   @Override
   public MapCodec<dmy> a() {
      return c;
   }

   public dmy(drw.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return true;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      a($$0, $$2, new cuk(this));
   }
}
