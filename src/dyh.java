import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dyh extends dza {
   public static final Codec<dyh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hv.a(je.e).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dyh::new)
   );
   private final Optional<hk<csx>> b;
   private final float c;

   public dyh(hk<csx> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public dyh(float $$0) {
      this(Optional.empty(), $$0);
   }

   private dyh(Optional<hk<csx>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public dzd.c a(cqa $$0, gw $$1, gw $$2, dzd.c $$3, dzd.c $$4, dyz $$5) {
      ase $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected dzc<?> a() {
      return dzc.f;
   }
}
