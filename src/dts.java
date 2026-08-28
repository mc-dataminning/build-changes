import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dts extends dsb implements dtm {
   public static final MapCodec<dts> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtm.a.e.fieldOf("weathering_state").forGetter(dlg::c), dxn.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dts::new)
   );
   private final dtm.a K;

   @Override
   public MapCodec<dts> a() {
      return J;
   }

   public dts(dtm.a $$0, dxn $$1, dxm.d $$2) {
      super($$1, $$2);
      this.K = $$0;
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxn $$0) {
      return dtm.c($$0.b()).isPresent();
   }

   public dtm.a q() {
      return this.K;
   }
}
