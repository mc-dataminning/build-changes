import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esn extends erp {
   static final MapCodec<esn> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(euj.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, esn::new));
   private final eui b;

   private esn(List<etn> $$0, eui $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<esw<?>> a() {
      return this.b.a();
   }

   @Override
   public err<esn> b() {
      return ers.Q;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      $$0.b(km.P, Integer.valueOf(this.b.a($$1)));
      return $$0;
   }

   public eui c() {
      return this.b;
   }

   public static erp.a<?> a(eui $$0) {
      return a($$1 -> new esn($$1, $$0));
   }
}
