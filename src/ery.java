import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ery extends esj {
   public static final MapCodec<ery> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ery.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ery::new)
   );
   private final ery.a b;

   private ery(List<euh> $$0, ery.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esl<ery> b() {
      return esm.s;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      if ($$1.c(this.b.g) instanceof bqm $$3) {
         $$0.b(kn.g, $$3.aj());
      }

      return $$0;
   }

   public static esj.a<?> a(ery.a $$0) {
      return a($$1 -> new ery($$1, $$0));
   }

   public static enum a implements azc {
      a("this", ets.a),
      b("attacking_entity", ets.d),
      c("last_damage_player", ets.b),
      d("block_entity", ets.h);

      public static final Codec<ery.a> e = azc.a(ery.a::values);
      private final String f;
      final etp<?> g;

      private a(final String $$0, final etp<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
