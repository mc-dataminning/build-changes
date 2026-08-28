import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class dxo extends dmr {
   public static final MapCodec<dxo> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), t()).apply($$0, dxo::new)
   );
   public static final dym c = dyl.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final fcs h = dkm.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final fcs i = dkm.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcs j = dkm.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final fcs k = dkm.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final fcs l = dkm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final fcs m = dkm.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dxo> a() {
      return b;
   }

   public dxo(boolean $$0, dxu.d $$1) {
      super($$1);
      this.l(this.F.b().b(a, jm.c).b(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      if ($$0.c(c)) {
         switch ((jm)$$0.c(a)) {
            case a:
               return m;
            case b:
            default:
               return l;
            case c:
               return k;
            case d:
               return j;
            case e:
               return i;
            case f:
               return h;
         }
      } else {
         return fcp.b();
      }
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bwg $$3, cxp $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(dhi $$0, jh $$1, dxv $$2) {
      jm $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dxs($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         jh $$5 = $$1.a($$3, 2);
         dxv $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dko.bX) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dxr $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.ac() == $$9.u() || ((ash)$$0).d())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dia $$0, jh $$1, jm $$2) {
      for (jm $$3 : jm.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jm.a)) {
         return true;
      } else {
         jh $$4 = $$1.d();

         for (jm $$5 : jm.values()) {
            if ($$5 != jm.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dxv $$0, dhi $$1, jh $$2, int $$3, int $$4) {
      jm $$5 = $$0.c(a);
      dxv $$6 = $$0.b(c, Boolean.valueOf(true));
      if (!$$1.C) {
         boolean $$7 = this.a($$1, $$2, $$5);
         if ($$7 && ($$3 == 1 || $$3 == 2)) {
            $$1.a($$2, $$6, 2);
            return false;
         }

         if (!$$7 && $$3 == 0) {
            return false;
         }
      }

      if ($$3 == 0) {
         if (!this.a($$1, $$2, $$5, true)) {
            return false;
         }

         $$1.a($$2, $$6, 67);
         $$1.a(null, $$2, axf.uu, axg.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(ecr.a, $$2, ecr.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dux $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dxr) {
            ((dxr)$$8).k();
         }

         dxv $$9 = dko.bX.m().b(dxn.b, $$5).b(dxn.c, this.n ? dyw.b : dyw.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dxn.a($$2, $$9, this.m().b(a, jm.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            jh $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dxv $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dko.bX) && $$1.c_($$10) instanceof dxr $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != euc.a && !$$11.a(dko.bF) && !$$11.a(dko.by)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, axf.ut, axg.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(ecr.e, $$2, ecr.a.a($$9));
      }

      return true;
   }

   public static boolean a(dxv $$0, dhi $$1, jh $$2, jm $$3, boolean $$4, jm $$5) {
      if ($$2.v() < $$1.L_() || $$2.v() > $$1.am() || !$$1.F_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dko.cv) || $$0.a(dko.pF) || $$0.a(dko.pG) || $$0.a(dko.tJ)) {
         return false;
      } else if ($$3 == jm.a && $$2.v() == $$1.L_()) {
         return false;
      } else if ($$3 == jm.b && $$2.v() == $$1.am()) {
         return false;
      } else {
         if (!$$0.a(dko.bF) && !$$0.a(dko.by)) {
            if ($$0.e($$1, $$2) == -1.0F) {
               return false;
            }

            switch ($$0.r()) {
               case c:
                  return false;
               case b:
                  return $$4;
               case e:
                  return $$3 == $$5;
            }
         } else if ($$0.c(c)) {
            return false;
         }

         return !$$0.x();
      }
   }

   private boolean a(dhi $$0, jh $$1, jm $$2, boolean $$3) {
      jh $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dko.bG)) {
         $$0.a($$4, dko.a.m(), 20);
      }

      dxs $$5 = new dxs($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<jh, dxv> $$6 = Maps.newHashMap();
         List<jh> $$7 = $$5.c();
         List<dxv> $$8 = Lists.newArrayList();

         for (jh $$9 : $$7) {
            dxv $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<jh> $$11 = $$5.d();
         dxv[] $$12 = new dxv[$$7.size() + $$11.size()];
         jm $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            jh $$16 = $$11.get($$15);
            dxv $$17 = $$0.a_($$16);
            dux $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dko.a.m(), 18);
            $$0.a(ecr.f, $$16, ecr.a.a($$17));
            if (!$$17.a(axu.aN)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            jh $$20 = $$7.get($$19);
            dxv $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dxv $$22 = dko.bX.m().b(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dxn.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dyw $$23 = this.n ? dyw.b : dyw.a;
            dxv $$24 = dko.bG.m().b(dxp.a, $$2).b(dxp.c, $$23);
            dxv $$25 = dko.bX.m().b(dxn.b, $$2).b(dxn.c, this.n ? dyw.b : dyw.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dxn.a($$4, $$25, $$24, $$2, true, true));
         }

         dxv $$26 = dko.a.m();

         for (jh $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<jh, dxv> $$28 : $$6.entrySet()) {
            jh $$29 = $$28.getKey();
            dxv $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         evf $$31 = evb.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            dxv $$33 = $$12[$$14++];
            jh $$34 = $$11.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$35 = $$7.size() - 1; $$35 >= 0; $$35--) {
            $$0.a($$7.get($$35), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dko.bG, $$31);
         }

         return true;
      }
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dxv $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
