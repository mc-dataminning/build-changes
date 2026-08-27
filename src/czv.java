import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class czv extends ddx implements dcu {
   public static final MapCodec<czv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpd.q.fieldOf("color").forGetter(czv::b), u()).apply($$0, czv::new));
   public static final dnz<dno> b = dnr.bb;
   public static final dns c = dnr.t;
   protected static final int d = 9;
   protected static final eqm e = dac.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final eqm f = dac.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eqm g = dac.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eqm h = dac.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eqm i = dac.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eqm j = eqj.a(e, f, h);
   protected static final eqm k = eqj.a(e, g, i);
   protected static final eqm l = eqj.a(e, f, g);
   protected static final eqm m = eqj.a(e, h, i);
   private final cpd o;

   @Override
   public MapCodec<czv> a() {
      return a;
   }

   public czv(cpd $$0, dna.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dno.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ih a(cwh $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1);
      return $$2.b() instanceof czv ? $$2.c(aE) : null;
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.b;
      } else {
         if ($$0.c(b) != dno.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bnd.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ib $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ept $$6 = $$2.b();
            $$1.a(null, $$1.ah().a($$6), null, $$6, 5.0F, true, cxb.a.b);
            return bnd.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(vu.c("block.minecraft.bed.occupied"), true);
            }

            return bnd.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bnd.a;
         }
      }
   }

   public static boolean a(cxb $$0) {
      return $$0.D_().l();
   }

   private boolean a(cxb $$0, ib $$1) {
      List<cih> $$2 = $$0.a(cih.class, new epo($$1), bpp::fI);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fJ();
         return true;
      }
   }

   @Override
   public void a(cxb $$0, dnb $$1, ib $$2, box $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cwh $$0, box $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(box $$0) {
      ept $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bpp ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dae.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ih a(dno $$0, ih $$1) {
      return $$0 == dno.b ? $$1 : $$1.g();
   }

   @Override
   public dnb a(cxb $$0, ib $$1, dnb $$2, ciu $$3) {
      if (!$$0.B && $$3.f()) {
         dno $$4 = $$2.c(b);
         if ($$4 == dno.b) {
            ib $$5 = $$1.a(a($$4, $$2.c(aE)));
            dnb $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dno.a) {
               $$0.a($$5, dae.a.o(), 35);
               $$0.a($$3, 2001, $$5, dac.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      ih $$1 = $$0.g();
      ib $$2 = $$0.a();
      ib $$3 = $$2.a($$1);
      cxb $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      ih $$4 = g($$0).g();
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

   public static ih g(dnb $$0) {
      ih $$1 = $$0.c(aE);
      return $$0.c(b) == dno.a ? $$1.g() : $$1;
   }

   public static dcj.a h(dnb $$0) {
      dno $$1 = $$0.c(b);
      return $$1 == dno.a ? dcj.a.b : dcj.a.c;
   }

   private static boolean b(cwh $$0, ib $$1) {
      return $$0.a_($$1.d()).b() instanceof czv;
   }

   public static Optional<ept> a(bpd<?> $$0, cwl $$1, ib $$2, ih $$3, float $$4) {
      ih $$5 = $$3.h();
      ih $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ept> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ept> a(bpd<?> $$0, cwl $$1, ib $$2, ih $$3, ih $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ept> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ib $$7 = $$2.d();
         Optional<ept> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ept> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ept> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ept> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ept> a(bpd<?> $$0, cwl $$1, ib $$2, int[][] $$3, boolean $$4) {
      ib.a $$5 = new ib.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ept $$7 = cku.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.b;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dke($$0, $$1, this.o);
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, @Nullable bpp $$3, cqm $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         ib $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dno.a), 3);
         $$0.b($$1, dae.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cpd b() {
      return this.o;
   }

   @Override
   protected long a(dnb $$0, ib $$1) {
      ib $$2 = $$1.a($$0.c(aE), $$0.c(b) == dno.a ? 0 : 1);
      return aww.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   private static int[][] a(ih $$0, ih $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ih $$0, ih $$1) {
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

   private static int[][] a(ih $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
