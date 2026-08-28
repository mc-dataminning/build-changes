import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dea extends ddz implements dmc {
   public static final MapCodec<dea> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, dea::new)
   );
   public static final dsv c = dsu.C;
   public static final dsy d = dsu.P;
   private final float k;
   private final float l;
   protected final ewm e;
   protected final ewm f;
   protected final ewm g;
   protected final ewm h;
   protected final ewm i;
   protected final ewm j;

   @Override
   public MapCodec<dea> a() {
      return b;
   }

   public dea(float $$0, float $$1, dsd.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, je.b));
      this.i = dfb.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dfb.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dfb.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dfb.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dfb.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dfb.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      je $$4 = $$0.c(d);
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
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      je $$3 = $$0.c(d);
      iz $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dcb $$1 = $$0.q();
      iz $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == eny.c)).a(d, $$0.k());
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(c) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c, d);
   }
}
