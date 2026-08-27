import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dls implements dlp {
   private final hz e;
   private final ha f;
   public static final Codec<dls> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hz.v(16).optionalFieldOf("offset", hz.g).forGetter($$0x -> $$0x.e), ha.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dls::new)
   );

   public dls(hz $$0, ha $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqf $$0, gu $$1) {
      gu $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dlq<?> a() {
      return dlq.d;
   }
}
