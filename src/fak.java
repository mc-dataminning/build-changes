import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fak(fao b, fao c) implements fao {
   public static final MapCodec<fak> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fap.a.fieldOf("n").forGetter(fak::c), fap.a.fieldOf("p").forGetter(fak::d)).apply($$0, fak::new)
   );

   @Override
   public fan b() {
      return fap.d;
   }

   @Override
   public int a(ewh $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      bam $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ewh $$0) {
      return (float)this.a($$0);
   }

   public static fak a(int $$0, float $$1) {
      return new fak(fal.a((float)$$0), fal.a($$1));
   }

   @Override
   public Set<eza<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fao c() {
      return this.b;
   }

   public fao d() {
      return this.c;
   }
}
