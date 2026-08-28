import com.mojang.serialization.MapCodec;

public class drc extends dtr {
   public static final MapCodec<drc> a = b(drc::new);

   @Override
   public MapCodec<drc> a() {
      return a;
   }

   public drc(dzn.d $$0) {
      super($$0);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lx.ac, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
