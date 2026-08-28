import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eow extends epq {
   public static final MapCodec<eow> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ke.a(ly.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eow::new)
   );
   private final Optional<jt<dhy>> b;
   private final float c;

   public eow(jt<dhy> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eow(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eow(Optional<jt<dhy>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ept.c a(dey $$0, jg $$1, jg $$2, ept.c $$3, ept.c $$4, epp $$5) {
      azr $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eps<?> a() {
      return eps.f;
   }
}
