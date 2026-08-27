import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpi implements dpf {
   private final iz e;
   private final ia f;
   public static final Codec<dpi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iz.v(16).optionalFieldOf("offset", iz.g).forGetter($$0x -> $$0x.e), ia.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dpi::new)
   );

   public dpi(iz $$0, ia $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(ctt $$0, hv $$1) {
      hv $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dpg<?> a() {
      return dpg.d;
   }
}
