import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class em extends dy<em.a> {
   @Override
   public Codec<em.a> a() {
      return em.a.a;
   }

   public void a(asi $$0, cxo $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bh> b, Optional<cu> c) implements dy.a {
      public static final Codec<em.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(em.a::a), cu.a.optionalFieldOf("item").forGetter(em.a::b)).apply($$0, em.a::new)
      );

      public static ap<em.a> a(bw.a $$0, cu.a $$1) {
         return ao.W.a(new em.a(Optional.of(bw.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cxo $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<cu> b() {
         return this.c;
      }
   }
}
