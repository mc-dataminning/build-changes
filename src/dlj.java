import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlj extends dkk implements dlc {
   public static final MapCodec<dlj> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpo.a.fieldOf("block_set_type").forGetter(dkk::k), dlc.a.e.fieldOf("weathering_state").forGetter(dlj::s), u()).apply($$0, dlj::new)
   );
   private final dlc.a n;

   @Override
   public MapCodec<dlj> a() {
      return m;
   }

   protected dlj(dpo $$0, dlc.a $$1, doy.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(doz $$0) {
      return dlc.c($$0.b()).isPresent();
   }

   public dlc.a s() {
      return this.n;
   }
}
