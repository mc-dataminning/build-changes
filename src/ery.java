import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ery extends ert {
   public static final MapCodec<ery> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqf.e.fieldOf("component").forGetter($$0x -> $$0x.b), erw.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, ery::new)
   );
   private final eqe<?> b;
   private final eru c;

   private ery(List<etr> $$0, eqe<?> $$1, eru $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public erv<ery> b() {
      return erw.u;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(eqn $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
