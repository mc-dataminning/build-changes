import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dx extends ds<dx.a> {
   @Override
   public Codec<dx.a> a() {
      return dx.a.a;
   }

   public void a(aqn $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bf> b) implements ds.a {
      public static final Codec<dx.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dx.a::a)).apply($$0, dx.a::new));

      public static an<dx.a> a(bu.a $$0) {
         return am.U.a(new dx.a(Optional.of(bu.a($$0))));
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
