import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dga extends dfc implements dft {
   public static final MapCodec<dga> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djw.a.fieldOf("block_set_type").forGetter(dfc::g), dft.a.e.fieldOf("weathering_state").forGetter(dga::s), u()).apply($$0, dga::new)
   );
   private final dft.a n;

   @Override
   public MapCodec<dga> a() {
      return m;
   }

   protected dga(djw $$0, dft.a $$1, djg.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(djh $$0) {
      return dft.c($$0.b()).isPresent();
   }

   public dft.a s() {
      return this.n;
   }
}
