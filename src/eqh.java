import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqh extends eqq {
   public static final MapCodec<eqh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eqh.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, eqh::new)
   );
   private final eqh.a b;

   private eqh(List<esl> $$0, eqh.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eqs b() {
      return eqt.r;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      if ($$1.c(this.b.g) instanceof bpz $$3) {
         $$0.b(kb.f, $$3.ah());
      }

      return $$0;
   }

   public static eqq.a<?> a(eqh.a $$0) {
      return a($$1 -> new eqh($$1, $$0));
   }

   public static enum a implements ayx {
      a("this", erx.a),
      b("killer", erx.d),
      c("killer_player", erx.b),
      d("block_entity", erx.h);

      public static final Codec<eqh.a> e = ayx.a(eqh.a::values);
      private final String f;
      final eru<?> g;

      private a(String $$0, eru<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
