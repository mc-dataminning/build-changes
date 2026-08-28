import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgx extends dgw implements doz {
   public static final MapCodec<dgx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), t())
            .apply($$0, dgx::new)
   );
   public static final dvu c = dvt.C;
   public static final dvx d = dvt.P;
   private final float k;
   private final float l;
   protected final fab e;
   protected final fab f;
   protected final fab g;
   protected final fab h;
   protected final fab i;
   protected final fab j;

   @Override
   public MapCodec<dgx> a() {
      return b;
   }

   public dgx(float $$0, float $$1, dvc.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jl.b));
      this.i = dhy.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dhy.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dhy.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dhy.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dhy.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dhy.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      jl $$4 = $$0.c(d);
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
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jl $$3 = $$0.c(d);
      jg $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dew $$1 = $$0.q();
      jg $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == erf.c)).b(d, $$0.k());
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(c) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c, d);
   }
}
