import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ega extends egj {
   public static final Codec<ega> a = RecordCodecBuilder.create($$0 -> a($$0).and(ega.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ega::new));
   private final ega.a b;

   private ega(List<ehw> $$0, ega.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egl b() {
      return egm.o;
   }

   @Override
   public Set<ehf<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      if ($$1.c(this.b.g) instanceof bjb $$3 && $$3.ae()) {
         $$0.a($$3.P_());
      }

      return $$0;
   }

   public static egj.a<?> a(ega.a $$0) {
      return a($$1 -> new ega($$1, $$0));
   }

   public static enum a implements aug {
      a("this", ehi.a),
      b("killer", ehi.d),
      c("killer_player", ehi.b),
      d("block_entity", ehi.h);

      public static final Codec<ega.a> e = aug.a(ega.a::values);
      private final String f;
      final ehf<?> g;

      private a(String $$0, ehf<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
