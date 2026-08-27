import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dk extends df<dk.a> {
   @Override
   public Codec<dk.a> a() {
      return dk.a.a;
   }

   public void a(aqo $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bc> b) implements df.a {
      public static final Codec<dk.a> a = RecordCodecBuilder.create($$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(dk.a::a)).apply($$0, dk.a::new));

      public static an<dk.a> a(br.a $$0) {
         return am.U.a(new dk.a(Optional.of(br.a($$0))));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
