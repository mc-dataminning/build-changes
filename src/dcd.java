import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dcd extends dcc implements dkf {
   public static final MapCodec<dcd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, dcd::new)
   );
   public static final dqy c = dqx.C;
   public static final drb d = dqx.P;
   private final float k;
   private final float l;
   protected final eui e;
   protected final eui f;
   protected final eui g;
   protected final eui h;
   protected final eui i;
   protected final eui j;

   @Override
   public MapCodec<dcd> a() {
      return b;
   }

   public dcd(float $$0, float $$1, dqg.d $$2) {
      super($$2);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(d, is.b));
      this.i = dde.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dde.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dde.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dde.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dde.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dde.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      is $$4 = $$0.c(d);
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
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      is $$3 = $$0.c(d);
      in $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dae $$1 = $$0.q();
      in $$2 = $$0.a();
      return this.n().a(c, Boolean.valueOf($$1.b_($$2).a() == emb.c)).a(d, $$0.k());
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(c) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c, d);
   }
}
