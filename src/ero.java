import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ero extends eqq {
   public static final MapCodec<ero> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cww.c.fieldOf("pages").forGetter($$0x -> $$0x.b), eqp.a(100).forGetter($$0x -> $$0x.c))).apply($$0, ero::new)
   );
   private final List<ard<String>> b;
   private final eqp c;

   protected ero(List<esl> $$0, List<ard<String>> $$1, eqp $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cto a(cto $$0, epf $$1) {
      $$0.a(kb.H, cww.a, this::a);
      return $$0;
   }

   public cww a(cww $$0) {
      List<ard<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public eqs b() {
      return eqt.L;
   }
}
