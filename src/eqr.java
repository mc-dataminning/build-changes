import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eqr extends erl {
   public static final MapCodec<eqr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eqr::new)
   );
   private final Optional<jv<djm>> b;
   private final float c;

   public eqr(jv<djm> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eqr(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eqr(Optional<jv<djm>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ero.d a(dgl $$0, ji $$1, ji $$2, ero.d $$3, ero.d $$4, erk $$5) {
      azh $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ern<?> a() {
      return ern.f;
   }
}
