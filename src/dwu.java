import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwu implements dwh {
   public static final Codec<dwu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ji.v(16).optionalFieldOf("offset", ji.g).forGetter($$0x -> $$0x.e), dpi.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dwu::new)
   );
   private final ji e;
   private final dpi f;

   protected dwu(ji $$0, dpi $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dab $$0, id $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dwi<?> a() {
      return dwi.g;
   }
}
