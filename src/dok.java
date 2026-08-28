import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dok extends dof implements dog {
   public static final MapCodec<dok> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dog.a.e.fieldOf("weathering_state").forGetter(dok::m), u()).apply($$0, dok::new)
   );
   private final dog.a f;

   @Override
   protected MapCodec<dok> a() {
      return e;
   }

   protected dok(dog.a $$0, dsd.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
