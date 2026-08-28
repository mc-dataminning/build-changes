import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dom extends dmv implements dog {
   public static final MapCodec<dom> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dog.a.e.fieldOf("weathering_state").forGetter(dgc::c), dse.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dom::new)
   );
   private final dog.a J;

   @Override
   public MapCodec<dom> a() {
      return I;
   }

   public dom(dog.a $$0, dse $$1, dsd.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dse $$0) {
      return dog.c($$0.b()).isPresent();
   }

   public dog.a m() {
      return this.J;
   }
}
