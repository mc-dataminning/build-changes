import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class egg extends egz {
   public static final Codec<egg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ja.a(kj.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, egg::new)
   );
   private final Optional<ip<daa>> b;
   private final float c;

   public egg(ip<daa> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public egg(float $$0) {
      this(Optional.empty(), $$0);
   }

   private egg(Optional<ip<daa>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ehc.c a(cxc $$0, ib $$1, ib $$2, ehc.c $$3, ehc.c $$4, egy $$5) {
      axd $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ehb<?> a() {
      return ehb.f;
   }
}
