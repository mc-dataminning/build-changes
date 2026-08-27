import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlt implements dlp {
   public static final Codec<dlt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hz.v(16).optionalFieldOf("offset", gu.b).forGetter($$0x -> $$0x.e)).apply($$0, dlt::new)
   );
   private final hz e;

   public dlt(hz $$0) {
      this.e = $$0;
   }

   public boolean a(cqf $$0, gu $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dlq<?> a() {
      return dlq.h;
   }
}
