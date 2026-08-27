import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cwr extends dat implements czq {
   public static final MapCodec<cwr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clv.q.fieldOf("color").forGetter(cwr::b), u()).apply($$0, cwr::new));
   public static final dkn<dkc> b = dkf.bb;
   public static final dkg c = dkf.t;
   protected static final int d = 9;
   protected static final emv e = cwy.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final emv f = cwy.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final emv g = cwy.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final emv h = cwy.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final emv i = cwy.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final emv j = ems.a(e, f, h);
   protected static final emv k = ems.a(e, g, i);
   protected static final emv l = ems.a(e, f, g);
   protected static final emv m = ems.a(e, h, i);
   private final clv o;

   @Override
   public MapCodec<cwr> a() {
      return a;
   }

   public cwr(clv $$0, djo.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dkc.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ic a(ctd $$0, hx $$1) {
      djp $$2 = $$0.a_($$1);
      return $$2.b() instanceof cwr ? $$2.c(aE) : null;
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.b;
      } else {
         if ($$0.c(b) != dkc.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bkc.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            hx $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            emc $$6 = $$2.b();
            $$1.a(null, $$1.ai().a($$6), null, $$6, 5.0F, true, ctx.a.b);
            return bkc.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(vg.c("block.minecraft.bed.occupied"), true);
            }

            return bkc.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bkc.a;
         }
      }
   }

   public static boolean a(ctx $$0) {
      return $$0.E_().l();
   }

   private boolean a(ctx $$0, hx $$1) {
      List<cfd> $$2 = $$0.a(cfd.class, new elx($$1), bmo::fD);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fE();
         return true;
      }
   }

   @Override
   public void a(ctx $$0, djp $$1, hx $$2, blw $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(ctd $$0, blw $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(blw $$0) {
      emc $$1 = $$0.do();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bmo ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cxa.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ic a(dkc $$0, ic $$1) {
      return $$0 == dkc.b ? $$1 : $$1.g();
   }

   @Override
   public djp a(ctx $$0, hx $$1, djp $$2, cfq $$3) {
      if (!$$0.B && $$3.f()) {
         dkc $$4 = $$2.c(b);
         if ($$4 == dkc.b) {
            hx $$5 = $$1.a(a($$4, $$2.c(aE)));
            djp $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dkc.a) {
               $$0.a($$5, cxa.a.o(), 35);
               $$0.a($$3, 2001, $$5, cwy.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      ic $$1 = $$0.g();
      hx $$2 = $$0.a();
      hx $$3 = $$2.a($$1);
      ctx $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.D_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      ic $$4 = g($$0).g();
      switch ($$4) {
         case c:
            return j;
         case d:
            return k;
         case e:
            return l;
         default:
            return m;
      }
   }

   public static ic g(djp $$0) {
      ic $$1 = $$0.c(aE);
      return $$0.c(b) == dkc.a ? $$1.g() : $$1;
   }

   public static czf.a h(djp $$0) {
      dkc $$1 = $$0.c(b);
      return $$1 == dkc.a ? czf.a.b : czf.a.c;
   }

   private static boolean b(ctd $$0, hx $$1) {
      return $$0.a_($$1.d()).b() instanceof cwr;
   }

   public static Optional<emc> a(bmc<?> $$0, cth $$1, hx $$2, ic $$3, float $$4) {
      ic $$5 = $$3.h();
      ic $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<emc> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<emc> a(bmc<?> $$0, cth $$1, hx $$2, ic $$3, ic $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<emc> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         hx $$7 = $$2.d();
         Optional<emc> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<emc> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<emc> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<emc> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<emc> a(bmc<?> $$0, cth $$1, hx $$2, int[][] $$3, boolean $$4) {
      hx.a $$5 = new hx.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         emc $$7 = chn.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.b;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dgz($$0, $$1, this.o);
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, @Nullable bmo $$3, cng $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         hx $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dkc.a), 3);
         $$0.b($$1, cxa.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public clv b() {
      return this.o;
   }

   @Override
   public long a(djp $$0, hx $$1) {
      hx $$2 = $$1.a($$0.c(aE), $$0.c(b) == dkc.a ? 0 : 1);
      return aup.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   private static int[][] a(ic $$0, ic $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ic $$0, ic $$1) {
      return new int[][]{
         {$$1.j(), $$1.l()},
         {$$1.j() - $$0.j(), $$1.l() - $$0.l()},
         {$$1.j() - $$0.j() * 2, $$1.l() - $$0.l() * 2},
         {-$$0.j() * 2, -$$0.l() * 2},
         {-$$1.j() - $$0.j() * 2, -$$1.l() - $$0.l() * 2},
         {-$$1.j() - $$0.j(), -$$1.l() - $$0.l()},
         {-$$1.j(), -$$1.l()},
         {-$$1.j() + $$0.j(), -$$1.l() + $$0.l()},
         {$$0.j(), $$0.l()},
         {$$1.j() + $$0.j(), $$1.l() + $$0.l()}
      };
   }

   private static int[][] a(ic $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
