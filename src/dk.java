import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dk extends cx<dk.a> {
   @Override
   public Codec<dk.a> a() {
      return dk.a.a;
   }

   public void a(apv $$0, crs $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<cc> c) implements cx.a {
      public static final Codec<dk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awu.a(br.b, "player").forGetter(dk.a::a), awu.a(cc.a, "item").forGetter(dk.a::b)).apply($$0, dk.a::new)
      );

      public static an<dk.a> a(br.a $$0, cc.a $$1) {
         return am.W.a(new dk.a(Optional.of(br.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(crs $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cc> b() {
         return this.c;
      }
   }
}
