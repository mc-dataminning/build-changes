import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cvi extends cvh implements ddj {
   public static final MapCodec<cvi> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, cvi::new)
   );
   public static final djr c = djq.C;
   public static final dju d = djq.P;
   private final float k;
   private final float l;
   protected final emf e;
   protected final emf f;
   protected final emf g;
   protected final emf h;
   protected final emf i;
   protected final emf j;

   @Override
   public MapCodec<cvi> a() {
      return b;
   }

   public cvi(float $$0, float $$1, diz.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, ic.b));
      this.i = cwj.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = cwj.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = cwj.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = cwj.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = cwj.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = cwj.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
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
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      ic $$3 = $$0.c(d);
      hx $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      ctj $$1 = $$0.q();
      hx $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == eel.c)).a(d, $$0.k());
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(c) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c, d);
   }
}
