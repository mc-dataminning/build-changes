import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ax extends dz<ax.a> {
   @Override
   public Codec<ax.a> a() {
      return ax.a.a;
   }

   public void a(ard $$0, dwv $$1, cwn $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bi> b, Optional<jr<djk>> c, Optional<cv> d, dk.d e) implements dz.a {
      public static final Codec<ax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(ax.a::a),
                  mb.e.r().optionalFieldOf("block").forGetter(ax.a::b),
                  cv.a.optionalFieldOf("item").forGetter(ax.a::c),
                  dk.d.d.optionalFieldOf("num_bees_inside", dk.d.c).forGetter(ax.a::d)
               )
               .apply($$0, ax.a::new)
      );

      public static aq<ax.a> a(djk $$0, cv.a $$1, dk.d $$2) {
         return ap.L.a(new ax.a(Optional.empty(), Optional.of($$0.p()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dwv $$0, cwn $$1, int $$2) {
         if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1) ? false : this.e.d($$2);
         }
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<jr<djk>> b() {
         return this.c;
      }

      public Optional<cv> c() {
         return this.d;
      }

      public dk.d d() {
         return this.e;
      }
   }
}
