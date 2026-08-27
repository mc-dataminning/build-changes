import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecr extends eck {
   public static final Codec<ecr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ecr::new)
   );
   private final int c;

   private ecr(int $$0) {
      this.c = $$0;
   }

   public static ecr a(int $$0) {
      return new ecr($$0);
   }

   @Override
   protected boolean a(ecj $$0, axd $$1, ib $$2) {
      int $$3 = $$0.a(dso.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dso.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ecm<?> b() {
      return ecm.d;
   }
}
