import com.mojang.serialization.MapCodec;

public class dlk extends dfc {
   public static final MapCodec<dlk> a = b(dlk::new);

   @Override
   public MapCodec<dlk> a() {
      return a;
   }

   public dlk(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return 15;
   }
}
