import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ee extends dz<ee.a> {
   @Override
   public Codec<ee.a> a() {
      return ee.a.a;
   }

   public void a(aro $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bi> b) implements dz.a {
      public static final Codec<ee.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(ee.a::a)).apply($$0, ee.a::new));

      public static aq<ee.a> a(bx.a $$0) {
         return ap.U.a(new ee.a(Optional.of(bx.a($$0))));
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
