import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dic extends dme implements dlb {
   public static final MapCodec<dic> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvc.q.fieldOf("color").forGetter(dic::b), t()).apply($$0, dic::new));
   public static final dwl<dwb> b = dwe.bb;
   public static final dwf c = dwe.t;
   protected static final int d = 9;
   protected static final fal e = dij.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fal f = dij.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fal g = dij.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fal h = dij.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fal i = dij.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fal j = fai.a(e, f, h);
   protected static final fal k = fai.a(e, g, i);
   protected static final fal l = fai.a(e, f, g);
   protected static final fal m = fai.a(e, h, i);
   private final cvc o;

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   public dic(cvc $$0, dvn.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dwb.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jm a(dek $$0, jh $$1) {
      dvo $$2 = $$0.a_($$1);
      return $$2.b() instanceof dic ? $$2.c(aF) : null;
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if ($$1.C) {
         return bsh.b;
      } else {
         if ($$0.c(b) != dwb.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bsh.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jh $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ezr $$6 = $$2.b();
            $$1.a(null, $$1.ai().a($$6), null, $$6, 5.0F, true, dff.a.b);
            return bsh.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xl.c("block.minecraft.bed.occupied"), true);
            }

            return bsh.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bsh.b;
         }
      }
   }

   public static boolean a(dff $$0) {
      return $$0.D_().l();
   }

   private boolean a(dff $$0, jh $$1) {
      List<coc> $$2 = $$0.a(coc.class, new ezm($$1), bve::fU);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fV();
         return true;
      }
   }

   @Override
   public void a(dff $$0, dvo $$1, jh $$2, bui $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dek $$0, bui $$1) {
      if ($$1.ch()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bui $$0) {
      ezr $$1 = $$0.dB();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bve ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$4 == a($$0.c(b), $$0.c(aF))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dil.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jm a(dwb $$0, jm $$1) {
      return $$0 == dwb.b ? $$1 : $$1.g();
   }

   @Override
   public dvo a(dff $$0, jh $$1, dvo $$2, cor $$3) {
      if (!$$0.C && $$3.f()) {
         dwb $$4 = $$2.c(b);
         if ($$4 == dwb.b) {
            jh $$5 = $$1.a(a($$4, $$2.c(aF)));
            dvo $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dwb.a) {
               $$0.a($$5, dil.a.m(), 35);
               $$0.a($$3, 2001, $$5, dij.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      jm $$1 = $$0.g();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$1);
      dff $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      jm $$4 = h($$0).g();
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

   public static jm h(dvo $$0) {
      jm $$1 = $$0.c(aF);
      return $$0.c(b) == dwb.a ? $$1.g() : $$1;
   }

   public static dkq.a i(dvo $$0) {
      dwb $$1 = $$0.c(b);
      return $$1 == dwb.a ? dkq.a.b : dkq.a.c;
   }

   private static boolean b(dek $$0, jh $$1) {
      return $$0.a_($$1.e()).b() instanceof dic;
   }

   public static Optional<ezr> a(bup<?> $$0, deo $$1, jh $$2, jm $$3, float $$4) {
      jm $$5 = $$3.h();
      jm $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ezr> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ezr> a(bup<?> $$0, deo $$1, jh $$2, jm $$3, jm $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ezr> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jh $$7 = $$2.e();
         Optional<ezr> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ezr> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ezr> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ezr> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ezr> a(bup<?> $$0, deo $$1, jh $$2, int[][] $$3, boolean $$4) {
      jh.a $$5 = new jh.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ezr $$7 = cqt.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.b;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dsn($$0, $$1, this.o);
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, @Nullable bve $$3, cwf $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         jh $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dwb.a), 3);
         $$0.b($$1, dil.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cvc b() {
      return this.o;
   }

   @Override
   protected long a(dvo $$0, jh $$1) {
      jh $$2 = $$1.a($$0.c(aF), $$0.c(b) == dwb.a ? 0 : 1);
      return azn.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   private static int[][] a(jm $$0, jm $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jm $$0, jm $$1) {
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

   private static int[][] a(jm $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
