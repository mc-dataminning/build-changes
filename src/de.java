import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class de extends df<de.a> {
   @Override
   public Codec<de.a> a() {
      return de.a.a;
   }

   public void a(aqn $$0, cto $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ch> c) implements df.a {
      public static final Codec<de.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(de.a::a), ch.a.optionalFieldOf("item").forGetter(de.a::b)).apply($$0, de.a::new)
      );

      public static an<de.a> a(Optional<ch> $$0) {
         return am.G.a(new de.a(Optional.empty(), $$0));
      }

      public static an<de.a> a(daw $$0) {
         return am.G.a(new de.a(Optional.empty(), Optional.of(ch.a.a().a($$0).b())));
      }

      public boolean a(cto $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
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
