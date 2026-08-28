import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ers extends eru {
   public static final MapCodec<ers> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eqh.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, ers::new));
   private final eqh b;

   private ers(List<ets> $$0, eqh $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erw<ers> b() {
      return erx.w;
   }

   @Override
   public Set<etb<?>> a() {
      return this.b.a();
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      int $$2 = this.b.a($$1, $$0.I());
      $$0.e($$2);
      return $$0;
   }

   public static eru.a<?> a(eqh $$0) {
      return a($$1 -> new ers($$1, $$0));
   }
}
