import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edj extends eds {
   public static final Codec<edj> a = RecordCodecBuilder.create($$0 -> a($$0).and(edj.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, edj::new));
   private final edj.a b;

   private edj(List<eff> $$0, edj.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edu b() {
      return edv.o;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      if ($$1.c(this.b.g) instanceof bgu $$3 && $$3.ac()) {
         $$0.a($$3.H_());
      }

      return $$0;
   }

   public static eds.a<?> a(edj.a $$0) {
      return a($$1 -> new edj($$1, $$0));
   }

   public static enum a implements ash {
      a("this", eer.a),
      b("killer", eer.d),
      c("killer_player", eer.b),
      d("block_entity", eer.h);

      public static final Codec<edj.a> e = ash.a(edj.a::values);
      private final String f;
      final eeo<?> g;

      private a(String $$0, eeo<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
