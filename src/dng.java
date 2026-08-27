import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dng extends ddy implements dnd {
   public static final MapCodec<dng> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnd.a.e.fieldOf("weathering_state").forGetter(dez::c), u()).apply($$0, dng::new)
   );
   private final dnd.a e;

   @Override
   public MapCodec<dng> a() {
      return d;
   }

   public dng(dnd.a $$0, dra.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(drb $$0) {
      return dnd.c($$0.b()).isPresent();
   }

   public dnd.a l() {
      return this.e;
   }
}
