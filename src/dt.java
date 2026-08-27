import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dt extends df<dt.a> {
   @Override
   public Codec<dt.a> a() {
      return dt.a.a;
   }

   public void a(aqn $$0, cto $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ch> c) implements df.a {
      public static final Codec<dt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(dt.a::a), ch.a.optionalFieldOf("item").forGetter(dt.a::b)).apply($$0, dt.a::new)
      );

      public static an<dt.a> a(ch $$0) {
         return am.C.a(new dt.a(Optional.empty(), Optional.of($$0)));
      }

      public static an<dt.a> a(daw $$0) {
         return am.C.a(new dt.a(Optional.empty(), Optional.of(ch.a.a().a($$0).b())));
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
