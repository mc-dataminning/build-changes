import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cue extends cud implements dcf {
   public static final MapCodec<cue> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, cue::new)
   );
   public static final die c = did.C;
   public static final dih d = did.P;
   private final float k;
   private final float l;
   protected final eks e;
   protected final eks f;
   protected final eks g;
   protected final eks h;
   protected final eks i;
   protected final eks j;

   @Override
   public MapCodec<cue> a() {
      return b;
   }

   public cue(float $$0, float $$1, dhm.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, ib.b));
      this.i = cvf.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = cvf.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = cvf.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = cvf.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = cvf.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = cvf.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      ib $$4 = $$0.c(d);
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
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      ib $$3 = $$0.c(d);
      hx $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      csg $$1 = $$0.q();
      hx $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == ecy.c)).a(d, $$0.k());
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(c) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c, d);
   }
}
