import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwi extends cxw {
   public static final MapCodec<cwi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ash.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, cwi::new)
   );
   private final ash b;

   @Override
   public MapCodec<cwi> a() {
      return a;
   }

   public cwi(ash $$0, dhh.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2) {
      return this.b.a();
   }
}
