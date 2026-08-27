import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebt extends ebm {
   public static final Codec<ebt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ebt::new)
   );
   private final int c;

   private ebt(int $$0) {
      this.c = $$0;
   }

   public static ebt a(int $$0) {
      return new ebt($$0);
   }

   @Override
   protected boolean a(ebl $$0, awt $$1, ib $$2) {
      int $$3 = $$0.a(drq.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(drq.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ebo<?> b() {
      return ebo.d;
   }
}
