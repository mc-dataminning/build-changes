import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erf extends erp {
   public static final MapCodec<erf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(erf.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, erf::new)
   );
   private final erf.a b;

   private erf(List<etn> $$0, erf.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public err<erf> b() {
      return ers.s;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      if ($$1.c(this.b.g) instanceof bqu $$3) {
         $$0.b(km.f, $$3.ah());
      }

      return $$0;
   }

   public static erp.a<?> a(erf.a $$0) {
      return a($$1 -> new erf($$1, $$0));
   }

   public static enum a implements azp {
      a("this", esz.a),
      b("killer", esz.d),
      c("killer_player", esz.b),
      d("block_entity", esz.h);

      public static final Codec<erf.a> e = azp.a(erf.a::values);
      private final String f;
      final esw<?> g;

      private a(final String $$0, final esw<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
