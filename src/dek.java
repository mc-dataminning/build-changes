import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dek extends ddq implements deg {
   public static final MapCodec<dek> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(deg.a.e.fieldOf("weathering_state").forGetter(dek::g), u()).apply($$0, dek::new)
   );
   private final deg.a f;

   @Override
   protected MapCodec<dek> a() {
      return e;
   }

   protected dek(deg.a $$0, dhm.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
