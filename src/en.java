import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class en extends dz<en.a> {
   @Override
   public Codec<en.a> a() {
      return en.a.a;
   }

   public void a(are $$0, cwq $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<cv> c) implements dz.a {
      public static final Codec<en.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(en.a::a), cv.a.optionalFieldOf("item").forGetter(en.a::b)).apply($$0, en.a::new)
      );

      public static aq<en.a> a(bx.a $$0, cv.a $$1) {
         return ap.W.a(new en.a(Optional.of(bx.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cwq $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<cv> b() {
         return this.c;
      }
   }
}
