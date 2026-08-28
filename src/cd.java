import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cd extends dk<cd.a> {
   @Override
   public Codec<cd.a> a() {
      return cd.a.a;
   }

   public void a(art $$0, czy $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<cm> c) implements dk.a {
      public static final Codec<cd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(cd.a::a), cm.a.optionalFieldOf("item").forGetter(cd.a::b)).apply($$0, cd.a::new)
      );

      public static ar<cd.a> a(cm.a $$0) {
         return aq.k.a(new cd.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(czy $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
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
