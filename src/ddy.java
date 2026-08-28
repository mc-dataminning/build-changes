import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ddy extends ddx implements dma {
   public static final MapCodec<ddy> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, ddy::new)
   );
   public static final dst c = dss.C;
   public static final dsw d = dss.P;
   private final float k;
   private final float l;
   protected final ewk e;
   protected final ewk f;
   protected final ewk g;
   protected final ewk h;
   protected final ewk i;
   protected final ewk j;

   @Override
   public MapCodec<ddy> a() {
      return b;
   }

   public ddy(float $$0, float $$1, dsb.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, je.b));
      this.i = dez.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dez.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dez.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dez.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dez.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dez.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
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
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      je $$3 = $$0.c(d);
      iz $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == enw.c)).a(d, $$0.k());
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(c) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c, d);
   }
}
