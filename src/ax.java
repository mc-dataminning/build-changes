import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ax extends dj<ax.a> {
   @Override
   public Codec<ax.a> a() {
      return ax.a.a;
   }

   public void a(arp $$0, dzo $$1, cys $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bi> b, Optional<je<dlu>> c, Optional<cl> d, cv.d e) implements dj.a {
      public static final Codec<ax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(ax.a::a),
                  mf.e.r().optionalFieldOf("block").forGetter(ax.a::b),
                  cl.a.optionalFieldOf("item").forGetter(ax.a::c),
                  cv.d.d.optionalFieldOf("num_bees_inside", cv.d.c).forGetter(ax.a::d)
               )
               .apply($$0, ax.a::new)
      );

      public static aq<ax.a> a(dlu $$0, cl.a $$1, cv.d $$2) {
         return ap.L.a(new ax.a(Optional.empty(), Optional.of($$0.p()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dzo $$0, cys $$1, int $$2) {
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

      public Optional<je<dlu>> b() {
         return this.c;
      }

      public Optional<cl> c() {
         return this.d;
      }

      public cv.d d() {
         return this.e;
      }
   }
}
