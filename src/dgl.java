import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgl extends dgk implements doo {
   public static final MapCodec<dgl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), t())
            .apply($$0, dgl::new)
   );
   public static final dvj c = dvi.C;
   public static final dvm d = dvi.P;
   private final float k;
   private final float l;
   protected final ezq e;
   protected final ezq f;
   protected final ezq g;
   protected final ezq h;
   protected final ezq i;
   protected final ezq j;

   @Override
   public MapCodec<dgl> a() {
      return b;
   }

   public dgl(float $$0, float $$1, dur.d $$2) {
      super($$2);
      this.l(this.n().b(c, Boolean.valueOf(false)).b(d, jk.b));
      this.i = dhm.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dhm.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dhm.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dhm.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dhm.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dhm.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      jk $$4 = $$0.c(d);
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
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jk $$3 = $$0.c(d);
      jf $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dek $$1 = $$0.q();
      jf $$2 = $$0.a();
      return this.n().b(c, Boolean.valueOf($$1.b_($$2).a() == equ.c)).b(d, $$0.k());
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(c) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c, d);
   }
}
