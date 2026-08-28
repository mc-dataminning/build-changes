import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dfr extends dju implements diq {
   public static final MapCodec<dfr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cti.q.fieldOf("color").forGetter(dfr::b), u()).apply($$0, dfr::new));
   public static final dua<dtp> b = dts.bb;
   public static final dtt c = dts.t;
   protected static final int d = 9;
   protected static final ext e = dfy.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ext f = dfy.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ext g = dfy.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ext h = dfy.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ext i = dfy.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ext j = exq.a(e, f, h);
   protected static final ext k = exq.a(e, g, i);
   protected static final ext l = exq.a(e, f, g);
   protected static final ext m = exq.a(e, h, i);
   private final cti o;

   @Override
   public MapCodec<dfr> a() {
      return a;
   }

   public dfr(cti $$0, dtb.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dtp.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ji a(dcc $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      return $$2.b() instanceof dfr ? $$2.c(aE) : null;
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$1.B) {
         return bqr.c;
      } else {
         if ($$0.c(b) != dtp.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqr.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jd $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            exa $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dcw.a.b);
            return bqr.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wz.c("block.minecraft.bed.occupied"), true);
            }

            return bqr.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqr.a;
         }
      }
   }

   public static boolean a(dcw $$0) {
      return $$0.D_().l();
   }

   private boolean a(dcw $$0, jd $$1) {
      List<cmk> $$2 = $$0.a(cmk.class, new ewv($$1), btn::fI);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fJ();
         return true;
      }
   }

   @Override
   public void a(dcw $$0, dtc $$1, jd $$2, bsr $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dcc $$0, bsr $$1) {
      if ($$1.bY()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsr $$0) {
      exa $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btn ? 1.0 : 0.8;
         $$0.n($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dga.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ji a(dtp $$0, ji $$1) {
      return $$0 == dtp.b ? $$1 : $$1.g();
   }

   @Override
   public dtc a(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      if (!$$0.B && $$3.f()) {
         dtp $$4 = $$2.c(b);
         if ($$4 == dtp.b) {
            jd $$5 = $$1.a(a($$4, $$2.c(aE)));
            dtc $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dtp.a) {
               $$0.a($$5, dga.a.o(), 35);
               $$0.a($$3, 2001, $$5, dfy.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      ji $$1 = $$0.g();
      jd $$2 = $$0.a();
      jd $$3 = $$2.a($$1);
      dcw $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      ji $$4 = g($$0).g();
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

   public static ji g(dtc $$0) {
      ji $$1 = $$0.c(aE);
      return $$0.c(b) == dtp.a ? $$1.g() : $$1;
   }

   public static dif.a h(dtc $$0) {
      dtp $$1 = $$0.c(b);
      return $$1 == dtp.a ? dif.a.b : dif.a.c;
   }

   private static boolean b(dcc $$0, jd $$1) {
      return $$0.a_($$1.e()).b() instanceof dfr;
   }

   public static Optional<exa> a(bsx<?> $$0, dcg $$1, jd $$2, ji $$3, float $$4) {
      ji $$5 = $$3.h();
      ji $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<exa> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<exa> a(bsx<?> $$0, dcg $$1, jd $$2, ji $$3, ji $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<exa> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jd $$7 = $$2.e();
         Optional<exa> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<exa> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<exa> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<exa> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<exa> a(bsx<?> $$0, dcg $$1, jd $$2, int[][] $$3, boolean $$4) {
      jd.a $$5 = new jd.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         exa $$7 = coy.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.b;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqd($$0, $$1, this.o);
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, @Nullable btn $$3, cuq $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         jd $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dtp.a), 3);
         $$0.b($$1, dga.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cti b() {
      return this.o;
   }

   @Override
   protected long a(dtc $$0, jd $$1) {
      jd $$2 = $$1.a($$0.c(aE), $$0.c(b) == dtp.a ? 0 : 1);
      return ayo.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }

   private static int[][] a(ji $$0, ji $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ji $$0, ji $$1) {
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

   private static int[][] a(ji $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
