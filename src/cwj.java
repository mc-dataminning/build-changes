import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cwj extends dal implements czi {
   public static final MapCodec<cwj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clm.q.fieldOf("color").forGetter(cwj::b), u()).apply($$0, cwj::new));
   public static final dkf<dju> b = djx.bb;
   public static final djy c = djx.t;
   protected static final int d = 9;
   protected static final emm e = cwq.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final emm f = cwq.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final emm g = cwq.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final emm h = cwq.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final emm i = cwq.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final emm j = emj.a(e, f, h);
   protected static final emm k = emj.a(e, g, i);
   protected static final emm l = emj.a(e, f, g);
   protected static final emm m = emj.a(e, h, i);
   private final clm o;

   @Override
   public MapCodec<cwj> a() {
      return a;
   }

   public cwj(clm $$0, djg.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dju.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ic a(csv $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      return $$2.b() instanceof cwj ? $$2.c(aE) : null;
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.b;
      } else {
         if ($$0.c(b) != dju.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bkb.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            hx $$6 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            elt $$7 = $$2.b();
            $$1.a(null, $$1.ai().a($$7), null, $$7, 5.0F, true, ctp.a.b);
            return bkb.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(vf.c("block.minecraft.bed.occupied"), true);
            }

            return bkb.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bkb.a;
         }
      }
   }

   public static boolean a(ctp $$0) {
      return $$0.E_().l();
   }

   private boolean a(ctp $$0, hx $$1) {
      List<cev> $$2 = $$0.a(cev.class, new elo($$1), bml::fD);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fE();
         return true;
      }
   }

   @Override
   public void a(ctp $$0, djh $$1, hx $$2, blv $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(csv $$0, blv $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(blv $$0) {
      elt $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bml ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cws.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ic a(dju $$0, ic $$1) {
      return $$0 == dju.b ? $$1 : $$1.g();
   }

   @Override
   public djh a(ctp $$0, hx $$1, djh $$2, cfi $$3) {
      if (!$$0.B && $$3.f()) {
         dju $$4 = $$2.c(b);
         if ($$4 == dju.b) {
            hx $$5 = $$1.a(a($$4, $$2.c(aE)));
            djh $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dju.a) {
               $$0.a($$5, cws.a.o(), 35);
               $$0.a($$3, 2001, $$5, cwq.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      ic $$1 = $$0.g();
      hx $$2 = $$0.a();
      hx $$3 = $$2.a($$1);
      ctp $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.D_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
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

   public static ic g(djh $$0) {
      ic $$1 = $$0.c(aE);
      return $$0.c(b) == dju.a ? $$1.g() : $$1;
   }

   public static cyx.a h(djh $$0) {
      dju $$1 = $$0.c(b);
      return $$1 == dju.a ? cyx.a.b : cyx.a.c;
   }

   private static boolean b(csv $$0, hx $$1) {
      return $$0.a_($$1.d()).b() instanceof cwj;
   }

   public static Optional<elt> a(blz<?> $$0, csz $$1, hx $$2, ic $$3, float $$4) {
      ic $$5 = $$3.h();
      ic $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<elt> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<elt> a(blz<?> $$0, csz $$1, hx $$2, ic $$3, ic $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<elt> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         hx $$7 = $$2.d();
         Optional<elt> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<elt> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<elt> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<elt> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<elt> a(blz<?> $$0, csz $$1, hx $$2, int[][] $$3, boolean $$4) {
      hx.a $$5 = new hx.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         elt $$7 = chf.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.b;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dgr($$0, $$1, this.o);
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, @Nullable bml $$3, cmy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         hx $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dju.a), 3);
         $$0.b($$1, cws.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public clm b() {
      return this.o;
   }

   @Override
   public long a(djh $$0, hx $$1) {
      hx $$2 = $$1.a($$0.c(aE), $$0.c(b) == dju.a ? 0 : 1);
      return auo.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
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
