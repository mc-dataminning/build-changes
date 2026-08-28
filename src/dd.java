import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dd extends dy<dd.a> {
   @Override
   public Codec<dd.a> a() {
      return dd.a.a;
   }

   public void a(arq $$0, ezy $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bh> b, Optional<bn> c, dj.d d) implements dy.a {
      public static final Codec<dd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(dd.a::a),
                  bn.a.optionalFieldOf("distance").forGetter(dd.a::b),
                  dj.d.d.optionalFieldOf("duration", dj.d.c).forGetter(dd.a::c)
               )
               .apply($$0, dd.a::new)
      );

      public static ap<dd.a> a(bn $$0) {
         return ao.v.a(new dd.a(Optional.empty(), Optional.of($$0), dj.d.c));
      }

      public boolean a(arq $$0, ezy $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.d, $$1.e, $$1.f, $$0.dA(), $$0.dC(), $$0.dG()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<bn> b() {
         return this.c;
      }

      public dj.d c() {
         return this.d;
      }
   }
}
