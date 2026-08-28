import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fco(fcs b, fcs c) implements fcs {
   public static final MapCodec<fco> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fct.a.fieldOf("n").forGetter(fco::c), fct.a.fieldOf("p").forGetter(fco::d)).apply($$0, fco::new)
   );

   @Override
   public fcr b() {
      return fct.d;
   }

   @Override
   public int a(eyn $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azt $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eyn $$0) {
      return (float)this.a($$0);
   }

   public static fco a(int $$0, float $$1) {
      return new fco(fcp.a((float)$$0), fcp.a($$1));
   }

   @Override
   public Set<bav<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fcs c() {
      return this.b;
   }

   public fcs d() {
      return this.c;
   }
}
