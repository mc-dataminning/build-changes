import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ern extends erp {
   public static final MapCodec<ern> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eqc.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, ern::new));
   private final eqc b;

   private ern(List<etn> $$0, eqc $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public err<ern> b() {
      return ers.w;
   }

   @Override
   public Set<esw<?>> a() {
      return this.b.a();
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      int $$2 = this.b.a($$1, $$0.I());
      $$0.e($$2);
      return $$0;
   }

   public static erp.a<?> a(eqc $$0) {
      return a($$1 -> new ern($$1, $$0));
   }
}
