import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cvo extends cvn implements ddp {
   public static final MapCodec<cvo> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, cvo::new)
   );
   public static final djx c = djw.C;
   public static final dka d = djw.P;
   private final float k;
   private final float l;
   protected final eml e;
   protected final eml f;
   protected final eml g;
   protected final eml h;
   protected final eml i;
   protected final eml j;

   @Override
   public MapCodec<cvo> a() {
      return b;
   }

   public cvo(float $$0, float $$1, djf.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, ic.b));
      this.i = cwp.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = cwp.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = cwp.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = cwp.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = cwp.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = cwp.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      ic $$4 = $$0.c(d);
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
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      ic $$3 = $$0.c(d);
      hx $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == eer.c)).a(d, $$0.k());
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(c) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c, d);
   }
}
