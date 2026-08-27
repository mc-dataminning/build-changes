import com.mojang.serialization.Codec;

public class eck extends ecz {
   public static final Codec<eck> a = djg.b.fieldOf("block_state").xmap(eck::new, $$0 -> $$0.b).codec();
   private final djg b;

   public eck(djg $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(djg $$0, auu $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eda<?> a() {
      return eda.c;
   }
}
