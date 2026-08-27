import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class czb extends cza implements dhc {
   public static final MapCodec<czb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, czb::new)
   );
   public static final dns c = dnr.C;
   public static final dnv d = dnr.P;
   private final float k;
   private final float l;
   protected final eqm e;
   protected final eqm f;
   protected final eqm g;
   protected final eqm h;
   protected final eqm i;
   protected final eqm j;

   @Override
   public MapCodec<czb> a() {
      return b;
   }

   public czb(float $$0, float $$1, dna.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, ih.b));
      this.i = dac.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dac.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dac.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dac.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dac.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dac.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
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
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ih $$3 = $$0.c(d);
      ib $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      cxc $$1 = $$0.q();
      ib $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == eiq.c)).a(d, $$0.k());
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(c) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c, d);
   }
}
