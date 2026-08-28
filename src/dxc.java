import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxc extends dpl implements dxa {
   public static final MapCodec<dxc> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebv.a.fieldOf("block_set_type").forGetter(dpl::b), dxa.a.e.fieldOf("weathering_state").forGetter(dxc::q), t()).apply($$0, dxc::new)
   );
   private final dxa.a h;

   @Override
   public MapCodec<dxc> a() {
      return g;
   }

   protected dxc(ebv $$0, dxa.a $$1, ebf.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$0.c(dpl.c) == ecc.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(ebg $$0) {
      return dxa.c($$0.b()).isPresent();
   }

   public dxa.a q() {
      return this.h;
   }
}
