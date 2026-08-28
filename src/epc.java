import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class epc extends epw {
   public static final MapCodec<epc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(lz.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, epc::new)
   );
   private final Optional<ju<die>> b;
   private final float c;

   public epc(ju<die> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public epc(float $$0) {
      this(Optional.empty(), $$0);
   }

   private epc(Optional<ju<die>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public epz.c a(dfe $$0, jh $$1, jh $$2, epz.c $$3, epz.c $$4, epv $$5) {
      azs $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected epy<?> a() {
      return epy.f;
   }
}
