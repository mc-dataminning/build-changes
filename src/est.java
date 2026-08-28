import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class est extends ete {
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(est.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, est::new)
   );
   private final est.a b;

   private est(List<evc> $$0, est.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etg<est> b() {
      return eth.s;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      if ($$1.c(this.b.g) instanceof bqw $$3) {
         $$0.b(kq.g, $$3.aj());
      }

      return $$0;
   }

   public static ete.a<?> a(est.a $$0) {
      return a($$1 -> new est($$1, $$0));
   }

   public static enum a implements azk {
      a("this", eun.a),
      b("attacking_entity", eun.d),
      c("last_damage_player", eun.b),
      d("block_entity", eun.h);

      public static final Codec<est.a> e = azk.a(est.a::values);
      private final String f;
      final euk<?> g;

      private a(final String $$0, final euk<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
