import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dua extends duy implements dlr {
   public static final MapCodec<dua> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxw.q.fieldOf("color").forGetter(dua::b), t()).apply($$0, dua::new));
   private final cxw c;

   @Override
   public MapCodec<dua> a() {
      return a;
   }

   public dua(cxw $$0, dzy.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cxw b() {
      return this.c;
   }
}
