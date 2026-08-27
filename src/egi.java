import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class egi extends ehb {
   public static final Codec<egi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ja.a(kj.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, egi::new)
   );
   private final Optional<ip<dac>> b;
   private final float c;

   public egi(ip<dac> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public egi(float $$0) {
      this(Optional.empty(), $$0);
   }

   private egi(Optional<ip<dac>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ehe.c a(cxe $$0, ib $$1, ib $$2, ehe.c $$3, ehe.c $$4, eha $$5) {
      axd $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ehd<?> a() {
      return ehd.f;
   }
}
