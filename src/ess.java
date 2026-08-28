import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ess extends eru {
   static final MapCodec<ess> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(euo.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, ess::new));
   private final eun b;

   private ess(List<ets> $$0, eun $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<etb<?>> a() {
      return this.b.a();
   }

   @Override
   public erw<ess> b() {
      return erx.Q;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      int $$2 = ayz.a(this.b.a($$1), 0, 4);
      $$0.b(km.Q, Integer.valueOf($$2));
      return $$0;
   }

   public eun c() {
      return this.b;
   }

   public static eru.a<?> a(eun $$0) {
      return a($$1 -> new ess($$1, $$0));
   }
}
