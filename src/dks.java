import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dks extends dmh {
   public static final MapCodec<dks> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axs.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dks::new)
   );
   private final axs b;

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(axs $$0, dwu.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dwv $$0, dfl $$1, ji $$2) {
      return this.b.a();
   }
}
