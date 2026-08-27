import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dii extends cyc {
   public static final MapCodec<dii> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dii::new)
   );
   public static final djg c = djf.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final elu h = cvz.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final elu i = cvz.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final elu j = cvz.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final elu k = cvz.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final elu l = cvz.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final elu m = cvz.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dii> a() {
      return b;
   }

   public dii(boolean $$0, dio.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ia.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      if ($$0.c(c)) {
         switch ((ia)$$0.c(a)) {
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
         return elr.b();
      }
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(csy $$0, hv $$1, dip $$2) {
      ia $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dim($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         hv $$5 = $$1.a($$3, 2);
         dip $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(cwb.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dil $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.W() == $$9.m() || ((amp)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cto $$0, hv $$1, ia $$2) {
      for (ia $$3 : ia.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ia.a)) {
         return true;
      } else {
         hv $$4 = $$1.c();

         for (ia $$5 : ia.values()) {
            if ($$5 != ia.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dip $$0, csy $$1, hv $$2, int $$3, int $$4) {
      ia $$5 = $$0.c(a);
      dip $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, arc.td, ard.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dmz.a, $$2, dmz.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dgd $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dil) {
            ((dil)$$8).l();
         }

         dip $$9 = cwb.bQ.o().a(dih.b, $$5).a(dih.c, this.n ? djr.b : djr.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dih.a($$2, $$9, this.o().a(a, ia.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            hv $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dip $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(cwb.bQ) && $$1.c_($$10) instanceof dil $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.l();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eee.a && !$$11.a(cwb.by) && !$$11.a(cwb.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, arc.tc, ard.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dmz.e, $$2, dmz.a.a($$9));
      }

      return true;
   }

   public static boolean a(dip $$0, csy $$1, hv $$2, ia $$3, boolean $$4, ia $$5) {
      if ($$2.v() < $$1.J_() || $$2.v() > $$1.ak() - 1 || !$$1.D_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(cwb.co) || $$0.a(cwb.pk) || $$0.a(cwb.pl) || $$0.a(cwb.to)) {
         return false;
      } else if ($$3 == ia.a && $$2.v() == $$1.J_()) {
         return false;
      } else if ($$3 == ia.b && $$2.v() == $$1.ak() - 1) {
         return false;
      } else {
         if (!$$0.a(cwb.by) && !$$0.a(cwb.br)) {
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

   private boolean a(csy $$0, hv $$1, ia $$2, boolean $$3) {
      hv $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(cwb.bz)) {
         $$0.a($$4, cwb.a.o(), 20);
      }

      dim $$5 = new dim($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<hv, dip> $$6 = Maps.newHashMap();
         List<hv> $$7 = $$5.c();
         List<dip> $$8 = Lists.newArrayList();

         for (hv $$9 : $$7) {
            dip $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<hv> $$11 = $$5.d();
         dip[] $$12 = new dip[$$7.size() + $$11.size()];
         ia $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            hv $$16 = $$11.get($$15);
            dip $$17 = $$0.a_($$16);
            dgd $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, cwb.a.o(), 18);
            $$0.a(dmz.f, $$16, dmz.a.a($$17));
            if (!$$17.a(arr.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            hv $$20 = $$7.get($$19);
            dip $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dip $$22 = cwb.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dih.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            djr $$23 = this.n ? djr.b : djr.a;
            dip $$24 = cwb.bz.o().a(dij.a, $$2).a(dij.c, $$23);
            dip $$25 = cwb.bQ.o().a(dih.b, $$2).a(dih.c, this.n ? djr.b : djr.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dih.a($$4, $$25, $$24, $$2, true, true));
         }

         dip $$26 = cwb.a.o();

         for (hv $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<hv, dip> $$28 : $$6.entrySet()) {
            hv $$29 = $$28.getKey();
            dip $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dip $$32 = $$12[$$14++];
            hv $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, cwb.bz);
         }

         return true;
      }
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(a, c);
   }

   @Override
   public boolean g_(dip $$0) {
      return $$0.c(c);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
