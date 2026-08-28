import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dz extends dk<dz.a> {
   @Override
   public Codec<dz.a> a() {
      return dz.a.a;
   }

   public void a(arr $$0, czn $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<cm> c) implements dk.a {
      public static final Codec<dz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(dz.a::a), cm.a.optionalFieldOf("item").forGetter(dz.a::b)).apply($$0, dz.a::new)
      );

      public static ar<dz.a> a(by.a $$0, cm.a $$1) {
         return aq.W.a(new dz.a(Optional.of(by.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(czn $$0) {
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
