import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddq extends ddd {
   public static final Codec<ddq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(akr.d(ddg.am), akr.d(ddg.an), akr.d(ddg.ao), akr.d(ddg.ap), akr.d(ddg.aq)).apply($$0, $$0.stable(ddq::new))
   );
   private final ja<dcz> c;
   private final ja<dcz> d;
   private final ja<dcz> e;
   private final ja<dcz> f;
   private final ja<dcz> g;

   public static ddq a(jb<dcz> $$0) {
      return new ddq($$0.b(ddg.am), $$0.b(ddg.an), $$0.b(ddg.ao), $$0.b(ddg.ap), $$0.b(ddg.aq));
   }

   private ddq(ja<dcz> $$0, ja<dcz> $$1, ja<dcz> $$2, ja<dcz> $$3, ja<dcz> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ja<dcz>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends ddd> a() {
      return b;
   }

   @Override
   public ja<dcz> getNoiseBiome(int $$0, int $$1, int $$2, ddi.f $$3) {
      int $$4 = jl.c($$0);
      int $$5 = jl.c($$1);
      int $$6 = jl.c($$2);
      int $$7 = jt.a($$4);
      int $$8 = jt.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jt.a($$4) * 2 + 1) * 8;
         int $$10 = (jt.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dyn.e($$9, $$5, $$10));
         if ($$11 > 0.25) {
            return this.d;
         } else if ($$11 >= -0.0625) {
            return this.e;
         } else {
            return $$11 < -0.21875 ? this.f : this.g;
         }
      }
   }
}
