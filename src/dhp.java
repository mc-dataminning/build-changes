import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dhp extends dho implements dpr {
   public static final MapCodec<dhp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), t())
            .apply($$0, dhp::new)
   );
   public static final dwm c = dwl.C;
   public static final dws<jm> d = dwl.P;
   private final float k;
   private final float l;
   protected final fas e;
   protected final fas f;
   protected final fas g;
   protected final fas h;
   protected final fas i;
   protected final fas j;

   @Override
   public MapCodec<dhp> a() {
      return b;
   }

   public dhp(float $$0, float $$1, dvu.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jm.b));
      this.i = diq.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = diq.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = diq.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = diq.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = diq.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = diq.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      jm $$4 = $$0.c(d);
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
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jm $$3 = $$0.c(d);
      jh $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dfn $$1 = $$0.q();
      jh $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == erw.c)).b(d, $$0.k());
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(c) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c, d);
   }
}
