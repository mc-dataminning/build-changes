import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bb extends cx<bb.a> {
   @Override
   public Codec<bb.a> a() {
      return bb.a.a;
   }

   public void a(apv $$0, crs $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<cc> c) implements cx.a {
      public static final Codec<bb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awu.a(br.b, "player").forGetter(bb.a::a), awu.a(cc.a, "item").forGetter(bb.a::c)).apply($$0, bb.a::new)
      );

      public static an<bb.a> b() {
         return am.A.a(new bb.a(Optional.empty(), Optional.empty()));
      }

      public static an<bb.a> a(czf $$0) {
         return a(cc.a.a().a($$0.p()));
      }

      public static an<bb.a> a(cc.a $$0) {
         return am.A.a(new bb.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(crs $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
