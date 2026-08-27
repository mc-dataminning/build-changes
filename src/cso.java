import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cso extends csb {
   public static final Codec<cso> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(afu.d(cse.ah), afu.d(cse.ai), afu.d(cse.aj), afu.d(cse.ak), afu.d(cse.al)).apply($$0, $$0.stable(cso::new))
   );
   private final ib<crx> c;
   private final ib<crx> d;
   private final ib<crx> e;
   private final ib<crx> f;
   private final ib<crx> g;

   public static cso a(ic<crx> $$0) {
      return new cso($$0.b(cse.ah), $$0.b(cse.ai), $$0.b(cse.aj), $$0.b(cse.ak), $$0.b(cse.al));
   }

   private cso(ib<crx> $$0, ib<crx> $$1, ib<crx> $$2, ib<crx> $$3, ib<crx> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ib<crx>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends csb> a() {
      return b;
   }

   @Override
   public ib<crx> getNoiseBiome(int $$0, int $$1, int $$2, csg.f $$3) {
      int $$4 = in.c($$0);
      int $$5 = in.c($$1);
      int $$6 = in.c($$2);
      int $$7 = iu.a($$4);
      int $$8 = iu.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (iu.a($$4) * 2 + 1) * 8;
         int $$10 = (iu.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dld.e($$9, $$5, $$10));
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
