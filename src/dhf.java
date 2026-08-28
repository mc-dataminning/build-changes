import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dhf extends dli implements dke {
   public static final MapCodec<dhf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cum.q.fieldOf("color").forGetter(dhf::b), t()).apply($$0, dhf::new));
   public static final dvq<dvf> b = dvi.bb;
   public static final dvj c = dvi.t;
   protected static final int d = 9;
   protected static final ezq e = dhm.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ezq f = dhm.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ezq g = dhm.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ezq h = dhm.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ezq i = dhm.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ezq j = ezn.a(e, f, h);
   protected static final ezq k = ezn.a(e, g, i);
   protected static final ezq l = ezn.a(e, f, g);
   protected static final ezq m = ezn.a(e, h, i);
   private final cum o;

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public dhf(cum $$0, dur.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dvf.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jk a(ddo $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      return $$2.b() instanceof dhf ? $$2.c(aF) : null;
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if ($$1.B) {
         return brs.b;
      } else {
         if ($$0.c(b) != dvf.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return brs.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jf $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            eyw $$6 = $$2.b();
            $$1.a(null, $$1.ak().a($$6), null, $$6, 5.0F, true, dej.a.b);
            return brs.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xe.c("block.minecraft.bed.occupied"), true);
            }

            return brs.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return brs.b;
         }
      }
   }

   public static boolean a(dej $$0) {
      return $$0.C_().l();
   }

   private boolean a(dej $$0, jf $$1) {
      List<cnk> $$2 = $$0.a(cnk.class, new eyr($$1), bun::fN);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fO();
         return true;
      }
   }

   @Override
   public void a(dej $$0, dus $$1, jf $$2, btr $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(ddo $$0, btr $$1) {
      if ($$1.cc()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(btr $$0) {
      eyw $$1 = $$0.dv();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bun ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aF))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.b(c, $$2.c(c)) : dho.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static jk a(dvf $$0, jk $$1) {
      return $$0 == dvf.b ? $$1 : $$1.g();
   }

   @Override
   public dus a(dej $$0, jf $$1, dus $$2, cnx $$3) {
      if (!$$0.B && $$3.f()) {
         dvf $$4 = $$2.c(b);
         if ($$4 == dvf.b) {
            jf $$5 = $$1.a(a($$4, $$2.c(aF)));
            dus $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dvf.a) {
               $$0.a($$5, dho.a.n(), 35);
               $$0.a($$3, 2001, $$5, dhm.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      jk $$1 = $$0.g();
      jf $$2 = $$0.a();
      jf $$3 = $$2.a($$1);
      dej $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.B_().a($$3) ? this.n().b(aF, $$1) : null;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      jk $$4 = h($$0).g();
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

   public static jk h(dus $$0) {
      jk $$1 = $$0.c(aF);
      return $$0.c(b) == dvf.a ? $$1.g() : $$1;
   }

   public static djt.a i(dus $$0) {
      dvf $$1 = $$0.c(b);
      return $$1 == dvf.a ? djt.a.b : djt.a.c;
   }

   private static boolean b(ddo $$0, jf $$1) {
      return $$0.a_($$1.e()).b() instanceof dhf;
   }

   public static Optional<eyw> a(bty<?> $$0, dds $$1, jf $$2, jk $$3, float $$4) {
      jk $$5 = $$3.h();
      jk $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<eyw> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<eyw> a(bty<?> $$0, dds $$1, jf $$2, jk $$3, jk $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<eyw> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jf $$7 = $$2.e();
         Optional<eyw> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<eyw> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<eyw> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<eyw> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<eyw> a(bty<?> $$0, dds $$1, jf $$2, int[][] $$3, boolean $$4) {
      jf.a $$5 = new jf.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         eyw $$7 = cqa.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.b;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new drr($$0, $$1, this.o);
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, @Nullable bun $$3, cvs $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         jf $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dvf.a), 3);
         $$0.b($$1, dho.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cum b() {
      return this.o;
   }

   @Override
   protected long a(dus $$0, jf $$1) {
      jf $$2 = $$1.a($$0.c(aF), $$0.c(b) == dvf.a ? 0 : 1);
      return azf.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   private static int[][] a(jk $$0, jk $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jk $$0, jk $$1) {
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

   private static int[][] a(jk $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
