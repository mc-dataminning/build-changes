import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edn extends edw {
   public static final Codec<edn> a = RecordCodecBuilder.create($$0 -> a($$0).and(edn.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, edn::new));
   private final edn.a b;

   private edn(List<efj> $$0, edn.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edy b() {
      return edz.o;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      if ($$1.c(this.b.g) instanceof bhi $$3 && $$3.ac()) {
         $$0.a($$3.N_());
      }

      return $$0;
   }

   public static edw.a<?> a(edn.a $$0) {
      return a($$1 -> new edn($$1, $$0));
   }

   public static enum a implements asu {
      a("this", eev.a),
      b("killer", eev.d),
      c("killer_player", eev.b),
      d("block_entity", eev.h);

      public static final Codec<edn.a> e = asu.a(edn.a::values);
      private final String f;
      final ees<?> g;

      private a(String $$0, ees<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
