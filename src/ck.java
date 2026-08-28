import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ck extends dj<ck.a> {
   @Override
   public Codec<ck.a> a() {
      return ck.a.a;
   }

   public void a(arr $$0, cyy $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bi> b, Optional<cl> c, cv.d d, cv.d e) implements dj.a {
      public static final Codec<ck.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(ck.a::a),
                  cl.a.optionalFieldOf("item").forGetter(ck.a::b),
                  cv.d.d.optionalFieldOf("durability", cv.d.c).forGetter(ck.a::c),
                  cv.d.d.optionalFieldOf("delta", cv.d.c).forGetter(ck.a::d)
               )
               .apply($$0, ck.a::new)
      );

      public static aq<ck.a> a(Optional<cl> $$0, cv.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static aq<ck.a> a(Optional<bi> $$0, Optional<cl> $$1, cv.d $$2) {
         return ap.u.a(new ck.a($$0, $$1, $$2, cv.d.c));
      }

      public boolean a(cyy $$0, int $$1) {
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

      public Optional<cl> b() {
         return this.c;
      }

      public cv.d c() {
         return this.d;
      }

      public cv.d d() {
         return this.e;
      }
   }
}
