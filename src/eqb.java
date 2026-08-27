import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eqb(il<dby> b, Optional<db> c) implements eqc {
   public static final Codec<eqb> a = aws.b(
      RecordCodecBuilder.create($$0 -> $$0.group(kr.e.r().fieldOf("block").forGetter(eqb::c), aws.a(db.a, "properties").forGetter(eqb::d)).apply($$0, eqb::new)),
      eqb::a
   );

   private static DataResult<eqb> a(eqb $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eqd b() {
      return eqe.j;
   }

   @Override
   public Set<epl<?>> a() {
      return Set.of(epo.g);
   }

   public boolean a(enb $$0) {
      doz $$1 = $$0.c(epo.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eqb.a a(dby $$0) {
      return new eqb.a($$0);
   }

   public il<dby> c() {
      return this.b;
   }

   public Optional<db> d() {
      return this.c;
   }

   public static class a implements eqc.a {
      private final il<dby> a;
      private Optional<db> b = Optional.empty();

      public a(dby $$0) {
         this.a = $$0.r();
      }

      public eqb.a a(db.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public eqc build() {
         return new eqb(this.a, this.b);
      }
   }
}
