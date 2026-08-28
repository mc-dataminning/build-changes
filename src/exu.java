import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exu(Optional<bw> b, eug.b c) implements exr {
   public static final MapCodec<exu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bw.a.optionalFieldOf("predicate").forGetter(exu::c), eug.b.e.fieldOf("entity").forGetter(exu::d)).apply($$0, exu::new)
   );

   @Override
   public exs b() {
      return ext.f;
   }

   @Override
   public Set<ewz<?>> a() {
      return ImmutableSet.of(exc.f, this.c.a());
   }

   public boolean a(eug $$0) {
      bui $$1 = $$0.c(this.c.a());
      ezr $$2 = $$0.c(exc.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static exr.a a(eug.b $$0) {
      return a($$0, bw.a.a());
   }

   public static exr.a a(eug.b $$0, bw.a $$1) {
      return () -> new exu(Optional.of($$1.b()), $$0);
   }

   public static exr.a a(eug.b $$0, bw $$1) {
      return () -> new exu(Optional.of($$1), $$0);
   }

   public Optional<bw> c() {
      return this.b;
   }

   public eug.b d() {
      return this.c;
   }
}
