import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqz extends equ {
   public static final MapCodec<eqz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btm.b(equ.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, eqz::new)
   );
   private final btm<equ> b;

   public eqz(btm<equ> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(bai $$0, eim $$1) {
      return this.b.b($$0).a($$0, $$1);
   }

   @Override
   public eqv<?> a() {
      return eqv.f;
   }
}
