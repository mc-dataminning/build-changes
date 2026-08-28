import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erj extends ert {
   public static final MapCodec<erj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(erj.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, erj::new)
   );
   private final erj.a b;

   private erj(List<etr> $$0, erj.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erv<erj> b() {
      return erw.s;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      if ($$1.c(this.b.g) instanceof bqy $$3) {
         $$0.b(km.g, $$3.ah());
      }

      return $$0;
   }

   public static ert.a<?> a(erj.a $$0) {
      return a($$1 -> new erj($$1, $$0));
   }

   public static enum a implements azt {
      a("this", etd.a),
      b("killer", etd.d),
      c("killer_player", etd.b),
      d("block_entity", etd.h);

      public static final Codec<erj.a> e = azt.a(erj.a::values);
      private final String f;
      final eta<?> g;

      private a(final String $$0, final eta<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
