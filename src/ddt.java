import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ddt extends dds implements dlv {
   public static final MapCodec<ddt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, ddt::new)
   );
   public static final dso c = dsn.C;
   public static final dsr d = dsn.P;
   private final float k;
   private final float l;
   protected final ewf e;
   protected final ewf f;
   protected final ewf g;
   protected final ewf h;
   protected final ewf i;
   protected final ewf j;

   @Override
   public MapCodec<ddt> a() {
      return b;
   }

   public ddt(float $$0, float $$1, drw.d $$2) {
      super($$2);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(d, je.b));
      this.i = deu.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = deu.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = deu.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = deu.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = deu.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = deu.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
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
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      je $$3 = $$0.c(d);
      iz $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      dbu $$1 = $$0.q();
      iz $$2 = $$0.a();
      return this.n().a(c, Boolean.valueOf($$1.b_($$2).a() == enr.c)).a(d, $$0.k());
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(c) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c, d);
   }
}
