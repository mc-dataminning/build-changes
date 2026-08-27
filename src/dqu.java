import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dqu extends dgb {
   public static final MapCodec<dqu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dqu::new)
   );
   public static final drs c = drr.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final evd h = ddy.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final evd i = ddy.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final evd j = ddy.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final evd k = ddy.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final evd l = ddy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final evd m = ddy.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dqu> a() {
      return b;
   }

   public dqu(boolean $$0, dra.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, it.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      if ($$0.c(c)) {
         switch ((it)$$0.c(a)) {
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
         return eva.b();
      }
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bso $$3, cto $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(dax $$0, io $$1, drb $$2) {
      it $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dqy($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         io $$5 = $$1.a($$3, 2);
         drb $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dea.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dqx $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Y() == $$9.l() || ((aqm)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dbn $$0, io $$1, it $$2) {
      for (it $$3 : it.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, it.a)) {
         return true;
      } else {
         io $$4 = $$1.c();

         for (it $$5 : it.values()) {
            if ($$5 != it.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(drb $$0, dax $$1, io $$2, int $$3, int $$4) {
      it $$5 = $$0.c(a);
      drb $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, avh.tX, avi.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dvu.a, $$2, dvu.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dog $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dqx) {
            ((dqx)$$8).k();
         }

         drb $$9 = dea.bQ.n().a(dqt.b, $$5).a(dqt.c, this.n ? dsd.b : dsd.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dqt.a($$2, $$9, this.n().a(a, it.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            io $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            drb $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dea.bQ) && $$1.c_($$10) instanceof dqx $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != emz.a && !$$11.a(dea.by) && !$$11.a(dea.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, avh.tW, avi.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dvu.e, $$2, dvu.a.a($$9));
      }

      return true;
   }

   public static boolean a(drb $$0, dax $$1, io $$2, it $$3, boolean $$4, it $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.al() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dea.co) || $$0.a(dea.pk) || $$0.a(dea.pl) || $$0.a(dea.to)) {
         return false;
      } else if ($$3 == it.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == it.b && $$2.v() == $$1.al() - 1) {
         return false;
      } else {
         if (!$$0.a(dea.by) && !$$0.a(dea.br)) {
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

   private boolean a(dax $$0, io $$1, it $$2, boolean $$3) {
      io $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dea.bz)) {
         $$0.a($$4, dea.a.n(), 20);
      }

      dqy $$5 = new dqy($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<io, drb> $$6 = Maps.newHashMap();
         List<io> $$7 = $$5.c();
         List<drb> $$8 = Lists.newArrayList();

         for (io $$9 : $$7) {
            drb $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<io> $$11 = $$5.d();
         drb[] $$12 = new drb[$$7.size() + $$11.size()];
         it $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            io $$16 = $$11.get($$15);
            drb $$17 = $$0.a_($$16);
            dog $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dea.a.n(), 18);
            $$0.a(dvu.f, $$16, dvu.a.a($$17));
            if (!$$17.a(avw.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            io $$20 = $$7.get($$19);
            drb $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            drb $$22 = dea.bQ.n().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dqt.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dsd $$23 = this.n ? dsd.b : dsd.a;
            drb $$24 = dea.bz.n().a(dqv.a, $$2).a(dqv.c, $$23);
            drb $$25 = dea.bQ.n().a(dqt.b, $$2).a(dqt.c, this.n ? dsd.b : dsd.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dqt.a($$4, $$25, $$24, $$2, true, true));
         }

         drb $$26 = dea.a.n();

         for (io $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<io, drb> $$28 : $$6.entrySet()) {
            io $$29 = $$28.getKey();
            drb $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            drb $$32 = $$12[$$14++];
            io $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dea.bz);
         }

         return true;
      }
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean f_(drb $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
