import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtr extends dml implements dtp {
   public static final MapCodec<dtr> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyf.a.fieldOf("block_set_type").forGetter(dml::b), dtp.a.e.fieldOf("weathering_state").forGetter(dtr::q), t()).apply($$0, dtr::new)
   );
   private final dtp.a h;

   @Override
   public MapCodec<dtr> a() {
      return g;
   }

   protected dtr(dyf $$0, dtp.a $$1, dxp.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(dml.c) == dym.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dxq $$0) {
      return dtp.c($$0.b()).isPresent();
   }

   public dtp.a q() {
      return this.h;
   }
}
