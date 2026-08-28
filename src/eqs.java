import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eqs extends erm {
   public static final MapCodec<eqs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eqs::new)
   );
   private final Optional<jv<djn>> b;
   private final float c;

   public eqs(jv<djn> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eqs(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eqs(Optional<jv<djn>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public erp.d a(dgm $$0, ji $$1, ji $$2, erp.d $$3, erp.d $$4, erl $$5) {
      azh $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ero<?> a() {
      return ero.f;
   }
}
