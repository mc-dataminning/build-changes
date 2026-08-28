import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkk extends die {
   public static final MapCodec<dkk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvy.a.fieldOf("block_set_type").forGetter(dkk::b), t()).apply($$0, dkk::new)
   );
   public static final dwd b = dlz.aF;
   public static final dwa c = dvz.u;
   public static final dwh<dwe> d = dvz.be;
   public static final dwa e = dvz.w;
   public static final dwh<dwf> f = dvz.ae;
   protected static final float g = 3.0F;
   protected static final fah h = die.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fah i = die.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fah j = die.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fah k = die.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dvy l;

   @Override
   public MapCodec<? extends dkk> a() {
      return a;
   }

   protected dkk(dvy $$0, dvi.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, dwe.a).b(e, Boolean.valueOf(false)).b(f, dwf.b));
   }

   public dvy b() {
      return this.l;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      jm $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dwe.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      dwf $$6 = $$0.c(f);
      if ($$1.o() != jm.a.b || $$6 == dwf.b != ($$1 == jm.b)) {
         return $$6 == dwf.b && $$1 == jm.a && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dkk && $$2.c(f) != $$6 ? $$2.b(f, $$6) : dig.a.m();
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, det $$3, BiConsumer<cwb, jh> $$4) {
      if ($$3.f() && $$0.c(f) == dwf.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dvj a(dfb $$0, jh $$1, dvj $$2, com $$3) {
      if (!$$0.C && ($$3.f() || !$$3.d($$2))) {
         dkm.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      jh $$1 = $$0.a();
      dfb $$2 = $$0.q();
      if ($$1.v() < $$2.al() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dwf.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bva $$3, cwb $$4) {
      $$0.a($$1.d(), $$2.b(f, dwf.a), 3);
   }

   private dwe b(czs $$0) {
      deg $$1 = $$0.q();
      jh $$2 = $$0.a();
      jm $$3 = $$0.g();
      jh $$4 = $$2.d();
      jm $$5 = $$3.i();
      jh $$6 = $$2.a($$5);
      dvj $$7 = $$1.a_($$6);
      jh $$8 = $$4.a($$5);
      dvj $$9 = $$1.a_($$8);
      jm $$10 = $$3.h();
      jh $$11 = $$2.a($$10);
      dvj $$12 = $$1.a_($$11);
      jh $$13 = $$4.a($$10);
      dvj $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dkk && $$7.c(f) == dwf.b;
      boolean $$17 = $$12.b() instanceof dkk && $$12.c(f) == dwf.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ezn $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dwe.a : dwe.b;
         } else {
            return dwe.a;
         }
      } else {
         return dwe.b;
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!this.l.c()) {
         return bsd.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? eag.h : eag.d, $$2);
         return bsd.a;
      }
   }

   public boolean n(dvj $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bue $$0, dfb $$1, dvj $$2, jh $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? eag.h : eag.d, $$3);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dwf.b ? jm.b : jm.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? eag.h : eag.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jh $$3 = $$2.e();
      dvj $$4 = $$1.a_($$3);
      return $$0.c(f) == dwf.b ? $$4.c($$1, $$3, jm.b) : $$4.a(this);
   }

   private void a(@Nullable bue $$0, dfb $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awm.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$1 == dna.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dvj $$0, jh $$1) {
      return azk.b($$1.u(), $$1.c($$0.c(f) == dwf.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dfb $$0, jh $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dvj $$0) {
      if ($$0.b() instanceof dkk $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
