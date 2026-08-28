import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cp extends dj<cp.a> {
   @Override
   public Codec<cp.a> a() {
      return cp.a.a;
   }

   public void a(arr $$0, feq $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bi> b, Optional<bo> c, cv.d d) implements dj.a {
      public static final Codec<cp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(cp.a::a),
                  bo.a.optionalFieldOf("distance").forGetter(cp.a::b),
                  cv.d.d.optionalFieldOf("duration", cv.d.c).forGetter(cp.a::c)
               )
               .apply($$0, cp.a::new)
      );

      public static aq<cp.a> a(bo $$0) {
         return ap.v.a(new cp.a(Optional.empty(), Optional.of($$0), cv.d.c));
      }

      public boolean a(arr $$0, feq $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.d, $$1.e, $$1.f, $$0.dA(), $$0.dC(), $$0.dG()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<bo> b() {
         return this.c;
      }

      public cv.d c() {
         return this.d;
      }
   }
}
