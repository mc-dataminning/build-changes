import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dey extends djb implements dhx {
   public static final MapCodec<dey> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cst.q.fieldOf("color").forGetter(dey::b), u()).apply($$0, dey::new));
   public static final dtf<dsu> b = dsx.bb;
   public static final dsy c = dsx.t;
   protected static final int d = 9;
   protected static final ews e = dff.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ews f = dff.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ews g = dff.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ews h = dff.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ews i = dff.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ews j = ewp.a(e, f, h);
   protected static final ews k = ewp.a(e, g, i);
   protected static final ews l = ewp.a(e, f, g);
   protected static final ews m = ewp.a(e, h, i);
   private final cst o;

   @Override
   public MapCodec<dey> a() {
      return a;
   }

   public dey(cst $$0, dsg.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dsu.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jf a(dbj $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      return $$2.b() instanceof dey ? $$2.c(aE) : null;
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.c;
      } else {
         if ($$0.c(b) != dsu.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqd.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ja $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            evz $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dcd.a.b);
            return bqd.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wu.c("block.minecraft.bed.occupied"), true);
            }

            return bqd.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqd.a;
         }
      }
   }

   public static boolean a(dcd $$0) {
      return $$0.D_().l();
   }

   private boolean a(dcd $$0, ja $$1) {
      List<clu> $$2 = $$0.a(clu.class, new evu($$1), bsy::fH);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fI();
         return true;
      }
   }

   @Override
   public void a(dcd $$0, dsh $$1, ja $$2, bsd $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dbj $$0, bsd $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsd $$0) {
      evz $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bsy ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dfh.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static jf a(dsu $$0, jf $$1) {
      return $$0 == dsu.b ? $$1 : $$1.g();
   }

   @Override
   public dsh a(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      if (!$$0.B && $$3.f()) {
         dsu $$4 = $$2.c(b);
         if ($$4 == dsu.b) {
            ja $$5 = $$1.a(a($$4, $$2.c(aE)));
            dsh $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dsu.a) {
               $$0.a($$5, dfh.a.o(), 35);
               $$0.a($$3, 2001, $$5, dff.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      jf $$1 = $$0.g();
      ja $$2 = $$0.a();
      ja $$3 = $$2.a($$1);
      dcd $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      jf $$4 = g($$0).g();
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

   public static jf g(dsh $$0) {
      jf $$1 = $$0.c(aE);
      return $$0.c(b) == dsu.a ? $$1.g() : $$1;
   }

   public static dhm.a h(dsh $$0) {
      dsu $$1 = $$0.c(b);
      return $$1 == dsu.a ? dhm.a.b : dhm.a.c;
   }

   private static boolean b(dbj $$0, ja $$1) {
      return $$0.a_($$1.d()).b() instanceof dey;
   }

   public static Optional<evz> a(bsj<?> $$0, dbn $$1, ja $$2, jf $$3, float $$4) {
      jf $$5 = $$3.h();
      jf $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<evz> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<evz> a(bsj<?> $$0, dbn $$1, ja $$2, jf $$3, jf $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<evz> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ja $$7 = $$2.d();
         Optional<evz> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<evz> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<evz> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<evz> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<evz> a(bsj<?> $$0, dbn $$1, ja $$2, int[][] $$3, boolean $$4) {
      ja.a $$5 = new ja.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         evz $$7 = coh.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.b;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpj($$0, $$1, this.o);
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, @Nullable bsy $$3, cua $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         ja $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dsu.a), 3);
         $$0.b($$1, dfh.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cst b() {
      return this.o;
   }

   @Override
   protected long a(dsh $$0, ja $$1) {
      ja $$2 = $$1.a($$0.c(aE), $$0.c(b) == dsu.a ? 0 : 1);
      return aye.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   private static int[][] a(jf $$0, jf $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jf $$0, jf $$1) {
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

   private static int[][] a(jf $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
