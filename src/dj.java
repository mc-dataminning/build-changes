import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dj extends dk<dj.a> {
   @Override
   public Codec<dj.a> a() {
      return dj.a.a;
   }

   public void a(arr $$0, czn $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<cm> c) implements dk.a {
      public static final Codec<dj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(dj.a::a), cm.a.optionalFieldOf("item").forGetter(dj.a::b)).apply($$0, dj.a::new)
      );

      public static ar<dj.a> a(Optional<cm> $$0) {
         return aq.G.a(new dj.a(Optional.empty(), $$0));
      }

      public static ar<dj.a> a(jg<czj> $$0, djl $$1) {
         return aq.G.a(new dj.a(Optional.empty(), Optional.of(cm.a.a().a($$0, $$1).b())));
      }

      public boolean a(czn $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cm> b() {
         return this.c;
      }
   }
}
