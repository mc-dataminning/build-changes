import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmm implements dlz {
   public static final Codec<dmm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ib.v(16).optionalFieldOf("offset", ib.g).forGetter($$0x -> $$0x.e), dfj.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dmm::new)
   );
   private final ib e;
   private final dfj f;

   protected dmm(ib $$0, dfj $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqp $$0, gw $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dma<?> a() {
      return dma.g;
   }
}
