import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgi extends dgh implements dol {
   public static final MapCodec<dgi> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, dgi::new)
   );
   public static final dvf c = dve.C;
   public static final dvi d = dve.P;
   private final float k;
   private final float l;
   protected final ezm e;
   protected final ezm f;
   protected final ezm g;
   protected final ezm h;
   protected final ezm i;
   protected final ezm j;

   @Override
   public MapCodec<dgi> a() {
      return b;
   }

   public dgi(float $$0, float $$1, dun.d $$2) {
      super($$2);
      this.l(this.o().b(c, Boolean.valueOf(false)).b(d, jj.b));
      this.i = dhj.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dhj.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dhj.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dhj.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dhj.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dhj.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
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
   protected boolean a(duo $$0, dej $$1, je $$2) {
      jj $$3 = $$0.c(d);
      je $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      deh $$1 = $$0.q();
      je $$2 = $$0.a();
      return this.o().b(c, Boolean.valueOf($$1.b_($$2).a() == eqq.c)).b(d, $$0.k());
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(c) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c, d);
   }
}
