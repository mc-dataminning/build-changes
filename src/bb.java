import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bb extends df<bb.a> {
   @Override
   public Codec<bb.a> a() {
      return bb.a.a;
   }

   public void a(aqo $$0, ctq $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ch> c) implements df.a {
      public static final Codec<bb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(bb.a::a), ch.a.optionalFieldOf("item").forGetter(bb.a::c)).apply($$0, bb.a::new)
      );

      public static an<bb.a> b() {
         return am.A.a(new bb.a(Optional.empty(), Optional.empty()));
      }

      public static an<bb.a> a(day $$0) {
         return a(ch.a.a().a($$0.r()));
      }

      public static an<bb.a> a(ch.a $$0) {
         return am.A.a(new bb.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(ctq $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
