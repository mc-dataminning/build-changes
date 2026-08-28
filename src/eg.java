import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eg extends ds<eg.a> {
   @Override
   public Codec<eg.a> a() {
      return eg.a.a;
   }

   public void a(aql $$0, cua $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<cp> c) implements ds.a {
      public static final Codec<eg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(eg.a::a), cp.a.optionalFieldOf("item").forGetter(eg.a::b)).apply($$0, eg.a::new)
      );

      public static an<eg.a> a(bu.a $$0, cp.a $$1) {
         return am.W.a(new eg.a(Optional.of(bu.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cua $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<cp> b() {
         return this.c;
      }
   }
}
