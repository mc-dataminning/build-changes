import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deh extends cwt implements deg {
   public static final MapCodec<deh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(deg.a.e.fieldOf("weathering_state").forGetter(deh::g), u()).apply($$0, deh::new)
   );
   private final deg.a e;

   @Override
   protected MapCodec<deh> a() {
      return d;
   }

   public deh(deg.a $$0, dhm.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dhn $$0) {
      return deg.c($$0.b()).isPresent();
   }

   public deg.a g() {
      return this.e;
   }
}
