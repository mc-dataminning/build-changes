import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcp(je<dmf> b, Optional<dq> c) implements fcq {
   public static final MapCodec<fcp> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mf.e.r().fieldOf("block").forGetter(fcp::c), dq.a.optionalFieldOf("properties").forGetter(fcp::d)).apply($$0, fcp::new)
      )
      .validate(fcp::a);

   private static DataResult<fcp> a(fcp $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public fcr b() {
      return fcs.i;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcb.g);
   }

   public boolean a(ezh $$0) {
      eah $$1 = $$0.c(fcb.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static fcp.a a(dmf $$0) {
      return new fcp.a($$0);
   }

   public je<dmf> c() {
      return this.b;
   }

   public Optional<dq> d() {
      return this.c;
   }

   public static class a implements fcq.a {
      private final je<dmf> a;
      private Optional<dq> b = Optional.empty();

      public a(dmf $$0) {
         this.a = $$0.p();
      }

      public fcp.a a(dq.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public fcq build() {
         return new fcp(this.a, this.b);
      }
   }
}
