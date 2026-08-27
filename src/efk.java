import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class efk extends egd {
   public static final Codec<efk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iz.a(ki.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, efk::new)
   );
   private final Optional<ip<czf>> b;
   private final float c;

   public efk(ip<czf> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public efk(float $$0) {
      this(Optional.empty(), $$0);
   }

   private efk(Optional<ip<czf>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public egg.c a(cwh $$0, ib $$1, ib $$2, egg.c $$3, egg.c $$4, egc $$5) {
      awt $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected egf<?> a() {
      return egf.f;
   }
}
