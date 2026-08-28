import com.mojang.serialization.MapCodec;

public class dsx extends dtb {
   public static final MapCodec<dsx> a = b(dsx::new);

   @Override
   public MapCodec<dsx> a() {
      return a;
   }

   public dsx(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dxv $$0) {
      return false;
   }

   @Override
   protected int i_(dxv $$0) {
      return 15;
   }
}
