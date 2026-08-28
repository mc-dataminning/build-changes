import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class djw extends dob implements dmw {
   public static final MapCodec<djw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwd.q.fieldOf("color").forGetter(djw::b), t()).apply($$0, djw::new));
   public static final dyl<dyb> b = dye.be;
   public static final dyf c = dye.y;
   protected static final int d = 9;
   protected static final fcl e = dkd.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fcl f = dkd.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fcl g = dkd.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fcl h = dkd.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fcl i = dkd.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fcl j = fci.a(e, f, h);
   protected static final fcl k = fci.a(e, g, i);
   protected static final fcl l = fci.a(e, f, g);
   protected static final fcl m = fci.a(e, h, i);
   private final cwd o;

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   public djw(cwd $$0, dxn.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dyb.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jm a(dge $$0, jh $$1) {
      dxo $$2 = $$0.a_($$1);
      return $$2.b() instanceof djw ? $$2.c(aF) : null;
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$1.C) {
         return bta.b;
      } else {
         if ($$0.c(b) != dyb.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bta.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jh $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fbr $$6 = $$2.b();
            $$1.a(null, $$1.ak().a($$6), null, $$6, 5.0F, true, dgz.a.b);
            return bta.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xk.c("block.minecraft.bed.occupied"), true);
            }

            return bta.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bta.b;
         }
      }
   }

   public static boolean a(dgz $$0) {
      return $$0.G_().l();
   }

   private boolean a(dgz $$0, jh $$1) {
      List<cpa> $$2 = $$0.a(cpa.class, new fbm($$1), bvx::fR);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fS();
         return true;
      }
   }

   @Override
   public void a(dgz $$0, dxo $$1, jh $$2, bvb $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dge $$0, bvb $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bvb $$0) {
      fbr $$1 = $$0.dz();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bvx ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$4 == a($$0.c(b), $$0.c(aF))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dkf.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jm a(dyb $$0, jm $$1) {
      return $$0 == dyb.b ? $$1 : $$1.g();
   }

   @Override
   public dxo a(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
      if (!$$0.C && $$3.b()) {
         dyb $$4 = $$2.c(b);
         if ($$4 == dyb.b) {
            jh $$5 = $$1.a(a($$4, $$2.c(aF)));
            dxo $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dyb.a) {
               $$0.a($$5, dkf.a.m(), 35);
               $$0.a($$3, 2001, $$5, dkd.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      jm $$1 = $$0.g();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$1);
      dgz $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.F_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
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

   public static jm h(dxo $$0) {
      jm $$1 = $$0.c(aF);
      return $$0.c(b) == dyb.a ? $$1.g() : $$1;
   }

   public static dml.a i(dxo $$0) {
      dyb $$1 = $$0.c(b);
      return $$1 == dyb.a ? dml.a.b : dml.a.c;
   }

   private static boolean b(dge $$0, jh $$1) {
      return $$0.a_($$1.e()).b() instanceof djw;
   }

   public static Optional<fbr> a(bvi<?> $$0, dgi $$1, jh $$2, jm $$3, float $$4) {
      jm $$5 = $$3.h();
      jm $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fbr> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fbr> a(bvi<?> $$0, dgi $$1, jh $$2, jm $$3, jm $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fbr> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jh $$7 = $$2.e();
         Optional<fbr> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fbr> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fbr> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fbr> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fbr> a(bvi<?> $$0, dgi $$1, jh $$2, int[][] $$3, boolean $$4) {
      jh.a $$5 = new jh.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fbr $$7 = crt.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.b;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dum($$0, $$1, this.o);
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, @Nullable bvx $$3, cxg $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         jh $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dyb.a), 3);
         $$0.b($$1, dkf.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cwd b() {
      return this.o;
   }

   @Override
   protected long a(dxo $$0, jh $$1) {
      jh $$2 = $$1.a($$0.c(aF), $$0.c(b) == dyb.a ? 0 : 1);
      return azu.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
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
