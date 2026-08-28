import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ax extends ds<ax.a> {
   @Override
   public Codec<ax.a> a() {
      return ax.a.a;
   }

   public void a(aql $$0, jj<cvz> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<jj<cvz>> c) implements ds.a {
      public static final Codec<ax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(ax.a::a), lq.h.s().optionalFieldOf("potion").forGetter(ax.a::c)).apply($$0, ax.a::new)
      );

      public static an<ax.a> b() {
         return am.l.a(new ax.a(Optional.empty(), Optional.empty()));
      }

      public boolean a(jj<cvz> $$0) {
         return !this.c.isPresent() || this.c.get().equals($$0);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
