import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ba extends dz<ba.a> {
   @Override
   public Codec<ba.a> a() {
      return ba.a.a;
   }

   public void a(aro $$0, js<czs> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<js<czs>> c) implements dz.a {
      public static final Codec<ba.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(ba.a::a), czs.a.optionalFieldOf("potion").forGetter(ba.a::c)).apply($$0, ba.a::new)
      );

      public static aq<ba.a> b() {
         return ap.l.a(new ba.a(Optional.empty(), Optional.empty()));
      }

      public boolean a(js<czs> $$0) {
         return !this.c.isPresent() || this.c.get().equals($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
