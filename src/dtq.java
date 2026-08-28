import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtq extends dls implements dtp {
   public static final MapCodec<dtq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtp.a.e.fieldOf("weathering_state").forGetter(dtq::q), t()).apply($$0, dtq::new)
   );
   private final dtp.a e;

   @Override
   protected MapCodec<dtq> a() {
      return d;
   }

   public dtq(dtp.a $$0, dxp.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxq $$0) {
      return dtp.c($$0.b()).isPresent();
   }

   public dtp.a q() {
      return this.e;
   }
}
