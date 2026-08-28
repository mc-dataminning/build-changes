import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class djd extends dpe {
   public static final MapCodec<djd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dww.a.fieldOf("wood_type").forGetter(dpe::d), t()).apply($$0, djd::new));
   public static final dwj b = dvz.ba;
   public static final dwa c = dvz.a;
   protected static final float d = 5.0F;
   protected static final fah e = die.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fah> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         die.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         die.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         die.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         die.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   public djd(dww $$0, dvi.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if ($$2.c_($$3) instanceof dty $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bsd.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(com $$0, ezj $$1, dty $$2, cwb $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cvq && $$1.c().equals(jm.a);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jm.a, dqf.b);
   }

   @Override
   public dvj a(czs $$0) {
      dfb $$1 = $$0.q();
      erk $$2 = $$1.b_($$0.a());
      jh $$3 = $$0.a().d();
      dvj $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axa.aB);
      jm $$6 = jm.a((double)$$0.i());
      boolean $$7 = !die.a($$4.g($$1, $$3), jm.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(drd.b)) {
            jm $$8 = $$4.c(drd.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jm> $$9 = dwp.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dwp.a($$6.g()) : dwp.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == erl.c));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      fah $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fah b_(dvj $$0, deg $$1, jh $$2) {
      return this.a($$0, $$1, $$2, ezs.a());
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == jm.b && !this.a($$0, $$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dvj $$0) {
      return dwp.b($$0.c(b));
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$2, dso.i, dty::a);
   }
}
