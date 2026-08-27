import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eiu extends ejn {
   public static final Codec<eiu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jc.a(ku.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eiu::new)
   );
   private final Optional<ir<dch>> b;
   private final float c;

   public eiu(ir<dch> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eiu(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eiu(Optional<ir<dch>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ejq.c a(czj $$0, id $$1, id $$2, ejq.c $$3, ejq.c $$4, ejm $$5) {
      axt $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ejp<?> a() {
      return ejp.f;
   }
}
