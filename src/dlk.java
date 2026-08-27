import com.mojang.serialization.MapCodec;

public class dlk extends dby {
   public static final MapCodec<dlk> a = b(dlk::new);

   @Override
   public MapCodec<dlk> a() {
      return a;
   }

   public dlk(doy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      $$3.a($$0, new esa(0.25, 0.05F, 0.25));
   }
}
