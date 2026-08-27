import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cum extends cyo implements cxk {
   public static final MapCodec<cum> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cjp.q.fieldOf("color").forGetter(cum::b), t()).apply($$0, cum::new));
   public static final dhu<dhj> b = dhm.bb;
   public static final dhn c = dhm.t;
   protected static final int d = 9;
   protected static final ekb e = cut.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ekb f = cut.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ekb g = cut.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ekb h = cut.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ekb i = cut.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ekb j = ejy.a(e, f, h);
   protected static final ekb k = ejy.a(e, g, i);
   protected static final ekb l = ejy.a(e, f, g);
   protected static final ekb m = ejy.a(e, h, i);
   private final cjp o;

   @Override
   public MapCodec<cum> a() {
      return a;
   }

   public cum(cjp $$0, dgv.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dhj.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static hx a(cqy $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      return $$2.b() instanceof cum ? $$2.c(aE) : null;
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.b;
      } else {
         if ($$0.c(b) != dhj.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return biq.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ht $$6 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            eji $$7 = $$2.b();
            $$1.a(null, $$1.ag().a($$7), null, $$7, 5.0F, true, crs.a.b);
            return biq.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(ur.c("block.minecraft.bed.occupied"), true);
            }

            return biq.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return biq.a;
         }
      }
   }

   public static boolean a(crs $$0) {
      return $$0.D_().l();
   }

   private boolean a(crs $$0, ht $$1) {
      List<ccz> $$2 = $$0.a(ccz.class, new ejd($$1), bky::fD);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fE();
         return true;
      }
   }

   @Override
   public void a(crs $$0, dgw $$1, ht $$2, bki $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cqy $$0, bki $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bki $$0) {
      eji $$1 = $$0.do();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bky ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cuv.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static hx a(dhj $$0, hx $$1) {
      return $$0 == dhj.b ? $$1 : $$1.g();
   }

   @Override
   public dgw a(crs $$0, ht $$1, dgw $$2, cdm $$3) {
      if (!$$0.B && $$3.f()) {
         dhj $$4 = $$2.c(b);
         if ($$4 == dhj.b) {
            ht $$5 = $$1.a(a($$4, $$2.c(aE)));
            dgw $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dhj.a) {
               $$0.a($$5, cuv.a.o(), 35);
               $$0.a($$3, 2001, $$5, cut.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      hx $$1 = $$0.g();
      ht $$2 = $$0.a();
      ht $$3 = $$2.a($$1);
      crs $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
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

   public static hx g(dgw $$0) {
      hx $$1 = $$0.c(aE);
      return $$0.c(b) == dhj.a ? $$1.g() : $$1;
   }

   public static cwz.a h(dgw $$0) {
      dhj $$1 = $$0.c(b);
      return $$1 == dhj.a ? cwz.a.b : cwz.a.c;
   }

   private static boolean b(cqy $$0, ht $$1) {
      return $$0.a_($$1.d()).b() instanceof cum;
   }

   public static Optional<eji> a(bkm<?> $$0, crc $$1, ht $$2, hx $$3, float $$4) {
      hx $$5 = $$3.h();
      hx $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<eji> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<eji> a(bkm<?> $$0, crc $$1, ht $$2, hx $$3, hx $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<eji> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ht $$7 = $$2.d();
         Optional<eji> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<eji> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<eji> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<eji> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<eji> a(bkm<?> $$0, crc $$1, ht $$2, int[][] $$3, boolean $$4) {
      ht.a $$5 = new ht.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         eji $$7 = cfi.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public day b_(dgw $$0) {
      return day.b;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new den($$0, $$1, this.o);
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, @Nullable bky $$3, clb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         ht $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dhj.a), 3);
         $$0.b($$1, cuv.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cjp b() {
      return this.o;
   }

   @Override
   public long a(dgw $$0, ht $$1) {
      ht $$2 = $$1.a($$0.c(aE), $$0.c(b) == dhj.a ? 0 : 1);
      return ati.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
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
