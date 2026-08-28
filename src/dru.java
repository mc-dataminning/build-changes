import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dru extends dhb {
   public static final MapCodec<dru> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dru::new)
   );
   public static final dss c = dsr.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final ewj h = dey.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final ewj i = dey.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewj j = dey.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final ewj k = dey.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final ewj l = dey.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final ewj m = dey.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dru> a() {
      return b;
   }

   public dru(boolean $$0, dsa.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, je.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      if ($$0.c(c)) {
         switch ((je)$$0.c(a)) {
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
         return ewg.b();
      }
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, bto $$3, cuo $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(dbx $$0, iz $$1, dsb $$2) {
      je $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dry($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         iz $$5 = $$1.a($$3, 2);
         dsb $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dfa.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof drx $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Z() == $$9.l() || ((are)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dcn $$0, iz $$1, je $$2) {
      for (je $$3 : je.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, je.a)) {
         return true;
      } else {
         iz $$4 = $$1.c();

         for (je $$5 : je.values()) {
            if ($$5 != je.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dsb $$0, dbx $$1, iz $$2, int $$3, int $$4) {
      je $$5 = $$0.c(a);
      dsb $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, avz.tX, awa.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dwu.a, $$2, dwu.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dpg $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof drx) {
            ((drx)$$8).k();
         }

         dsb $$9 = dfa.bQ.o().a(drt.b, $$5).a(drt.c, this.n ? dtd.b : dtd.a);
         $$1.a($$2, $$9, 20);
         $$1.a(drt.a($$2, $$9, this.o().a(a, je.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            iz $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dsb $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dfa.bQ) && $$1.c_($$10) instanceof drx $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != enz.a && !$$11.a(dfa.by) && !$$11.a(dfa.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, avz.tW, awa.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dwu.e, $$2, dwu.a.a($$9));
      }

      return true;
   }

   public static boolean a(dsb $$0, dbx $$1, iz $$2, je $$3, boolean $$4, je $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.am() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dfa.co) || $$0.a(dfa.pk) || $$0.a(dfa.pl) || $$0.a(dfa.to)) {
         return false;
      } else if ($$3 == je.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == je.b && $$2.v() == $$1.am() - 1) {
         return false;
      } else {
         if (!$$0.a(dfa.by) && !$$0.a(dfa.br)) {
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

   private boolean a(dbx $$0, iz $$1, je $$2, boolean $$3) {
      iz $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dfa.bz)) {
         $$0.a($$4, dfa.a.o(), 20);
      }

      dry $$5 = new dry($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<iz, dsb> $$6 = Maps.newHashMap();
         List<iz> $$7 = $$5.c();
         List<dsb> $$8 = Lists.newArrayList();

         for (iz $$9 : $$7) {
            dsb $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<iz> $$11 = $$5.d();
         dsb[] $$12 = new dsb[$$7.size() + $$11.size()];
         je $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            iz $$16 = $$11.get($$15);
            dsb $$17 = $$0.a_($$16);
            dpg $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dfa.a.o(), 18);
            $$0.a(dwu.f, $$16, dwu.a.a($$17));
            if (!$$17.a(awo.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            iz $$20 = $$7.get($$19);
            dsb $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dsb $$22 = dfa.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(drt.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dtd $$23 = this.n ? dtd.b : dtd.a;
            dsb $$24 = dfa.bz.o().a(drv.a, $$2).a(drv.c, $$23);
            dsb $$25 = dfa.bQ.o().a(drt.b, $$2).a(drt.c, this.n ? dtd.b : dtd.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(drt.a($$4, $$25, $$24, $$2, true, true));
         }

         dsb $$26 = dfa.a.o();

         for (iz $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<iz, dsb> $$28 : $$6.entrySet()) {
            iz $$29 = $$28.getKey();
            dsb $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dsb $$32 = $$12[$$14++];
            iz $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dfa.bz);
         }

         return true;
      }
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean f_(dsb $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
