import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyk extends dym {
   public static final Codec<dyk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dfa.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, dyk::new)
   );
   private final dfa b;
   private final float d;

   public dyk(dfa $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dfa $$0, aru $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected dyn<?> a() {
      return dyn.f;
   }
}
