import com.mojang.serialization.MapCodec;

public class ddf extends cvw {
   public static final MapCodec<ddf> n = b(ddf::new);

   @Override
   public MapCodec<ddf> a() {
      return n;
   }

   public ddf(dgv.d $$0) {
      super($$0, () -> det.c);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dgj($$0, $$1);
   }

   @Override
   protected aqu<agg> c() {
      return aqx.i.b(aqx.ai);
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return ati.a(dey.a($$1, $$2), 0, 15);
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$3 == hx.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
