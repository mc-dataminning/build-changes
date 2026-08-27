import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class ctt extends cxu implements cwq {
   public static final MapCodec<ctt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cix.q.fieldOf("color").forGetter(ctt::b), t()).apply($$0, ctt::new));
   public static final dgz<dgo> b = dgr.bb;
   public static final dgs c = dgr.t;
   protected static final int d = 9;
   protected static final eiy e = cua.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final eiy f = cua.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eiy g = cua.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eiy h = cua.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eiy i = cua.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eiy j = eiv.a(e, f, h);
   protected static final eiy k = eiv.a(e, g, i);
   protected static final eiy l = eiv.a(e, f, g);
   protected static final eiy m = eiv.a(e, h, i);
   private final cix o;

   @Override
   public MapCodec<ctt> a() {
      return a;
   }

   public ctt(cix $$0, dga.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dgo.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static hx a(cqf $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      return $$2.b() instanceof ctt ? $$2.c(aE) : null;
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.b;
      } else {
         if ($$0.c(b) != dgo.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bib.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ht $$6 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            eif $$7 = $$2.b();
            $$1.a(null, $$1.ag().a($$7), null, $$7, 5.0F, true, cqz.a.b);
            return bib.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(ui.c("block.minecraft.bed.occupied"), true);
            }

            return bib.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bib.a;
         }
      }
   }

   public static boolean a(cqz $$0) {
      return $$0.D_().l();
   }

   private boolean a(cqz $$0, ht $$1) {
      List<cck> $$2 = $$0.a(cck.class, new eia($$1), bkj::fD);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fE();
         return true;
      }
   }

   @Override
   public void a(cqz $$0, dgb $$1, ht $$2, bjt $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cqf $$0, bjt $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bjt $$0) {
      eif $$1 = $$0.do();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bkj ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cuc.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static hx a(dgo $$0, hx $$1) {
      return $$0 == dgo.b ? $$1 : $$1.g();
   }

   @Override
   public dgb a(cqz $$0, ht $$1, dgb $$2, ccx $$3) {
      if (!$$0.B && $$3.f()) {
         dgo $$4 = $$2.c(b);
         if ($$4 == dgo.b) {
            ht $$5 = $$1.a(a($$4, $$2.c(aE)));
            dgb $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dgo.a) {
               $$0.a($$5, cuc.a.o(), 35);
               $$0.a($$3, 2001, $$5, cua.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      hx $$1 = $$0.g();
      ht $$2 = $$0.a();
      ht $$3 = $$2.a($$1);
      cqz $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      hx $$4 = g($$0).g();
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

   public static hx g(dgb $$0) {
      hx $$1 = $$0.c(aE);
      return $$0.c(b) == dgo.a ? $$1.g() : $$1;
   }

   public static cwf.a h(dgb $$0) {
      dgo $$1 = $$0.c(b);
      return $$1 == dgo.a ? cwf.a.b : cwf.a.c;
   }

   private static boolean b(cqf $$0, ht $$1) {
      return $$0.a_($$1.d()).b() instanceof ctt;
   }

   public static Optional<eif> a(bjx<?> $$0, cqj $$1, ht $$2, hx $$3, float $$4) {
      hx $$5 = $$3.h();
      hx $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<eif> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<eif> a(bjx<?> $$0, cqj $$1, ht $$2, hx $$3, hx $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<eif> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ht $$7 = $$2.d();
         Optional<eif> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<eif> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<eif> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<eif> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<eif> a(bjx<?> $$0, cqj $$1, ht $$2, int[][] $$3, boolean $$4) {
      ht.a $$5 = new ht.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         eif $$7 = cet.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.b;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new ddt($$0, $$1, this.o);
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, @Nullable bkj $$3, ckj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         ht $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dgo.a), 3);
         $$0.b($$1, cuc.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cix b() {
      return this.o;
   }

   @Override
   public long a(dgb $$0, ht $$1) {
      ht $$2 = $$1.a($$0.c(aE), $$0.c(b) == dgo.a ? 0 : 1);
      return asy.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   private static int[][] a(hx $$0, hx $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(hx $$0, hx $$1) {
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

   private static int[][] a(hx $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
