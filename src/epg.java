import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class epg extends eqa {
   public static final MapCodec<epg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(ma.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, epg::new)
   );
   private final Optional<ju<dij>> b;
   private final float c;

   public epg(ju<dij> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public epg(float $$0) {
      this(Optional.empty(), $$0);
   }

   private epg(Optional<ju<dij>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public eqd.c a(dfi $$0, jh $$1, jh $$2, eqd.c $$3, eqd.c $$4, epz $$5) {
      azv $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eqc<?> a() {
      return eqc.f;
   }
}
