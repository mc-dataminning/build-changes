import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dbt extends dbg {
   public static final Codec<dbt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(akf.d(dbj.ah), akf.d(dbj.ai), akf.d(dbj.aj), akf.d(dbj.ak), akf.d(dbj.al)).apply($$0, $$0.stable(dbt::new))
   );
   private final iw<dbc> c;
   private final iw<dbc> d;
   private final iw<dbc> e;
   private final iw<dbc> f;
   private final iw<dbc> g;

   public static dbt a(ix<dbc> $$0) {
      return new dbt($$0.b(dbj.ah), $$0.b(dbj.ai), $$0.b(dbj.aj), $$0.b(dbj.ak), $$0.b(dbj.al));
   }

   private dbt(iw<dbc> $$0, iw<dbc> $$1, iw<dbc> $$2, iw<dbc> $$3, iw<dbc> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<iw<dbc>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends dbg> a() {
      return b;
   }

   @Override
   public iw<dbc> getNoiseBiome(int $$0, int $$1, int $$2, dbl.f $$3) {
      int $$4 = jh.c($$0);
      int $$5 = jh.c($$1);
      int $$6 = jh.c($$2);
      int $$7 = jp.a($$4);
      int $$8 = jp.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jp.a($$4) * 2 + 1) * 8;
         int $$10 = (jp.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dvs.e($$9, $$5, $$10));
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
