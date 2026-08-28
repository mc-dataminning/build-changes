import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erm extends erw {
   public static final MapCodec<erm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(erm.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, erm::new)
   );
   private final erm.a b;

   private erm(List<etu> $$0, erm.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ery<erm> b() {
      return erz.s;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      if ($$1.c(this.b.g) instanceof brb $$3) {
         $$0.b(km.g, $$3.ah());
      }

      return $$0;
   }

   public static erw.a<?> a(erm.a $$0) {
      return a($$1 -> new erm($$1, $$0));
   }

   public static enum a implements azu {
      a("this", etg.a),
      b("killer", etg.d),
      c("killer_player", etg.b),
      d("block_entity", etg.h);

      public static final Codec<erm.a> e = azu.a(erm.a::values);
      private final String f;
      final etd<?> g;

      private a(final String $$0, final etd<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
