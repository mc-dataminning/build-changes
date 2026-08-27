import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dle extends dee implements dlc {
   public static final MapCodec<dle> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpo.a.fieldOf("block_set_type").forGetter(dee::b), dlc.a.e.fieldOf("weathering_state").forGetter(dle::k), u()).apply($$0, dle::new)
   );
   private final dlc.a m;

   @Override
   public MapCodec<dle> a() {
      return l;
   }

   protected dle(dpo $$0, dlc.a $$1, doy.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$0.c(dee.f) == dpv.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(doz $$0) {
      return dlc.c($$0.b()).isPresent();
   }

   public dlc.a k() {
      return this.m;
   }
}
