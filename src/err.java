import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class err extends ert {
   public static final MapCodec<err> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eqg.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, err::new));
   private final eqg b;

   private err(List<etr> $$0, eqg $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erv<err> b() {
      return erw.w;
   }

   @Override
   public Set<eta<?>> a() {
      return this.b.a();
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      int $$2 = this.b.a($$1, $$0.I());
      $$0.e($$2);
      return $$0;
   }

   public static ert.a<?> a(eqg $$0) {
      return a($$1 -> new err($$1, $$0));
   }
}
