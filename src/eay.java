import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class eay extends dpi {
   public static final MapCodec<eay> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.i), t()).apply($$0, eay::new)
   );
   public static final ebx c = ebw.j;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final int g = 4;
   private static final Map<jc, fgm> h = fgj.d(dne.c(16.0, 4.0, 16.0));
   private final boolean i;

   @Override
   public MapCodec<eay> a() {
      return b;
   }

   public eay(boolean $$0, ebf.d $$1) {
      super($$1);
      this.l(this.C.b().b(a, jc.c).b(c, Boolean.valueOf(false)));
      this.i = $$0;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return $$0.c(c) ? h.get($$0.c(a)) : fgj.b();
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bxw $$3, daa $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(djz $$0, iw $$1, ebg $$2) {
      jc $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new ebc($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         iw $$5 = $$1.a($$3, 2);
         ebg $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dng.ca) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof ebb $$9 && $$9.a() && ($$9.a(0.0F) < 0.5F || $$0.ae() == $$9.t() || ((aru)$$0).d())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dkr $$0, iw $$1, jc $$2) {
      for (jc $$3 : jc.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jc.a)) {
         return true;
      } else {
         iw $$4 = $$1.d();

         for (jc $$5 : jc.values()) {
            if ($$5 != jc.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(ebg $$0, djz $$1, iw $$2, int $$3, int $$4) {
      jc $$5 = $$0.c(a);
      ebg $$6 = $$0.b(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, awr.uO, aws.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(egg.a, $$2, egg.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dye $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof ebb) {
            ((ebb)$$8).k();
         }

         ebg $$9 = dng.ca.m().b(eax.b, $$5).b(eax.c, this.i ? eci.b : eci.a);
         $$1.a($$2, $$9, 276);
         $$1.a(eax.a($$2, $$9, this.m().b(a, jc.a($$4 & 7)), $$5, false, true));
         $$1.a($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.i) {
            iw $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            ebg $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dng.ca) && $$1.c_($$10) instanceof ebb $$14 && $$14.c() == $$5 && $$14.a()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != exv.a && !$$11.a(dng.bI) && !$$11.a(dng.by)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awr.uN, aws.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(egg.e, $$2, egg.a.a($$9));
      }

      return true;
   }

   public static boolean a(ebg $$0, djz $$1, iw $$2, jc $$3, boolean $$4, jc $$5) {
      if ($$2.v() < $$1.K_() || $$2.v() > $$1.ao() || !$$1.E_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dng.cy) || $$0.a(dng.pS) || $$0.a(dng.pT) || $$0.a(dng.tY)) {
         return false;
      } else if ($$3 == jc.a && $$2.v() == $$1.K_()) {
         return false;
      } else if ($$3 == jc.b && $$2.v() == $$1.ao()) {
         return false;
      } else {
         if (!$$0.a(dng.bI) && !$$0.a(dng.by)) {
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

   private boolean a(djz $$0, iw $$1, jc $$2, boolean $$3) {
      iw $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dng.bJ)) {
         $$0.a($$4, dng.a.m(), 276);
      }

      ebc $$5 = new ebc($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<iw, ebg> $$6 = Maps.newHashMap();
         List<iw> $$7 = $$5.c();
         List<ebg> $$8 = Lists.newArrayList();

         for (iw $$9 : $$7) {
            ebg $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<iw> $$11 = $$5.d();
         ebg[] $$12 = new ebg[$$7.size() + $$11.size()];
         jc $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            iw $$16 = $$11.get($$15);
            ebg $$17 = $$0.a_($$16);
            dye $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            if (!$$17.a(axg.aN) && $$0.A_()) {
               $$0.c(2001, $$16, j($$17));
            }

            $$0.a($$16, dng.a.m(), 18);
            $$0.a(egg.f, $$16, egg.a.a($$17));
            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            iw $$20 = $$7.get($$19);
            ebg $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            ebg $$22 = dng.ca.m().b(a, $$2);
            $$0.a($$20, $$22, 324);
            $$0.a(eax.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            eci $$23 = this.i ? eci.b : eci.a;
            ebg $$24 = dng.bJ.m().b(eaz.a, $$2).b(eaz.c, $$23);
            ebg $$25 = dng.ca.m().b(eax.b, $$2).b(eax.c, this.i ? eci.b : eci.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 324);
            $$0.a(eax.a($$4, $$25, $$24, $$2, true, true));
         }

         ebg $$26 = dng.a.m();

         for (iw $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<iw, ebg> $$28 : $$6.entrySet()) {
            iw $$29 = $$28.getKey();
            ebg $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         eyy $$31 = eyu.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            ebg $$33 = $$12[$$14++];
            iw $$34 = $$11.get($$32);
            if ($$0 instanceof aru $$35) {
               $$33.a($$35, $$34, false);
            }

            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$36 = $$7.size() - 1; $$36 >= 0; $$36--) {
            $$0.a($$7.get($$36), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dng.bJ, $$31);
         }

         return true;
      }
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(ebg $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
