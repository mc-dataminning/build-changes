import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dia extends dhq {
   public static final MapCodec<dia> a = b(dia::new);
   public static final dwd b = dlz.aF;
   public static final dwh<dvx> c = dvz.V;
   public static final dwa d = dvz.w;
   private static final fah f = die.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fah g = die.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fah h = die.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fah i = die.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fah j = fae.a(i, h);
   private static final fah k = fae.a(j, die.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fah l = fae.a(j, die.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fah m = fae.a(j, die.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fah n = fae.a(j, die.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fah o = fae.a(j, die.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fah G = fae.a(j, die.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fah H = fae.a(j, die.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   public dia(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dvx.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
      bue $$4 = $$3.s();
      com $$5 = $$4 instanceof com ? (com)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      return (bsd)(this.a($$1, $$0, $$4, $$3, true) ? bsd.a : bsd.e);
   }

   public boolean a(dfb $$0, dvj $$1, ezj $$2, @Nullable com $$3, boolean $$4) {
      jm $$5 = $$2.c();
      jh $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awv.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dvj $$0, jm $$1, double $$2) {
      if ($$1.o() != jm.a.b && !($$2 > 0.8124F)) {
         jm $$3 = $$0.c(b);
         dvx $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dfb $$0, jh $$1, @Nullable jm $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bue $$0, dfb $$1, jh $$2, @Nullable jm $$3) {
      dsm $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dsk) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dsk)$$4).a($$3);
         $$1.a(null, $$2, awl.bZ, awm.e, 2.0F, 1.0F);
         $$1.a($$0, eag.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fah o(dvj $$0) {
      jm $$1 = $$0.c(b);
      dvx $$2 = $$0.c(c);
      if ($$2 == dvx.a) {
         return $$1 != jm.c && $$1 != jm.d ? g : f;
      } else if ($$2 == dvx.b) {
         return H;
      } else if ($$2 == dvx.d) {
         return $$1 != jm.c && $$1 != jm.d ? l : k;
      } else if ($$1 == jm.c) {
         return o;
      } else if ($$1 == jm.d) {
         return G;
      } else {
         return $$1 == jm.f ? n : m;
      }
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.o($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.o($$0);
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      dfb $$3 = $$0.q();
      jm.a $$4 = $$1.o();
      if ($$4 == jm.a.b) {
         dvj $$5 = this.m().b(c, $$1 == jm.a ? dvx.b : dvx.a).b(b, $$0.g());
         if ($$5.a((dfe)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jm.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jm.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jm.e)
            || $$4 == jm.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jm.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jm.c);
         dvj $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dvx.d : dvx.c);
         if ($$7.a((dfe)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jm.b);
         $$7 = $$7.b(c, $$8 ? dvx.a : dvx.b);
         if ($$7.a((dfe)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, det $$3, BiConsumer<cwb, jh> $$4) {
      if ($$3.f()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      dvx $$6 = $$0.c(c);
      jm $$7 = q($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dvx.d) {
         return dig.a.m();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dvx.d && !$$2.c($$3, $$5, $$1)) {
               return $$0.b(c, dvx.c).b(b, $$1.g());
            }

            if ($$6 == dvx.c && $$7.g() == $$1 && $$2.c($$3, $$5, $$0.c(b))) {
               return $$0.b(c, dvx.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jm $$3 = q($$0).g();
      return $$3 == jm.b ? die.a($$1, $$2.d(), jm.a) : dkx.b($$1, $$2, $$3);
   }

   private static jm q(dvj $$0) {
      switch ((dvx)$$0.c(c)) {
         case a:
            return jm.b;
         case b:
            return jm.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$2, dso.E, $$0.C ? dsk::a : dsk::b);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Override
   public dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
