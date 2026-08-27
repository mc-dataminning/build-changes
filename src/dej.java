import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dej extends cvf implements deg {
   public static final MapCodec<dej> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(deg.a.e.fieldOf("weathering_state").forGetter(cwg::c), u()).apply($$0, dej::new)
   );
   private final deg.a e;

   @Override
   public MapCodec<dej> a() {
      return d;
   }

   public dej(deg.a $$0, dhm.d $$1) {
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
