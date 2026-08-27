import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ba extends dd<ba.a> {
   @Override
   public Codec<ba.a> a() {
      return ba.a.a;
   }

   public void a(aqf $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, cs.d c) implements dd.a {
      public static final Codec<ba.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(ba.a::a), axe.a(cs.d.d, "level", cs.d.c).forGetter(ba.a::c)).apply($$0, ba.a::new)
      );

      public static an<ba.a> b() {
         return am.m.a(new ba.a(Optional.empty(), cs.d.c));
      }

      public static an<ba.a> a(cs.d $$0) {
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
