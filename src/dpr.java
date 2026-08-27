import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dpr extends dey {
   public static final MapCodec<dpr> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dpr::new)
   );
   public static final dqp c = dqo.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final ety h = dcv.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final ety i = dcv.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ety j = dcv.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final ety k = dcv.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final ety l = dcv.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final ety m = dcv.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dpr> a() {
      return b;
   }

   public dpr(boolean $$0, dpx.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ir.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      if ($$0.c(c)) {
         switch ((ir)$$0.c(a)) {
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
         return etv.b();
      }
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bre $$3, csd $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(czu $$0, im $$1, dpy $$2) {
      ir $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dpv($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         im $$5 = $$1.a($$3, 2);
         dpy $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dcx.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dpu $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Y() == $$9.l() || ((aqe)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dak $$0, im $$1, ir $$2) {
      for (ir $$3 : ir.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ir.a)) {
         return true;
      } else {
         im $$4 = $$1.c();

         for (ir $$5 : ir.values()) {
            if ($$5 != ir.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dpy $$0, czu $$1, im $$2, int $$3, int $$4) {
      ir $$5 = $$0.c(a);
      dpy $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, auz.tL, ava.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dur.a, $$2, dur.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dnd $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dpu) {
            ((dpu)$$8).k();
         }

         dpy $$9 = dcx.bQ.n().a(dpq.b, $$5).a(dpq.c, this.n ? dra.b : dra.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dpq.a($$2, $$9, this.n().a(a, ir.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            im $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dpy $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dcx.bQ) && $$1.c_($$10) instanceof dpu $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != elw.a && !$$11.a(dcx.by) && !$$11.a(dcx.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, auz.tK, ava.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dur.e, $$2, dur.a.a($$9));
      }

      return true;
   }

   public static boolean a(dpy $$0, czu $$1, im $$2, ir $$3, boolean $$4, ir $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.al() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dcx.co) || $$0.a(dcx.pk) || $$0.a(dcx.pl) || $$0.a(dcx.to)) {
         return false;
      } else if ($$3 == ir.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == ir.b && $$2.v() == $$1.al() - 1) {
         return false;
      } else {
         if (!$$0.a(dcx.by) && !$$0.a(dcx.br)) {
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

   private boolean a(czu $$0, im $$1, ir $$2, boolean $$3) {
      im $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dcx.bz)) {
         $$0.a($$4, dcx.a.n(), 20);
      }

      dpv $$5 = new dpv($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<im, dpy> $$6 = Maps.newHashMap();
         List<im> $$7 = $$5.c();
         List<dpy> $$8 = Lists.newArrayList();

         for (im $$9 : $$7) {
            dpy $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<im> $$11 = $$5.d();
         dpy[] $$12 = new dpy[$$7.size() + $$11.size()];
         ir $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            im $$16 = $$11.get($$15);
            dpy $$17 = $$0.a_($$16);
            dnd $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dcx.a.n(), 18);
            $$0.a(dur.f, $$16, dur.a.a($$17));
            if (!$$17.a(avo.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            im $$20 = $$7.get($$19);
            dpy $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dpy $$22 = dcx.bQ.n().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dpq.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dra $$23 = this.n ? dra.b : dra.a;
            dpy $$24 = dcx.bz.n().a(dps.a, $$2).a(dps.c, $$23);
            dpy $$25 = dcx.bQ.n().a(dpq.b, $$2).a(dpq.c, this.n ? dra.b : dra.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dpq.a($$4, $$25, $$24, $$2, true, true));
         }

         dpy $$26 = dcx.a.n();

         for (im $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<im, dpy> $$28 : $$6.entrySet()) {
            im $$29 = $$28.getKey();
            dpy $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dpy $$32 = $$12[$$14++];
            im $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dcx.bz);
         }

         return true;
      }
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dpy $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
