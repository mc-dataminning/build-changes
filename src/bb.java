import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bb extends cx<bb.a> {
   @Override
   public Codec<bb.a> a() {
      return bb.a.a;
   }

   public void a(apb $$0, cpq $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<cc> c) implements cx.a {
      public static final Codec<bb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avu.a(br.b, "player").forGetter(bb.a::a), avu.a(cc.a, "item").forGetter(bb.a::c)).apply($$0, bb.a::new)
      );

      public static an<bb.a> b() {
         return am.A.a(new bb.a(Optional.empty(), Optional.empty()));
      }

      public static an<bb.a> a(cwd $$0) {
         return a(cc.a.a().a($$0.l()));
      }

      public static an<bb.a> a(cc.a $$0) {
         return am.A.a(new bb.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cpq $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
