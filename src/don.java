import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class don extends dff implements dok {
   public static final MapCodec<don> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dok.a.e.fieldOf("weathering_state").forGetter(dgg::c), u()).apply($$0, don::new)
   );
   private final dok.a e;

   @Override
   public MapCodec<don> a() {
      return d;
   }

   public don(dok.a $$0, dsg.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
