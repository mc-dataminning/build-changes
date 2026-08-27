import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmc implements dlp {
   public static final Codec<dmc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hz.v(16).optionalFieldOf("offset", hz.g).forGetter($$0x -> $$0x.e), dez.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dmc::new)
   );
   private final hz e;
   private final dez f;

   protected dmc(hz $$0, dez $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqf $$0, gu $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dlq<?> a() {
      return dlq.g;
   }
}
