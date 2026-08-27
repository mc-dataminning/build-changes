import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dpb extends dek {
   public static final MapCodec<dpb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dpb::new)
   );
   public static final dpz c = dpy.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final etc h = dch.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final etc i = dch.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final etc j = dch.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final etc k = dch.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final etc l = dch.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final etc m = dch.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dpb> a() {
      return b;
   }

   public dpb(boolean $$0, dph.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ij.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      if ($$0.c(c)) {
         switch ((ij)$$0.c(a)) {
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
         return esz.b();
      }
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqt $$3, crs $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(czg $$0, id $$1, dpi $$2) {
      ij $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dpf($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         id $$5 = $$1.a($$3, 2);
         dpi $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dcj.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dpe $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Y() == $$9.l() || ((apu)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(czw $$0, id $$1, ij $$2) {
      for (ij $$3 : ij.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ij.a)) {
         return true;
      } else {
         id $$4 = $$1.c();

         for (ij $$5 : ij.values()) {
            if ($$5 != ij.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dpi $$0, czg $$1, id $$2, int $$3, int $$4) {
      ij $$5 = $$0.c(a);
      dpi $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, auo.tE, aup.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dub.a, $$2, dub.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dmo $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dpe) {
            ((dpe)$$8).k();
         }

         dpi $$9 = dcj.bQ.n().a(dpa.b, $$5).a(dpa.c, this.n ? dqk.b : dqk.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dpa.a($$2, $$9, this.n().a(a, ij.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            id $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dpi $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dcj.bQ) && $$1.c_($$10) instanceof dpe $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != elg.a && !$$11.a(dcj.by) && !$$11.a(dcj.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, auo.tD, aup.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dub.e, $$2, dub.a.a($$9));
      }

      return true;
   }

   public static boolean a(dpi $$0, czg $$1, id $$2, ij $$3, boolean $$4, ij $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.al() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dcj.co) || $$0.a(dcj.pk) || $$0.a(dcj.pl) || $$0.a(dcj.to)) {
         return false;
      } else if ($$3 == ij.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == ij.b && $$2.v() == $$1.al() - 1) {
         return false;
      } else {
         if (!$$0.a(dcj.by) && !$$0.a(dcj.br)) {
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

   private boolean a(czg $$0, id $$1, ij $$2, boolean $$3) {
      id $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dcj.bz)) {
         $$0.a($$4, dcj.a.n(), 20);
      }

      dpf $$5 = new dpf($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<id, dpi> $$6 = Maps.newHashMap();
         List<id> $$7 = $$5.c();
         List<dpi> $$8 = Lists.newArrayList();

         for (id $$9 : $$7) {
            dpi $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<id> $$11 = $$5.d();
         dpi[] $$12 = new dpi[$$7.size() + $$11.size()];
         ij $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            id $$16 = $$11.get($$15);
            dpi $$17 = $$0.a_($$16);
            dmo $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dcj.a.n(), 18);
            $$0.a(dub.f, $$16, dub.a.a($$17));
            if (!$$17.a(ave.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            id $$20 = $$7.get($$19);
            dpi $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dpi $$22 = dcj.bQ.n().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dpa.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dqk $$23 = this.n ? dqk.b : dqk.a;
            dpi $$24 = dcj.bz.n().a(dpc.a, $$2).a(dpc.c, $$23);
            dpi $$25 = dcj.bQ.n().a(dpa.b, $$2).a(dpa.c, this.n ? dqk.b : dqk.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dpa.a($$4, $$25, $$24, $$2, true, true));
         }

         dpi $$26 = dcj.a.n();

         for (id $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<id, dpi> $$28 : $$6.entrySet()) {
            id $$29 = $$28.getKey();
            dpi $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dpi $$32 = $$12[$$14++];
            id $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dcj.bz);
         }

         return true;
      }
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dpi $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
