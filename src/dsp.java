import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsp implements dsc {
   public static final Codec<dsp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.v(16).optionalFieldOf("offset", jd.g).forGetter($$0x -> $$0x.e), dlj.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dsp::new)
   );
   private final jd e;
   private final dlj f;

   protected dsp(jd $$0, dlj $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cwm $$0, hz $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dsd<?> a() {
      return dsd.g;
   }
}
