import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erl extends eqq {
   static final MapCodec<erl> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eth.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, erl::new));
   private final etg b;

   private erl(List<esl> $$0, etg $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eqs b() {
      return eqt.N;
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      $$0.b(kb.P, Integer.valueOf(this.b.a($$1)));
      return $$0;
   }

   public etg c() {
      return this.b;
   }

   public static eqq.a<?> a(etg $$0) {
      return a($$1 -> new erl($$1, $$0));
   }
}
