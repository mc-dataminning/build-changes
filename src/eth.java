import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eth extends esj {
   public static final MapCodec<eth> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cwc.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eth::new));
   private final jj<cwc> b;

   private eth(List<euh> $$0, jj<cwc> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esl<eth> b() {
      return esm.F;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      $$0.a(kn.G, cwe.a, this.b, cwe::b);
      return $$0;
   }

   public static esj.a<?> a(jj<cwc> $$0) {
      return a($$1 -> new eth($$1, $$0));
   }
}
