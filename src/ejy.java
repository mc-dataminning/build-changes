import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ejy extends ekh {
   public static final Codec<ejy> a = RecordCodecBuilder.create($$0 -> a($$0).and(ejy.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ejy::new));
   private final ejy.a b;

   private ejy(List<elu> $$0, ejy.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekj b() {
      return ekk.o;
   }

   @Override
   public Set<eld<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      if ($$1.c(this.b.g) instanceof blz $$3 && $$3.ae()) {
         $$0.a($$3.Q_());
      }

      return $$0;
   }

   public static ekh.a<?> a(ejy.a $$0) {
      return a($$1 -> new ejy($$1, $$0));
   }

   public static enum a implements axc {
      a("this", elg.a),
      b("killer", elg.d),
      c("killer_player", elg.b),
      d("block_entity", elg.h);

      public static final Codec<ejy.a> e = axc.a(ejy.a::values);
      private final String f;
      final eld<?> g;

      private a(String $$0, eld<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
