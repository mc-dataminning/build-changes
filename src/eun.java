import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eun extends euy {
   public static final MapCodec<eun> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eun.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, eun::new)
   );
   private final eun.a b;

   private eun(List<eww> $$0, eun.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eva<eun> b() {
      return evb.s;
   }

   @Override
   public Set<ewe<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      if ($$1.c(this.b.g) instanceof brv $$3) {
         $$0.b(ks.g, $$3.al());
      }

      return $$0;
   }

   public static euy.a<?> a(eun.a $$0) {
      return a($$1 -> new eun($$1, $$0));
   }

   public static enum a implements bab {
      a("this", ewh.a),
      b("attacking_entity", ewh.d),
      c("last_damage_player", ewh.b),
      d("block_entity", ewh.h);

      public static final Codec<eun.a> e = bab.a(eun.a::values);
      private final String f;
      final ewe<?> g;

      private a(final String $$0, final ewe<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
