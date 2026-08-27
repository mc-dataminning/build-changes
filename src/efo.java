import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class efo extends efx {
   public static final Codec<efo> a = RecordCodecBuilder.create($$0 -> a($$0).and(efo.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, efo::new));
   private final efo.a b;

   private efo(List<ehk> $$0, efo.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public efz b() {
      return ega.o;
   }

   @Override
   public Set<egt<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      if ($$1.c(this.b.g) instanceof biu $$3 && $$3.ac()) {
         $$0.a($$3.O_());
      }

      return $$0;
   }

   public static efx.a<?> a(efo.a $$0) {
      return a($$1 -> new efo($$1, $$0));
   }

   public static enum a implements aub {
      a("this", egw.a),
      b("killer", egw.d),
      c("killer_player", egw.b),
      d("block_entity", egw.h);

      public static final Codec<efo.a> e = aub.a(efo.a::values);
      private final String f;
      final egt<?> g;

      private a(String $$0, egt<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
