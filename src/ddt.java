import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class ddt extends dhw implements dgs {
   public static final MapCodec<ddt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csj.q.fieldOf("color").forGetter(ddt::b), u()).apply($$0, ddt::new));
   public static final dsb<drq> b = drt.bb;
   public static final dru c = drt.t;
   protected static final int d = 9;
   protected static final evf e = dea.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final evf f = dea.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final evf g = dea.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final evf h = dea.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final evf i = dea.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final evf j = evc.a(e, f, h);
   protected static final evf k = evc.a(e, g, i);
   protected static final evf l = evc.a(e, f, g);
   protected static final evf m = evc.a(e, h, i);
   private final csj o;

   @Override
   public MapCodec<ddt> a() {
      return a;
   }

   public ddt(csj $$0, drc.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, drq.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static it a(daf $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      return $$2.b() instanceof ddt ? $$2.c(aE) : null;
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.b;
      } else {
         if ($$0.c(b) != drq.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bpw.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            io $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            eum $$6 = $$2.b();
            $$1.a(null, $$1.ai().a($$6), null, $$6, 5.0F, true, daz.a.b);
            return bpw.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wx.c("block.minecraft.bed.occupied"), true);
            }

            return bpw.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bpw.a;
         }
      }
   }

   public static boolean a(daz $$0) {
      return $$0.D_().l();
   }

   private boolean a(daz $$0, io $$1) {
      List<cll> $$2 = $$0.a(cll.class, new euh($$1), bsq::fL);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fM();
         return true;
      }
   }

   @Override
   public void a(daz $$0, drd $$1, io $$2, brw $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(daf $$0, brw $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(brw $$0) {
      eum $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bsq ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dec.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static it a(drq $$0, it $$1) {
      return $$0 == drq.b ? $$1 : $$1.g();
   }

   @Override
   public drd a(daz $$0, io $$1, drd $$2, cly $$3) {
      if (!$$0.B && $$3.f()) {
         drq $$4 = $$2.c(b);
         if ($$4 == drq.b) {
            io $$5 = $$1.a(a($$4, $$2.c(aE)));
            drd $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == drq.a) {
               $$0.a($$5, dec.a.n(), 35);
               $$0.a($$3, 2001, $$5, dea.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      it $$1 = $$0.g();
      io $$2 = $$0.a();
      io $$3 = $$2.a($$1);
      daz $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.n().a(aE, $$1) : null;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      it $$4 = g($$0).g();
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

   public static it g(drd $$0) {
      it $$1 = $$0.c(aE);
      return $$0.c(b) == drq.a ? $$1.g() : $$1;
   }

   public static dgh.a h(drd $$0) {
      drq $$1 = $$0.c(b);
      return $$1 == drq.a ? dgh.a.b : dgh.a.c;
   }

   private static boolean b(daf $$0, io $$1) {
      return $$0.a_($$1.d()).b() instanceof ddt;
   }

   public static Optional<eum> a(bsc<?> $$0, daj $$1, io $$2, it $$3, float $$4) {
      it $$5 = $$3.h();
      it $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<eum> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<eum> a(bsc<?> $$0, daj $$1, io $$2, it $$3, it $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<eum> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         io $$7 = $$2.d();
         Optional<eum> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<eum> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<eum> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<eum> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<eum> a(bsc<?> $$0, daj $$1, io $$2, int[][] $$3, boolean $$4) {
      io.a $$5 = new io.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         eum $$7 = cny.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.b;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new doe($$0, $$1, this.o);
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, @Nullable bsq $$3, ctq $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         io $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, drq.a), 3);
         $$0.b($$1, dec.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public csj b() {
      return this.o;
   }

   @Override
   protected long a(drd $$0, io $$1) {
      io $$2 = $$1.a($$0.c(aE), $$0.c(b) == drq.a ? 0 : 1);
      return ayf.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   private static int[][] a(it $$0, it $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(it $$0, it $$1) {
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

   private static int[][] a(it $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
