import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dit extends cym {
   public static final MapCodec<dit> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dit::new)
   );
   public static final djr c = djq.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final emf h = cwj.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final emf i = cwj.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emf j = cwj.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final emf k = cwj.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final emf l = cwj.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final emf m = cwj.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dit> a() {
      return b;
   }

   public dit(boolean $$0, diz.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ic.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
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
         return emc.b();
      }
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(cti $$0, hx $$1, dja $$2) {
      ic $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dix($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         hx $$5 = $$1.a($$3, 2);
         dja $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(cwl.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof diw $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.X() == $$9.m() || ((amz)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cty $$0, hx $$1, ic $$2) {
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
   public boolean a(dja $$0, cti $$1, hx $$2, int $$3, int $$4) {
      ic $$5 = $$0.c(a);
      dja $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, arm.td, arn.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dnk.a, $$2, dnk.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dgo $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof diw) {
            ((diw)$$8).l();
         }

         dja $$9 = cwl.bQ.o().a(dis.b, $$5).a(dis.c, this.n ? dkc.b : dkc.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dis.a($$2, $$9, this.o().a(a, ic.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            hx $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dja $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(cwl.bQ) && $$1.c_($$10) instanceof diw $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.l();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eep.a && !$$11.a(cwl.by) && !$$11.a(cwl.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, arm.tc, arn.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dnk.e, $$2, dnk.a.a($$9));
      }

      return true;
   }

   public static boolean a(dja $$0, cti $$1, hx $$2, ic $$3, boolean $$4, ic $$5) {
      if ($$2.v() < $$1.J_() || $$2.v() > $$1.al() - 1 || !$$1.D_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(cwl.co) || $$0.a(cwl.pk) || $$0.a(cwl.pl) || $$0.a(cwl.to)) {
         return false;
      } else if ($$3 == ic.a && $$2.v() == $$1.J_()) {
         return false;
      } else if ($$3 == ic.b && $$2.v() == $$1.al() - 1) {
         return false;
      } else {
         if (!$$0.a(cwl.by) && !$$0.a(cwl.br)) {
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

   private boolean a(cti $$0, hx $$1, ic $$2, boolean $$3) {
      hx $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(cwl.bz)) {
         $$0.a($$4, cwl.a.o(), 20);
      }

      dix $$5 = new dix($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<hx, dja> $$6 = Maps.newHashMap();
         List<hx> $$7 = $$5.c();
         List<dja> $$8 = Lists.newArrayList();

         for (hx $$9 : $$7) {
            dja $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<hx> $$11 = $$5.d();
         dja[] $$12 = new dja[$$7.size() + $$11.size()];
         ic $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            hx $$16 = $$11.get($$15);
            dja $$17 = $$0.a_($$16);
            dgo $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, cwl.a.o(), 18);
            $$0.a(dnk.f, $$16, dnk.a.a($$17));
            if (!$$17.a(asb.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            hx $$20 = $$7.get($$19);
            dja $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dja $$22 = cwl.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dis.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dkc $$23 = this.n ? dkc.b : dkc.a;
            dja $$24 = cwl.bz.o().a(diu.a, $$2).a(diu.c, $$23);
            dja $$25 = cwl.bQ.o().a(dis.b, $$2).a(dis.c, this.n ? dkc.b : dkc.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dis.a($$4, $$25, $$24, $$2, true, true));
         }

         dja $$26 = cwl.a.o();

         for (hx $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<hx, dja> $$28 : $$6.entrySet()) {
            hx $$29 = $$28.getKey();
            dja $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dja $$32 = $$12[$$14++];
            hx $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, cwl.bz);
         }

         return true;
      }
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(a, c);
   }

   @Override
   public boolean g_(dja $$0) {
      return $$0.c(c);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
