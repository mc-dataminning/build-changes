import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eop extends eox {
   public static final Codec<eop> a = RecordCodecBuilder.create($$0 -> a($$0).and(eop.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, eop::new));
   private final eop.a b;

   private eop(List<eql> $$0, eop.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoz b() {
      return epa.p;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      if ($$1.c(this.b.g) instanceof bok $$3) {
         $$0.b(jr.d, $$3.af());
      }

      return $$0;
   }

   public static eox.a<?> a(eop.a $$0) {
      return a($$1 -> new eop($$1, $$0));
   }

   public static enum a implements ayg {
      a("this", epx.a),
      b("killer", epx.d),
      c("killer_player", epx.b),
      d("block_entity", epx.h);

      public static final Codec<eop.a> e = ayg.a(eop.a::values);
      private final String f;
      final epu<?> g;

      private a(String $$0, epu<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
