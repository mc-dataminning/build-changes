import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esr extends eta {
   public static final Codec<esr> a = RecordCodecBuilder.create($$0 -> a($$0).and(esr.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, esr::new));
   private final esr.a b;

   private esr(List<euu> $$0, esr.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etc b() {
      return etd.r;
   }

   @Override
   public Set<eud<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      if ($$1.c(this.b.g) instanceof bqf $$3) {
         $$0.b(ke.f, $$3.ah());
      }

      return $$0;
   }

   public static eta.a<?> a(esr.a $$0) {
      return a($$1 -> new esr($$1, $$0));
   }

   public static enum a implements azg {
      a("this", eug.a),
      b("killer", eug.d),
      c("killer_player", eug.b),
      d("block_entity", eug.h);

      public static final Codec<esr.a> e = azg.a(esr.a::values);
      private final String f;
      final eud<?> g;

      private a(String $$0, eud<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
