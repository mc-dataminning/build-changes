import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgi extends dfk implements dgb {
   public static final MapCodec<dgi> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dke.a.fieldOf("block_set_type").forGetter(dfk::g), dgb.a.e.fieldOf("weathering_state").forGetter(dgi::s), u()).apply($$0, dgi::new)
   );
   private final dgb.a n;

   @Override
   public MapCodec<dgi> a() {
      return m;
   }

   protected dgi(dke $$0, dgb.a $$1, djo.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(djp $$0) {
      return dgb.c($$0.b()).isPresent();
   }

   public dgb.a s() {
      return this.n;
   }
}
