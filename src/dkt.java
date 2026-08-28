import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkt extends dmi {
   public static final MapCodec<dkt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axt.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dkt::new)
   );
   private final axt b;

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(axt $$0, dwv.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dww $$0, dfm $$1, ji $$2) {
      return this.b.a();
   }
}
