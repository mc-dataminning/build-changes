import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxr extends czf {
   public static final MapCodec<cxr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(atc.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, cxr::new)
   );
   private final atc b;

   @Override
   public MapCodec<cxr> a() {
      return a;
   }

   public cxr(atc $$0, diz.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2) {
      return this.b.a();
   }
}
