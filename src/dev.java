import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dev extends deu implements dmy {
   public static final MapCodec<dev> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, dev::new)
   );
   public static final dtr c = dtq.C;
   public static final dtu d = dtq.P;
   private final float k;
   private final float l;
   protected final exp e;
   protected final exp f;
   protected final exp g;
   protected final exp h;
   protected final exp i;
   protected final exp j;

   @Override
   public MapCodec<dev> a() {
      return b;
   }

   public dev(float $$0, float $$1, dsz.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, ji.b));
      this.i = dfw.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dfw.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dfw.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dfw.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dfw.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dfw.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      ji $$4 = $$0.c(d);
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
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      ji $$3 = $$0.c(d);
      jd $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dcv $$1 = $$0.q();
      jd $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == eoz.c)).a(d, $$0.k());
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(c) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c, d);
   }
}
