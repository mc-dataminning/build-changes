import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqj extends eqs {
   public static final MapCodec<eqj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eqj.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, eqj::new)
   );
   private final eqj.a b;

   private eqj(List<esn> $$0, eqj.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public equ b() {
      return eqv.r;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      if ($$1.c(this.b.g) instanceof bqb $$3) {
         $$0.b(kb.f, $$3.ah());
      }

      return $$0;
   }

   public static eqs.a<?> a(eqj.a $$0) {
      return a($$1 -> new eqj($$1, $$0));
   }

   public static enum a implements ayz {
      a("this", erz.a),
      b("killer", erz.d),
      c("killer_player", erz.b),
      d("block_entity", erz.h);

      public static final Codec<eqj.a> e = ayz.a(eqj.a::values);
      private final String f;
      final erw<?> g;

      private a(String $$0, erw<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
