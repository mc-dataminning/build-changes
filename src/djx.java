import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class djx extends dod implements dmx {
   public static final MapCodec<djx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwe.q.fieldOf("color").forGetter(djx::b), t()).apply($$0, djx::new));
   public static final dyo<dyd> b = dyg.be;
   public static final dyh c = dyg.x;
   private static final Map<jn, fcr> d = af.a(() -> {
      fcr $$0 = dke.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
      fcr $$1 = fco.a($$0, h.a(0, 90));
      return fco.c(fco.a(dke.b(16.0, 3.0, 9.0), $$0, $$1));
   });
   private final cwe f;

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   public djx(cwe $$0, dxp.d $$1) {
      super($$1);
      this.f = $$0;
      this.l(this.B.b().b(b, dyd.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jn a(dgf $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      return $$2.b() instanceof djx ? $$2.c(e) : null;
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$1.C) {
         return bsy.b;
      } else {
         if ($$0.c(b) != dyd.a) {
            $$2 = $$2.a($$0.c(e));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bsy.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ji $$5 = $$2.a($$0.c(e).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fbx $$6 = $$2.b();
            $$1.a(null, $$1.al().a($$6), null, $$6, 5.0F, true, dgz.a.b);
            return bsy.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wp.c("block.minecraft.bed.occupied"), true);
            }

            return bsy.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bsy.b;
         }
      }
   }

   public static boolean a(dgz $$0) {
      return $$0.B_().l();
   }

   private boolean a(dgz $$0, ji $$1) {
      List<cpd> $$2 = $$0.a(cpd.class, new fbs($$1), bvy::fT);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fU();
         return true;
      }
   }

   @Override
   public void a(dgz $$0, dxq $$1, ji $$2, bva $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dgf $$0, bva $$1) {
      if ($$1.ce()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bva $$0) {
      fbx $$1 = $$0.dx();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bvy ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == a($$0.c(b), $$0.c(e))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dkg.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jn a(dyd $$0, jn $$1) {
      return $$0 == dyd.b ? $$1 : $$1.g();
   }

   @Override
   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      if (!$$0.C && $$3.gn()) {
         dyd $$4 = $$2.c(b);
         if ($$4 == dyd.b) {
            ji $$5 = $$1.a(a($$4, $$2.c(e)));
            dxq $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dyd.a) {
               $$0.a($$5, dkg.a.m(), 35);
               $$0.a($$3, 2001, $$5, dke.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      jn $$1 = $$0.g();
      ji $$2 = $$0.a();
      ji $$3 = $$2.a($$1);
      dgz $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.A_().a($$3) ? this.m().b(e, $$1) : null;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d.get(h($$0).g());
   }

   public static jn h(dxq $$0) {
      jn $$1 = $$0.c(e);
      return $$0.c(b) == dyd.a ? $$1.g() : $$1;
   }

   public static dmm.a i(dxq $$0) {
      dyd $$1 = $$0.c(b);
      return $$1 == dyd.a ? dmm.a.b : dmm.a.c;
   }

   private static boolean b(dgf $$0, ji $$1) {
      return $$0.a_($$1.e()).b() instanceof djx;
   }

   public static Optional<fbx> a(bvi<?> $$0, dgj $$1, ji $$2, jn $$3, float $$4) {
      jn $$5 = $$3.h();
      jn $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fbx> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fbx> a(bvi<?> $$0, dgj $$1, ji $$2, jn $$3, jn $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fbx> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ji $$7 = $$2.e();
         Optional<fbx> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fbx> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fbx> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fbx> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fbx> a(bvi<?> $$0, dgj $$1, ji $$2, int[][] $$3, boolean $$4) {
      ji.a $$5 = new ji.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fbx $$7 = crw.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e, b, c);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new duo($$0, $$1, this.f);
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, @Nullable bvy $$3, cxh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         ji $$5 = $$1.a($$2.c(e));
         $$0.a($$5, $$2.b(b, dyd.a), 3);
         $$0.a($$1, dkg.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cwe b() {
      return this.f;
   }

   @Override
   protected long a(dxq $$0, ji $$1) {
      ji $$2 = $$1.a($$0.c(e), $$0.c(b) == dyd.a ? 0 : 1);
      return ayz.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   private static int[][] a(jn $$0, jn $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jn $$0, jn $$1) {
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

   private static int[][] a(jn $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
