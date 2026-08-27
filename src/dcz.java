import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dcz extends dcy implements dlb {
   public static final MapCodec<dcz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, dcz::new)
   );
   public static final dru c = drt.C;
   public static final drx d = drt.P;
   private final float k;
   private final float l;
   protected final evf e;
   protected final evf f;
   protected final evf g;
   protected final evf h;
   protected final evf i;
   protected final evf j;

   @Override
   public MapCodec<dcz> a() {
      return b;
   }

   public dcz(float $$0, float $$1, drc.d $$2) {
      super($$2);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(d, it.b));
      this.i = dea.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dea.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dea.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dea.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dea.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dea.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      it $$4 = $$0.c(d);
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
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      it $$3 = $$0.c(d);
      io $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      dba $$1 = $$0.q();
      io $$2 = $$0.a();
      return this.n().a(c, Boolean.valueOf($$1.b_($$2).a() == emx.c)).a(d, $$0.k());
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(c) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c, d);
   }
}
