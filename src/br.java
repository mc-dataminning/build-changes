import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class br extends dl<br.a> {
   @Override
   public Codec<br.a> a() {
      return br.a.a;
   }

   public void a(arv $$0, ffs $$1) {
      ffs $$2 = $$0.dt();
      this.a($$0, $$3 -> $$3.a($$0.y(), $$1, $$2));
   }

   public static record a(Optional<bj> b, Optional<cv> c, Optional<bq> d) implements dl.a {
      public static final Codec<br.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(br.a::a),
                  cv.a.optionalFieldOf("start_position").forGetter(br.a::b),
                  bq.a.optionalFieldOf("distance").forGetter(br.a::c)
               )
               .apply($$0, br.a::new)
      );

      public static ar<br.a> a(bz.a $$0, bq $$1, cv.a $$2) {
         return aq.X.a(new br.a(Optional.of(bz.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
      }

      public static ar<br.a> a(bz.a $$0, bq $$1) {
         return aq.Y.a(new br.a(Optional.of(bz.a($$0)), Optional.empty(), Optional.of($$1)));
      }

      public static ar<br.a> a(bq $$0) {
         return aq.D.a(new br.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public boolean a(aru $$0, ffs $$1, ffs $$2) {
         return this.c.isPresent() && !this.c.get().a($$0, $$1.d, $$1.e, $$1.f)
            ? false
            : !this.d.isPresent() || this.d.get().a($$1.d, $$1.e, $$1.f, $$2.d, $$2.e, $$2.f);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cv> b() {
         return this.c;
      }

      public Optional<bq> c() {
         return this.d;
      }
   }
}
