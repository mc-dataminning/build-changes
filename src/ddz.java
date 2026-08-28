import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ddz extends ddy implements dmb {
   public static final MapCodec<ddz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, ddz::new)
   );
   public static final dsu c = dst.C;
   public static final dsx d = dst.P;
   private final float k;
   private final float l;
   protected final ewl e;
   protected final ewl f;
   protected final ewl g;
   protected final ewl h;
   protected final ewl i;
   protected final ewl j;

   @Override
   public MapCodec<ddz> a() {
      return b;
   }

   public ddz(float $$0, float $$1, dsc.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, je.b));
      this.i = dfa.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dfa.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dfa.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dfa.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dfa.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dfa.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
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
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      je $$3 = $$0.c(d);
      iz $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == enx.c)).a(d, $$0.k());
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(c) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c, d);
   }
}
