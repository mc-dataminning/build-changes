import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dum extends duf {
   public static final Codec<dum> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dum::new)
   );
   private final int c;

   private dum(int $$0) {
      this.c = $$0;
   }

   public static dum a(int $$0) {
      return new dum($$0);
   }

   @Override
   protected boolean a(due $$0, aru $$1, gu $$2) {
      int $$3 = $$0.a(dkj.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dkj.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public duh<?> b() {
      return duh.d;
   }
}
