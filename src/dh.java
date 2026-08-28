import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dh extends dk<dh.a> {
   @Override
   public Codec<dh.a> a() {
      return dh.a.a;
   }

   public void a(art $$0, deu<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static ar<dh.a> a(alh<dep<?>> $$0) {
      return aq.g.a(new dh.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bj> b, alh<dep<?>> c) implements dk.a {
      public static final Codec<dh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(dh.a::a), dep.b.fieldOf("recipe").forGetter(dh.a::b)).apply($$0, dh.a::new)
      );

      public boolean a(deu<?> $$0) {
         return this.c == $$0.a();
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public alh<dep<?>> b() {
         return this.c;
      }
   }
}
