import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class av extends dx<av.a> {
   @Override
   public Codec<av.a> a() {
      return av.a.a;
   }

   public void a(arn $$0, dvd $$1, cvx $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bg> b, Optional<jp<dhy>> c, Optional<ct> d, di.d e) implements dx.a {
      public static final Codec<av.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(av.a::a),
                  lx.e.r().optionalFieldOf("block").forGetter(av.a::b),
                  ct.a.optionalFieldOf("item").forGetter(av.a::c),
                  di.d.d.optionalFieldOf("num_bees_inside", di.d.c).forGetter(av.a::d)
               )
               .apply($$0, av.a::new)
      );

      public static ao<av.a> a(dhy $$0, ct.a $$1, di.d $$2) {
         return an.L.a(new av.a(Optional.empty(), Optional.of($$0.p()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dvd $$0, cvx $$1, int $$2) {
         if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1) ? false : this.e.d($$2);
         }
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<jp<dhy>> b() {
         return this.c;
      }

      public Optional<ct> c() {
         return this.d;
      }

      public di.d d() {
         return this.e;
      }
   }
}
