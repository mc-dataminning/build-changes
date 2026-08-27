import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cyh extends dcj implements dbg {
   public static final MapCodec<cyh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnn.q.fieldOf("color").forGetter(cyh::b), u()).apply($$0, cyh::new));
   public static final dmd<dls> b = dlv.bb;
   public static final dlw c = dlv.t;
   protected static final int d = 9;
   protected static final eol e = cyo.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final eol f = cyo.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eol g = cyo.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eol h = cyo.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eol i = cyo.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eol j = eoi.a(e, f, h);
   protected static final eol k = eoi.a(e, g, i);
   protected static final eol l = eoi.a(e, f, g);
   protected static final eol m = eoi.a(e, h, i);
   private final cnn o;

   @Override
   public MapCodec<cyh> a() {
      return a;
   }

   public cyh(cnn $$0, dle.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dls.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ie a(cut $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      return $$2.b() instanceof cyh ? $$2.c(aE) : null;
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.b;
      } else {
         if ($$0.c(b) != dls.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return blu.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            hz $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ens $$6 = $$2.b();
            $$1.a(null, $$1.ai().a($$6), null, $$6, 5.0F, true, cvn.a.b);
            return blu.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(vq.c("block.minecraft.bed.occupied"), true);
            }

            return blu.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return blu.a;
         }
      }
   }

   public static boolean a(cvn $$0) {
      return $$0.E_().l();
   }

   private boolean a(cvn $$0, hz $$1) {
      List<cgu> $$2 = $$0.a(cgu.class, new enn($$1), bog::fD);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fE();
         return true;
      }
   }

   @Override
   public void a(cvn $$0, dlf $$1, hz $$2, bno $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cut $$0, bno $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bno $$0) {
      ens $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bog ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cyq.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ie a(dls $$0, ie $$1) {
      return $$0 == dls.b ? $$1 : $$1.g();
   }

   @Override
   public dlf a(cvn $$0, hz $$1, dlf $$2, chh $$3) {
      if (!$$0.B && $$3.f()) {
         dls $$4 = $$2.c(b);
         if ($$4 == dls.b) {
            hz $$5 = $$1.a(a($$4, $$2.c(aE)));
            dlf $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dls.a) {
               $$0.a($$5, cyq.a.o(), 35);
               $$0.a($$3, 2001, $$5, cyo.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      ie $$1 = $$0.g();
      hz $$2 = $$0.a();
      hz $$3 = $$2.a($$1);
      cvn $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.D_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      ie $$4 = g($$0).g();
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

   public static ie g(dlf $$0) {
      ie $$1 = $$0.c(aE);
      return $$0.c(b) == dls.a ? $$1.g() : $$1;
   }

   public static dav.a h(dlf $$0) {
      dls $$1 = $$0.c(b);
      return $$1 == dls.a ? dav.a.b : dav.a.c;
   }

   private static boolean b(cut $$0, hz $$1) {
      return $$0.a_($$1.d()).b() instanceof cyh;
   }

   public static Optional<ens> a(bnu<?> $$0, cux $$1, hz $$2, ie $$3, float $$4) {
      ie $$5 = $$3.h();
      ie $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ens> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ens> a(bnu<?> $$0, cux $$1, hz $$2, ie $$3, ie $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ens> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         hz $$7 = $$2.d();
         Optional<ens> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ens> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ens> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ens> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ens> a(bnu<?> $$0, cux $$1, hz $$2, int[][] $$3, boolean $$4) {
      hz.a $$5 = new hz.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ens $$7 = cjf.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected det b_(dlf $$0) {
      return det.b;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dip($$0, $$1, this.o);
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, @Nullable bog $$3, coz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         hz $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dls.a), 3);
         $$0.b($$1, cyq.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cnn b() {
      return this.o;
   }

   @Override
   protected long a(dlf $$0, hz $$1) {
      hz $$2 = $$1.a($$0.c(aE), $$0.c(b) == dls.a ? 0 : 1);
      return awh.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   private static int[][] a(ie $$0, ie $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ie $$0, ie $$1) {
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

   private static int[][] a(ie $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
