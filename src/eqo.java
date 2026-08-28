import com.mojang.serialization.MapCodec;

public class eqo extends erg {
   public static final MapCodec<eqo> a = mb.e.q().fieldOf("block").xmap(eqo::new, $$0 -> $$0.b);
   private final djk b;

   public eqo(djk $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dwv $$0, azg $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected erh<?> a() {
      return erh.b;
   }
}
