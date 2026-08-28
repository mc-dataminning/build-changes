import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esn extends esy {
   public static final MapCodec<esn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(esn.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, esn::new)
   );
   private final esn.a b;

   private esn(List<euw> $$0, esn.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eta<esn> b() {
      return etb.s;
   }

   @Override
   public Set<eue<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      if ($$1.c(this.b.g) instanceof bqv $$3) {
         $$0.b(kq.g, $$3.aj());
      }

      return $$0;
   }

   public static esy.a<?> a(esn.a $$0) {
      return a($$1 -> new esn($$1, $$0));
   }

   public static enum a implements azj {
      a("this", euh.a),
      b("attacking_entity", euh.d),
      c("last_damage_player", euh.b),
      d("block_entity", euh.h);

      public static final Codec<esn.a> e = azj.a(esn.a::values);
      private final String f;
      final eue<?> g;

      private a(final String $$0, final eue<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
