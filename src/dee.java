import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dee extends ded implements dmg {
   public static final MapCodec<dee> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, dee::new)
   );
   public static final dsy c = dsx.C;
   public static final dtb d = dsx.P;
   private final float k;
   private final float l;
   protected final ews e;
   protected final ews f;
   protected final ews g;
   protected final ews h;
   protected final ews i;
   protected final ews j;

   @Override
   public MapCodec<dee> a() {
      return b;
   }

   public dee(float $$0, float $$1, dsg.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, jf.b));
      this.i = dff.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dff.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dff.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dff.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dff.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dff.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
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
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      jf $$3 = $$0.c(d);
      ja $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dce $$1 = $$0.q();
      ja $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == eoc.c)).a(d, $$0.k());
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(c) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c, d);
   }
}
