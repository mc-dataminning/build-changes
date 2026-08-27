import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cxh extends cwu {
   public static final Codec<cxh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aiw.d(cwx.ah), aiw.d(cwx.ai), aiw.d(cwx.aj), aiw.d(cwx.ak), aiw.d(cwx.al)).apply($$0, $$0.stable(cxh::new))
   );
   private final ij<cwq> c;
   private final ij<cwq> d;
   private final ij<cwq> e;
   private final ij<cwq> f;
   private final ij<cwq> g;

   public static cxh a(ik<cwq> $$0) {
      return new cxh($$0.b(cwx.ah), $$0.b(cwx.ai), $$0.b(cwx.aj), $$0.b(cwx.ak), $$0.b(cwx.al));
   }

   private cxh(ij<cwq> $$0, ij<cwq> $$1, ij<cwq> $$2, ij<cwq> $$3, ij<cwq> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ij<cwq>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cwu> a() {
      return b;
   }

   @Override
   public ij<cwq> getNoiseBiome(int $$0, int $$1, int $$2, cwz.f $$3) {
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
         double $$11 = $$3.e().a(new dqo.e($$9, $$5, $$10));
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
