import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cuy extends cza implements cxx {
   public static final MapCodec<cuy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ckc.q.fieldOf("color").forGetter(cuy::b), u()).apply($$0, cuy::new));
   public static final dil<dia> b = did.bb;
   public static final die c = did.t;
   protected static final int d = 9;
   protected static final eks e = cvf.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final eks f = cvf.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eks g = cvf.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eks h = cvf.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eks i = cvf.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eks j = ekp.a(e, f, h);
   protected static final eks k = ekp.a(e, g, i);
   protected static final eks l = ekp.a(e, f, g);
   protected static final eks m = ekp.a(e, h, i);
   private final ckc o;

   @Override
   public MapCodec<cuy> a() {
      return a;
   }

   public cuy(ckc $$0, dhm.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dia.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ib a(crl $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      return $$2.b() instanceof cuy ? $$2.c(aE) : null;
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.b;
      } else {
         if ($$0.c(b) != dia.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bjb.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            hx $$6 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            ejz $$7 = $$2.b();
            $$1.a(null, $$1.ah().a($$7), null, $$7, 5.0F, true, csf.a.b);
            return bjb.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(uv.c("block.minecraft.bed.occupied"), true);
            }

            return bjb.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bjb.a;
         }
      }
   }

   public static boolean a(csf $$0) {
      return $$0.E_().l();
   }

   private boolean a(csf $$0, hx $$1) {
      List<cdm> $$2 = $$0.a(cdm.class, new eju($$1), bll::fE);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fF();
         return true;
      }
   }

   @Override
   public void a(csf $$0, dhn $$1, hx $$2, bkv $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(crl $$0, bkv $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bkv $$0) {
      ejz $$1 = $$0.dq();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bll ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cvh.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ib a(dia $$0, ib $$1) {
      return $$0 == dia.b ? $$1 : $$1.g();
   }

   @Override
   public dhn a(csf $$0, hx $$1, dhn $$2, cdz $$3) {
      if (!$$0.B && $$3.f()) {
         dia $$4 = $$2.c(b);
         if ($$4 == dia.b) {
            hx $$5 = $$1.a(a($$4, $$2.c(aE)));
            dhn $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dia.a) {
               $$0.a($$5, cvh.a.o(), 35);
               $$0.a($$3, 2001, $$5, cvf.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      ib $$1 = $$0.g();
      hx $$2 = $$0.a();
      hx $$3 = $$2.a($$1);
      csf $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.D_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      ib $$4 = g($$0).g();
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

   public static ib g(dhn $$0) {
      ib $$1 = $$0.c(aE);
      return $$0.c(b) == dia.a ? $$1.g() : $$1;
   }

   public static cxm.a h(dhn $$0) {
      dia $$1 = $$0.c(b);
      return $$1 == dia.a ? cxm.a.b : cxm.a.c;
   }

   private static boolean b(crl $$0, hx $$1) {
      return $$0.a_($$1.d()).b() instanceof cuy;
   }

   public static Optional<ejz> a(bkz<?> $$0, crp $$1, hx $$2, ib $$3, float $$4) {
      ib $$5 = $$3.h();
      ib $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ejz> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ejz> a(bkz<?> $$0, crp $$1, hx $$2, ib $$3, ib $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ejz> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         hx $$7 = $$2.d();
         Optional<ejz> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ejz> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ejz> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ejz> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ejz> a(bkz<?> $$0, crp $$1, hx $$2, int[][] $$3, boolean $$4) {
      hx.a $$5 = new hx.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ejz $$7 = cfv.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.b;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfe($$0, $$1, this.o);
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, @Nullable bll $$3, clo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         hx $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dia.a), 3);
         $$0.b($$1, cvh.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public ckc b() {
      return this.o;
   }

   @Override
   public long a(dhn $$0, hx $$1) {
      hx $$2 = $$1.a($$0.c(aE), $$0.c(b) == dia.a ? 0 : 1);
      return atq.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   private static int[][] a(ib $$0, ib $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ib $$0, ib $$1) {
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

   private static int[][] a(ib $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
