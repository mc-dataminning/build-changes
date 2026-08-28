import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etd extends esj {
   public static final MapCodec<etd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(akh.a(lr.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, etd::new)
   );
   private final jj<cty> b;

   private etd(List<euh> $$0, jj<cty> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esl<etd> b() {
      return esm.f;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      return $$0.a(this.b.a());
   }
}
