import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdi(fde b, fde c) implements fde {
   public static final MapCodec<fdi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdf.a.fieldOf("min").forGetter(fdi::c), fdf.a.fieldOf("max").forGetter(fdi::d)).apply($$0, fdi::new)
   );

   @Override
   public fdd b() {
      return fdf.c;
   }

   public static fdi a(float $$0, float $$1) {
      return new fdi(fdb.a($$0), fdb.a($$1));
   }

   @Override
   public int a(eyz $$0) {
      return azm.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eyz $$0) {
      return azm.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fde c() {
      return this.b;
   }

   public fde d() {
      return this.c;
   }
}
