import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwz extends dws {
   public static final Codec<dwz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dwz::new)
   );
   private final int c;

   private dwz(int $$0) {
      this.c = $$0;
   }

   public static dwz a(int $$0) {
      return new dwz($$0);
   }

   @Override
   protected boolean a(dwr $$0, atw $$1, hx $$2) {
      int $$3 = $$0.a(dmw.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dmw.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dwu<?> b() {
      return dwu.d;
   }
}
