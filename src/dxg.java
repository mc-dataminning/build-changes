import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class dxg extends dmj {
   public static final MapCodec<dxg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), t()).apply($$0, dxg::new)
   );
   public static final dye c = dyd.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final fcm h = dke.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final fcm i = dke.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcm j = dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final fcm k = dke.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final fcm l = dke.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final fcm m = dke.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dxg> a() {
      return b;
   }

   public dxg(boolean $$0, dxm.d $$1) {
      super($$1);
      this.l(this.F.b().b(a, jm.c).b(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
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
         return fcj.b();
      }
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bwb $$3, cxk $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(dha $$0, jh $$1, dxn $$2) {
      jm $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dxk($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         jh $$5 = $$1.a($$3, 2);
         dxn $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dkg.bX) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dxj $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.ac() == $$9.u() || ((ash)$$0).d())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dhs $$0, jh $$1, jm $$2) {
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
   protected boolean a(dxn $$0, dha $$1, jh $$2, int $$3, int $$4) {
      jm $$5 = $$0.c(a);
      dxn $$6 = $$0.b(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, axf.ut, axg.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(ecj.a, $$2, ecj.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dup $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dxj) {
            ((dxj)$$8).k();
         }

         dxn $$9 = dkg.bX.m().b(dxf.b, $$5).b(dxf.c, this.n ? dyo.b : dyo.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dxf.a($$2, $$9, this.m().b(a, jm.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            jh $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dxn $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dkg.bX) && $$1.c_($$10) instanceof dxj $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != etu.a && !$$11.a(dkg.bF) && !$$11.a(dkg.by)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, axf.us, axg.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(ecj.e, $$2, ecj.a.a($$9));
      }

      return true;
   }

   public static boolean a(dxn $$0, dha $$1, jh $$2, jm $$3, boolean $$4, jm $$5) {
      if ($$2.v() < $$1.L_() || $$2.v() > $$1.am() || !$$1.F_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dkg.cv) || $$0.a(dkg.pF) || $$0.a(dkg.pG) || $$0.a(dkg.tJ)) {
         return false;
      } else if ($$3 == jm.a && $$2.v() == $$1.L_()) {
         return false;
      } else if ($$3 == jm.b && $$2.v() == $$1.am()) {
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

   private boolean a(dha $$0, jh $$1, jm $$2, boolean $$3) {
      jh $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dkg.bG)) {
         $$0.a($$4, dkg.a.m(), 20);
      }

      dxk $$5 = new dxk($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<jh, dxn> $$6 = Maps.newHashMap();
         List<jh> $$7 = $$5.c();
         List<dxn> $$8 = Lists.newArrayList();

         for (jh $$9 : $$7) {
            dxn $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<jh> $$11 = $$5.d();
         dxn[] $$12 = new dxn[$$7.size() + $$11.size()];
         jm $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            jh $$16 = $$11.get($$15);
            dxn $$17 = $$0.a_($$16);
            dup $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dkg.a.m(), 18);
            $$0.a(ecj.f, $$16, ecj.a.a($$17));
            if (!$$17.a(axu.aN)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            jh $$20 = $$7.get($$19);
            dxn $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dxn $$22 = dkg.bX.m().b(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dxf.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dyo $$23 = this.n ? dyo.b : dyo.a;
            dxn $$24 = dkg.bG.m().b(dxh.a, $$2).b(dxh.c, $$23);
            dxn $$25 = dkg.bX.m().b(dxf.b, $$2).b(dxf.c, this.n ? dyo.b : dyo.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dxf.a($$4, $$25, $$24, $$2, true, true));
         }

         dxn $$26 = dkg.a.m();

         for (jh $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<jh, dxn> $$28 : $$6.entrySet()) {
            jh $$29 = $$28.getKey();
            dxn $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         eux $$31 = eut.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            dxn $$33 = $$12[$$14++];
            jh $$34 = $$11.get($$32);
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
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dxn $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
