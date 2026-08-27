import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehz extends eii {
   public static final Codec<ehz> a = RecordCodecBuilder.create($$0 -> a($$0).and(ehz.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ehz::new));
   private final ehz.a b;

   private ehz(List<ejv> $$0, ehz.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eik b() {
      return eil.o;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      if ($$1.c(this.b.g) instanceof bkf $$3 && $$3.ae()) {
         $$0.a($$3.Q_());
      }

      return $$0;
   }

   public static eii.a<?> a(ehz.a $$0) {
      return a($$1 -> new ehz($$1, $$0));
   }

   public static enum a implements avk {
      a("this", ejh.a),
      b("killer", ejh.d),
      c("killer_player", ejh.b),
      d("block_entity", ejh.h);

      public static final Codec<ehz.a> e = avk.a(ehz.a::values);
      private final String f;
      final eje<?> g;

      private a(String $$0, eje<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
