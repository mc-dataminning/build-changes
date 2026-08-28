import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class aw extends dy<aw.a> {
   @Override
   public Codec<aw.a> a() {
      return aw.a.a;
   }

   public void a(asi $$0, dxv $$1, cxp $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bh> b, Optional<jq<dkm>> c, Optional<cu> d, dj.d e) implements dy.a {
      public static final Codec<aw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(aw.a::a),
                  ma.e.r().optionalFieldOf("block").forGetter(aw.a::b),
                  cu.a.optionalFieldOf("item").forGetter(aw.a::c),
                  dj.d.d.optionalFieldOf("num_bees_inside", dj.d.c).forGetter(aw.a::d)
               )
               .apply($$0, aw.a::new)
      );

      public static ap<aw.a> a(dkm $$0, cu.a $$1, dj.d $$2) {
         return ao.L.a(new aw.a(Optional.empty(), Optional.of($$0.p()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dxv $$0, cxp $$1, int $$2) {
         if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1) ? false : this.e.d($$2);
         }
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<jq<dkm>> b() {
         return this.c;
      }

      public Optional<cu> c() {
         return this.d;
      }

      public dj.d d() {
         return this.e;
      }
   }
}
