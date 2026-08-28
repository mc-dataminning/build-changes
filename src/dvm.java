import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvm extends dlu implements dvj {
   public static final MapCodec<dvm> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvj.a.e.fieldOf("weathering_state").forGetter(dmw::c), t()).apply($$0, dvm::new)
   );
   private final dvj.a e;

   @Override
   public MapCodec<dvm> a() {
      return d;
   }

   public dvm(dvj.a $$0, dzn.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dzo $$0) {
      return dvj.c($$0.b()).isPresent();
   }

   public dvj.a q() {
      return this.e;
   }
}
