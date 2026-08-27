import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dps implements dpf {
   public static final Codec<dps> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iz.v(16).optionalFieldOf("offset", iz.g).forGetter($$0x -> $$0x.e), dip.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dps::new)
   );
   private final iz e;
   private final dip f;

   protected dps(iz $$0, dip $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(ctt $$0, hv $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dpg<?> a() {
      return dpg.g;
   }
}
