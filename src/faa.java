import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record faa(Optional<bw> b, ewo.b c) implements ezx {
   public static final MapCodec<faa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bw.a.optionalFieldOf("predicate").forGetter(faa::c), ewo.b.e.fieldOf("entity").forGetter(faa::d)).apply($$0, faa::new)
   );

   @Override
   public ezy b() {
      return ezz.f;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezi.f, this.c.a());
   }

   public boolean a(ewo $$0) {
      bvj $$1 = $$0.c(this.c.a());
      fbx $$2 = $$0.c(ezi.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ezx.a a(ewo.b $$0) {
      return a($$0, bw.a.a());
   }

   public static ezx.a a(ewo.b $$0, bw.a $$1) {
      return () -> new faa(Optional.of($$1.b()), $$0);
   }

   public static ezx.a a(ewo.b $$0, bw $$1) {
      return () -> new faa(Optional.of($$1), $$0);
   }

   public Optional<bw> c() {
      return this.b;
   }

   public ewo.b d() {
      return this.c;
   }
}
