import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cwc extends dae implements czb {
   public static final MapCodec<cwc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clf.q.fieldOf("color").forGetter(cwc::b), u()).apply($$0, cwc::new));
   public static final djy<djn> b = djq.bb;
   public static final djr c = djq.t;
   protected static final int d = 9;
   protected static final emf e = cwj.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final emf f = cwj.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final emf g = cwj.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final emf h = cwj.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final emf i = cwj.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final emf j = emc.a(e, f, h);
   protected static final emf k = emc.a(e, g, i);
   protected static final emf l = emc.a(e, f, g);
   protected static final emf m = emc.a(e, h, i);
   private final clf o;

   @Override
   public MapCodec<cwc> a() {
      return a;
   }

   public cwc(clf $$0, diz.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, djn.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ic a(cso $$0, hx $$1) {
      dja $$2 = $$0.a_($$1);
      return $$2.b() instanceof cwc ? $$2.c(aE) : null;
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.b;
      } else {
         if ($$0.c(b) != djn.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bjv.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            hx $$6 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            elm $$7 = $$2.b();
            $$1.a(null, $$1.ai().a($$7), null, $$7, 5.0F, true, cti.a.b);
            return bjv.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(vd.c("block.minecraft.bed.occupied"), true);
            }

            return bjv.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bjv.a;
         }
      }
   }

   public static boolean a(cti $$0) {
      return $$0.E_().l();
   }

   private boolean a(cti $$0, hx $$1) {
      List<ceo> $$2 = $$0.a(ceo.class, new elh($$1), bmf::fD);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fE();
         return true;
      }
   }

   @Override
   public void a(cti $$0, dja $$1, hx $$2, blp $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cso $$0, blp $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(blp $$0) {
      elm $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bmf ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cwl.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ic a(djn $$0, ic $$1) {
      return $$0 == djn.b ? $$1 : $$1.g();
   }

   @Override
   public dja a(cti $$0, hx $$1, dja $$2, cfb $$3) {
      if (!$$0.B && $$3.f()) {
         djn $$4 = $$2.c(b);
         if ($$4 == djn.b) {
            hx $$5 = $$1.a(a($$4, $$2.c(aE)));
            dja $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == djn.a) {
               $$0.a($$5, cwl.a.o(), 35);
               $$0.a($$3, 2001, $$5, cwj.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      ic $$1 = $$0.g();
      hx $$2 = $$0.a();
      hx $$3 = $$2.a($$1);
      cti $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.D_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
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

   public static ic g(dja $$0) {
      ic $$1 = $$0.c(aE);
      return $$0.c(b) == djn.a ? $$1.g() : $$1;
   }

   public static cyq.a h(dja $$0) {
      djn $$1 = $$0.c(b);
      return $$1 == djn.a ? cyq.a.b : cyq.a.c;
   }

   private static boolean b(cso $$0, hx $$1) {
      return $$0.a_($$1.d()).b() instanceof cwc;
   }

   public static Optional<elm> a(blt<?> $$0, css $$1, hx $$2, ic $$3, float $$4) {
      ic $$5 = $$3.h();
      ic $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<elm> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<elm> a(blt<?> $$0, css $$1, hx $$2, ic $$3, ic $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<elm> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         hx $$7 = $$2.d();
         Optional<elm> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<elm> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<elm> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<elm> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<elm> a(blt<?> $$0, css $$1, hx $$2, int[][] $$3, boolean $$4) {
      hx.a $$5 = new hx.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         elm $$7 = cgy.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public dco b_(dja $$0) {
      return dco.b;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dgk($$0, $$1, this.o);
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, @Nullable bmf $$3, cmr $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         hx $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, djn.a), 3);
         $$0.b($$1, cwl.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public clf b() {
      return this.o;
   }

   @Override
   public long a(dja $$0, hx $$1) {
      hx $$2 = $$1.a($$0.c(aE), $$0.c(b) == djn.a ? 0 : 1);
      return aui.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
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
