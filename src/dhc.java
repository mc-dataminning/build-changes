import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dhc extends dlf implements dkb {
   public static final MapCodec<dhc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuj.q.fieldOf("color").forGetter(dhc::b), u()).apply($$0, dhc::new));
   public static final dvm<dvb> b = dve.bb;
   public static final dvf c = dve.t;
   protected static final int d = 9;
   protected static final ezm e = dhj.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ezm f = dhj.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ezm g = dhj.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ezm h = dhj.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ezm i = dhj.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ezm j = ezj.a(e, f, h);
   protected static final ezm k = ezj.a(e, g, i);
   protected static final ezm l = ezj.a(e, f, g);
   protected static final ezm m = ezj.a(e, h, i);
   private final cuj o;

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   public dhc(cuj $$0, dun.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dvb.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jj a(ddl $$0, je $$1) {
      duo $$2 = $$0.a_($$1);
      return $$2.b() instanceof dhc ? $$2.c(aF) : null;
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if ($$1.B) {
         return brp.b;
      } else {
         if ($$0.c(b) != dvb.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return brp.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            je $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            eys $$6 = $$2.b();
            $$1.a(null, $$1.ak().a($$6), null, $$6, 5.0F, true, deg.a.b);
            return brp.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xd.c("block.minecraft.bed.occupied"), true);
            }

            return brp.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return brp.b;
         }
      }
   }

   public static boolean a(deg $$0) {
      return $$0.B_().l();
   }

   private boolean a(deg $$0, je $$1) {
      List<cnh> $$2 = $$0.a(cnh.class, new eyn($$1), buk::fM);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fN();
         return true;
      }
   }

   @Override
   public void a(deg $$0, duo $$1, je $$2, bto $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(ddl $$0, bto $$1) {
      if ($$1.cc()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bto $$0) {
      eys $$1 = $$0.dv();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof buk ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aF))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.b(c, $$2.c(c)) : dhl.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static jj a(dvb $$0, jj $$1) {
      return $$0 == dvb.b ? $$1 : $$1.g();
   }

   @Override
   public duo a(deg $$0, je $$1, duo $$2, cnu $$3) {
      if (!$$0.B && $$3.f()) {
         dvb $$4 = $$2.c(b);
         if ($$4 == dvb.b) {
            je $$5 = $$1.a(a($$4, $$2.c(aF)));
            duo $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dvb.a) {
               $$0.a($$5, dhl.a.o(), 35);
               $$0.a($$3, 2001, $$5, dhj.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      jj $$1 = $$0.g();
      je $$2 = $$0.a();
      je $$3 = $$2.a($$1);
      deg $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.A_().a($$3) ? this.o().b(aF, $$1) : null;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      jj $$4 = h($$0).g();
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

   public static jj h(duo $$0) {
      jj $$1 = $$0.c(aF);
      return $$0.c(b) == dvb.a ? $$1.g() : $$1;
   }

   public static djq.a i(duo $$0) {
      dvb $$1 = $$0.c(b);
      return $$1 == dvb.a ? djq.a.b : djq.a.c;
   }

   private static boolean b(ddl $$0, je $$1) {
      return $$0.a_($$1.e()).b() instanceof dhc;
   }

   public static Optional<eys> a(btv<?> $$0, ddp $$1, je $$2, jj $$3, float $$4) {
      jj $$5 = $$3.h();
      jj $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<eys> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<eys> a(btv<?> $$0, ddp $$1, je $$2, jj $$3, jj $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<eys> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         je $$7 = $$2.e();
         Optional<eys> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<eys> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<eys> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<eys> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<eys> a(btv<?> $$0, ddp $$1, je $$2, int[][] $$3, boolean $$4) {
      je.a $$5 = new je.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         eys $$7 = cpx.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.b;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dro($$0, $$1, this.o);
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, @Nullable buk $$3, cvp $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         je $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dvb.a), 3);
         $$0.b($$1, dhl.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cuj b() {
      return this.o;
   }

   @Override
   protected long a(duo $$0, je $$1) {
      je $$2 = $$1.a($$0.c(aF), $$0.c(b) == dvb.a ? 0 : 1);
      return azd.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   private static int[][] a(jj $$0, jj $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jj $$0, jj $$1) {
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

   private static int[][] a(jj $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
