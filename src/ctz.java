import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ctz extends cty implements dca {
   public static final MapCodec<ctz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, ctz::new)
   );
   public static final dhz c = dhy.C;
   public static final dic d = dhy.P;
   private final float k;
   private final float l;
   protected final ekn e;
   protected final ekn f;
   protected final ekn g;
   protected final ekn h;
   protected final ekn i;
   protected final ekn j;

   @Override
   public MapCodec<ctz> a() {
      return b;
   }

   public ctz(float $$0, float $$1, dhh.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, hx.b));
      this.i = cva.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = cva.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = cva.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = cva.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = cva.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = cva.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      hx $$4 = $$0.c(d);
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
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      hx $$3 = $$0.c(d);
      ht $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      csb $$1 = $$0.q();
      ht $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == ect.c)).a(d, $$0.k());
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(c) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c, d);
   }
}
