import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzu implements dzg {
   public static final MapCodec<dzu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ke.v(16).optionalFieldOf("offset", ke.g).forGetter($$0x -> $$0x.e), dsh.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dzu::new)
   );
   private final ke e;
   private final dsh f;

   protected dzu(ke $$0, dsh $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dcz $$0, ja $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dzh<?> a() {
      return dzh.g;
   }
}
