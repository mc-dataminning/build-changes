import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cyz extends cyy implements dha {
   public static final MapCodec<cyz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), u())
            .apply($$0, cyz::new)
   );
   public static final dnq c = dnp.C;
   public static final dnt d = dnp.P;
   private final float k;
   private final float l;
   protected final eqk e;
   protected final eqk f;
   protected final eqk g;
   protected final eqk h;
   protected final eqk i;
   protected final eqk j;

   @Override
   public MapCodec<cyz> a() {
      return b;
   }

   public cyz(float $$0, float $$1, dmy.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, ih.b));
      this.i = daa.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = daa.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = daa.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = daa.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = daa.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = daa.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      ih $$4 = $$0.c(d);
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
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ih $$3 = $$0.c(d);
      ib $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      cxa $$1 = $$0.q();
      ib $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == eio.c)).a(d, $$0.k());
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(c) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c, d);
   }
}
