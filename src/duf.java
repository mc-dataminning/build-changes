import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duf extends dkw {
   public static final MapCodec<duf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwe.q.fieldOf("color").forGetter(duf::b), t()).apply($$0, duf::new));
   private final cwe c;

   @Override
   public MapCodec<duf> a() {
      return b;
   }

   protected duf(cwe $$0, dxp.d $$1) {
      super($$1);
      this.c = $$0;
   }

   public cwe b() {
      return this.c;
   }
}
