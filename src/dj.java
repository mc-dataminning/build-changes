import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dj extends de<dj.a> {
   @Override
   public Codec<dj.a> a() {
      return dj.a.a;
   }

   public void a(aqi $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bc> b) implements de.a {
      public static final Codec<dj.a> a = RecordCodecBuilder.create($$0 -> $$0.group(axh.a(br.b, "player").forGetter(dj.a::a)).apply($$0, dj.a::new));

      public static an<dj.a> a(br.a $$0) {
         return am.U.a(new dj.a(Optional.of(br.a($$0))));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
