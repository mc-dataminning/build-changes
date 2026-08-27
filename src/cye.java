import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cye extends cyd implements dgf {
   public static final MapCodec<cye> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, cye::new)
   );
   public static final dmv c = dmu.C;
   public static final dmy d = dmu.P;
   private final float k;
   private final float l;
   protected final epo e;
   protected final epo f;
   protected final epo g;
   protected final epo h;
   protected final epo i;
   protected final epo j;

   @Override
   public MapCodec<cye> a() {
      return b;
   }

   public cye(float $$0, float $$1, dmd.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, ih.b));
      this.i = czf.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = czf.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = czf.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = czf.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = czf.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = czf.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
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
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ih $$3 = $$0.c(d);
      ib $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      cwf $$1 = $$0.q();
      ib $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == ehs.c)).a(d, $$0.k());
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(c) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c, d);
   }
}
