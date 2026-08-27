import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class di extends dd<di.a> {
   @Override
   public Codec<di.a> a() {
      return di.a.a;
   }

   public void a(aqf $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bc> b) implements dd.a {
      public static final Codec<di.a> a = RecordCodecBuilder.create($$0 -> $$0.group(axe.a(br.b, "player").forGetter(di.a::a)).apply($$0, di.a::new));

      public static an<di.a> a(br.a $$0) {
         return am.U.a(new di.a(Optional.of(br.a($$0))));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
