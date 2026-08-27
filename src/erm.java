import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erm extends eqq {
   public static final MapCodec<erm> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(le.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, erm::new));
   private final ix<cvn> b;

   private erm(List<esl> $$0, ix<cvn> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eqs b() {
      return eqt.C;
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      $$0.a(kb.F, cvp.a, this.b, cvp::b);
      return $$0;
   }

   public static eqq.a<?> a(ix<cvn> $$0) {
      return a($$1 -> new erm($$1, $$0));
   }
}
