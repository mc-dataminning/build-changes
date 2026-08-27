import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqo extends eqq {
   public static final MapCodec<eqo> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(epe.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eqo::new));
   private final epe b;

   private eqo(List<esl> $$0, epe $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eqs b() {
      return eqt.t;
   }

   @Override
   public Set<eru<?>> a() {
      return this.b.a();
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      int $$2 = this.b.a($$1, $$0.I());
      $$0.e($$2);
      return $$0;
   }

   public static eqq.a<?> a(epe $$0) {
      return a($$1 -> new eqo($$1, $$0));
   }
}
