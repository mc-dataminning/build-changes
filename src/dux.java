import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dux extends dvq {
   public static final Codec<dux> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ht.a(jc.e).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dux::new)
   );
   private final Optional<hi<cpn>> b;
   private final float c;

   public dux(hi<cpn> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public dux(float $$0) {
      this(Optional.empty(), $$0);
   }

   private dux(Optional<hi<cpn>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
      apf $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected dvs<?> a() {
      return dvs.f;
   }
}
