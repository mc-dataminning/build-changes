import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erk extends eru {
   public static final MapCodec<erk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(erk.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, erk::new)
   );
   private final erk.a b;

   private erk(List<ets> $$0, erk.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erw<erk> b() {
      return erx.s;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      if ($$1.c(this.b.g) instanceof bqz $$3) {
         $$0.b(km.g, $$3.ah());
      }

      return $$0;
   }

   public static eru.a<?> a(erk.a $$0) {
      return a($$1 -> new erk($$1, $$0));
   }

   public static enum a implements azu {
      a("this", ete.a),
      b("killer", ete.d),
      c("killer_player", ete.b),
      d("block_entity", ete.h);

      public static final Codec<erk.a> e = azu.a(erk.a::values);
      private final String f;
      final etb<?> g;

      private a(final String $$0, final etb<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
