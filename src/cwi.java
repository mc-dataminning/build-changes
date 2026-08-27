import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cwi extends dak implements czh {
   public static final MapCodec<cwi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cll.q.fieldOf("color").forGetter(cwi::b), u()).apply($$0, cwi::new));
   public static final dke<djt> b = djw.bb;
   public static final djx c = djw.t;
   protected static final int d = 9;
   protected static final eml e = cwp.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final eml f = cwp.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eml g = cwp.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eml h = cwp.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eml i = cwp.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eml j = emi.a(e, f, h);
   protected static final eml k = emi.a(e, g, i);
   protected static final eml l = emi.a(e, f, g);
   protected static final eml m = emi.a(e, h, i);
   private final cll o;

   @Override
   public MapCodec<cwi> a() {
      return a;
   }

   public cwi(cll $$0, djf.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, djt.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ic a(csu $$0, hx $$1) {
      djg $$2 = $$0.a_($$1);
      return $$2.b() instanceof cwi ? $$2.c(aE) : null;
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.b;
      } else {
         if ($$0.c(b) != djt.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bka.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            hx $$6 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            els $$7 = $$2.b();
            $$1.a(null, $$1.ai().a($$7), null, $$7, 5.0F, true, cto.a.b);
            return bka.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(vf.c("block.minecraft.bed.occupied"), true);
            }

            return bka.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bka.a;
         }
      }
   }

   public static boolean a(cto $$0) {
      return $$0.E_().l();
   }

   private boolean a(cto $$0, hx $$1) {
      List<ceu> $$2 = $$0.a(ceu.class, new eln($$1), bmk::fD);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fE();
         return true;
      }
   }

   @Override
   public void a(cto $$0, djg $$1, hx $$2, blu $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(csu $$0, blu $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(blu $$0) {
      els $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bmk ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cwr.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ic a(djt $$0, ic $$1) {
      return $$0 == djt.b ? $$1 : $$1.g();
   }

   @Override
   public djg a(cto $$0, hx $$1, djg $$2, cfh $$3) {
      if (!$$0.B && $$3.f()) {
         djt $$4 = $$2.c(b);
         if ($$4 == djt.b) {
            hx $$5 = $$1.a(a($$4, $$2.c(aE)));
            djg $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == djt.a) {
               $$0.a($$5, cwr.a.o(), 35);
               $$0.a($$3, 2001, $$5, cwp.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      ic $$1 = $$0.g();
      hx $$2 = $$0.a();
      hx $$3 = $$2.a($$1);
      cto $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.D_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      ic $$4 = g($$0).g();
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

   public static ic g(djg $$0) {
      ic $$1 = $$0.c(aE);
      return $$0.c(b) == djt.a ? $$1.g() : $$1;
   }

   public static cyw.a h(djg $$0) {
      djt $$1 = $$0.c(b);
      return $$1 == djt.a ? cyw.a.b : cyw.a.c;
   }

   private static boolean b(csu $$0, hx $$1) {
      return $$0.a_($$1.d()).b() instanceof cwi;
   }

   public static Optional<els> a(bly<?> $$0, csy $$1, hx $$2, ic $$3, float $$4) {
      ic $$5 = $$3.h();
      ic $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<els> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<els> a(bly<?> $$0, csy $$1, hx $$2, ic $$3, ic $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<els> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         hx $$7 = $$2.d();
         Optional<els> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<els> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<els> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<els> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<els> a(bly<?> $$0, csy $$1, hx $$2, int[][] $$3, boolean $$4) {
      hx.a $$5 = new hx.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         els $$7 = che.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.b;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dgq($$0, $$1, this.o);
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, @Nullable bmk $$3, cmx $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         hx $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, djt.a), 3);
         $$0.b($$1, cwr.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cll b() {
      return this.o;
   }

   @Override
   public long a(djg $$0, hx $$1) {
      hx $$2 = $$1.a($$0.c(aE), $$0.c(b) == djt.a ? 0 : 1);
      return aun.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   private static int[][] a(ic $$0, ic $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ic $$0, ic $$1) {
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

   private static int[][] a(ic $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
