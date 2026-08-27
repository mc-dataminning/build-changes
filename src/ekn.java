import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ekn extends elg {
   public static final MapCodec<ekn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jm.a(lf.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ekn::new)
   );
   private final Optional<jb<ddy>> b;
   private final float c;

   public ekn(jb<ddy> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public ekn(float $$0) {
      this(Optional.empty(), $$0);
   }

   private ekn(Optional<jb<ddy>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public elj.c a(dba $$0, io $$1, io $$2, elj.c $$3, elj.c $$4, elf $$5) {
      ayk $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eli<?> a() {
      return eli.f;
   }
}
