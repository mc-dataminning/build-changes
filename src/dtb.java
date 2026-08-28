import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtb extends drk implements dsv {
   public static final MapCodec<dtb> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsv.a.e.fieldOf("weathering_state").forGetter(dkn::c), dww.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dtb::new)
   );
   private final dsv.a K;

   @Override
   public MapCodec<dtb> a() {
      return J;
   }

   public dtb(dsv.a $$0, dww $$1, dwv.d $$2) {
      super($$1, $$2);
      this.K = $$0;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dww $$0) {
      return dsv.c($$0.b()).isPresent();
   }

   public dsv.a q() {
      return this.K;
   }
}
