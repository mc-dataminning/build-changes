import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dos extends dnb implements dom {
   public static final MapCodec<dos> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dom.a.e.fieldOf("weathering_state").forGetter(dgi::c), dsk.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dos::new)
   );
   private final dom.a J;

   @Override
   public MapCodec<dos> a() {
      return I;
   }

   public dos(dom.a $$0, dsk $$1, dsj.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsk $$0) {
      return dom.c($$0.b()).isPresent();
   }

   public dom.a m() {
      return this.J;
   }
}
