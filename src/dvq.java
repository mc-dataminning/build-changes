import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvq extends duq implements dvj {
   public static final MapCodec<dvq> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ead.a.fieldOf("block_set_type").forGetter(duq::q), dvj.a.e.fieldOf("weathering_state").forGetter(dvq::r), t()).apply($$0, dvq::new)
   );
   private final dvj.a h;

   @Override
   public MapCodec<dvq> a() {
      return g;
   }

   protected dvq(ead $$0, dvj.a $$1, dzn.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dzo $$0) {
      return dvj.c($$0.b()).isPresent();
   }

   public dvj.a r() {
      return this.h;
   }
}
