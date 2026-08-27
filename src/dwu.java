import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwu extends dwn {
   public static final Codec<dwu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dwu::new)
   );
   private final int c;

   private dwu(int $$0) {
      this.c = $$0;
   }

   public static dwu a(int $$0) {
      return new dwu($$0);
   }

   @Override
   protected boolean a(dwm $$0, ats $$1, ht $$2) {
      int $$3 = $$0.a(dmr.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dmr.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dwp<?> b() {
      return dwp.d;
   }
}
