import com.mojang.serialization.MapCodec;

public class dkb extends deg implements dcb {
   public static final MapCodec<dkb> c = b(dkb::new);

   @Override
   public MapCodec<dkb> a() {
      return c;
   }

   public dkb(doy.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return true;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      a($$0, $$2, new crj(this));
   }
}
