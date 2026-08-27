import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dji extends czb {
   public static final MapCodec<dji> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dji::new)
   );
   public static final dkg c = dkf.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final emv h = cwy.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final emv i = cwy.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emv j = cwy.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final emv k = cwy.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final emv l = cwy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final emv m = cwy.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dji> a() {
      return b;
   }

   public dji(boolean $$0, djo.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ic.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      if ($$0.c(c)) {
         switch ((ic)$$0.c(a)) {
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
         return ems.b();
      }
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(ctx $$0, hx $$1, djp $$2) {
      ic $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new djm($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         hx $$5 = $$1.a($$3, 2);
         djp $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(cxa.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof djl $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.X() == $$9.m() || ((ane)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cun $$0, hx $$1, ic $$2) {
      for (ic $$3 : ic.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ic.a)) {
         return true;
      } else {
         hx $$4 = $$1.c();

         for (ic $$5 : ic.values()) {
            if ($$5 != ic.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(djp $$0, ctx $$1, hx $$2, int $$3, int $$4) {
      ic $$5 = $$0.c(a);
      djp $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, art.ts, aru.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dnz.a, $$2, dnz.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dhd $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof djl) {
            ((djl)$$8).l();
         }

         djp $$9 = cxa.bQ.o().a(djh.b, $$5).a(djh.c, this.n ? dkr.b : dkr.a);
         $$1.a($$2, $$9, 20);
         $$1.a(djh.a($$2, $$9, this.o().a(a, ic.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            hx $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            djp $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(cxa.bQ) && $$1.c_($$10) instanceof djl $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.l();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != efe.a && !$$11.a(cxa.by) && !$$11.a(cxa.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, art.tr, aru.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dnz.e, $$2, dnz.a.a($$9));
      }

      return true;
   }

   public static boolean a(djp $$0, ctx $$1, hx $$2, ic $$3, boolean $$4, ic $$5) {
      if ($$2.v() < $$1.J_() || $$2.v() > $$1.al() - 1 || !$$1.D_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(cxa.co) || $$0.a(cxa.pk) || $$0.a(cxa.pl) || $$0.a(cxa.to)) {
         return false;
      } else if ($$3 == ic.a && $$2.v() == $$1.J_()) {
         return false;
      } else if ($$3 == ic.b && $$2.v() == $$1.al() - 1) {
         return false;
      } else {
         if (!$$0.a(cxa.by) && !$$0.a(cxa.br)) {
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

   private boolean a(ctx $$0, hx $$1, ic $$2, boolean $$3) {
      hx $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(cxa.bz)) {
         $$0.a($$4, cxa.a.o(), 20);
      }

      djm $$5 = new djm($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<hx, djp> $$6 = Maps.newHashMap();
         List<hx> $$7 = $$5.c();
         List<djp> $$8 = Lists.newArrayList();

         for (hx $$9 : $$7) {
            djp $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<hx> $$11 = $$5.d();
         djp[] $$12 = new djp[$$7.size() + $$11.size()];
         ic $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            hx $$16 = $$11.get($$15);
            djp $$17 = $$0.a_($$16);
            dhd $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, cxa.a.o(), 18);
            $$0.a(dnz.f, $$16, dnz.a.a($$17));
            if (!$$17.a(asi.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            hx $$20 = $$7.get($$19);
            djp $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            djp $$22 = cxa.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(djh.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dkr $$23 = this.n ? dkr.b : dkr.a;
            djp $$24 = cxa.bz.o().a(djj.a, $$2).a(djj.c, $$23);
            djp $$25 = cxa.bQ.o().a(djh.b, $$2).a(djh.c, this.n ? dkr.b : dkr.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(djh.a($$4, $$25, $$24, $$2, true, true));
         }

         djp $$26 = cxa.a.o();

         for (hx $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<hx, djp> $$28 : $$6.entrySet()) {
            hx $$29 = $$28.getKey();
            djp $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            djp $$32 = $$12[$$14++];
            hx $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, cxa.bz);
         }

         return true;
      }
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(a, c);
   }

   @Override
   public boolean g_(djp $$0) {
      return $$0.c(c);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
