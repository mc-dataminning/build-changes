import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cp extends dz<cp.a> {
   @Override
   public Codec<cp.a> a() {
      return cp.a.a;
   }

   public void a(are $$0, cwp $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bi> b, Optional<cv> c, dk.d d, dk.d e) implements dz.a {
      public static final Codec<cp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(cp.a::a),
                  cv.a.optionalFieldOf("item").forGetter(cp.a::b),
                  dk.d.d.optionalFieldOf("durability", dk.d.c).forGetter(cp.a::c),
                  dk.d.d.optionalFieldOf("delta", dk.d.c).forGetter(cp.a::d)
               )
               .apply($$0, cp.a::new)
      );

      public static aq<cp.a> a(Optional<cv> $$0, dk.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static aq<cp.a> a(Optional<bi> $$0, Optional<cv> $$1, dk.d $$2) {
         return ap.u.a(new cp.a($$0, $$1, $$2, dk.d.c));
      }

      public boolean a(cwp $$0, int $$1) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            return !this.d.d($$0.p() - $$1) ? false : this.e.d($$0.o() - $$1);
         }
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<cv> b() {
         return this.c;
      }

      public dk.d c() {
         return this.d;
      }

      public dk.d d() {
         return this.e;
      }
   }
}
