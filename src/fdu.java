import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdu(fdy b, fdy c) implements fdy {
   public static final MapCodec<fdu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdz.a.fieldOf("n").forGetter(fdu::c), fdz.a.fieldOf("p").forGetter(fdu::d)).apply($$0, fdu::new)
   );

   @Override
   public fdx b() {
      return fdz.d;
   }

   @Override
   public int a(ezt $$0) {
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
   public float b(ezt $$0) {
      return (float)this.a($$0);
   }

   public static fdu a(int $$0, float $$1) {
      return new fdu(fdv.a((float)$$0), fdv.a($$1));
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fdy c() {
      return this.b;
   }

   public fdy d() {
      return this.c;
   }
}
