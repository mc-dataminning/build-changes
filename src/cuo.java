import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cuo extends cub {
   public static final Codec<cuo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(agr.d(cue.ah), agr.d(cue.ai), agr.d(cue.aj), agr.d(cue.ak), agr.d(cue.al)).apply($$0, $$0.stable(cuo::new))
   );
   private final ie<ctx> c;
   private final ie<ctx> d;
   private final ie<ctx> e;
   private final ie<ctx> f;
   private final ie<ctx> g;

   public static cuo a(ig<ctx> $$0) {
      return new cuo($$0.b(cue.ah), $$0.b(cue.ai), $$0.b(cue.aj), $$0.b(cue.ak), $$0.b(cue.al));
   }

   private cuo(ie<ctx> $$0, ie<ctx> $$1, ie<ctx> $$2, ie<ctx> $$3, ie<ctx> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ie<ctx>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cub> a() {
      return b;
   }

   @Override
   public ie<ctx> getNoiseBiome(int $$0, int $$1, int $$2, cug.f $$3) {
      int $$4 = iq.c($$0);
      int $$5 = iq.c($$1);
      int $$6 = iq.c($$2);
      int $$7 = ix.a($$4);
      int $$8 = ix.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (ix.a($$4) * 2 + 1) * 8;
         int $$10 = (ix.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dnr.e($$9, $$5, $$10));
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
