import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class di extends cx<di.a> {
   @Override
   public Codec<di.a> a() {
      return di.a.a;
   }

   public void a(aow $$0, coz $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<cc> c) implements cx.a {
      public static final Codec<di.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avp.a(br.b, "player").forGetter(di.a::a), avp.a(cc.a, "item").forGetter(di.a::b)).apply($$0, di.a::new)
      );

      public static an<di.a> a(cc $$0) {
         return am.C.a(new di.a(Optional.empty(), Optional.of($$0)));
      }

      public static an<di.a> a(cvm $$0) {
         return am.C.a(new di.a(Optional.empty(), Optional.of(cc.a.a().a($$0).b())));
      }

      public boolean a(coz $$0) {
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
