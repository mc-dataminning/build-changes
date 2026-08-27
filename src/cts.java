import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cts extends ctr implements dbt {
   public static final MapCodec<cts> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), t())
            .apply($$0, cts::new)
   );
   public static final dhn c = dhm.C;
   public static final dhq d = dhm.P;
   private final float k;
   private final float l;
   protected final ekb e;
   protected final ekb f;
   protected final ekb g;
   protected final ekb h;
   protected final ekb i;
   protected final ekb j;

   @Override
   public MapCodec<cts> a() {
      return b;
   }

   public cts(float $$0, float $$1, dgv.d $$2) {
      super($$2);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(d, hx.b));
      this.i = cut.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = cut.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = cut.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = cut.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = cut.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = cut.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      hx $$4 = $$0.c(d);
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
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      hx $$3 = $$0.c(d);
      ht $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      crt $$1 = $$0.q();
      ht $$2 = $$0.a();
      return this.o().a(c, Boolean.valueOf($$1.b_($$2).a() == ech.c)).a(d, $$0.k());
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(c) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c, d);
   }
}
