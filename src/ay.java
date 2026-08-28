import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ay extends dl<ay.a> {
   @Override
   public Codec<ay.a> a() {
      return ay.a.a;
   }

   public void a(arv $$0, ebg $$1, daa $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bj> b, Optional<jg<dne>> c, Optional<cn> d, cx.d e) implements dl.a {
      public static final Codec<ay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(ay.a::a),
                  mh.e.r().optionalFieldOf("block").forGetter(ay.a::b),
                  cn.a.optionalFieldOf("item").forGetter(ay.a::c),
                  cx.d.d.optionalFieldOf("num_bees_inside", cx.d.c).forGetter(ay.a::d)
               )
               .apply($$0, ay.a::new)
      );

      public static ar<ay.a> a(dne $$0, cn.a $$1, cx.d $$2) {
         return aq.L.a(new ay.a(Optional.empty(), Optional.of($$0.p()), Optional.of($$1.b()), $$2));
      }

      public boolean a(ebg $$0, daa $$1, int $$2) {
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

      public Optional<jg<dne>> b() {
         return this.c;
      }

      public Optional<cn> c() {
         return this.d;
      }

      public cx.d d() {
         return this.e;
      }
   }
}
