import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ely extends elt {
   public static final MapCodec<ely> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqs.b(elt.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ely::new)
   );
   private final bqs<elt> b;

   public ely(bqs<elt> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azh $$0, edp $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public elu<?> a() {
      return elu.f;
   }
}
