import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class dul extends djp {
   public static final MapCodec<dul> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), t()).apply($$0, dul::new)
   );
   public static final dvj c = dvi.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final ezq h = dhm.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final ezq i = dhm.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezq j = dhm.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final ezq k = dhm.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final ezq l = dhm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final ezq m = dhm.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dul> a() {
      return b;
   }

   public dul(boolean $$0, dur.d $$1) {
      super($$1);
      this.l(this.F.b().b(a, jk.c).b(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      if ($$0.c(c)) {
         switch ((jk)$$0.c(a)) {
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
         return ezn.b();
      }
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, bun $$3, cvs $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(dej $$0, jf $$1, dus $$2) {
      jk $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dup($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         jf $$5 = $$1.a($$3, 2);
         dus $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dho.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof duo $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.aa() == $$9.u() || ((arj)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dfa $$0, jf $$1, jk $$2) {
      for (jk $$3 : jk.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jk.a)) {
         return true;
      } else {
         jf $$4 = $$1.d();

         for (jk $$5 : jk.values()) {
            if ($$5 != jk.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dus $$0, dej $$1, jf $$2, int $$3, int $$4) {
      jk $$5 = $$0.c(a);
      dus $$6 = $$0.b(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, awg.ub, awh.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dzp.a, $$2, dzp.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         drv $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof duo) {
            ((duo)$$8).k();
         }

         dus $$9 = dho.bQ.n().b(duk.b, $$5).b(duk.c, this.n ? dvu.b : dvu.a);
         $$1.a($$2, $$9, 20);
         $$1.a(duk.a($$2, $$9, this.n().b(a, jk.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            jf $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dus $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dho.bQ) && $$1.c_($$10) instanceof duo $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != eqy.a && !$$11.a(dho.by) && !$$11.a(dho.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awg.ua, awh.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dzp.e, $$2, dzp.a.a($$9));
      }

      return true;
   }

   public static boolean a(dus $$0, dej $$1, jf $$2, jk $$3, boolean $$4, jk $$5) {
      if ($$2.v() < $$1.H_() || $$2.v() > $$1.an() || !$$1.B_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dho.co) || $$0.a(dho.pk) || $$0.a(dho.pl) || $$0.a(dho.to)) {
         return false;
      } else if ($$3 == jk.a && $$2.v() == $$1.H_()) {
         return false;
      } else if ($$3 == jk.b && $$2.v() == $$1.an()) {
         return false;
      } else {
         if (!$$0.a(dho.by) && !$$0.a(dho.br)) {
            if ($$0.e($$1, $$2) == -1.0F) {
               return false;
            }

            switch ($$0.r()) {
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

         return !$$0.x();
      }
   }

   private boolean a(dej $$0, jf $$1, jk $$2, boolean $$3) {
      jf $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dho.bz)) {
         $$0.a($$4, dho.a.n(), 20);
      }

      dup $$5 = new dup($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<jf, dus> $$6 = Maps.newHashMap();
         List<jf> $$7 = $$5.c();
         List<dus> $$8 = Lists.newArrayList();

         for (jf $$9 : $$7) {
            dus $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<jf> $$11 = $$5.d();
         dus[] $$12 = new dus[$$7.size() + $$11.size()];
         jk $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            jf $$16 = $$11.get($$15);
            dus $$17 = $$0.a_($$16);
            drv $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dho.a.n(), 18);
            $$0.a(dzp.f, $$16, dzp.a.a($$17));
            if (!$$17.a(awv.aL)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            jf $$20 = $$7.get($$19);
            dus $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dus $$22 = dho.bQ.n().b(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(duk.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dvu $$23 = this.n ? dvu.b : dvu.a;
            dus $$24 = dho.bz.n().b(dum.a, $$2).b(dum.c, $$23);
            dus $$25 = dho.bQ.n().b(duk.b, $$2).b(duk.c, this.n ? dvu.b : dvu.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(duk.a($$4, $$25, $$24, $$2, true, true));
         }

         dus $$26 = dho.a.n();

         for (jf $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<jf, dus> $$28 : $$6.entrySet()) {
            jf $$29 = $$28.getKey();
            dus $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         esb $$31 = erx.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            dus $$33 = $$12[$$14++];
            jf $$34 = $$11.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$35 = $$7.size() - 1; $$35 >= 0; $$35--) {
            $$0.a($$7.get($$35), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dho.bz, $$31);
         }

         return true;
      }
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dus $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
