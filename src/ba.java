import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ba extends cx<ba.a> {
   @Override
   public Codec<ba.a> a() {
      return ba.a.a;
   }

   public void a(apv $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, cm.d c) implements cx.a {
      public static final Codec<ba.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awu.a(br.b, "player").forGetter(ba.a::a), awu.a(cm.d.d, "level", cm.d.c).forGetter(ba.a::c)).apply($$0, ba.a::new)
      );

      public static an<ba.a> b() {
         return am.m.a(new ba.a(Optional.empty(), cm.d.c));
      }

      public static an<ba.a> a(cm.d $$0) {
         return am.m.a(new ba.a(Optional.empty(), $$0));
      }

      public boolean a(int $$0) {
         return this.c.d($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
