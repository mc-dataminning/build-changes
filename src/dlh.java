import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlh extends dja implements dlc {
   public static final MapCodec<dlh> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlc.a.e.fieldOf("weathering_state").forGetter(dcz::c), u()).apply($$0, dlh::new)
   );
   private final dlc.a g;

   @Override
   public MapCodec<dlh> a() {
      return f;
   }

   public dlh(dlc.a $$0, doy.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(doz $$0) {
      return dlc.c($$0.b()).isPresent();
   }

   public dlc.a k() {
      return this.g;
   }
}
