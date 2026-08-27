import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eju(ih<cwq> b, Optional<cz> c) implements ejv {
   public static final Codec<eju> a = atw.a(
      RecordCodecBuilder.create($$0 -> $$0.group(kd.e.r().fieldOf("block").forGetter(eju::c), atw.a(cz.a, "properties").forGetter(eju::d)).apply($$0, eju::new)),
      eju::a
   );

   private static DataResult<eju> a(eju $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ejw b() {
      return ejx.j;
   }

   @Override
   public Set<eje<?>> a() {
      return Set.of(ejh.g);
   }

   public boolean a(egw $$0) {
      djh $$1 = $$0.c(ejh.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eju.a a(cwq $$0) {
      return new eju.a($$0);
   }

   public ih<cwq> c() {
      return this.b;
   }

   public Optional<cz> d() {
      return this.c;
   }

   public static class a implements ejv.a {
      private final ih<cwq> a;
      private Optional<cz> b = Optional.empty();

      public a(cwq $$0) {
         this.a = $$0.r();
      }

      public eju.a a(cz.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ejv build() {
         return new eju(this.a, this.b);
      }
   }
}
