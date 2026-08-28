import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fes(feo b, feo c) implements feo {
   public static final MapCodec<fes> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fep.a.fieldOf("min").forGetter(fes::c), fep.a.fieldOf("max").forGetter(fes::d)).apply($$0, fes::new)
   );

   @Override
   public fen b() {
      return fep.c;
   }

   public static fes a(float $$0, float $$1) {
      return new fes(fel.a($$0), fel.a($$1));
   }

   @Override
   public int a(faj $$0) {
      return azq.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(faj $$0) {
      return azq.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bbb<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public feo c() {
      return this.b;
   }

   public feo d() {
      return this.c;
   }
}
