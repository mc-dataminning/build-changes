import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfv extends cyw implements dft {
   public static final MapCodec<dfv> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djw.a.fieldOf("block_set_type").forGetter(cyw::b), dft.a.e.fieldOf("weathering_state").forGetter(dfv::g), u()).apply($$0, dfv::new)
   );
   private final dft.a m;

   @Override
   public MapCodec<dfv> a() {
      return l;
   }

   protected dfv(djw $$0, dft.a $$1, djg.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$0.c(cyw.f) == dkd.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(djh $$0) {
      return dft.c($$0.b()).isPresent();
   }

   public dft.a g() {
      return this.m;
   }
}
