import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dos extends deb {
   public static final MapCodec<dos> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dos::new)
   );
   public static final dpq c = dpp.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final est h = dby.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final est i = dby.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final est j = dby.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final est k = dby.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final est l = dby.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final est m = dby.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dos> a() {
      return b;
   }

   public dos(boolean $$0, doy.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ih.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      if ($$0.c(c)) {
         switch ((ih)$$0.c(a)) {
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
         return esq.b();
      }
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bqo $$3, crj $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(cyx $$0, ib $$1, doz $$2) {
      ih $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dow($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         ib $$5 = $$1.a($$3, 2);
         doz $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dca.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dov $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Y() == $$9.l() || ((aps)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(czn $$0, ib $$1, ih $$2) {
      for (ih $$3 : ih.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ih.a)) {
         return true;
      } else {
         ib $$4 = $$1.c();

         for (ih $$5 : ih.values()) {
            if ($$5 != ih.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(doz $$0, cyx $$1, ib $$2, int $$3, int $$4) {
      ih $$5 = $$0.c(a);
      doz $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, aum.tE, aun.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dts.a, $$2, dts.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dmf $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dov) {
            ((dov)$$8).k();
         }

         doz $$9 = dca.bQ.n().a(dor.b, $$5).a(dor.c, this.n ? dqb.b : dqb.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dor.a($$2, $$9, this.n().a(a, ih.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            ib $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            doz $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dca.bQ) && $$1.c_($$10) instanceof dov $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != ekx.a && !$$11.a(dca.by) && !$$11.a(dca.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, aum.tD, aun.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dts.e, $$2, dts.a.a($$9));
      }

      return true;
   }

   public static boolean a(doz $$0, cyx $$1, ib $$2, ih $$3, boolean $$4, ih $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.al() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dca.co) || $$0.a(dca.pk) || $$0.a(dca.pl) || $$0.a(dca.to)) {
         return false;
      } else if ($$3 == ih.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == ih.b && $$2.v() == $$1.al() - 1) {
         return false;
      } else {
         if (!$$0.a(dca.by) && !$$0.a(dca.br)) {
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

   private boolean a(cyx $$0, ib $$1, ih $$2, boolean $$3) {
      ib $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dca.bz)) {
         $$0.a($$4, dca.a.n(), 20);
      }

      dow $$5 = new dow($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<ib, doz> $$6 = Maps.newHashMap();
         List<ib> $$7 = $$5.c();
         List<doz> $$8 = Lists.newArrayList();

         for (ib $$9 : $$7) {
            doz $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<ib> $$11 = $$5.d();
         doz[] $$12 = new doz[$$7.size() + $$11.size()];
         ih $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            ib $$16 = $$11.get($$15);
            doz $$17 = $$0.a_($$16);
            dmf $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dca.a.n(), 18);
            $$0.a(dts.f, $$16, dts.a.a($$17));
            if (!$$17.a(avc.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            ib $$20 = $$7.get($$19);
            doz $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            doz $$22 = dca.bQ.n().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dor.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dqb $$23 = this.n ? dqb.b : dqb.a;
            doz $$24 = dca.bz.n().a(dot.a, $$2).a(dot.c, $$23);
            doz $$25 = dca.bQ.n().a(dor.b, $$2).a(dor.c, this.n ? dqb.b : dqb.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dor.a($$4, $$25, $$24, $$2, true, true));
         }

         doz $$26 = dca.a.n();

         for (ib $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<ib, doz> $$28 : $$6.entrySet()) {
            ib $$29 = $$28.getKey();
            doz $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            doz $$32 = $$12[$$14++];
            ib $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dca.bz);
         }

         return true;
      }
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(doz $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
