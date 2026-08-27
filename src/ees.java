import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ees extends een {
   public static final Codec<ees> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bna.b(een.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ees::new)
   );
   private final bna<een> b;

   public ees(bna<een> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ayd $$0, dwn $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public eeo<?> a() {
      return eeo.f;
   }
}
