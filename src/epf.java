import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epf extends epa {
   public static final MapCodec<epf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsm.b(epa.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, epf::new)
   );
   private final bsm<epa> b;

   public epf(bsm<epa> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azv $$0, egv $$1) {
      return this.b.b($$0).a($$0, $$1);
   }

   @Override
   public epb<?> a() {
      return epb.f;
   }
}
