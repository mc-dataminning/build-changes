import com.mojang.serialization.MapCodec;

public class eii extends ehz {
   public static final MapCodec<eii> b = dus.a.fieldOf("state").xmap(eii::new, $$0 -> $$0.c);
   private final dus c;

   protected eii(dus $$0) {
      this.c = $$0;
   }

   @Override
   protected eia<?> a() {
      return eia.a;
   }

   @Override
   public dus a(azn $$0, jf $$1) {
      return this.c;
   }
}
