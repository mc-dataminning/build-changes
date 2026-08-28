import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dy extends dk<dy.a> {
   @Override
   public Codec<dy.a> a() {
      return dy.a.a;
   }

   public void a(arr $$0, czk $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<cm> c) implements dk.a {
      public static final Codec<dy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(dy.a::a), cm.a.optionalFieldOf("item").forGetter(dy.a::b)).apply($$0, dy.a::new)
      );

      public static ar<dy.a> a(cm $$0) {
         return aq.C.a(new dy.a(Optional.empty(), Optional.of($$0)));
      }

      public static ar<dy.a> a(jg<czg> $$0, djg $$1) {
         return aq.C.a(new dy.a(Optional.empty(), Optional.of(cm.a.a().a($$0, $$1).b())));
      }

      public boolean a(czk $$0) {
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
