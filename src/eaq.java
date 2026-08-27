import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eaq extends ebj {
   public static final Codec<eaq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iu.a(kd.e).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eaq::new)
   );
   private final Optional<ik<cvf>> b;
   private final float c;

   public eaq(ik<cvf> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eaq(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eaq(Optional<ik<cvf>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ebm.c a(csi $$0, hx $$1, hx $$2, ebm.c $$3, ebm.c $$4, ebi $$5) {
      atw $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ebl<?> a() {
      return ebl.f;
   }
}
