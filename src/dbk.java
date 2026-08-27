import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dbk extends dax {
   public static final Codec<dbk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(akd.d(dba.ah), akd.d(dba.ai), akd.d(dba.aj), akd.d(dba.ak), akd.d(dba.al)).apply($$0, $$0.stable(dbk::new))
   );
   private final iv<dat> c;
   private final iv<dat> d;
   private final iv<dat> e;
   private final iv<dat> f;
   private final iv<dat> g;

   public static dbk a(iw<dat> $$0) {
      return new dbk($$0.b(dba.ah), $$0.b(dba.ai), $$0.b(dba.aj), $$0.b(dba.ak), $$0.b(dba.al));
   }

   private dbk(iv<dat> $$0, iv<dat> $$1, iv<dat> $$2, iv<dat> $$3, iv<dat> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<iv<dat>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends dax> a() {
      return b;
   }

   @Override
   public iv<dat> getNoiseBiome(int $$0, int $$1, int $$2, dbc.f $$3) {
      int $$4 = jg.c($$0);
      int $$5 = jg.c($$1);
      int $$6 = jg.c($$2);
      int $$7 = jo.a($$4);
      int $$8 = jo.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jo.a($$4) * 2 + 1) * 8;
         int $$10 = (jo.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dvj.e($$9, $$5, $$10));
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
