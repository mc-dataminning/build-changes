import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eou extends eop {
   public static final MapCodec<eou> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsj.b(eop.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, eou::new)
   );
   private final bsj<eop> b;

   public eou(bsj<eop> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azt $$0, egk $$1) {
      return this.b.b($$0).a($$0, $$1);
   }

   @Override
   public eoq<?> a() {
      return eoq.f;
   }
}
