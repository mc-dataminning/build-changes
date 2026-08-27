import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cw extends cx<cw.a> {
   @Override
   public Codec<cw.a> a() {
      return cw.a.a;
   }

   public void a(apg $$0, cqk $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<cc> c) implements cx.a {
      public static final Codec<cw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.a(br.b, "player").forGetter(cw.a::a), awe.a(cc.a, "item").forGetter(cw.a::b)).apply($$0, cw.a::new)
      );

      public static an<cw.a> a(Optional<cc> $$0) {
         return am.G.a(new cw.a(Optional.empty(), $$0));
      }

      public static an<cw.a> a(cwy $$0) {
         return am.G.a(new cw.a(Optional.empty(), Optional.of(cc.a.a().a($$0).b())));
      }

      public boolean a(cqk $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
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
