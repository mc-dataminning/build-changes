import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dom extends dhl implements dok {
   public static final MapCodec<dom> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsw.a.fieldOf("block_set_type").forGetter(dhl::b), dok.a.e.fieldOf("weathering_state").forGetter(dom::m), u()).apply($$0, dom::new)
   );
   private final dok.a m;

   @Override
   public MapCodec<dom> a() {
      return l;
   }

   protected dom(dsw $$0, dok.a $$1, dsg.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$0.c(dhl.f) == dtd.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsh $$0) {
      return dok.c($$0.b()).isPresent();
   }

   public dok.a m() {
      return this.m;
   }
}
