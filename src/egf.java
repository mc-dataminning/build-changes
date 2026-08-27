import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class egf extends ego {
   public static final Codec<egf> a = RecordCodecBuilder.create($$0 -> a($$0).and(egf.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, egf::new));
   private final egf.a b;

   private egf(List<eib> $$0, egf.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egq b() {
      return egr.o;
   }

   @Override
   public Set<ehk<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      if ($$1.c(this.b.g) instanceof bjf $$3 && $$3.ae()) {
         $$0.a($$3.Q_());
      }

      return $$0;
   }

   public static ego.a<?> a(egf.a $$0) {
      return a($$1 -> new egf($$1, $$0));
   }

   public static enum a implements auk {
      a("this", ehn.a),
      b("killer", ehn.d),
      c("killer_player", ehn.b),
      d("block_entity", ehn.h);

      public static final Codec<egf.a> e = auk.a(egf.a::values);
      private final String f;
      final ehk<?> g;

      private a(String $$0, ehk<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
