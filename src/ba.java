import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ba extends dj<ba.a> {
   @Override
   public Codec<ba.a> a() {
      return ba.a.a;
   }

   public void a(arr $$0, je<das> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<je<das>> c) implements dj.a {
      public static final Codec<ba.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(ba.a::a), das.a.optionalFieldOf("potion").forGetter(ba.a::c)).apply($$0, ba.a::new)
      );

      public static aq<ba.a> b() {
         return ap.l.a(new ba.a(Optional.empty(), Optional.empty()));
      }

      public boolean a(je<das> $$0) {
         return !this.c.isPresent() || this.c.get().equals($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
