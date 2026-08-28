import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dy extends dz<dy.a> {
   @Override
   public Codec<dy.a> a() {
      return dy.a.a;
   }

   public void a(are $$0, cwo $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<cv> c) implements dz.a {
      public static final Codec<dy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dy.a::a), cv.a.optionalFieldOf("item").forGetter(dy.a::b)).apply($$0, dy.a::new)
      );

      public static aq<dy.a> a(Optional<cv> $$0) {
         return ap.G.a(new dy.a(Optional.empty(), $$0));
      }

      public static aq<dy.a> a(js<cwk> $$0, dgg $$1) {
         return ap.G.a(new dy.a(Optional.empty(), Optional.of(cv.a.a().a($$0, $$1).b())));
      }

      public boolean a(cwo $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<cv> b() {
         return this.c;
      }
   }
}
