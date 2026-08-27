import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnh extends dnc implements dnd {
   public static final MapCodec<dnh> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnd.a.e.fieldOf("weathering_state").forGetter(dnh::l), u()).apply($$0, dnh::new)
   );
   private final dnd.a f;

   @Override
   protected MapCodec<dnh> a() {
      return e;
   }

   protected dnh(dnd.a $$0, dra.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
