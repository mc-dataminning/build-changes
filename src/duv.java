import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duv extends duo {
   public static final Codec<duv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, duv::new)
   );
   private final int c;

   private duv(int $$0) {
      this.c = $$0;
   }

   public static duv a(int $$0) {
      return new duv($$0);
   }

   @Override
   protected boolean a(dun $$0, asc $$1, gw $$2) {
      int $$3 = $$0.a(dks.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dks.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public duq<?> b() {
      return duq.d;
   }
}
