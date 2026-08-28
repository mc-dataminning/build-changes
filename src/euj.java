import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class euj extends euu {
   public static final MapCodec<euj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(euj.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, euj::new)
   );
   private final euj.a b;

   private euj(List<ews> $$0, euj.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public euw<euj> b() {
      return eux.s;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      if ($$1.c(this.b.g) instanceof brs $$3) {
         $$0.b(kr.g, $$3.al());
      }

      return $$0;
   }

   public static euu.a<?> a(euj.a $$0) {
      return a($$1 -> new euj($$1, $$0));
   }

   public static enum a implements azz {
      a("this", ewd.a),
      b("attacking_entity", ewd.d),
      c("last_damage_player", ewd.b),
      d("block_entity", ewd.h);

      public static final Codec<euj.a> e = azz.a(euj.a::values);
      private final String f;
      final ewa<?> g;

      private a(final String $$0, final ewa<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
