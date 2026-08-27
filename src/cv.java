import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cv extends cx<cv.a> {
   @Override
   public Codec<cv.a> a() {
      return cv.a.a;
   }

   public void a(apg $$0, ctp<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static an<cv.a> a(ajh $$0) {
      return am.g.a(new cv.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bc> b, ajh c) implements cx.a {
      public static final Codec<cv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.a(br.b, "player").forGetter(cv.a::a), ajh.a.fieldOf("recipe").forGetter(cv.a::b)).apply($$0, cv.a::new)
      );

      public boolean a(ctp<?> $$0) {
         return this.c.equals($$0.a());
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public ajh b() {
         return this.c;
      }
   }
}
