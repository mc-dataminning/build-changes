import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ern extends ert {
   public static final MapCodec<ern> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eqh.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ern::new)
   );
   private final eqh.b b;

   public ern(List<etr> $$0, eqh.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erv<ern> b() {
      return erw.B;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      if ($$0.a(cur.un) && $$1.c(this.b.a()) instanceof cmw $$2) {
         $$0.b(km.V, new cxq($$2.gb()));
      }

      return $$0;
   }

   public static ert.a<?> a(eqh.b $$0) {
      return a($$1 -> new ern($$1, $$0));
   }
}
