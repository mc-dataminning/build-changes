import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class den extends ddr implements deg {
   public static final MapCodec<den> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dic.a.fieldOf("block_set_type").forGetter(ddr::g), deg.a.e.fieldOf("weathering_state").forGetter(den::s), u()).apply($$0, den::new)
   );
   private final deg.a n;

   @Override
   public MapCodec<den> a() {
      return m;
   }

   protected den(dic $$0, deg.a $$1, dhm.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dhn $$0) {
      return deg.c($$0.b()).isPresent();
   }

   public deg.a s() {
      return this.n;
   }
}
