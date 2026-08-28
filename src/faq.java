import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record faq(fau b, fau c) implements fau {
   public static final MapCodec<faq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fav.a.fieldOf("n").forGetter(faq::c), fav.a.fieldOf("p").forGetter(faq::d)).apply($$0, faq::new)
   );

   @Override
   public fat b() {
      return fav.d;
   }

   @Override
   public int a(ewp $$0) {
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
   public float b(ewp $$0) {
      return (float)this.a($$0);
   }

   public static faq a(int $$0, float $$1) {
      return new faq(far.a((float)$$0), far.a($$1));
   }

   @Override
   public Set<bbn<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fau c() {
      return this.b;
   }

   public fau d() {
      return this.c;
   }
}
