import com.mojang.serialization.Codec;

public class dwh extends dvy {
   public static final Codec<dwh> b = djg.b.fieldOf("state").xmap(dwh::new, $$0 -> $$0.c).codec();
   private final djg c;

   protected dwh(djg $$0) {
      this.c = $$0;
   }

   @Override
   protected dvz<?> a() {
      return dvz.a;
   }

   @Override
   public djg a(auu $$0, hx $$1) {
      return this.c;
   }
}
