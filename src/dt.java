import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dt extends de<dt.a> {
   @Override
   public Codec<dt.a> a() {
      return dt.a.a;
   }

   public void a(aqi $$0, csz $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ch> c) implements de.a {
      public static final Codec<dt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(dt.a::a), axh.a(ch.a, "item").forGetter(dt.a::b)).apply($$0, dt.a::new)
      );

      public static an<dt.a> a(br.a $$0, ch.a $$1) {
         return am.W.a(new dt.a(Optional.of(br.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(csz $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<ch> b() {
         return this.c;
      }
   }
}
