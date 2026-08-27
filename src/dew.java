import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dew extends cvd {
   public static final MapCodec<dew> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), t()).apply($$0, dew::new)
   );
   public static final dfu c = dft.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final eia h = ctc.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final eia i = ctc.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eia j = ctc.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final eia k = ctc.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final eia l = ctc.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final eia m = ctc.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dew> a() {
      return b;
   }

   public dew(boolean $$0, dfc.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ha.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      if ($$0.c(c)) {
         switch ((ha)$$0.c(a)) {
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
         return ehx.b();
      }
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(cqb $$0, gw $$1, dfd $$2) {
      ha $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dfa($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         gw $$5 = $$1.a($$3, 2);
         dfd $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(cte.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dez $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.V() == $$9.v() || ((akt)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cqr $$0, gw $$1, ha $$2) {
      for (ha $$3 : ha.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ha.a)) {
         return true;
      } else {
         gw $$4 = $$1.c();

         for (ha $$5 : ha.values()) {
            if ($$5 != ha.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dfd $$0, cqb $$1, gw $$2, int $$3, int $$4) {
      ha $$5 = $$0.c(a);
      dfd $$6 = $$0.a(c, Boolean.valueOf(true));
      if (!$$1.B) {
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
         $$1.a(null, $$2, apg.so, aph.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(djn.a, $$2, djn.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dcz $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dez) {
            ((dez)$$8).j();
         }

         dfd $$9 = cte.bQ.o().a(dev.b, $$5).a(dev.c, this.n ? dgf.b : dgf.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dev.a($$2, $$9, this.o().a(a, ha.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            gw $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dfd $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(cte.bQ) && $$1.c_($$10) instanceof dez $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.j();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eal.a && !$$11.a(cte.by) && !$$11.a(cte.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, apg.sn, aph.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(djn.e, $$2, djn.a.a($$9));
      }

      return true;
   }

   public static boolean a(dfd $$0, cqb $$1, gw $$2, ha $$3, boolean $$4, ha $$5) {
      if ($$2.v() < $$1.H_() || $$2.v() > $$1.aj() - 1 || !$$1.B_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(cte.co) || $$0.a(cte.pk) || $$0.a(cte.pl) || $$0.a(cte.sn)) {
         return false;
      } else if ($$3 == ha.a && $$2.v() == $$1.H_()) {
         return false;
      } else if ($$3 == ha.b && $$2.v() == $$1.aj() - 1) {
         return false;
      } else {
         if (!$$0.a(cte.by) && !$$0.a(cte.br)) {
            if ($$0.h($$1, $$2) == -1.0F) {
               return false;
            }

            switch ($$0.o()) {
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

         return !$$0.t();
      }
   }

   private boolean a(cqb $$0, gw $$1, ha $$2, boolean $$3) {
      gw $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(cte.bz)) {
         $$0.a($$4, cte.a.o(), 20);
      }

      dfa $$5 = new dfa($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<gw, dfd> $$6 = Maps.newHashMap();
         List<gw> $$7 = $$5.c();
         List<dfd> $$8 = Lists.newArrayList();

         for (gw $$9 : $$7) {
            dfd $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<gw> $$11 = $$5.d();
         dfd[] $$12 = new dfd[$$7.size() + $$11.size()];
         ha $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            gw $$16 = $$11.get($$15);
            dfd $$17 = $$0.a_($$16);
            dcz $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, cte.a.o(), 18);
            $$0.a(djn.f, $$16, djn.a.a($$17));
            if (!$$17.a(apv.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            gw $$20 = $$7.get($$19);
            dfd $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dfd $$22 = cte.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dev.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dgf $$23 = this.n ? dgf.b : dgf.a;
            dfd $$24 = cte.bz.o().a(dex.a, $$2).a(dex.c, $$23);
            dfd $$25 = cte.bQ.o().a(dev.b, $$2).a(dev.c, this.n ? dgf.b : dgf.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dev.a($$4, $$25, $$24, $$2, true, true));
         }

         dfd $$26 = cte.a.o();

         for (gw $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<gw, dfd> $$28 : $$6.entrySet()) {
            gw $$29 = $$28.getKey();
            dfd $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dfd $$32 = $$12[$$14++];
            gw $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, cte.bz);
         }

         return true;
      }
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(a, c);
   }

   @Override
   public boolean g_(dfd $$0) {
      return $$0.c(c);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
