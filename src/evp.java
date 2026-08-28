import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evp extends ewa {
   public static final MapCodec<evp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(evp.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, evp::new)
   );
   private final evp.a b;

   private evp(List<exy> $$0, evp.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ewc<evp> b() {
      return ewd.s;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      if ($$1.c(this.b.g) instanceof bsn $$3) {
         $$0.b(ku.g, $$3.an());
      }

      return $$0;
   }

   public static ewa.a<?> a(evp.a $$0) {
      return a($$1 -> new evp($$1, $$0));
   }

   public static enum a implements bai {
      a("this", exj.a),
      b("attacking_entity", exj.d),
      c("last_damage_player", exj.b),
      d("block_entity", exj.h);

      public static final Codec<evp.a> e = bai.a(evp.a::values);
      private final String f;
      final exg<?> g;

      private a(final String $$0, final exg<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
