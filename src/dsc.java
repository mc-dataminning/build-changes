import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsc extends dsw implements djv {
   public static final MapCodec<dsc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwe.q.fieldOf("color").forGetter(dsc::b), t()).apply($$0, dsc::new));
   private final cwe c;

   @Override
   public MapCodec<dsc> a() {
      return a;
   }

   public dsc(cwe $$0, dxp.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cwe b() {
      return this.c;
   }
}
