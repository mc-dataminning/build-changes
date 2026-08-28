import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dgo extends dkr implements djn {
   public static final MapCodec<dgo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cue.q.fieldOf("color").forGetter(dgo::b), u()).apply($$0, dgo::new));
   public static final duy<dun> b = duq.bb;
   public static final dur c = duq.t;
   protected static final int d = 9;
   protected static final eyx e = dgv.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final eyx f = dgv.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eyx g = dgv.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eyx h = dgv.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eyx i = dgv.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eyx j = eyu.a(e, f, h);
   protected static final eyx k = eyu.a(e, g, i);
   protected static final eyx l = eyu.a(e, f, g);
   protected static final eyx m = eyu.a(e, h, i);
   private final cue o;

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   public dgo(cue $$0, dtz.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.E.b().b(b, dun.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jj a(dcx $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      return $$2.b() instanceof dgo ? $$2.c(aE) : null;
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if ($$1.B) {
         return brk.b;
      } else {
         if ($$0.c(b) != dun.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return brk.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            je $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            eye $$6 = $$2.b();
            $$1.a(null, $$1.ak().a($$6), null, $$6, 5.0F, true, dds.a.b);
            return brk.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xd.c("block.minecraft.bed.occupied"), true);
            }

            return brk.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return brk.b;
         }
      }
   }

   public static boolean a(dds $$0) {
      return $$0.B_().l();
   }

   private boolean a(dds $$0, je $$1) {
      List<cnc> $$2 = $$0.a(cnc.class, new exz($$1), buf::fL);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fM();
         return true;
      }
   }

   @Override
   public void a(dds $$0, dua $$1, je $$2, btj $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dcx $$0, btj $$1) {
      if ($$1.cc()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(btj $$0) {
      eye $$1 = $$0.dv();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof buf ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.b(c, $$2.c(c)) : dgx.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static jj a(dun $$0, jj $$1) {
      return $$0 == dun.b ? $$1 : $$1.g();
   }

   @Override
   public dua a(dds $$0, je $$1, dua $$2, cnp $$3) {
      if (!$$0.B && $$3.f()) {
         dun $$4 = $$2.c(b);
         if ($$4 == dun.b) {
            je $$5 = $$1.a(a($$4, $$2.c(aE)));
            dua $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dun.a) {
               $$0.a($$5, dgx.a.o(), 35);
               $$0.a($$3, 2001, $$5, dgv.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      jj $$1 = $$0.g();
      je $$2 = $$0.a();
      je $$3 = $$2.a($$1);
      dds $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.A_().a($$3) ? this.o().b(aE, $$1) : null;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
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

   public static jj h(dua $$0) {
      jj $$1 = $$0.c(aE);
      return $$0.c(b) == dun.a ? $$1.g() : $$1;
   }

   public static djc.a i(dua $$0) {
      dun $$1 = $$0.c(b);
      return $$1 == dun.a ? djc.a.b : djc.a.c;
   }

   private static boolean b(dcx $$0, je $$1) {
      return $$0.a_($$1.e()).b() instanceof dgo;
   }

   public static Optional<eye> a(btq<?> $$0, ddb $$1, je $$2, jj $$3, float $$4) {
      jj $$5 = $$3.h();
      jj $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<eye> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<eye> a(btq<?> $$0, ddb $$1, je $$2, jj $$3, jj $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<eye> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         je $$7 = $$2.e();
         Optional<eye> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<eye> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<eye> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<eye> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<eye> a(btq<?> $$0, ddb $$1, je $$2, int[][] $$3, boolean $$4) {
      je.a $$5 = new je.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         eye $$7 = cpr.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.b;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dra($$0, $$1, this.o);
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, @Nullable buf $$3, cvl $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         je $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.b(b, dun.a), 3);
         $$0.b($$1, dgx.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cue b() {
      return this.o;
   }

   @Override
   protected long a(dua $$0, je $$1) {
      je $$2 = $$1.a($$0.c(aE), $$0.c(b) == dun.a ? 0 : 1);
      return azc.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
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
