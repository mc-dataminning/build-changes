import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dbg extends dbf implements djh {
   public static final MapCodec<dbg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, dbg::new)
   );
   public static final dpz c = dpy.C;
   public static final dqc d = dpy.P;
   private final float k;
   private final float l;
   protected final etc e;
   protected final etc f;
   protected final etc g;
   protected final etc h;
   protected final etc i;
   protected final etc j;

   @Override
   public MapCodec<dbg> a() {
      return b;
   }

   public dbg(float $$0, float $$1, dph.d $$2) {
      super($$2);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(d, ij.b));
      this.i = dch.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = dch.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = dch.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = dch.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = dch.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = dch.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      ij $$4 = $$0.c(d);
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
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      ij $$3 = $$0.c(d);
      id $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      czh $$1 = $$0.q();
      id $$2 = $$0.a();
      return this.n().a(c, Boolean.valueOf($$1.b_($$2).a() == elc.c)).a(d, $$0.k());
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(c) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c, d);
   }
}
