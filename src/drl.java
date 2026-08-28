import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drl extends dkk implements drj {
   public static final MapCodec<drl> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvy.a.fieldOf("block_set_type").forGetter(dkk::b), drj.a.e.fieldOf("weathering_state").forGetter(drl::q), t()).apply($$0, drl::new)
   );
   private final drj.a m;

   @Override
   public MapCodec<drl> a() {
      return l;
   }

   protected drl(dvy $$0, drj.a $$1, dvi.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$0.c(dkk.f) == dwf.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dvj $$0) {
      return drj.c($$0.b()).isPresent();
   }

   public drj.a q() {
      return this.m;
   }
}
