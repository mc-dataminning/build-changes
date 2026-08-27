import com.mojang.serialization.MapCodec;

public class cyq extends cva {
   public static final MapCodec<cyq> d = b(cyq::new);

   @Override
   protected MapCodec<? extends cyq> a() {
      return d;
   }

   protected cyq(dhh.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhi $$0, dhi $$1, hx $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
