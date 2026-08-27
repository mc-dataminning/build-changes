import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dgp extends cwv {
   public static final MapCodec<dgp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), t()).apply($$0, dgp::new)
   );
   public static final dhn c = dhm.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final ekb h = cut.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final ekb i = cut.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ekb j = cut.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final ekb k = cut.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final ekb l = cut.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final ekb m = cut.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dgp> a() {
      return b;
   }

   public dgp(boolean $$0, dgv.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, hx.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      if ($$0.c(c)) {
         switch ((hx)$$0.c(a)) {
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
         return ejy.b();
      }
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(crs $$0, ht $$1, dgw $$2) {
      hx $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dgt($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         ht $$5 = $$1.a($$3, 2);
         dgw $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(cuv.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dgs $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.V() == $$9.v() || ((ama)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(csi $$0, ht $$1, hx $$2) {
      for (hx $$3 : hx.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, hx.a)) {
         return true;
      } else {
         ht $$4 = $$1.c();

         for (hx $$5 : hx.values()) {
            if ($$5 != hx.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dgw $$0, crs $$1, ht $$2, int $$3, int $$4) {
      hx $$5 = $$0.c(a);
      dgw $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, aqn.ss, aqo.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dlg.a, $$2, dlg.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         der $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dgs) {
            ((dgs)$$8).j();
         }

         dgw $$9 = cuv.bQ.o().a(dgo.b, $$5).a(dgo.c, this.n ? dhy.b : dhy.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dgo.a($$2, $$9, this.o().a(a, hx.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            ht $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dgw $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(cuv.bQ) && $$1.c_($$10) instanceof dgs $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.j();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != ecl.a && !$$11.a(cuv.by) && !$$11.a(cuv.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, aqn.sr, aqo.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dlg.e, $$2, dlg.a.a($$9));
      }

      return true;
   }

   public static boolean a(dgw $$0, crs $$1, ht $$2, hx $$3, boolean $$4, hx $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.aj() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(cuv.co) || $$0.a(cuv.pk) || $$0.a(cuv.pl) || $$0.a(cuv.sn)) {
         return false;
      } else if ($$3 == hx.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == hx.b && $$2.v() == $$1.aj() - 1) {
         return false;
      } else {
         if (!$$0.a(cuv.by) && !$$0.a(cuv.br)) {
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

   private boolean a(crs $$0, ht $$1, hx $$2, boolean $$3) {
      ht $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(cuv.bz)) {
         $$0.a($$4, cuv.a.o(), 20);
      }

      dgt $$5 = new dgt($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<ht, dgw> $$6 = Maps.newHashMap();
         List<ht> $$7 = $$5.c();
         List<dgw> $$8 = Lists.newArrayList();

         for (ht $$9 : $$7) {
            dgw $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<ht> $$11 = $$5.d();
         dgw[] $$12 = new dgw[$$7.size() + $$11.size()];
         hx $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            ht $$16 = $$11.get($$15);
            dgw $$17 = $$0.a_($$16);
            der $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, cuv.a.o(), 18);
            $$0.a(dlg.f, $$16, dlg.a.a($$17));
            if (!$$17.a(arc.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            ht $$20 = $$7.get($$19);
            dgw $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dgw $$22 = cuv.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dgo.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dhy $$23 = this.n ? dhy.b : dhy.a;
            dgw $$24 = cuv.bz.o().a(dgq.a, $$2).a(dgq.c, $$23);
            dgw $$25 = cuv.bQ.o().a(dgo.b, $$2).a(dgo.c, this.n ? dhy.b : dhy.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dgo.a($$4, $$25, $$24, $$2, true, true));
         }

         dgw $$26 = cuv.a.o();

         for (ht $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<ht, dgw> $$28 : $$6.entrySet()) {
            ht $$29 = $$28.getKey();
            dgw $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dgw $$32 = $$12[$$14++];
            ht $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, cuv.bz);
         }

         return true;
      }
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(a, c);
   }

   @Override
   public boolean g_(dgw $$0) {
      return $$0.c(c);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
