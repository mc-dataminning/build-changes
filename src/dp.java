import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dp extends dj<dp.a> {
   @Override
   public Codec<dp.a> a() {
      return dp.a.a;
   }

   public void a(arp $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bi> b) implements dj.a {
      public static final Codec<dp.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dp.a::a)).apply($$0, dp.a::new));

      public static aq<dp.a> a(bx.a $$0) {
         return ap.U.a(new dp.a(Optional.of(bx.a($$0))));
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
