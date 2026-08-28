import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpd extends dhq {
   public static final MapCodec<dpd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cuy.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new dpd((cuy)$$0x.orElse(null), $$1))
   );
   private static final xi d = xi.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fah f = die.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fah g = die.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fah h = die.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fah i = die.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fah j = die.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fah k = die.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fah> l = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, j);
      $$0.put(jm.f, i);
      $$0.put(jm.d, k);
      $$0.put(jm.e, h);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   });
   public static final dwh<jm> b = dkh.a;
   public static final ali c = ali.b("contents");
   @Nullable
   private final cuy m;

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   public dpd(@Nullable cuy $$0, dvi.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jm.b));
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtx(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$2, dso.x, dtx::a);
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.b;
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtx $$5 && a($$0, $$1, $$2, $$5)) {
         $$3.a($$5);
         $$3.a(awv.aq);
         cnc.a($$3, true);
      }

      return bsd.a;
   }

   private static boolean a(dvj $$0, dfb $$1, jh $$2, dtx $$3) {
      if ($$3.k() != dtx.a.a) {
         return true;
      } else {
         ezi $$4 = clx.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   public dvj a(dfb $$0, jh $$1, dvj $$2, com $$3) {
      dsm $$4 = $$0.c_($$1);
      if ($$4 instanceof dtx $$5) {
         if (!$$0.C && $$3.f() && !$$5.c()) {
            cwb $$6 = b(this.b());
            $$6.b($$4.r());
            ckv $$7 = new ckv($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.q();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwb> a(dvj $$0, euf.a $$1) {
      dsm $$2 = $$1.b(ewy.h);
      if ($$2 instanceof dtx $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsm $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dtx) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(ku.ap)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cwb $$6 : $$0.a(ku.al, cyt.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xi.a("container.shulkerBox.itemCount", $$6.y(), $$6.L()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xi.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected fah b_(dvj $$0, deg $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dtx $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return fae.b();
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      dsm $$4 = $$1.c_($$2);
      return $$4 instanceof dtx ? fae.a(((dtx)$$4).a($$0)) : fae.b();
   }

   @Override
   protected boolean e_(dvj $$0) {
      return false;
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return cro.a($$1.c_($$2));
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      cwb $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dso.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cuy b(cvx $$0) {
      return a(die.a($$0));
   }

   @Nullable
   public static cuy a(die $$0) {
      return $$0 instanceof dpd ? ((dpd)$$0).b() : null;
   }

   public static die a(@Nullable cuy $$0) {
      if ($$0 == null) {
         return dig.kP;
      } else {
         return switch ($$0) {
            case a -> dig.kQ;
            case b -> dig.kR;
            case c -> dig.kS;
            case d -> dig.kT;
            case e -> dig.kU;
            case f -> dig.kV;
            case g -> dig.kW;
            case h -> dig.kX;
            case i -> dig.kY;
            case j -> dig.kZ;
            case l -> dig.lb;
            case m -> dig.lc;
            case n -> dig.ld;
            case o -> dig.le;
            case p -> dig.lf;
            case k -> dig.la;
         };
      }
   }

   @Nullable
   public cuy b() {
      return this.m;
   }

   public static cwb b(@Nullable cuy $$0) {
      return new cwb(a($$0));
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
