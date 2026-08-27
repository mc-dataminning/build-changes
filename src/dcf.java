import com.mojang.serialization.MapCodec;

public class dcf extends ctc {
   public static final MapCodec<dcf> a = b(dcf::new);

   @Override
   public MapCodec<dcf> a() {
      return a;
   }

   public dcf(dfc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      $$3.a($$0, new ehh(0.25, 0.05F, 0.25));
   }
}
