import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dax extends daw implements diy {
   public static final MapCodec<dax> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, dax::new)
   );
   public static final dpq c = dpp.C;
   public static final dpt d = dpp.P;
   private final float k;
   private final float l;
   protected final est e;
   protected final est f;
   protected final est g;
   protected final est h;
   protected final est i;
   protected final est j;

   @Override
   public MapCodec<dax> a() {
      return b;
   }

   public dax(float $$0, float $$1, doy.d $$2) {
      super($$2);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(d, ih.b));
      this.i = dby.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dby.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dby.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dby.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dby.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dby.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      ih $$4 = $$0.c(d);
      switch ($$4) {
         case c:
            return this.e;
         case d:
            return this.f;
         case f:
            return this.g;
         case e:
            return this.h;
         case a:
            return this.j;
         case b:
         default:
            return this.i;
      }
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ih $$3 = $$0.c(d);
      ib $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      cyy $$1 = $$0.q();
      ib $$2 = $$0.a();
      return this.n().a(c, Boolean.valueOf($$1.b_($$2).a() == ekt.c)).a(d, $$0.k());
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(c) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c, d);
   }
}
