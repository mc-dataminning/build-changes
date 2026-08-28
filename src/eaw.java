import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class eaw extends dpg {
   public static final MapCodec<eaw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.i), t()).apply($$0, eaw::new)
   );
   public static final ebv c = ebu.j;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final int g = 4;
   private static final Map<jb, fgk> h = fgh.d(dnc.c(16.0, 4.0, 16.0));
   private final boolean i;

   @Override
   public MapCodec<eaw> a() {
      return b;
   }

   public eaw(boolean $$0, ebd.d $$1) {
      super($$1);
      this.l(this.C.b().b(a, jb.c).b(c, Boolean.valueOf(false)));
      this.i = $$0;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return $$0.c(c) ? h.get($$0.c(a)) : fgh.b();
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bxu $$3, czy $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(djx $$0, iv $$1, ebe $$2) {
      jb $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new eba($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         iv $$5 = $$1.a($$3, 2);
         ebe $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dne.ca) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof eaz $$9 && $$9.a() && ($$9.a(0.0F) < 0.5F || $$0.ae() == $$9.t() || ((ars)$$0).d())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dkp $$0, iv $$1, jb $$2) {
      for (jb $$3 : jb.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jb.a)) {
         return true;
      } else {
         iv $$4 = $$1.d();

         for (jb $$5 : jb.values()) {
            if ($$5 != jb.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(ebe $$0, djx $$1, iv $$2, int $$3, int $$4) {
      jb $$5 = $$0.c(a);
      ebe $$6 = $$0.b(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, awp.uO, awq.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(ege.a, $$2, ege.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dyc $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof eaz) {
            ((eaz)$$8).k();
         }

         ebe $$9 = dne.ca.m().b(eav.b, $$5).b(eav.c, this.i ? ecg.b : ecg.a);
         $$1.a($$2, $$9, 276);
         $$1.a(eav.a($$2, $$9, this.m().b(a, jb.a($$4 & 7)), $$5, false, true));
         $$1.a($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.i) {
            iv $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            ebe $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dne.ca) && $$1.c_($$10) instanceof eaz $$14 && $$14.c() == $$5 && $$14.a()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != ext.a && !$$11.a(dne.bI) && !$$11.a(dne.by)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awp.uN, awq.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(ege.e, $$2, ege.a.a($$9));
      }

      return true;
   }

   public static boolean a(ebe $$0, djx $$1, iv $$2, jb $$3, boolean $$4, jb $$5) {
      if ($$2.v() < $$1.K_() || $$2.v() > $$1.ao() || !$$1.E_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dne.cy) || $$0.a(dne.pS) || $$0.a(dne.pT) || $$0.a(dne.tY)) {
         return false;
      } else if ($$3 == jb.a && $$2.v() == $$1.K_()) {
         return false;
      } else if ($$3 == jb.b && $$2.v() == $$1.ao()) {
         return false;
      } else {
         if (!$$0.a(dne.bI) && !$$0.a(dne.by)) {
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

   private boolean a(djx $$0, iv $$1, jb $$2, boolean $$3) {
      iv $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dne.bJ)) {
         $$0.a($$4, dne.a.m(), 276);
      }

      eba $$5 = new eba($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<iv, ebe> $$6 = Maps.newHashMap();
         List<iv> $$7 = $$5.c();
         List<ebe> $$8 = Lists.newArrayList();

         for (iv $$9 : $$7) {
            ebe $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<iv> $$11 = $$5.d();
         ebe[] $$12 = new ebe[$$7.size() + $$11.size()];
         jb $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            iv $$16 = $$11.get($$15);
            ebe $$17 = $$0.a_($$16);
            dyc $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dne.a.m(), 18);
            $$0.a(ege.f, $$16, ege.a.a($$17));
            if (!$$17.a(axe.aN)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            iv $$20 = $$7.get($$19);
            ebe $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            ebe $$22 = dne.ca.m().b(a, $$2);
            $$0.a($$20, $$22, 324);
            $$0.a(eav.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            ecg $$23 = this.i ? ecg.b : ecg.a;
            ebe $$24 = dne.bJ.m().b(eax.a, $$2).b(eax.c, $$23);
            ebe $$25 = dne.ca.m().b(eav.b, $$2).b(eav.c, this.i ? ecg.b : ecg.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 324);
            $$0.a(eav.a($$4, $$25, $$24, $$2, true, true));
         }

         ebe $$26 = dne.a.m();

         for (iv $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<iv, ebe> $$28 : $$6.entrySet()) {
            iv $$29 = $$28.getKey();
            ebe $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         eyw $$31 = eys.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            ebe $$33 = $$12[$$14++];
            iv $$34 = $$11.get($$32);
            if ($$0 instanceof ars $$35) {
               $$33.a($$35, $$34, false);
            }

            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$36 = $$7.size() - 1; $$36 >= 0; $$36--) {
            $$0.a($$7.get($$36), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dne.bJ, $$31);
         }

         return true;
      }
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(ebe $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
