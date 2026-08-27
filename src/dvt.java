import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvt extends dvo {
   public static final Codec<dvt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bhh.b(dvo.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dvt::new)
   );
   private final bhh<dvo> b;

   public dvt(bhh<dvo> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ats $$0, dno $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dvp<?> a() {
      return dvp.f;
   }
}
