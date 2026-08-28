import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ec extends dx<ec.a> {
   @Override
   public Codec<ec.a> a() {
      return ec.a.a;
   }

   public void a(arn $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bg> b) implements dx.a {
      public static final Codec<ec.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ec.a::a)).apply($$0, ec.a::new));

      public static ao<ec.a> a(bv.a $$0) {
         return an.U.a(new ec.a(Optional.of(bv.a($$0))));
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
