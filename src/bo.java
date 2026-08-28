import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bo extends dy<bo.a> {
   @Override
   public Codec<bo.a> a() {
      return bo.a.a;
   }

   public void a(asi $$0, fbs $$1) {
      fbs $$2 = $$0.dt();
      this.a($$0, $$3 -> $$3.a($$0.y(), $$1, $$2));
   }

   public static record a(Optional<bh> b, Optional<dh> c, Optional<bn> d) implements dy.a {
      public static final Codec<bo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(bo.a::a),
                  dh.a.optionalFieldOf("start_position").forGetter(bo.a::b),
                  bn.a.optionalFieldOf("distance").forGetter(bo.a::c)
               )
               .apply($$0, bo.a::new)
      );

      public static ap<bo.a> a(bw.a $$0, bn $$1, dh.a $$2) {
         return ao.X.a(new bo.a(Optional.of(bw.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
      }

      public static ap<bo.a> a(bw.a $$0, bn $$1) {
         return ao.Y.a(new bo.a(Optional.of(bw.a($$0)), Optional.empty(), Optional.of($$1)));
      }

      public static ap<bo.a> a(bn $$0) {
         return ao.D.a(new bo.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public boolean a(ash $$0, fbs $$1, fbs $$2) {
         return this.c.isPresent() && !this.c.get().a($$0, $$1.d, $$1.e, $$1.f)
            ? false
            : !this.d.isPresent() || this.d.get().a($$1.d, $$1.e, $$1.f, $$2.d, $$2.e, $$2.f);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<dh> b() {
         return this.c;
      }

      public Optional<bn> c() {
         return this.d;
      }
   }
}
