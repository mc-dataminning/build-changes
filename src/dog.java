import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dog extends dnh implements dnz {
   public static final MapCodec<dog> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsm.a.fieldOf("block_set_type").forGetter(dnh::m), dnz.a.e.fieldOf("weathering_state").forGetter(dog::s), u()).apply($$0, dog::new)
   );
   private final dnz.a n;

   @Override
   public MapCodec<dog> a() {
      return m;
   }

   protected dog(dsm $$0, dnz.a $$1, drw.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(drx $$0) {
      return dnz.c($$0.b()).isPresent();
   }

   public dnz.a s() {
      return this.n;
   }
}
