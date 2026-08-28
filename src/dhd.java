import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dhd extends dhc implements dpf {
   public static final MapCodec<dhd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.k), Codec.FLOAT.fieldOf("aabb_offset").forGetter($$0x -> $$0x.l), t())
            .apply($$0, dhd::new)
   );
   public static final dwa c = dvz.C;
   public static final dwd d = dvz.P;
   private final float k;
   private final float l;
   protected final fah e;
   protected final fah f;
   protected final fah g;
   protected final fah h;
   protected final fah i;
   protected final fah j;

   @Override
   public MapCodec<dhd> a() {
      return b;
   }

   public dhd(float $$0, float $$1, dvi.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jm.b));
      this.i = die.a((double)$$1, 0.0, (double)$$1, (double)(16.0F - $$1), (double)$$0, (double)(16.0F - $$1));
      this.j = die.a((double)$$1, (double)(16.0F - $$0), (double)$$1, (double)(16.0F - $$1), 16.0, (double)(16.0F - $$1));
      this.e = die.a((double)$$1, (double)$$1, (double)(16.0F - $$0), (double)(16.0F - $$1), (double)(16.0F - $$1), 16.0);
      this.f = die.a((double)$$1, (double)$$1, 0.0, (double)(16.0F - $$1), (double)(16.0F - $$1), (double)$$0);
      this.g = die.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.h = die.a((double)(16.0F - $$0), (double)$$1, (double)$$1, 16.0, (double)(16.0F - $$1), (double)(16.0F - $$1));
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
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
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jm $$3 = $$0.c(d);
      jh $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return $$1 == $$0.c(d).g() && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dfc $$1 = $$0.q();
      jh $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == erl.c)).b(d, $$0.k());
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(c) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c, d);
   }
}
