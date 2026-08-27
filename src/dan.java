import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dan extends daa {
   public static final Codec<dan> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajr.d(dad.ah), ajr.d(dad.ai), ajr.d(dad.aj), ajr.d(dad.ak), ajr.d(dad.al)).apply($$0, $$0.stable(dan::new))
   );
   private final il<czw> c;
   private final il<czw> d;
   private final il<czw> e;
   private final il<czw> f;
   private final il<czw> g;

   public static dan a(im<czw> $$0) {
      return new dan($$0.b(dad.ah), $$0.b(dad.ai), $$0.b(dad.aj), $$0.b(dad.ak), $$0.b(dad.al));
   }

   private dan(il<czw> $$0, il<czw> $$1, il<czw> $$2, il<czw> $$3, il<czw> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<il<czw>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends daa> a() {
      return b;
   }

   @Override
   public il<czw> getNoiseBiome(int $$0, int $$1, int $$2, daf.f $$3) {
      int $$4 = iw.c($$0);
      int $$5 = iw.c($$1);
      int $$6 = iw.c($$2);
      int $$7 = je.a($$4);
      int $$8 = je.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (je.a($$4) * 2 + 1) * 8;
         int $$10 = (je.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new duk.e($$9, $$5, $$10));
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
