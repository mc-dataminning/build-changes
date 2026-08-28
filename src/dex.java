import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dex extends dew implements dna {
   public static final MapCodec<dex> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, dex::new)
   );
   public static final dtt c = dts.C;
   public static final dtw d = dts.P;
   private final float k;
   private final float l;
   protected final exv e;
   protected final exv f;
   protected final exv g;
   protected final exv h;
   protected final exv i;
   protected final exv j;

   @Override
   public MapCodec<dex> a() {
      return b;
   }

   public dex(float $$0, float $$1, dtb.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, ji.b));
      this.i = dfy.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dfy.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dfy.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dfy.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dfy.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dfy.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
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
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      ji $$3 = $$0.c(d);
      jd $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dcx $$1 = $$0.q();
      jd $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == epf.c)).a(d, $$0.k());
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c, d);
   }
}
