import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ay extends dk<ay.a> {
   @Override
   public Codec<ay.a> a() {
      return ay.a.a;
   }

   public void a(arr $$0, eao $$1, czk $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bj> b, Optional<jf<dmm>> c, Optional<cm> d, cw.d e) implements dk.a {
      public static final Codec<ay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(ay.a::a),
                  mg.e.r().optionalFieldOf("block").forGetter(ay.a::b),
                  cm.a.optionalFieldOf("item").forGetter(ay.a::c),
                  cw.d.d.optionalFieldOf("num_bees_inside", cw.d.c).forGetter(ay.a::d)
               )
               .apply($$0, ay.a::new)
      );

      public static ar<ay.a> a(dmm $$0, cm.a $$1, cw.d $$2) {
         return aq.L.a(new ay.a(Optional.empty(), Optional.of($$0.p()), Optional.of($$1.b()), $$2));
      }

      public boolean a(eao $$0, czk $$1, int $$2) {
         if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1) ? false : this.e.d($$2);
         }
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<jf<dmm>> b() {
         return this.c;
      }

      public Optional<cm> c() {
         return this.d;
      }

      public cw.d d() {
         return this.e;
      }
   }
}
