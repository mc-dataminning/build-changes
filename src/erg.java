import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erg extends eqq {
   public static final MapCodec<erg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awl.b(lf.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, erg::new)
   );
   private final awl<ctg> b;

   private erg(List<esl> $$0, awl<ctg> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eqs b() {
      return eqt.D;
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      cth.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eqq.a<?> a(awl<ctg> $$0) {
      return a($$1 -> new erg($$1, $$0));
   }
}
