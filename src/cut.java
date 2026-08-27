import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cut extends cyv implements cxs {
   public static final MapCodec<cut> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cjx.q.fieldOf("color").forGetter(cut::b), u()).apply($$0, cut::new));
   public static final dig<dhv> b = dhy.bb;
   public static final dhz c = dhy.t;
   protected static final int d = 9;
   protected static final ekn e = cva.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ekn f = cva.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ekn g = cva.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ekn h = cva.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ekn i = cva.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ekn j = ekk.a(e, f, h);
   protected static final ekn k = ekk.a(e, g, i);
   protected static final ekn l = ekk.a(e, f, g);
   protected static final ekn m = ekk.a(e, h, i);
   private final cjx o;

   @Override
   public MapCodec<cut> a() {
      return a;
   }

   public cut(cjx $$0, dhh.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dhv.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static hx a(crg $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1);
      return $$2.b() instanceof cut ? $$2.c(aE) : null;
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.b;
      } else {
         if ($$0.c(b) != dhv.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bix.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ht $$6 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            eju $$7 = $$2.b();
            $$1.a(null, $$1.ah().a($$7), null, $$7, 5.0F, true, csa.a.b);
            return bix.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(ur.c("block.minecraft.bed.occupied"), true);
            }

            return bix.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bix.a;
         }
      }
   }

   public static boolean a(csa $$0) {
      return $$0.D_().l();
   }

   private boolean a(csa $$0, ht $$1) {
      List<cdh> $$2 = $$0.a(cdh.class, new ejp($$1), blg::fE);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fF();
         return true;
      }
   }

   @Override
   public void a(csa $$0, dhi $$1, ht $$2, bkq $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(crg $$0, bkq $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bkq $$0) {
      eju $$1 = $$0.dq();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof blg ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cvc.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static hx a(dhv $$0, hx $$1) {
      return $$0 == dhv.b ? $$1 : $$1.g();
   }

   @Override
   public dhi a(csa $$0, ht $$1, dhi $$2, cdu $$3) {
      if (!$$0.B && $$3.f()) {
         dhv $$4 = $$2.c(b);
         if ($$4 == dhv.b) {
            ht $$5 = $$1.a(a($$4, $$2.c(aE)));
            dhi $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dhv.a) {
               $$0.a($$5, cvc.a.o(), 35);
               $$0.a($$3, 2001, $$5, cva.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      hx $$1 = $$0.g();
      ht $$2 = $$0.a();
      ht $$3 = $$2.a($$1);
      csa $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      hx $$4 = g($$0).g();
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

   public static hx g(dhi $$0) {
      hx $$1 = $$0.c(aE);
      return $$0.c(b) == dhv.a ? $$1.g() : $$1;
   }

   public static cxh.a h(dhi $$0) {
      dhv $$1 = $$0.c(b);
      return $$1 == dhv.a ? cxh.a.b : cxh.a.c;
   }

   private static boolean b(crg $$0, ht $$1) {
      return $$0.a_($$1.d()).b() instanceof cut;
   }

   public static Optional<eju> a(bku<?> $$0, crk $$1, ht $$2, hx $$3, float $$4) {
      hx $$5 = $$3.h();
      hx $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<eju> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<eju> a(bku<?> $$0, crk $$1, ht $$2, hx $$3, hx $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<eju> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ht $$7 = $$2.d();
         Optional<eju> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<eju> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<eju> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<eju> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<eju> a(bku<?> $$0, crk $$1, ht $$2, int[][] $$3, boolean $$4) {
      ht.a $$5 = new ht.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         eju $$7 = cfq.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.b;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dez($$0, $$1, this.o);
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, @Nullable blg $$3, clj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         ht $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dhv.a), 3);
         $$0.b($$1, cvc.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cjx b() {
      return this.o;
   }

   @Override
   public long a(dhi $$0, ht $$1) {
      ht $$2 = $$1.a($$0.c(aE), $$0.c(b) == dhv.a ? 0 : 1);
      return atm.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   private static int[][] a(hx $$0, hx $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(hx $$0, hx $$1) {
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

   private static int[][] a(hx $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
