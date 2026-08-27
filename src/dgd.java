import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgd extends cze implements dgb {
   public static final MapCodec<dgd> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dke.a.fieldOf("block_set_type").forGetter(cze::b), dgb.a.e.fieldOf("weathering_state").forGetter(dgd::g), u()).apply($$0, dgd::new)
   );
   private final dgb.a m;

   @Override
   public MapCodec<dgd> a() {
      return l;
   }

   protected dgd(dke $$0, dgb.a $$1, djo.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$0.c(cze.f) == dkl.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(djp $$0) {
      return dgb.c($$0.b()).isPresent();
   }

   public dgb.a g() {
      return this.m;
   }
}
