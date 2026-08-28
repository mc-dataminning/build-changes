import com.mojang.serialization.MapCodec;

public class dkb extends dmp {
   public static final MapCodec<dkb> a = b(dkb::new);

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   public dkb(dsa.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(li.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
