import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dto extends dtj {
   public static final Codec<dto> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfo.b(dtj.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dto::new)
   );
   private final bfo<dtj> b;

   public dto(bfo<dtj> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ash $$0, dlj $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dtk<?> a() {
      return dtk.f;
   }
}
