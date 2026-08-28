import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsw extends dlr implements dsu {
   public static final MapCodec<dsw> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxk.a.fieldOf("block_set_type").forGetter(dlr::b), dsu.a.e.fieldOf("weathering_state").forGetter(dsw::q), t()).apply($$0, dsw::new)
   );
   private final dsu.a m;

   @Override
   public MapCodec<dsw> a() {
      return l;
   }

   protected dsw(dxk $$0, dsu.a $$1, dwu.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$0.c(dlr.f) == dxq.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dwv $$0) {
      return dsu.c($$0.b()).isPresent();
   }

   public dsu.a q() {
      return this.m;
   }
}
