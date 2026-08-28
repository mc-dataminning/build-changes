import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlm extends dnb {
   public static final MapCodec<dlm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axt.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dlm::new)
   );
   private final axt b;

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(axt $$0, dxp.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dxq $$0, dgf $$1, ji $$2) {
      return this.b.a();
   }
}
