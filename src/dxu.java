import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dxu extends dyn {
   public static final Codec<dxu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hu.a(jd.e).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dxu::new)
   );
   private final Optional<hj<csk>> b;
   private final float c;

   public dxu(hj<csk> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public dxu(float $$0) {
      this(Optional.empty(), $$0);
   }

   private dxu(Optional<hj<csk>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public dyq.c a(cpn $$0, gv $$1, gv $$2, dyq.c $$3, dyq.c $$4, dym $$5) {
      art $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected dyp<?> a() {
      return dyp.f;
   }
}
