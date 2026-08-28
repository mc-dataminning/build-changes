import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class dvo extends dkt {
   public static final MapCodec<dvo> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), t()).apply($$0, dvo::new)
   );
   public static final dwm c = dwl.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final fas h = diq.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final fas i = diq.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fas j = diq.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final fas k = diq.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final fas l = diq.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final fas m = diq.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dvo> a() {
      return b;
   }

   public dvo(boolean $$0, dvu.d $$1) {
      super($$1);
      this.l(this.F.b().b(a, jm.c).b(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
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
         return fap.b();
      }
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bvh $$3, cwm $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(dfm $$0, jh $$1, dvv $$2) {
      jm $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dvs($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         jh $$5 = $$1.a($$3, 2);
         dvv $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dis.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dvr $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.ab() == $$9.u() || ((arp)$$0).d())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dge $$0, jh $$1, jm $$2) {
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
   protected boolean a(dvv $$0, dfm $$1, jh $$2, int $$3, int $$4) {
      jm $$5 = $$0.c(a);
      dvv $$6 = $$0.b(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, awn.tZ, awo.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(ear.a, $$2, ear.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dsy $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dvr) {
            ((dvr)$$8).k();
         }

         dvv $$9 = dis.bQ.m().b(dvn.b, $$5).b(dvn.c, this.n ? dww.b : dww.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dvn.a($$2, $$9, this.m().b(a, jm.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            jh $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dvv $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dis.bQ) && $$1.c_($$10) instanceof dvr $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != esa.a && !$$11.a(dis.by) && !$$11.a(dis.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awn.tY, awo.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(ear.e, $$2, ear.a.a($$9));
      }

      return true;
   }

   public static boolean a(dvv $$0, dfm $$1, jh $$2, jm $$3, boolean $$4, jm $$5) {
      if ($$2.v() < $$1.K_() || $$2.v() > $$1.al() || !$$1.E_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dis.co) || $$0.a(dis.pk) || $$0.a(dis.pl) || $$0.a(dis.to)) {
         return false;
      } else if ($$3 == jm.a && $$2.v() == $$1.K_()) {
         return false;
      } else if ($$3 == jm.b && $$2.v() == $$1.al()) {
         return false;
      } else {
         if (!$$0.a(dis.by) && !$$0.a(dis.br)) {
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

   private boolean a(dfm $$0, jh $$1, jm $$2, boolean $$3) {
      jh $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dis.bz)) {
         $$0.a($$4, dis.a.m(), 20);
      }

      dvs $$5 = new dvs($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<jh, dvv> $$6 = Maps.newHashMap();
         List<jh> $$7 = $$5.c();
         List<dvv> $$8 = Lists.newArrayList();

         for (jh $$9 : $$7) {
            dvv $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<jh> $$11 = $$5.d();
         dvv[] $$12 = new dvv[$$7.size() + $$11.size()];
         jm $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            jh $$16 = $$11.get($$15);
            dvv $$17 = $$0.a_($$16);
            dsy $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dis.a.m(), 18);
            $$0.a(ear.f, $$16, ear.a.a($$17));
            if (!$$17.a(axc.aM)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            jh $$20 = $$7.get($$19);
            dvv $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dvv $$22 = dis.bQ.m().b(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dvn.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dww $$23 = this.n ? dww.b : dww.a;
            dvv $$24 = dis.bz.m().b(dvp.a, $$2).b(dvp.c, $$23);
            dvv $$25 = dis.bQ.m().b(dvn.b, $$2).b(dvn.c, this.n ? dww.b : dww.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dvn.a($$4, $$25, $$24, $$2, true, true));
         }

         dvv $$26 = dis.a.m();

         for (jh $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<jh, dvv> $$28 : $$6.entrySet()) {
            jh $$29 = $$28.getKey();
            dvv $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         etd $$31 = esz.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            dvv $$33 = $$12[$$14++];
            jh $$34 = $$11.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$35 = $$7.size() - 1; $$35 >= 0; $$35--) {
            $$0.a($$7.get($$35), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dis.bz, $$31);
         }

         return true;
      }
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dvv $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
