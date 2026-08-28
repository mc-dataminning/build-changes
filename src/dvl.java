import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvl extends dob implements dvj {
   public static final MapCodec<dvl> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ead.a.fieldOf("block_set_type").forGetter(dob::b), dvj.a.e.fieldOf("weathering_state").forGetter(dvl::q), t()).apply($$0, dvl::new)
   );
   private final dvj.a h;

   @Override
   public MapCodec<dvl> a() {
      return g;
   }

   protected dvl(ead $$0, dvj.a $$1, dzn.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$0.c(dob.c) == eak.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dzo $$0) {
      return dvj.c($$0.b()).isPresent();
   }

   public dvj.a q() {
      return this.h;
   }
}
