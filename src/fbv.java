import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fbv(je<dlu> b, Optional<dq> c) implements fbw {
   public static final MapCodec<fbv> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mf.e.r().fieldOf("block").forGetter(fbv::c), dq.a.optionalFieldOf("properties").forGetter(fbv::d)).apply($$0, fbv::new)
      )
      .validate(fbv::a);

   private static DataResult<fbv> a(fbv $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public fbx b() {
      return fby.i;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.g);
   }

   public boolean a(eyn $$0) {
      dzo $$1 = $$0.c(fbh.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static fbv.a a(dlu $$0) {
      return new fbv.a($$0);
   }

   public je<dlu> c() {
      return this.b;
   }

   public Optional<dq> d() {
      return this.c;
   }

   public static class a implements fbw.a {
      private final je<dlu> a;
      private Optional<dq> b = Optional.empty();

      public a(dlu $$0) {
         this.a = $$0.p();
      }

      public fbv.a a(dq.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public fbw build() {
         return new fbv(this.a, this.b);
      }
   }
}
