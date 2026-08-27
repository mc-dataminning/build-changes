import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dxw extends dyp {
   public static final Codec<dxw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ht.a(jc.e).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dxw::new)
   );
   private final Optional<hi<csm>> b;
   private final float c;

   public dxw(hi<csm> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public dxw(float $$0) {
      this(Optional.empty(), $$0);
   }

   private dxw(Optional<hi<csm>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public dys.c a(cpp $$0, gu $$1, gu $$2, dys.c $$3, dys.c $$4, dyo $$5) {
      aru $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected dyr<?> a() {
      return dyr.f;
   }
}
