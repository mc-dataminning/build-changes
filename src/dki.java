import com.mojang.serialization.MapCodec;

public class dki extends dmw {
   public static final MapCodec<dki> a = b(dki::new);

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(dsg.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lj.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
