import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class des extends div implements dhr {
   public static final MapCodec<des> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cti.q.fieldOf("color").forGetter(des::b), u()).apply($$0, des::new));
   public static final dta<dsp> b = dss.bb;
   public static final dst c = dss.t;
   protected static final int d = 9;
   protected static final ewk e = dez.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ewk f = dez.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ewk g = dez.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ewk h = dez.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ewk i = dez.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ewk j = ewh.a(e, f, h);
   protected static final ewk k = ewh.a(e, g, i);
   protected static final ewk l = ewh.a(e, f, g);
   protected static final ewk m = ewh.a(e, h, i);
   private final cti o;

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public des(cti $$0, dsb.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dsp.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static je a(dbe $$0, iz $$1) {
      dsc $$2 = $$0.a_($$1);
      return $$2.b() instanceof des ? $$2.c(aE) : null;
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.c;
      } else {
         if ($$0.c(b) != dsp.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqu.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iz $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            evr $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dby.a.b);
            return bqu.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xp.c("block.minecraft.bed.occupied"), true);
            }

            return bqu.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqu.a;
         }
      }
   }

   public static boolean a(dby $$0) {
      return $$0.D_().l();
   }

   private boolean a(dby $$0, iz $$1) {
      List<cmk> $$2 = $$0.a(cmk.class, new evm($$1), btp::fL);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fM();
         return true;
      }
   }

   @Override
   public void a(dby $$0, dsc $$1, iz $$2, bsu $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dbe $$0, bsu $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsu $$0) {
      evr $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btp ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dfb.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static je a(dsp $$0, je $$1) {
      return $$0 == dsp.b ? $$1 : $$1.g();
   }

   @Override
   public dsc a(dby $$0, iz $$1, dsc $$2, cmx $$3) {
      if (!$$0.B && $$3.f()) {
         dsp $$4 = $$2.c(b);
         if ($$4 == dsp.b) {
            iz $$5 = $$1.a(a($$4, $$2.c(aE)));
            dsc $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dsp.a) {
               $$0.a($$5, dfb.a.o(), 35);
               $$0.a($$3, 2001, $$5, dez.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      je $$1 = $$0.g();
      iz $$2 = $$0.a();
      iz $$3 = $$2.a($$1);
      dby $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      je $$4 = g($$0).g();
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

   public static je g(dsc $$0) {
      je $$1 = $$0.c(aE);
      return $$0.c(b) == dsp.a ? $$1.g() : $$1;
   }

   public static dhg.a h(dsc $$0) {
      dsp $$1 = $$0.c(b);
      return $$1 == dsp.a ? dhg.a.b : dhg.a.c;
   }

   private static boolean b(dbe $$0, iz $$1) {
      return $$0.a_($$1.d()).b() instanceof des;
   }

   public static Optional<evr> a(bta<?> $$0, dbi $$1, iz $$2, je $$3, float $$4) {
      je $$5 = $$3.h();
      je $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<evr> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<evr> a(bta<?> $$0, dbi $$1, iz $$2, je $$3, je $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<evr> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iz $$7 = $$2.d();
         Optional<evr> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<evr> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<evr> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<evr> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<evr> a(bta<?> $$0, dbi $$1, iz $$2, int[][] $$3, boolean $$4) {
      iz.a $$5 = new iz.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         evr $$7 = coy.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.b;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpd($$0, $$1, this.o);
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, @Nullable btp $$3, cup $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         iz $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dsp.a), 3);
         $$0.b($$1, dfb.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cti b() {
      return this.o;
   }

   @Override
   protected long a(dsc $$0, iz $$1) {
      iz $$2 = $$1.a($$0.c(aE), $$0.c(b) == dsp.a ? 0 : 1);
      return ayz.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   private static int[][] a(je $$0, je $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(je $$0, je $$1) {
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

   private static int[][] a(je $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
