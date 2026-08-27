import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class emx extends enq {
   public static final Codec<emx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jp.a(li.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, emx::new)
   );
   private final Optional<je<dfc>> b;
   private final float c;

   public emx(je<dfc> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public emx(float $$0) {
      this(Optional.empty(), $$0);
   }

   private emx(Optional<je<dfc>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ent.c a(dcd $$0, ir $$1, ir $$2, ent.c $$3, ent.c $$4, enp $$5) {
      ayt $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ens<?> a() {
      return ens.f;
   }
}
