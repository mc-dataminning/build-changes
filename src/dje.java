import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dje implements dir {
   public static final Codec<dje> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hz.v(16).optionalFieldOf("offset", hz.g).forGetter($$0x -> $$0x.e), dcb.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dje::new)
   );
   private final hz e;
   private final dcb f;

   protected dje(hz $$0, dcb $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cng $$0, gu $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dis<?> a() {
      return dis.g;
   }
}
