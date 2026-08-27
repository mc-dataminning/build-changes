import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bl extends de<bl.a> {
   @Override
   public Codec<bl.a> a() {
      return bl.a.a;
   }

   public void a(aqi $$0, csz $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bc> b, Optional<ch> c, ct.d d) implements de.a {
      public static final Codec<bl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(bl.a::a), axh.a(ch.a, "item").forGetter(bl.a::c), axh.a(ct.d.d, "levels", ct.d.c).forGetter(bl.a::d))
               .apply($$0, bl.a::new)
      );

      public static an<bl.a> b() {
         return am.j.a(new bl.a(Optional.empty(), Optional.empty(), ct.d.c));
      }

      public boolean a(csz $$0, int $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.d($$1);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
