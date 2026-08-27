import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehy extends eih {
   public static final Codec<ehy> a = RecordCodecBuilder.create($$0 -> a($$0).and(ehy.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ehy::new));
   private final ehy.a b;

   private ehy(List<eju> $$0, ehy.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eij b() {
      return eik.o;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      if ($$1.c(this.b.g) instanceof bke $$3 && $$3.ae()) {
         $$0.a($$3.Q_());
      }

      return $$0;
   }

   public static eih.a<?> a(ehy.a $$0) {
      return a($$1 -> new ehy($$1, $$0));
   }

   public static enum a implements avj {
      a("this", ejg.a),
      b("killer", ejg.d),
      c("killer_player", ejg.b),
      d("block_entity", ejg.h);

      public static final Codec<ehy.a> e = avj.a(ehy.a::values);
      private final String f;
      final ejd<?> g;

      private a(String $$0, ejd<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
