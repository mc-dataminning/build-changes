import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eat implements eaf {
   public static final MapCodec<eat> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.v(16).optionalFieldOf("offset", kh.g).forGetter($$0x -> $$0x.e), dtc.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eat::new)
   );
   private final kh e;
   private final dtc f;

   protected eat(kh $$0, dtc $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dds $$0, jd $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eag<?> a() {
      return eag.g;
   }
}
