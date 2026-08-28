import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class dxj extends dmi {
   public static final MapCodec<dxj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.i), t()).apply($$0, dxj::new)
   );
   public static final dyh c = dyg.j;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final int g = 4;
   private static final Map<jn, fcr> h = fco.d(dke.c(16.0, 4.0, 16.0));
   private final boolean i;

   @Override
   public MapCodec<dxj> a() {
      return b;
   }

   public dxj(boolean $$0, dxp.d $$1) {
      super($$1);
      this.l(this.B.b().b(a, jn.c).b(c, Boolean.valueOf(false)));
      this.i = $$0;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return $$0.c(c) ? h.get($$0.c(a)) : fco.b();
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bvy $$3, cxh $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(dgz $$0, ji $$1, dxq $$2) {
      jn $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dxn($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         ji $$5 = $$1.a($$3, 2);
         dxq $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dkg.bX) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dxm $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.ae() == $$9.t() || ((ard)$$0).d())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dhr $$0, ji $$1, jn $$2) {
      for (jn $$3 : jn.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jn.a)) {
         return true;
      } else {
         ji $$4 = $$1.d();

         for (jn $$5 : jn.values()) {
            if ($$5 != jn.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dxq $$0, dgz $$1, ji $$2, int $$3, int $$4) {
      jn $$5 = $$0.c(a);
      dxq $$6 = $$0.b(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, awa.uK, awb.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(ecp.a, $$2, ecp.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dus $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dxm) {
            ((dxm)$$8).k();
         }

         dxq $$9 = dkg.bX.m().b(dxi.b, $$5).b(dxi.c, this.i ? dys.b : dys.a);
         $$1.a($$2, $$9, 276);
         $$1.a(dxi.a($$2, $$9, this.m().b(a, jn.a($$4 & 7)), $$5, false, true));
         $$1.a($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.i) {
            ji $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dxq $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dkg.bX) && $$1.c_($$10) instanceof dxm $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != eub.a && !$$11.a(dkg.bF) && !$$11.a(dkg.by)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awa.uJ, awb.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(ecp.e, $$2, ecp.a.a($$9));
      }

      return true;
   }

   public static boolean a(dxq $$0, dgz $$1, ji $$2, jn $$3, boolean $$4, jn $$5) {
      if ($$2.v() < $$1.G_() || $$2.v() > $$1.ao() || !$$1.A_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dkg.cv) || $$0.a(dkg.pM) || $$0.a(dkg.pN) || $$0.a(dkg.tS)) {
         return false;
      } else if ($$3 == jn.a && $$2.v() == $$1.G_()) {
         return false;
      } else if ($$3 == jn.b && $$2.v() == $$1.ao()) {
         return false;
      } else {
         if (!$$0.a(dkg.bF) && !$$0.a(dkg.by)) {
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

   private boolean a(dgz $$0, ji $$1, jn $$2, boolean $$3) {
      ji $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dkg.bG)) {
         $$0.a($$4, dkg.a.m(), 276);
      }

      dxn $$5 = new dxn($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<ji, dxq> $$6 = Maps.newHashMap();
         List<ji> $$7 = $$5.c();
         List<dxq> $$8 = Lists.newArrayList();

         for (ji $$9 : $$7) {
            dxq $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<ji> $$11 = $$5.d();
         dxq[] $$12 = new dxq[$$7.size() + $$11.size()];
         jn $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            ji $$16 = $$11.get($$15);
            dxq $$17 = $$0.a_($$16);
            dus $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dkg.a.m(), 18);
            $$0.a(ecp.f, $$16, ecp.a.a($$17));
            if (!$$17.a(awp.aN)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            ji $$20 = $$7.get($$19);
            dxq $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dxq $$22 = dkg.bX.m().b(a, $$2);
            $$0.a($$20, $$22, 324);
            $$0.a(dxi.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dys $$23 = this.i ? dys.b : dys.a;
            dxq $$24 = dkg.bG.m().b(dxk.a, $$2).b(dxk.c, $$23);
            dxq $$25 = dkg.bX.m().b(dxi.b, $$2).b(dxi.c, this.i ? dys.b : dys.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 324);
            $$0.a(dxi.a($$4, $$25, $$24, $$2, true, true));
         }

         dxq $$26 = dkg.a.m();

         for (ji $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<ji, dxq> $$28 : $$6.entrySet()) {
            ji $$29 = $$28.getKey();
            dxq $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         eve $$31 = eva.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            dxq $$33 = $$12[$$14++];
            ji $$34 = $$11.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$35 = $$7.size() - 1; $$35 >= 0; $$35--) {
            $$0.a($$7.get($$35), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dkg.bG, $$31);
         }

         return true;
      }
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dxq $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
