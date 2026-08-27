import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cvp extends cvo implements ddq {
   public static final MapCodec<cvp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, cvp::new)
   );
   public static final djy c = djx.C;
   public static final dkb d = djx.P;
   private final float k;
   private final float l;
   protected final emm e;
   protected final emm f;
   protected final emm g;
   protected final emm h;
   protected final emm i;
   protected final emm j;

   @Override
   public MapCodec<cvp> a() {
      return b;
   }

   public cvp(float $$0, float $$1, djg.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, ic.b));
      this.i = cwq.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = cwq.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = cwq.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = cwq.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = cwq.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = cwq.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
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
   public boolean a(djh $$0, cts $$1, hx $$2) {
      ic $$3 = $$0.c(d);
      hx $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      ctq $$1 = $$0.q();
      hx $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == ees.c)).a(d, $$0.k());
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(c) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c, d);
   }
}
