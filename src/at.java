import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends cv<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(anf $$0, djp $$1, cng $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bb> b, Optional<ih<cwy>> c, Optional<ca> d, ck.d e) implements cv.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atx.a(bp.b, "player").forGetter(at.a::a),
                  atx.a(kd.e.r(), "block").forGetter(at.a::b),
                  atx.a(ca.a, "item").forGetter(at.a::c),
                  atx.a(ck.d.d, "num_bees_inside", ck.d.c).forGetter(at.a::d)
               )
               .apply($$0, at.a::new)
      );

      public static an<at.a> a(cwy $$0, ca.a $$1, ck.d $$2) {
         return am.L.a(new at.a(Optional.empty(), Optional.of($$0.r()), Optional.of($$1.b()), $$2));
      }

      public boolean a(djp $$0, cng $$1, int $$2) {
         if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1) ? false : this.e.d($$2);
         }
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ih<cwy>> b() {
         return this.c;
      }

      public Optional<ca> c() {
         return this.d;
      }

      public ck.d d() {
         return this.e;
      }
   }
}
