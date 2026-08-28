import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dij extends dii implements dqq {
   public static final MapCodec<dij> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), t())
            .apply($$0, dij::new)
   );
   public static final dxm c = dxl.J;
   public static final dxs<jn> d = dxl.S;
   private final float k;
   private final float l;
   protected final fbs e;
   protected final fbs f;
   protected final fbs g;
   protected final fbs h;
   protected final fbs i;
   protected final fbs j;

   @Override
   public MapCodec<dij> a() {
      return b;
   }

   public dij(float $$0, float $$1, dwu.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jn.b));
      this.i = djk.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = djk.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = djk.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = djk.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = djk.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = djk.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
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
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      jn $$3 = $$0.c(d);
      ji $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == esy.c)).b(d, $$0.k());
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(c) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c, d);
   }
}
