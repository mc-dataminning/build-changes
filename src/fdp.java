import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdp(jf<dnc> b, Optional<dr> c) implements fdq {
   public static final MapCodec<fdp> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mg.e.r().fieldOf("block").forGetter(fdp::c), dr.a.optionalFieldOf("properties").forGetter(fdp::d)).apply($$0, fdp::new)
      )
      .validate(fdp::a);

   private static DataResult<fdp> a(fdp $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public fdr b() {
      return fds.i;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.g);
   }

   public boolean a(fah $$0) {
      ebe $$1 = $$0.c(fdb.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static fdp.a a(dnc $$0) {
      return new fdp.a($$0);
   }

   public jf<dnc> c() {
      return this.b;
   }

   public Optional<dr> d() {
      return this.c;
   }

   public static class a implements fdq.a {
      private final jf<dnc> a;
      private Optional<dr> b = Optional.empty();

      public a(dnc $$0) {
         this.a = $$0.p();
      }

      public fdp.a a(dr.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public fdq build() {
         return new fdp(this.a, this.b);
      }
   }
}
