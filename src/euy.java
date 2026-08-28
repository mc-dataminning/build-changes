import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class euy extends evj {
   public static final MapCodec<euy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(euy.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, euy::new)
   );
   private final euy.a b;

   private euy(List<exh> $$0, euy.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evl<euy> b() {
      return evm.s;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      if ($$1.c(this.b.g) instanceof bsb $$3) {
         $$0.b(kt.g, $$3.an());
      }

      return $$0;
   }

   public static evj.a<?> a(euy.a $$0) {
      return a($$1 -> new euy($$1, $$0));
   }

   public static enum a implements baf {
      a("this", ews.a),
      b("attacking_entity", ews.d),
      c("last_damage_player", ews.b),
      d("block_entity", ews.h);

      public static final Codec<euy.a> e = baf.a(euy.a::values);
      private final String f;
      final ewp<?> g;

      private a(final String $$0, final ewp<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
