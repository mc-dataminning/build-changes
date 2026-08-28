import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class co extends dy<co.a> {
   @Override
   public Codec<co.a> a() {
      return co.a.a;
   }

   public void a(arr $$0, cwf $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bh> b, Optional<cu> c, dj.d d, dj.d e) implements dy.a {
      public static final Codec<co.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(co.a::a),
                  cu.a.optionalFieldOf("item").forGetter(co.a::b),
                  dj.d.d.optionalFieldOf("durability", dj.d.c).forGetter(co.a::c),
                  dj.d.d.optionalFieldOf("delta", dj.d.c).forGetter(co.a::d)
               )
               .apply($$0, co.a::new)
      );

      public static ap<co.a> a(Optional<cu> $$0, dj.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static ap<co.a> a(Optional<bh> $$0, Optional<cu> $$1, dj.d $$2) {
         return ao.u.a(new co.a($$0, $$1, $$2, dj.d.c));
      }

      public boolean a(cwf $$0, int $$1) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            return !this.d.d($$0.p() - $$1) ? false : this.e.d($$0.o() - $$1);
         }
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<cu> b() {
         return this.c;
      }

      public dj.d c() {
         return this.d;
      }

      public dj.d d() {
         return this.e;
      }
   }
}
