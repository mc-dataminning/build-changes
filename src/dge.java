import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dge extends cwy implements dgb {
   public static final MapCodec<dge> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgb.a.e.fieldOf("weathering_state").forGetter(cxz::c), u()).apply($$0, dge::new)
   );
   private final dgb.a e;

   @Override
   public MapCodec<dge> a() {
      return d;
   }

   public dge(dgb.a $$0, djo.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
