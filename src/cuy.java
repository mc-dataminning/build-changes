import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cuy extends cul {
   public static final Codec<cuy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahb.d(cuo.ah), ahb.d(cuo.ai), ahb.d(cuo.aj), ahb.d(cuo.ak), ahb.d(cuo.al)).apply($$0, $$0.stable(cuy::new))
   );
   private final ih<cuh> c;
   private final ih<cuh> d;
   private final ih<cuh> e;
   private final ih<cuh> f;
   private final ih<cuh> g;

   public static cuy a(ii<cuh> $$0) {
      return new cuy($$0.b(cuo.ah), $$0.b(cuo.ai), $$0.b(cuo.aj), $$0.b(cuo.ak), $$0.b(cuo.al));
   }

   private cuy(ih<cuh> $$0, ih<cuh> $$1, ih<cuh> $$2, ih<cuh> $$3, ih<cuh> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ih<cuh>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cul> a() {
      return b;
   }

   @Override
   public ih<cuh> getNoiseBiome(int $$0, int $$1, int $$2, cuq.f $$3) {
      int $$4 = is.c($$0);
      int $$5 = is.c($$1);
      int $$6 = is.c($$2);
      int $$7 = iz.a($$4);
      int $$8 = iz.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (iz.a($$4) * 2 + 1) * 8;
         int $$10 = (iz.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new doc.e($$9, $$5, $$10));
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
