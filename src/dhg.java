import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dhg extends cxi {
   public static final MapCodec<dhg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dhg::new)
   );
   public static final die c = did.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final eks h = cvf.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final eks i = cvf.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eks j = cvf.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final eks k = cvf.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final eks l = cvf.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final eks m = cvf.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dhg> a() {
      return b;
   }

   public dhg(boolean $$0, dhm.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ib.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      if ($$0.c(c)) {
         switch ((ib)$$0.c(a)) {
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
         return ekp.b();
      }
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(csf $$0, hx $$1, dhn $$2) {
      ib $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dhk($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         hx $$5 = $$1.a($$3, 2);
         dhn $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(cvh.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dhj $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.W() == $$9.m() || ((ami)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(csv $$0, hx $$1, ib $$2) {
      for (ib $$3 : ib.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ib.a)) {
         return true;
      } else {
         hx $$4 = $$1.c();

         for (ib $$5 : ib.values()) {
            if ($$5 != ib.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dhn $$0, csf $$1, hx $$2, int $$3, int $$4) {
      ib $$5 = $$0.c(a);
      dhn $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, aqv.sI, aqw.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dlx.a, $$2, dlx.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dfi $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dhj) {
            ((dhj)$$8).l();
         }

         dhn $$9 = cvh.bQ.o().a(dhf.b, $$5).a(dhf.c, this.n ? dip.b : dip.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dhf.a($$2, $$9, this.o().a(a, ib.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            hx $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dhn $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(cvh.bQ) && $$1.c_($$10) instanceof dhj $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.l();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != edc.a && !$$11.a(cvh.by) && !$$11.a(cvh.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, aqv.sH, aqw.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dlx.e, $$2, dlx.a.a($$9));
      }

      return true;
   }

   public static boolean a(dhn $$0, csf $$1, hx $$2, ib $$3, boolean $$4, ib $$5) {
      if ($$2.v() < $$1.J_() || $$2.v() > $$1.ak() - 1 || !$$1.D_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(cvh.co) || $$0.a(cvh.pk) || $$0.a(cvh.pl) || $$0.a(cvh.to)) {
         return false;
      } else if ($$3 == ib.a && $$2.v() == $$1.J_()) {
         return false;
      } else if ($$3 == ib.b && $$2.v() == $$1.ak() - 1) {
         return false;
      } else {
         if (!$$0.a(cvh.by) && !$$0.a(cvh.br)) {
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

   private boolean a(csf $$0, hx $$1, ib $$2, boolean $$3) {
      hx $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(cvh.bz)) {
         $$0.a($$4, cvh.a.o(), 20);
      }

      dhk $$5 = new dhk($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<hx, dhn> $$6 = Maps.newHashMap();
         List<hx> $$7 = $$5.c();
         List<dhn> $$8 = Lists.newArrayList();

         for (hx $$9 : $$7) {
            dhn $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<hx> $$11 = $$5.d();
         dhn[] $$12 = new dhn[$$7.size() + $$11.size()];
         ib $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            hx $$16 = $$11.get($$15);
            dhn $$17 = $$0.a_($$16);
            dfi $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, cvh.a.o(), 18);
            $$0.a(dlx.f, $$16, dlx.a.a($$17));
            if (!$$17.a(ark.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            hx $$20 = $$7.get($$19);
            dhn $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dhn $$22 = cvh.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dhf.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dip $$23 = this.n ? dip.b : dip.a;
            dhn $$24 = cvh.bz.o().a(dhh.a, $$2).a(dhh.c, $$23);
            dhn $$25 = cvh.bQ.o().a(dhf.b, $$2).a(dhf.c, this.n ? dip.b : dip.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dhf.a($$4, $$25, $$24, $$2, true, true));
         }

         dhn $$26 = cvh.a.o();

         for (hx $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<hx, dhn> $$28 : $$6.entrySet()) {
            hx $$29 = $$28.getKey();
            dhn $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dhn $$32 = $$12[$$14++];
            hx $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, cvh.bz);
         }

         return true;
      }
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(a, c);
   }

   @Override
   public boolean g_(dhn $$0) {
      return $$0.c(c);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
