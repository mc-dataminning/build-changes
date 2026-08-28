import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etv extends eug {
   public static final MapCodec<etv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(etv.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, etv::new)
   );
   private final etv.a b;

   private etv(List<ewe> $$0, etv.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eui<etv> b() {
      return euj.s;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      if ($$1.c(this.b.g) instanceof brn $$3) {
         $$0.b(kr.g, $$3.al());
      }

      return $$0;
   }

   public static eug.a<?> a(etv.a $$0) {
      return a($$1 -> new etv($$1, $$0));
   }

   public static enum a implements azy {
      a("this", evp.a),
      b("attacking_entity", evp.d),
      c("last_damage_player", evp.b),
      d("block_entity", evp.h);

      public static final Codec<etv.a> e = azy.a(etv.a::values);
      private final String f;
      final evm<?> g;

      private a(final String $$0, final evm<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
