import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egy extends egt {
   public static final MapCodec<egy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpg.b(egt.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, egy::new)
   );
   private final bpg<egt> b;

   public egy(bpg<egt> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azh $$0, dyt $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public egu<?> a() {
      return egu.f;
   }
}
