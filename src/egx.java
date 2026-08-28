import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egx extends egs {
   public static final MapCodec<egx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpf.b(egs.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, egx::new)
   );
   private final bpf<egs> b;

   public egx(bpf<egs> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azh $$0, dys $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public egt<?> a() {
      return egt.f;
   }
}
