import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bg extends dj<bg.a> {
   @Override
   public Codec<bg.a> a() {
      return bg.a.a;
   }

   public void a(arp $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, cv.d c) implements dj.a {
      public static final Codec<bg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(bg.a::a), cv.d.d.optionalFieldOf("level", cv.d.c).forGetter(bg.a::c)).apply($$0, bg.a::new)
      );

      public static aq<bg.a> b() {
         return ap.m.a(new bg.a(Optional.empty(), cv.d.c));
      }

      public static aq<bg.a> a(cv.d $$0) {
         return ap.m.a(new bg.a(Optional.empty(), $$0));
      }

      public boolean a(int $$0) {
         return this.c.d($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
