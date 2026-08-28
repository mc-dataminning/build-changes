import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dsv extends dib {
   public static final MapCodec<dsv> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dsv::new)
   );
   public static final dtt c = dts.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final exv h = dfy.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final exv i = dfy.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exv j = dfy.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final exv k = dfy.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final exv l = dfy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final exv m = dfy.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dsv> a() {
      return b;
   }

   public dsv(boolean $$0, dtb.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ji.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      if ($$0.c(c)) {
         switch ((ji)$$0.c(a)) {
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
         return exs.b();
      }
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, btn $$3, cuq $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(dcw $$0, jd $$1, dtc $$2) {
      ji $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dsz($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         jd $$5 = $$1.a($$3, 2);
         dtc $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dga.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dsy $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Z() == $$9.l() || ((aqu)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(ddm $$0, jd $$1, ji $$2) {
      for (ji $$3 : ji.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ji.a)) {
         return true;
      } else {
         jd $$4 = $$1.d();

         for (ji $$5 : ji.values()) {
            if ($$5 != ji.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dtc $$0, dcw $$1, jd $$2, int $$3, int $$4) {
      ji $$5 = $$0.c(a);
      dtc $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, avp.ua, avq.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dxz.a, $$2, dxz.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dqh $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dsy) {
            ((dsy)$$8).k();
         }

         dtc $$9 = dga.bQ.o().a(dsu.b, $$5).a(dsu.c, this.n ? due.b : due.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dsu.a($$2, $$9, this.o().a(a, ji.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            jd $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dtc $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dga.bQ) && $$1.c_($$10) instanceof dsy $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != epj.a && !$$11.a(dga.by) && !$$11.a(dga.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, avp.tZ, avq.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dxz.e, $$2, dxz.a.a($$9));
      }

      return true;
   }

   public static boolean a(dtc $$0, dcw $$1, jd $$2, ji $$3, boolean $$4, ji $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.am() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dga.co) || $$0.a(dga.pk) || $$0.a(dga.pl) || $$0.a(dga.to)) {
         return false;
      } else if ($$3 == ji.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == ji.b && $$2.v() == $$1.am() - 1) {
         return false;
      } else {
         if (!$$0.a(dga.by) && !$$0.a(dga.br)) {
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

   private boolean a(dcw $$0, jd $$1, ji $$2, boolean $$3) {
      jd $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dga.bz)) {
         $$0.a($$4, dga.a.o(), 20);
      }

      dsz $$5 = new dsz($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<jd, dtc> $$6 = Maps.newHashMap();
         List<jd> $$7 = $$5.c();
         List<dtc> $$8 = Lists.newArrayList();

         for (jd $$9 : $$7) {
            dtc $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<jd> $$11 = $$5.d();
         dtc[] $$12 = new dtc[$$7.size() + $$11.size()];
         ji $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            jd $$16 = $$11.get($$15);
            dtc $$17 = $$0.a_($$16);
            dqh $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dga.a.o(), 18);
            $$0.a(dxz.f, $$16, dxz.a.a($$17));
            if (!$$17.a(awe.aL)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            jd $$20 = $$7.get($$19);
            dtc $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dtc $$22 = dga.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dsu.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            due $$23 = this.n ? due.b : due.a;
            dtc $$24 = dga.bz.o().a(dsw.a, $$2).a(dsw.c, $$23);
            dtc $$25 = dga.bQ.o().a(dsu.b, $$2).a(dsu.c, this.n ? due.b : due.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dsu.a($$4, $$25, $$24, $$2, true, true));
         }

         dtc $$26 = dga.a.o();

         for (jd $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<jd, dtc> $$28 : $$6.entrySet()) {
            jd $$29 = $$28.getKey();
            dtc $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dtc $$32 = $$12[$$14++];
            jd $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dga.bz);
         }

         return true;
      }
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean f_(dtc $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
