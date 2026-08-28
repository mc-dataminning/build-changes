import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epn extends epi {
   public static final MapCodec<epn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bso.b(epi.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, epn::new)
   );
   private final bso<epi> b;

   public epn(bso<epi> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azv $$0, ehd $$1) {
      return this.b.b($$0).a($$0, $$1);
   }

   @Override
   public epj<?> a() {
      return epj.f;
   }
}
