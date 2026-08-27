import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class del extends dch implements deg {
   public static final MapCodec<del> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(deg.a.e.fieldOf("weathering_state").forGetter(cwg::c), u()).apply($$0, del::new)
   );
   private final deg.a g;

   @Override
   public MapCodec<del> a() {
      return f;
   }

   public del(deg.a $$0, dhm.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
