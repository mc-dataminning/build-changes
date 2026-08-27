import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dya extends dyt {
   public static final Codec<dya> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hv.a(je.e).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dya::new)
   );
   private final Optional<hk<csq>> b;
   private final float c;

   public dya(hk<csq> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public dya(float $$0) {
      this(Optional.empty(), $$0);
   }

   private dya(Optional<hk<csq>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public dyw.c a(cpt $$0, gw $$1, gw $$2, dyw.c $$3, dyw.c $$4, dys $$5) {
      arx $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected dyv<?> a() {
      return dyv.f;
   }
}
