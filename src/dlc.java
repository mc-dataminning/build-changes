import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlc extends dlz {
   public static final MapCodec<dlc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dww.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dlc::new)
   );
   public static final dwa b = dvz.u;
   public static final dwa c = dvz.w;
   public static final dwa d = dvz.q;
   protected static final fah e = die.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fah f = die.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final fah g = die.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final fah h = die.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final fah i = die.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fah j = die.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fah k = die.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fah l = die.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fah m = fae.a(die.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), die.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final fah n = fae.a(die.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), die.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final fah o = fae.a(die.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), die.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final fah G = fae.a(die.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), die.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dww H;

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(dww $$0, dvi.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jm.a.a ? f : e;
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      jm.a $$6 = $$1.o();
      if ($$0.c(aF).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.o($$2) || this.o($$3.a_($$4.a($$1.g())));
         return $$0.b(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected fah b_(dvj $$0, deg $$1, jh $$2) {
      if ($$0.c(b)) {
         return fae.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? k : l;
      }
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      if ($$0.c(b)) {
         return fae.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? i : j;
      }
   }

   @Override
   protected fah d_(dvj $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jm.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public dvj a(czs $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jm $$4 = $$0.g();
      jm.a $$5 = $$4.o();
      boolean $$6 = $$5 == jm.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jm.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dvj $$0) {
      return $$0.a(axa.M);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jm $$5 = $$3.cP();
         if ($$0.c(aF) == $$5.g()) {
            $$0 = $$0.b(aF, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), awm.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? eag.h : eag.d, $$2);
      return bsd.a;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, det $$3, BiConsumer<cwb, jh> $$4) {
      if ($$3.f() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), awm.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? eag.d : eag.h, $$2, eag.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), awm.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? eag.h : eag.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dvj $$0, jm $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
