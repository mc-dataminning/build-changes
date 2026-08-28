import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dlt extends dlg {
   public static final MapCodec<dlt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.d(dlj.ai), ali.d(dlj.aj), ali.d(dlj.ak), ali.d(dlj.al), ali.d(dlj.am)).apply($$0, $$0.stable(dlt::new))
   );
   private final jg<dlc> c;
   private final jg<dlc> d;
   private final jg<dlc> e;
   private final jg<dlc> f;
   private final jg<dlc> g;

   public static dlt a(jh<dlc> $$0) {
      return new dlt($$0.b(dlj.ai), $$0.b(dlj.aj), $$0.b(dlj.ak), $$0.b(dlj.al), $$0.b(dlj.am));
   }

   private dlt(jg<dlc> $$0, jg<dlc> $$1, jg<dlc> $$2, jg<dlc> $$3, jg<dlc> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jg<dlc>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dlg> a() {
      return b;
   }

   @Override
   public jg<dlc> getNoiseBiome(int $$0, int $$1, int $$2, dll.f $$3) {
      int $$4 = jr.c($$0);
      int $$5 = jr.c($$1);
      int $$6 = jr.c($$2);
      int $$7 = jz.a($$4);
      int $$8 = jz.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jz.a($$4) * 2 + 1) * 8;
         int $$10 = (jz.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new egy.e($$9, $$5, $$10));
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
