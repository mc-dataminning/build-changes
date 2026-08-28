import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dqr extends dlz implements dpf {
   public static final MapCodec<dqr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvy.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dqr::new)
   );
   public static final dwa b = dvz.u;
   public static final dwh<dwi> c = dvz.af;
   public static final dwa d = dvz.w;
   public static final dwa e = dvz.C;
   protected static final int f = 3;
   protected static final fah g = die.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fah h = die.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fah i = die.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fah j = die.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fah k = die.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fah l = die.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dvy m;

   @Override
   public MapCodec<? extends dqr> a() {
      return a;
   }

   protected dqr(dvy $$0, dvi.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(c, dwi.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dwi.a ? l : k;
      } else {
         switch ((jm)$$0.c(aF)) {
            case c:
            default:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      }
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(e);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!this.m.c()) {
         return bsd.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bsd.a;
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, det $$3, BiConsumer<cwb, jh> $$4) {
      if ($$3.f() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dvj $$0, dfb $$1, jh $$2, @Nullable com $$3) {
      dvj $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, erl.c, erl.c.a((dfe)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable com $$0, dfb $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awm.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? eag.h : eag.d, $$2);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, erl.c, erl.c.a((dfe)$$1));
            }
         }
      }
   }

   @Override
   public dvj a(czs $$0) {
      dvj $$1 = this.m();
      erk $$2 = $$0.q().b_($$0.a());
      jm $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dwi.a : dwi.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jm.b ? dwi.b : dwi.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == erl.c));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(e) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dvy q() {
      return this.m;
   }
}
