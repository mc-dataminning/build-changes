import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eep extends efi {
   public static final Codec<eep> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ix.a(kg.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eep::new)
   );
   private final Optional<in<cys>> b;
   private final float c;

   public eep(in<cys> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eep(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eep(Optional<in<cys>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public efl.c a(cvu $$0, hz $$1, hz $$2, efl.c $$3, efl.c $$4, efh $$5) {
      awp $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected efk<?> a() {
      return efk.f;
   }
}
