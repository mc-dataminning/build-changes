import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ens(il<daa> b, Optional<db> c) implements ent {
   public static final Codec<ens> a = awe.b(
      RecordCodecBuilder.create($$0 -> $$0.group(ki.e.r().fieldOf("block").forGetter(ens::c), awe.a(db.a, "properties").forGetter(ens::d)).apply($$0, ens::new)),
      ens::a
   );

   private static DataResult<ens> a(ens $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public enu b() {
      return env.j;
   }

   @Override
   public Set<enc<?>> a() {
      return Set.of(enf.g);
   }

   public boolean a(eku $$0) {
      dmz $$1 = $$0.c(enf.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ens.a a(daa $$0) {
      return new ens.a($$0);
   }

   public il<daa> c() {
      return this.b;
   }

   public Optional<db> d() {
      return this.c;
   }

   public static class a implements ent.a {
      private final il<daa> a;
      private Optional<db> b = Optional.empty();

      public a(daa $$0) {
         this.a = $$0.r();
      }

      public ens.a a(db.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ent build() {
         return new ens(this.a, this.b);
      }
   }
}
