import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eri extends ers {
   public static final MapCodec<eri> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eri.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, eri::new)
   );
   private final eri.a b;

   private eri(List<etq> $$0, eri.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eru<eri> b() {
      return erv.s;
   }

   @Override
   public Set<esz<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      if ($$1.c(this.b.g) instanceof bqx $$3) {
         $$0.b(km.f, $$3.ah());
      }

      return $$0;
   }

   public static ers.a<?> a(eri.a $$0) {
      return a($$1 -> new eri($$1, $$0));
   }

   public static enum a implements azs {
      a("this", etc.a),
      b("killer", etc.d),
      c("killer_player", etc.b),
      d("block_entity", etc.h);

      public static final Codec<eri.a> e = azs.a(eri.a::values);
      private final String f;
      final esz<?> g;

      private a(final String $$0, final esz<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
