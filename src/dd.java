import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dd extends df<dd.a> {
   @Override
   public Codec<dd.a> a() {
      return dd.a.a;
   }

   public void a(aqo $$0, cxy<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static an<dd.a> a(akn $$0) {
      return am.g.a(new dd.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bc> b, akn c) implements df.a {
      public static final Codec<dd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(dd.a::a), akn.a.fieldOf("recipe").forGetter(dd.a::b)).apply($$0, dd.a::new)
      );

      public boolean a(cxy<?> $$0) {
         return this.c.equals($$0.a());
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public akn b() {
         return this.c;
      }
   }
}
