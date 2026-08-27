import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dxz extends dys {
   public static final Codec<dxz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hs.a(jc.e).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dxz::new)
   );
   private final Optional<hi<ctc>> b;
   private final float c;

   public dxz(hi<ctc> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public dxz(float $$0) {
      this(Optional.empty(), $$0);
   }

   private dxz(Optional<hi<ctc>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public dyv.c a(cqe $$0, gw $$1, gw $$2, dyv.c $$3, dyv.c $$4, dyr $$5) {
      ash $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected dyu<?> a() {
      return dyu.f;
   }
}
