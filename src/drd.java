import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class drd extends dpe {
   public static final MapCodec<drd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dww.a.fieldOf("wood_type").forGetter(dpe::d), t()).apply($$0, drd::new));
   public static final dwd b = dlz.aF;
   public static final fah c = die.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fah d = die.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fah e = fae.a(c, die.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fah i = fae.a(d, die.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jm, fah> j = Maps.newEnumMap(ImmutableMap.of(jm.c, e, jm.d, e, jm.f, i, jm.e, i));

   @Override
   public MapCodec<drd> a() {
      return a;
   }

   public drd(dww $$0, dvi.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if ($$2.c_($$3) instanceof dty $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bsd.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dvj $$0, com $$1, ezj $$2, dty $$3, cwb $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cvq && !this.a($$2, $$0);
   }

   private boolean a(ezj $$0, dvj $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fah b_(dvj $$0, deg $$1, jh $$2) {
      return this.a($$0, $$1, $$2, ezs.a());
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      switch ((jm)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dvj $$0, dfe $$1, jh $$2) {
      jm $$3 = $$0.c(b).h();
      jm $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dfe $$0, dvj $$1, jh $$2, jm $$3) {
      dvj $$4 = $$0.a_($$2);
      return $$4.a(axa.aA) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dqf.a);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dvj $$1 = this.m();
      erk $$2 = $$0.q().b_($$0.a());
      dfe $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == erl.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dvj $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtl($$0, $$1);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$2, dso.i, dty::a);
   }
}
