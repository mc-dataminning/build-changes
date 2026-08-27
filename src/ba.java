import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ba extends cv<ba.a> {
   @Override
   public Codec<ba.a> a() {
      return ba.a.a;
   }

   public void a(amq $$0, cmh $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, Optional<ca> c) implements cv.a {
      public static final Codec<ba.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atg.a(bp.b, "player").forGetter(ba.a::a), atg.a(ca.a, "item").forGetter(ba.a::c)).apply($$0, ba.a::new)
      );

      public static an<ba.a> b() {
         return am.A.a(new ba.a(Optional.empty(), Optional.empty()));
      }

      public static an<ba.a> a(csx $$0) {
         return a(ca.a.a().a($$0.k()));
      }

      public static an<ba.a> a(ca.a $$0) {
         return am.A.a(new ba.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cmh $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
