import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class du extends df<du.a> {
   @Override
   public Codec<du.a> a() {
      return du.a.a;
   }

   public void a(aqn $$0, cto $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ch> c) implements df.a {
      public static final Codec<du.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(du.a::a), ch.a.optionalFieldOf("item").forGetter(du.a::b)).apply($$0, du.a::new)
      );

      public static an<du.a> a(br.a $$0, ch.a $$1) {
         return am.W.a(new du.a(Optional.of(br.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cto $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<ch> b() {
         return this.c;
      }
   }
}
