import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class deh extends deg implements dmj {
   public static final MapCodec<deh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, deh::new)
   );
   public static final dtc c = dtb.C;
   public static final dtf d = dtb.P;
   private final float k;
   private final float l;
   protected final exa e;
   protected final exa f;
   protected final exa g;
   protected final exa h;
   protected final exa i;
   protected final exa j;

   @Override
   public MapCodec<deh> a() {
      return b;
   }

   public deh(float $$0, float $$1, dsk.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, jf.b));
      this.i = dfi.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dfi.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dfi.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dfi.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dfi.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dfi.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      jf $$4 = $$0.c(d);
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
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      jf $$3 = $$0.c(d);
      ja $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dch $$1 = $$0.q();
      ja $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == eok.c)).a(d, $$0.k());
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(c) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c, d);
   }
}
