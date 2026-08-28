import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doo extends doj implements dok {
   public static final MapCodec<doo> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dok.a.e.fieldOf("weathering_state").forGetter(doo::m), u()).apply($$0, doo::new)
   );
   private final dok.a f;

   @Override
   protected MapCodec<doo> a() {
      return e;
   }

   protected doo(dok.a $$0, dsg.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsh $$0) {
      return dok.c($$0.b()).isPresent();
   }

   public dok.a m() {
      return this.f;
   }
}
