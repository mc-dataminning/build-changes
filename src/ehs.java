import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehs extends eib {
   public static final Codec<ehs> a = RecordCodecBuilder.create($$0 -> a($$0).and(ehs.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ehs::new));
   private final ehs.a b;

   private ehs(List<ejo> $$0, ehs.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eid b() {
      return eie.o;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      if ($$1.c(this.b.g) instanceof bjz $$3 && $$3.ae()) {
         $$0.a($$3.Q_());
      }

      return $$0;
   }

   public static eib.a<?> a(ehs.a $$0) {
      return a($$1 -> new ehs($$1, $$0));
   }

   public static enum a implements ave {
      a("this", eja.a),
      b("killer", eja.d),
      c("killer_player", eja.b),
      d("block_entity", eja.h);

      public static final Codec<ehs.a> e = ave.a(ehs.a::values);
      private final String f;
      final eix<?> g;

      private a(String $$0, eix<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
