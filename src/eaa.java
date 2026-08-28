import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaa implements dzm {
   public static final MapCodec<eaa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ke.v(16).optionalFieldOf("offset", ke.g).forGetter($$0x -> $$0x.e), dsk.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eaa::new)
   );
   private final ke e;
   private final dsk f;

   protected eaa(ke $$0, dsk $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(ddb $$0, ja $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dzn<?> a() {
      return dzn.g;
   }
}
