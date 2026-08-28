import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ess extends esy {
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(erl.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ess::new)
   );
   private final erl.b b;

   public ess(List<euw> $$0, erl.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eta<ess> b() {
      return etb.B;
   }

   @Override
   public Set<eue<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      if ($$0.a(cur.un) && $$1.c(this.b.a()) instanceof cmv $$2) {
         $$0.b(kq.W, new cxs($$2.fY()));
      }

      return $$0;
   }

   public static esy.a<?> a(erl.b $$0) {
      return a($$1 -> new ess($$1, $$0));
   }
}
