import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewr extends exc {
   public static final MapCodec<ewr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ewr.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ewr::new)
   );
   private final ewr.a b;

   private ewr(List<eyy> $$0, ewr.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exe<ewr> b() {
      return exf.s;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      if ($$1.c(this.b.g) instanceof bsl $$3) {
         $$0.b(kv.g, $$3.an());
      }

      return $$0;
   }

   public static exc.a<?> a(ewr.a $$0) {
      return a($$1 -> new ewr($$1, $$0));
   }

   public static enum a implements azu {
      a("this", eyj.a),
      b("attacking_entity", eyj.d),
      c("last_damage_player", eyj.b),
      d("block_entity", eyj.h);

      public static final Codec<ewr.a> e = azu.a(ewr.a::values);
      private final String f;
      final bah<?> g;

      private a(final String $$0, final bah<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
