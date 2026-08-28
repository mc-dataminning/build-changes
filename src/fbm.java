import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fbm(fbq b, fbq c) implements fbq {
   public static final MapCodec<fbm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fbr.a.fieldOf("n").forGetter(fbm::c), fbr.a.fieldOf("p").forGetter(fbm::d)).apply($$0, fbm::new)
   );

   @Override
   public fbp b() {
      return fbr.d;
   }

   @Override
   public int a(exl $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azs $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(exl $$0) {
      return (float)this.a($$0);
   }

   public static fbm a(int $$0, float $$1) {
      return new fbm(fbn.a((float)$$0), fbn.a($$1));
   }

   @Override
   public Set<bat<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fbq c() {
      return this.b;
   }

   public fbq d() {
      return this.c;
   }
}
