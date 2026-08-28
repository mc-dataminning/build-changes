import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dfu extends dft implements dnx {
   public static final MapCodec<dfu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, dfu::new)
   );
   public static final dur c = duq.C;
   public static final duu d = duq.P;
   private final float k;
   private final float l;
   protected final eyx e;
   protected final eyx f;
   protected final eyx g;
   protected final eyx h;
   protected final eyx i;
   protected final eyx j;

   @Override
   public MapCodec<dfu> a() {
      return b;
   }

   public dfu(float $$0, float $$1, dtz.d $$2) {
      super($$2);
      this.l(this.o().b(c, Boolean.valueOf(false)).b(d, jj.b));
      this.i = dgv.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dgv.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dgv.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dgv.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dgv.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dgv.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      jj $$4 = $$0.c(d);
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
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      jj $$3 = $$0.c(d);
      je $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      ddt $$1 = $$0.q();
      je $$2 = $$0.a();
      return this.o().b(c, Boolean.valueOf($$1.b_($$2).a() == eqc.c)).b(d, $$0.k());
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(c) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c, d);
   }
}
