import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dik extends dij implements dqr {
   public static final MapCodec<dik> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), t())
            .apply($$0, dik::new)
   );
   public static final dxn c = dxm.J;
   public static final dxt<jn> d = dxm.S;
   private final float k;
   private final float l;
   protected final fbt e;
   protected final fbt f;
   protected final fbt g;
   protected final fbt h;
   protected final fbt i;
   protected final fbt j;

   @Override
   public MapCodec<dik> a() {
      return b;
   }

   public dik(float $$0, float $$1, dwv.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jn.b));
      this.i = djl.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = djl.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = djl.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = djl.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = djl.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = djl.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      jn $$4 = $$0.c(d);
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
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      jn $$3 = $$0.c(d);
      ji $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == esz.c)).b(d, $$0.k());
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(c) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c, d);
   }
}
