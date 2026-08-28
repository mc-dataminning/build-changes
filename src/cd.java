import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cd extends dl<cd.a> {
   @Override
   public Codec<cd.a> a() {
      return cd.a.a;
   }

   public void a(arv $$0, ffs $$1, @Nullable bwv $$2) {
      ffs $$3 = $$0.dt();
      faj $$4 = $$2 != null ? bz.b($$0, $$2) : null;
      this.a($$0, $$4x -> $$4x.a($$0.y(), $$1, $$3, $$4));
   }

   public static record a(Optional<bj> b, Optional<cv> c, Optional<bq> d, Optional<bj> e) implements dl.a {
      public static final Codec<cd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(cd.a::a),
                  cv.a.optionalFieldOf("start_position").forGetter(cd.a::b),
                  bq.a.optionalFieldOf("distance").forGetter(cd.a::c),
                  bz.b.optionalFieldOf("cause").forGetter(cd.a::d)
               )
               .apply($$0, cd.a::new)
      );

      public static ar<cd.a> a(bq $$0, bz.a $$1) {
         return aq.ae.a(new cd.a(Optional.empty(), Optional.empty(), Optional.of($$0), Optional.of(bz.a($$1))));
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.d(), ".cause");
      }

      public boolean a(aru $$0, ffs $$1, ffs $$2, @Nullable faj $$3) {
         if (this.c.isPresent() && !this.c.get().a($$0, $$1.d, $$1.e, $$1.f)) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1.d, $$1.e, $$1.f, $$2.d, $$2.e, $$2.f)
               ? false
               : !this.e.isPresent() || $$3 != null && this.e.get().a($$3);
         }
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

      public Optional<bj> d() {
         return this.e;
      }
   }
}
