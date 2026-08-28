import com.mojang.serialization.MapCodec;

public class eqq extends erg {
   public static final MapCodec<eqq> a = dwv.a.fieldOf("block_state").xmap(eqq::new, $$0 -> $$0.b);
   private final dwv b;

   public eqq(dwv $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dwv $$0, azg $$1) {
      return $$0 == this.b;
   }

   @Override
   protected erh<?> a() {
      return erh.c;
   }
}
