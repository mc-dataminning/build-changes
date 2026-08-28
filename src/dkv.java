import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkv extends dmk {
   public static final MapCodec<dkv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axt.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dkv::new)
   );
   private final axt b;

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   public dkv(axt $$0, dwx.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dwy $$0, dfo $$1, ji $$2) {
      return this.b.a();
   }
}
