import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fap(fat b, fat c) implements fat {
   public static final MapCodec<fap> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fau.a.fieldOf("n").forGetter(fap::c), fau.a.fieldOf("p").forGetter(fap::d)).apply($$0, fap::new)
   );

   @Override
   public fas b() {
      return fau.d;
   }

   @Override
   public int a(ewo $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azh $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ewo $$0) {
      return (float)this.a($$0);
   }

   public static fap a(int $$0, float $$1) {
      return new fap(faq.a((float)$$0), faq.a($$1));
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fat c() {
      return this.b;
   }

   public fat d() {
      return this.c;
   }
}
