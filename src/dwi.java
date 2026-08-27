import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwi extends dwb {
   public static final Codec<dwi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dwi::new)
   );
   private final int c;

   private dwi(int $$0) {
      this.c = $$0;
   }

   public static dwi a(int $$0) {
      return new dwi($$0);
   }

   @Override
   protected boolean a(dwa $$0, ato $$1, ht $$2) {
      int $$3 = $$0.a(dmf.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dmf.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dwd<?> b() {
      return dwd.d;
   }
}
