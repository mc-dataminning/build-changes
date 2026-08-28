import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwd extends dom implements dwb {
   public static final MapCodec<dwd> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaw.a.fieldOf("block_set_type").forGetter(dom::b), dwb.a.e.fieldOf("weathering_state").forGetter(dwd::q), t()).apply($$0, dwd::new)
   );
   private final dwb.a h;

   @Override
   public MapCodec<dwd> a() {
      return g;
   }

   protected dwd(eaw $$0, dwb.a $$1, eag.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(dom.c) == ebd.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(eah $$0) {
      return dwb.c($$0.b()).isPresent();
   }

   public dwb.a q() {
      return this.h;
   }
}
