import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class deq extends dit implements dhp {
   public static final MapCodec<deq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctg.q.fieldOf("color").forGetter(deq::b), u()).apply($$0, deq::new));
   public static final dsy<dsn> b = dsq.bb;
   public static final dsr c = dsq.t;
   protected static final int d = 9;
   protected static final ewi e = dex.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ewi f = dex.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ewi g = dex.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ewi h = dex.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ewi i = dex.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ewi j = ewf.a(e, f, h);
   protected static final ewi k = ewf.a(e, g, i);
   protected static final ewi l = ewf.a(e, f, g);
   protected static final ewi m = ewf.a(e, h, i);
   private final ctg o;

   @Override
   public MapCodec<deq> a() {
      return a;
   }

   public deq(ctg $$0, drz.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dsn.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static je a(dbc $$0, iz $$1) {
      dsa $$2 = $$0.a_($$1);
      return $$2.b() instanceof deq ? $$2.c(aE) : null;
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.c;
      } else {
         if ($$0.c(b) != dsn.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqs.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iz $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            evp $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dbw.a.b);
            return bqs.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xo.c("block.minecraft.bed.occupied"), true);
            }

            return bqs.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqs.a;
         }
      }
   }

   public static boolean a(dbw $$0) {
      return $$0.D_().l();
   }

   private boolean a(dbw $$0, iz $$1) {
      List<cmi> $$2 = $$0.a(cmi.class, new evk($$1), btn::fL);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fM();
         return true;
      }
   }

   @Override
   public void a(dbw $$0, dsa $$1, iz $$2, bss $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dbc $$0, bss $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bss $$0) {
      evp $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btn ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dez.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static je a(dsn $$0, je $$1) {
      return $$0 == dsn.b ? $$1 : $$1.g();
   }

   @Override
   public dsa a(dbw $$0, iz $$1, dsa $$2, cmv $$3) {
      if (!$$0.B && $$3.f()) {
         dsn $$4 = $$2.c(b);
         if ($$4 == dsn.b) {
            iz $$5 = $$1.a(a($$4, $$2.c(aE)));
            dsa $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dsn.a) {
               $$0.a($$5, dez.a.o(), 35);
               $$0.a($$3, 2001, $$5, dex.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      je $$1 = $$0.g();
      iz $$2 = $$0.a();
      iz $$3 = $$2.a($$1);
      dbw $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
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

   public static je g(dsa $$0) {
      je $$1 = $$0.c(aE);
      return $$0.c(b) == dsn.a ? $$1.g() : $$1;
   }

   public static dhe.a h(dsa $$0) {
      dsn $$1 = $$0.c(b);
      return $$1 == dsn.a ? dhe.a.b : dhe.a.c;
   }

   private static boolean b(dbc $$0, iz $$1) {
      return $$0.a_($$1.d()).b() instanceof deq;
   }

   public static Optional<evp> a(bsy<?> $$0, dbg $$1, iz $$2, je $$3, float $$4) {
      je $$5 = $$3.h();
      je $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<evp> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<evp> a(bsy<?> $$0, dbg $$1, iz $$2, je $$3, je $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<evp> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iz $$7 = $$2.d();
         Optional<evp> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<evp> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<evp> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<evp> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<evp> a(bsy<?> $$0, dbg $$1, iz $$2, int[][] $$3, boolean $$4) {
      iz.a $$5 = new iz.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         evp $$7 = cow.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.b;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpb($$0, $$1, this.o);
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, @Nullable btn $$3, cun $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         iz $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dsn.a), 3);
         $$0.b($$1, dez.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public ctg b() {
      return this.o;
   }

   @Override
   protected long a(dsa $$0, iz $$1) {
      iz $$2 = $$1.a($$0.c(aE), $$0.c(b) == dsn.a ? 0 : 1);
      return ayx.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
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
