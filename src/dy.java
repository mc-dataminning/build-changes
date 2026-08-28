import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dy extends dj<dy.a> {
   @Override
   public Codec<dy.a> a() {
      return dy.a.a;
   }

   public void a(arr $$0, cyy $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<cl> c) implements dj.a {
      public static final Codec<dy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dy.a::a), cl.a.optionalFieldOf("item").forGetter(dy.a::b)).apply($$0, dy.a::new)
      );

      public static aq<dy.a> a(bx.a $$0, cl.a $$1) {
         return ap.W.a(new dy.a(Optional.of(bx.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cyy $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<cl> b() {
         return this.c;
      }
   }
}
