import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dei extends cxl implements deg {
   public static final MapCodec<dei> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dic.a.fieldOf("block_set_type").forGetter(cxl::b), deg.a.e.fieldOf("weathering_state").forGetter(dei::g), u()).apply($$0, dei::new)
   );
   private final deg.a m;

   @Override
   public MapCodec<dei> a() {
      return l;
   }

   protected dei(dic $$0, deg.a $$1, dhm.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$0.c(cxl.f) == dij.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dhn $$0) {
      return deg.c($$0.b()).isPresent();
   }

   public deg.a g() {
      return this.m;
   }
}
