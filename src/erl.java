import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erl extends erv {
   public static final MapCodec<erl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(erl.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, erl::new)
   );
   private final erl.a b;

   private erl(List<ett> $$0, erl.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erx<erl> b() {
      return ery.s;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      if ($$1.c(this.b.g) instanceof bra $$3) {
         $$0.b(km.g, $$3.ah());
      }

      return $$0;
   }

   public static erv.a<?> a(erl.a $$0) {
      return a($$1 -> new erl($$1, $$0));
   }

   public static enum a implements azu {
      a("this", etf.a),
      b("killer", etf.d),
      c("killer_player", etf.b),
      d("block_entity", etf.h);

      public static final Codec<erl.a> e = azu.a(erl.a::values);
      private final String f;
      final etc<?> g;

      private a(final String $$0, final etc<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
