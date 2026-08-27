import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxa extends dwv {
   public static final Codec<dxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bhv.b(dwv.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dxa::new)
   );
   private final bhv<dwv> b;

   public dxa(bhv<dwv> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(auf $$0, dov $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dww<?> a() {
      return dww.f;
   }
}
