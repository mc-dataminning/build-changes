import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class daw extends daj {
   public static final Codec<daw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajt.d(dam.ah), ajt.d(dam.ai), ajt.d(dam.aj), ajt.d(dam.ak), ajt.d(dam.al)).apply($$0, $$0.stable(daw::new))
   );
   private final in<daf> c;
   private final in<daf> d;
   private final in<daf> e;
   private final in<daf> f;
   private final in<daf> g;

   public static daw a(io<daf> $$0) {
      return new daw($$0.b(dam.ah), $$0.b(dam.ai), $$0.b(dam.aj), $$0.b(dam.ak), $$0.b(dam.al));
   }

   private daw(in<daf> $$0, in<daf> $$1, in<daf> $$2, in<daf> $$3, in<daf> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<in<daf>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends daj> a() {
      return b;
   }

   @Override
   public in<daf> getNoiseBiome(int $$0, int $$1, int $$2, dao.f $$3) {
      int $$4 = iy.c($$0);
      int $$5 = iy.c($$1);
      int $$6 = iy.c($$2);
      int $$7 = jg.a($$4);
      int $$8 = jg.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jg.a($$4) * 2 + 1) * 8;
         int $$10 = (jg.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dut.e($$9, $$5, $$10));
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
