import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpq {
   public static final Codec<dpq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dum.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dpq::new)
   );
   public final he<dum> b;
   public final float c;

   public dpq(he<dum> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cqp $$0, dhg $$1, asc $$2, gw $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
