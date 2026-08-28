import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eic extends ehx {
   public static final MapCodec<eic> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpb.b(ehx.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, eic::new)
   );
   private final bpb<ehx> b;

   public eic(bpb<ehx> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ayw $$0, dzv $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ehy<?> a() {
      return ehy.f;
   }
}
