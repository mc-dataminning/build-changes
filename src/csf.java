import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class csf extends cwf implements cva {
   public static final dfy<dfn> a = dfq.bb;
   public static final dfr b = dfq.t;
   protected static final int c = 9;
   protected static final ehx d = csm.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int m = 3;
   protected static final ehx e = csm.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ehx f = csm.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ehx g = csm.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ehx h = csm.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ehx i = ehu.a(d, e, g);
   protected static final ehx j = ehu.a(d, f, h);
   protected static final ehx k = ehu.a(d, e, f);
   protected static final ehx l = ehu.a(d, g, h);
   private final chm n;

   public csf(chm $$0, dez.d $$1) {
      super($$1);
      this.n = $$0;
      this.k(this.C.b().a(a, dfn.b).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   public static ha a(cos $$0, gu $$1) {
      dfa $$2 = $$0.a_($$1);
      return $$2.b() instanceof csf ? $$2.c(aC) : null;
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.b;
      } else {
         if ($$0.c(a) != dfn.a) {
            $$2 = $$2.a($$0.c(aC));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bgq.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            gu $$6 = $$2.a($$0.c(aC).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            ehe $$7 = $$2.b();
            $$1.a(null, $$1.ag().a($$7), null, $$7, 5.0F, true, cpm.a.b);
            return bgq.a;
         } else if ($$0.c(b)) {
            if (!this.a($$1, $$2)) {
               $$3.a(tf.c("block.minecraft.bed.occupied"), true);
            }

            return bgq.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bgq.a;
         }
      }
   }

   public static boolean a(cpm $$0) {
      return $$0.x_().l();
   }

   private boolean a(cpm $$0, gu $$1) {
      List<cba> $$2 = $$0.a(cba.class, new egz($$1), biy::fB);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fC();
         return true;
      }
   }

   @Override
   public void a(cpm $$0, dfa $$1, gu $$2, bii $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cos $$0, bii $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bii $$0) {
      ehe $$1 = $$0.dn();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof biy ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$1 == a($$0.c(a), $$0.c(aC))) {
         return $$2.a(this) && $$2.c(a) != $$0.c(a) ? $$0.a(b, $$2.c(b)) : csn.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ha a(dfn $$0, ha $$1) {
      return $$0 == dfn.b ? $$1 : $$1.g();
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, cbn $$3) {
      if (!$$0.B && $$3.f()) {
         dfn $$4 = $$2.c(a);
         if ($$4 == dfn.b) {
            gu $$5 = $$1.a(a($$4, $$2.c(aC)));
            dfa $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(a) == dfn.a) {
               $$0.a($$5, csn.a.n(), 35);
               $$0.a($$3, 2001, $$5, csm.i($$6));
            }
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      ha $$1 = $$0.g();
      gu $$2 = $$0.a();
      gu $$3 = $$2.a($$1);
      cpm $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.w_().a($$3) ? this.n().a(aC, $$1) : null;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      ha $$4 = g($$0).g();
      switch ($$4) {
         case c:
            return i;
         case d:
            return j;
         case e:
            return k;
         default:
            return l;
      }
   }

   public static ha g(dfa $$0) {
      ha $$1 = $$0.c(aC);
      return $$0.c(a) == dfn.a ? $$1.g() : $$1;
   }

   public static cup.a h(dfa $$0) {
      dfn $$1 = $$0.c(a);
      return $$1 == dfn.a ? cup.a.b : cup.a.c;
   }

   private static boolean b(cos $$0, gu $$1) {
      return $$0.a_($$1.d()).b() instanceof csf;
   }

   public static Optional<ehe> a(bim<?> $$0, cow $$1, gu $$2, ha $$3, float $$4) {
      ha $$5 = $$3.h();
      ha $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ehe> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ehe> a(bim<?> $$0, cow $$1, gu $$2, ha $$3, ha $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ehe> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         gu $$7 = $$2.d();
         Optional<ehe> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ehe> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ehe> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ehe> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ehe> a(bim<?> $$0, cow $$1, gu $$2, int[][] $$3, boolean $$4) {
      gu.a $$5 = new gu.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ehe $$7 = cdj.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.b;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(aC, a, b);
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dci($$0, $$1, this.n);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, @Nullable biy $$3, ciy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         gu $$5 = $$1.a($$2.c(aC));
         $$0.a($$5, $$2.a(a, dfn.a), 3);
         $$0.b($$1, csn.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public chm a() {
      return this.n;
   }

   @Override
   public long a(dfa $$0, gu $$1) {
      gu $$2 = $$1.a($$0.c(aC), $$0.c(a) == dfn.a ? 0 : 1);
      return arp.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   private static int[][] a(ha $$0, ha $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ha $$0, ha $$1) {
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

   private static int[][] a(ha $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
