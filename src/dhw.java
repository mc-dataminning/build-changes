import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhw extends dfq implements dhr {
   public static final MapCodec<dhw> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhr.a.e.fieldOf("weathering_state").forGetter(czp::c), u()).apply($$0, dhw::new)
   );
   private final dhr.a g;

   @Override
   public MapCodec<dhw> a() {
      return f;
   }

   public dhw(dhr.a $$0, dle.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dlf $$0) {
      return dhr.c($$0.b()).isPresent();
   }

   public dhr.a g() {
      return this.g;
   }
}
