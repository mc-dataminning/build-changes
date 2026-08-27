import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record egg(ib<cua> b, Optional<da> c) implements egh {
   public static final Codec<egg> a = asg.a(
      RecordCodecBuilder.create($$0 -> $$0.group(jy.f.r().fieldOf("block").forGetter(egg::c), asg.a(da.a, "properties").forGetter(egg::d)).apply($$0, egg::new)),
      egg::a
   );

   private static DataResult<egg> a(egg $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public egi b() {
      return egj.j;
   }

   @Override
   public Set<efq<?>> a() {
      return Set.of(eft.g);
   }

   public boolean a(edi $$0) {
      dgb $$1 = $$0.c(eft.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static egg.a a(cua $$0) {
      return new egg.a($$0);
   }

   public ib<cua> c() {
      return this.b;
   }

   public Optional<da> d() {
      return this.c;
   }

   public static class a implements egh.a {
      private final ib<cua> a;
      private Optional<da> b = Optional.empty();

      public a(cua $$0) {
         this.a = $$0.r();
      }

      public egg.a a(da.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public egh build() {
         return new egg(this.a, this.b);
      }
   }
}
