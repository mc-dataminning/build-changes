import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class deu extends djc implements dhw {
   public static final MapCodec<deu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csy.q.fieldOf("color").forGetter(deu::b), u()).apply($$0, deu::new));
   public static final dua<dtp> b = dts.bb;
   public static final dtt c = dts.t;
   protected static final int d = 9;
   protected static final exn e = dfc.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final exn f = dfc.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final exn g = dfc.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final exn h = dfc.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final exn i = dfc.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final exn j = exk.a(e, f, h);
   protected static final exn k = exk.a(e, g, i);
   protected static final exn l = exk.a(e, f, g);
   protected static final exn m = exk.a(e, h, i);
   private final csy o;

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public deu(csy $$0, dtb.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dtp.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static iw a(dbg $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      return $$2.b() instanceof deu ? $$2.c(aE) : null;
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.b;
      } else {
         if ($$0.c(b) != dtp.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqa.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ir $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ewu $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dca.a.b);
            return bqa.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xe.c("block.minecraft.bed.occupied"), true);
            }

            return bqa.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqa.a;
         }
      }
   }

   public static boolean a(dca $$0) {
      return $$0.E_().l();
   }

   private boolean a(dca $$0, ir $$1) {
      List<cll> $$2 = $$0.a(cll.class, new ewp($$1), bso::fU);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fV();
         return true;
      }
   }

   @Override
   public void a(dca $$0, dtc $$1, ir $$2, brv $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dbg $$0, brv $$1) {
      if ($$1.cc()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(brv $$0) {
      ewu $$1 = $$0.dx();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bso ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dfe.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static iw a(dtp $$0, iw $$1) {
      return $$0 == dtp.b ? $$1 : $$1.g();
   }

   @Override
   public dtc a(dca $$0, ir $$1, dtc $$2, cly $$3) {
      if (!$$0.C && $$3.f()) {
         dtp $$4 = $$2.c(b);
         if ($$4 == dtp.b) {
            ir $$5 = $$1.a(a($$4, $$2.c(aE)));
            dtc $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dtp.a) {
               $$0.a($$5, dfe.a.n(), 35);
               $$0.a($$3, 2001, $$5, dfc.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      iw $$1 = $$0.g();
      ir $$2 = $$0.a();
      ir $$3 = $$2.a($$1);
      dca $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.D_().a($$3) ? this.n().a(aE, $$1) : null;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      iw $$4 = g($$0).g();
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

   public static iw g(dtc $$0) {
      iw $$1 = $$0.c(aE);
      return $$0.c(b) == dtp.a ? $$1.g() : $$1;
   }

   public static dhk.a h(dtc $$0) {
      dtp $$1 = $$0.c(b);
      return $$1 == dtp.a ? dhk.a.b : dhk.a.c;
   }

   private static boolean b(dbg $$0, ir $$1) {
      return $$0.a_($$1.d()).b() instanceof deu;
   }

   public static Optional<ewu> a(bsb<?> $$0, dbk $$1, ir $$2, iw $$3, float $$4) {
      iw $$5 = $$3.h();
      iw $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ewu> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ewu> a(bsb<?> $$0, dbk $$1, ir $$2, iw $$3, iw $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ewu> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ir $$7 = $$2.d();
         Optional<ewu> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ewu> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ewu> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ewu> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ewu> a(bsb<?> $$0, dbk $$1, ir $$2, int[][] $$3, boolean $$4) {
      ir.a $$5 = new ir.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ewu $$7 = cob.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.b;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dpx($$0, $$1, this.o);
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, @Nullable bso $$3, cuh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         ir $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dtp.a), 3);
         $$0.b($$1, dfe.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public csy b() {
      return this.o;
   }

   @Override
   protected long a(dtc $$0, ir $$1) {
      ir $$2 = $$1.a($$0.c(aE), $$0.c(b) == dtp.a ? 0 : 1);
      return aym.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   private static int[][] a(iw $$0, iw $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(iw $$0, iw $$1) {
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

   private static int[][] a(iw $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
