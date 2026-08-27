import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dd extends de<dd.a> {
   @Override
   public Codec<dd.a> a() {
      return dd.a.a;
   }

   public void a(aqi $$0, csz $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ch> c) implements de.a {
      public static final Codec<dd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(dd.a::a), axh.a(ch.a, "item").forGetter(dd.a::b)).apply($$0, dd.a::new)
      );

      public static an<dd.a> a(Optional<ch> $$0) {
         return am.G.a(new dd.a(Optional.empty(), $$0));
      }

      public static an<dd.a> a(dac $$0) {
         return am.G.a(new dd.a(Optional.empty(), Optional.of(ch.a.a().a($$0).b())));
      }

      public boolean a(csz $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
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
