import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eei extends efb {
   public static final Codec<eei> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ix.a(kg.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eei::new)
   );
   private final Optional<in<cyo>> b;
   private final float c;

   public eei(in<cyo> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eei(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eei(Optional<in<cyo>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public efe.c a(cvq $$0, hz $$1, hz $$2, efe.c $$3, efe.c $$4, efa $$5) {
      awo $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected efd<?> a() {
      return efd.f;
   }
}
