import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doq extends dmz implements dok {
   public static final MapCodec<doq> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dok.a.e.fieldOf("weathering_state").forGetter(dgg::c), dsh.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, doq::new)
   );
   private final dok.a J;

   @Override
   public MapCodec<doq> a() {
      return I;
   }

   public doq(dok.a $$0, dsh $$1, dsg.d $$2) {
      super($$1, $$2);
      this.J = $$0;
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
      return this.J;
   }
}
