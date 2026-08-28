import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bq extends dk<bq.a> {
   @Override
   public Codec<bq.a> a() {
      return bq.a.a;
   }

   public void a(arr $$0, ffc $$1) {
      ffc $$2 = $$0.ds();
      this.a($$0, $$3 -> $$3.a($$0.y(), $$1, $$2));
   }

   public static record a(Optional<bj> b, Optional<cu> c, Optional<bp> d) implements dk.a {
      public static final Codec<bq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(bq.a::a),
                  cu.a.optionalFieldOf("start_position").forGetter(bq.a::b),
                  bp.a.optionalFieldOf("distance").forGetter(bq.a::c)
               )
               .apply($$0, bq.a::new)
      );

      public static ar<bq.a> a(by.a $$0, bp $$1, cu.a $$2) {
         return aq.X.a(new bq.a(Optional.of(by.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
      }

      public static ar<bq.a> a(by.a $$0, bp $$1) {
         return aq.Y.a(new bq.a(Optional.of(by.a($$0)), Optional.empty(), Optional.of($$1)));
      }

      public static ar<bq.a> a(bp $$0) {
         return aq.D.a(new bq.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public boolean a(arq $$0, ffc $$1, ffc $$2) {
         return this.c.isPresent() && !this.c.get().a($$0, $$1.d, $$1.e, $$1.f)
            ? false
            : !this.d.isPresent() || this.d.get().a($$1.d, $$1.e, $$1.f, $$2.d, $$2.e, $$2.f);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cu> b() {
         return this.c;
      }

      public Optional<bp> c() {
         return this.d;
      }
   }
}
