import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlr extends dka implements dll {
   public static final MapCodec<dlr> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dll.a.e.fieldOf("weathering_state").forGetter(ddi::c), dpi.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dlr::new)
   );
   private final dll.a J;

   @Override
   public MapCodec<dlr> a() {
      return I;
   }

   public dlr(dll.a $$0, dpi $$1, dph.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dpi $$0) {
      return dll.c($$0.b()).isPresent();
   }

   public dll.a k() {
      return this.J;
   }
}
