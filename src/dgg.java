import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgg extends dea implements dgb {
   public static final MapCodec<dgg> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgb.a.e.fieldOf("weathering_state").forGetter(cxz::c), u()).apply($$0, dgg::new)
   );
   private final dgb.a g;

   @Override
   public MapCodec<dgg> a() {
      return f;
   }

   public dgg(dgb.a $$0, djo.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(djp $$0) {
      return dgb.c($$0.b()).isPresent();
   }

   public dgb.a g() {
      return this.g;
   }
}
