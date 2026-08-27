import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cxd extends cwq {
   public static final Codec<cxd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aiw.d(cwt.ah), aiw.d(cwt.ai), aiw.d(cwt.aj), aiw.d(cwt.ak), aiw.d(cwt.al)).apply($$0, $$0.stable(cxd::new))
   );
   private final ij<cwm> c;
   private final ij<cwm> d;
   private final ij<cwm> e;
   private final ij<cwm> f;
   private final ij<cwm> g;

   public static cxd a(ik<cwm> $$0) {
      return new cxd($$0.b(cwt.ah), $$0.b(cwt.ai), $$0.b(cwt.aj), $$0.b(cwt.ak), $$0.b(cwt.al));
   }

   private cxd(ij<cwm> $$0, ij<cwm> $$1, ij<cwm> $$2, ij<cwm> $$3, ij<cwm> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ij<cwm>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cwq> a() {
      return b;
   }

   @Override
   public ij<cwm> getNoiseBiome(int $$0, int $$1, int $$2, cwv.f $$3) {
      int $$4 = iu.c($$0);
      int $$5 = iu.c($$1);
      int $$6 = iu.c($$2);
      int $$7 = jb.a($$4);
      int $$8 = jb.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jb.a($$4) * 2 + 1) * 8;
         int $$10 = (jb.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dqh.e($$9, $$5, $$10));
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
