import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ent extends eon {
   public static final MapCodec<ent> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.a(lv.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ent::new)
   );
   private final Optional<jr<dgv>> b;
   private final float c;

   public ent(jr<dgv> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public ent(float $$0) {
      this(Optional.empty(), $$0);
   }

   private ent(Optional<jr<dgv>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public eoq.c a(ddv $$0, je $$1, je $$2, eoq.c $$3, eoq.c $$4, eom $$5) {
      azk $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eop<?> a() {
      return eop.f;
   }
}
