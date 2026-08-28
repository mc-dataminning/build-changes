import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class djj extends diw {
   public static final MapCodec<djj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.d(diz.ai), alb.d(diz.aj), alb.d(diz.ak), alb.d(diz.al), alb.d(diz.am)).apply($$0, $$0.stable(djj::new))
   );
   private final js<dis> c;
   private final js<dis> d;
   private final js<dis> e;
   private final js<dis> f;
   private final js<dis> g;

   public static djj a(jt<dis> $$0) {
      return new djj($$0.b(diz.ai), $$0.b(diz.aj), $$0.b(diz.ak), $$0.b(diz.al), $$0.b(diz.am));
   }

   private djj(js<dis> $$0, js<dis> $$1, js<dis> $$2, js<dis> $$3, js<dis> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<js<dis>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends diw> a() {
      return b;
   }

   @Override
   public js<dis> getNoiseBiome(int $$0, int $$1, int $$2, djb.f $$3) {
      int $$4 = kd.c($$0);
      int $$5 = kd.c($$1);
      int $$6 = kd.c($$2);
      int $$7 = kl.a($$4);
      int $$8 = kl.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kl.a($$4) * 2 + 1) * 8;
         int $$10 = (kl.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new eee.e($$9, $$5, $$10));
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
