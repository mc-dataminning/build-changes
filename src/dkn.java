import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dkn extends dot implements dnn {
   public static final MapCodec<dkn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwv.q.fieldOf("color").forGetter(dkn::b), t()).apply($$0, dkn::new));
   public static final dzk<dyz> b = dzc.be;
   public static final dzd c = dzc.x;
   private static final Map<jo, fdo> d = af.a(() -> {
      fdo $$0 = dku.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
      fdo $$1 = fdl.a($$0, h.a(0, 90));
      return fdl.c(fdl.a(dku.b(16.0, 3.0, 9.0), $$0, $$1));
   });
   private final cwv f;

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(cwv $$0, dyl.d $$1) {
      super($$1);
      this.f = $$0;
      this.l(this.B.b().b(b, dyz.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jo a(dgv $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      return $$2.b() instanceof dkn ? $$2.c(e) : null;
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$1.C) {
         return btq.b;
      } else {
         if ($$0.c(b) != dyz.a) {
            $$2 = $$2.a($$0.c(e));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return btq.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jj $$5 = $$2.a($$0.c(e).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fcu $$6 = $$2.b();
            $$1.a(null, $$1.al().a($$6), null, $$6, 5.0F, true, dhp.a.b);
            return btq.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wv.c("block.minecraft.bed.occupied"), true);
            }

            return btq.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return btq.b;
         }
      }
   }

   public static boolean a(dhp $$0) {
      return $$0.B_().l();
   }

   private boolean a(dhp $$0, jj $$1) {
      List<cpu> $$2 = $$0.a(cpu.class, new fcp($$1), bwr::fQ);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fR();
         return true;
      }
   }

   @Override
   public void a(dhp $$0, dym $$1, jj $$2, bvs $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5);
   }

   @Override
   public void a(dgv $$0, bvs $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bvs $$0) {
      fcu $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bwr ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == a($$0.c(b), $$0.c(e))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dkw.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jo a(dyz $$0, jo $$1) {
      return $$0 == dyz.b ? $$1 : $$1.g();
   }

   @Override
   public dym a(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      if (!$$0.C && $$3.gk()) {
         dyz $$4 = $$2.c(b);
         if ($$4 == dyz.b) {
            jj $$5 = $$1.a(a($$4, $$2.c(e)));
            dym $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dyz.a) {
               $$0.a($$5, dkw.a.m(), 35);
               $$0.a($$3, 2001, $$5, dku.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      jo $$1 = $$0.g();
      jj $$2 = $$0.a();
      jj $$3 = $$2.a($$1);
      dhp $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.A_().a($$3) ? this.m().b(e, $$1) : null;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d.get(h($$0).g());
   }

   public static jo h(dym $$0) {
      jo $$1 = $$0.c(e);
      return $$0.c(b) == dyz.a ? $$1.g() : $$1;
   }

   public static dnc.a i(dym $$0) {
      dyz $$1 = $$0.c(b);
      return $$1 == dyz.a ? dnc.a.b : dnc.a.c;
   }

   private static boolean b(dgv $$0, jj $$1) {
      return $$0.a_($$1.e()).b() instanceof dkn;
   }

   public static Optional<fcu> a(bwb<?> $$0, dgz $$1, jj $$2, jo $$3, float $$4) {
      jo $$5 = $$3.h();
      jo $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fcu> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fcu> a(bwb<?> $$0, dgz $$1, jj $$2, jo $$3, jo $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fcu> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jj $$7 = $$2.e();
         Optional<fcu> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fcu> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fcu> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fcu> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fcu> a(bwb<?> $$0, dgz $$1, jj $$2, int[][] $$3, boolean $$4) {
      jj.a $$5 = new jj.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fcu $$7 = csn.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e, b, c);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvh($$0, $$1, this.f);
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, @Nullable bwr $$3, cxy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         jj $$5 = $$1.a($$2.c(e));
         $$0.a($$5, $$2.b(b, dyz.a), 3);
         $$0.a($$1, dkw.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cwv b() {
      return this.f;
   }

   @Override
   protected long a(dym $$0, jj $$1) {
      jj $$2 = $$1.a($$0.c(e), $$0.c(b) == dyz.a ? 0 : 1);
      return azk.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   private static int[][] a(jo $$0, jo $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jo $$0, jo $$1) {
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

   private static int[][] a(jo $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
