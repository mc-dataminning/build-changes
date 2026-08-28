import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fda(fde b, fde c) implements fde {
   public static final MapCodec<fda> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdf.a.fieldOf("n").forGetter(fda::c), fdf.a.fieldOf("p").forGetter(fda::d)).apply($$0, fda::new)
   );

   @Override
   public fdd b() {
      return fdf.d;
   }

   @Override
   public int a(eyz $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azv $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eyz $$0) {
      return (float)this.a($$0);
   }

   public static fda a(int $$0, float $$1) {
      return new fda(fdb.a((float)$$0), fdb.a($$1));
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
