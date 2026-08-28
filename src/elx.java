import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elx extends els {
   public static final MapCodec<elx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqr.b(els.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, elx::new)
   );
   private final bqr<els> b;

   public elx(bqr<els> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azh $$0, edo $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public elt<?> a() {
      return elt.f;
   }
}
