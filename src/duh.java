import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class duh extends djm {
   public static final MapCodec<duh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, duh::new)
   );
   public static final dvf c = dve.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final ezm h = dhj.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final ezm i = dhj.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezm j = dhj.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final ezm k = dhj.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final ezm l = dhj.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final ezm m = dhj.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<duh> a() {
      return b;
   }

   public duh(boolean $$0, dun.d $$1) {
      super($$1);
      this.l(this.F.b().b(a, jj.c).b(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      if ($$0.c(c)) {
         switch ((jj)$$0.c(a)) {
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
         return ezj.b();
      }
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, buk $$3, cvp $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(deg $$0, je $$1, duo $$2) {
      jj $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dul($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         je $$5 = $$1.a($$3, 2);
         duo $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dhl.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof duk $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.aa() == $$9.u() || ((arh)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dex $$0, je $$1, jj $$2) {
      for (jj $$3 : jj.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jj.a)) {
         return true;
      } else {
         je $$4 = $$1.d();

         for (jj $$5 : jj.values()) {
            if ($$5 != jj.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(duo $$0, deg $$1, je $$2, int $$3, int $$4) {
      jj $$5 = $$0.c(a);
      duo $$6 = $$0.b(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, awe.ub, awf.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dzl.a, $$2, dzl.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         drs $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof duk) {
            ((duk)$$8).k();
         }

         duo $$9 = dhl.bQ.o().b(dug.b, $$5).b(dug.c, this.n ? dvq.b : dvq.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dug.a($$2, $$9, this.o().b(a, jj.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            je $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            duo $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dhl.bQ) && $$1.c_($$10) instanceof duk $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != equ.a && !$$11.a(dhl.by) && !$$11.a(dhl.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awe.ua, awf.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dzl.e, $$2, dzl.a.a($$9));
      }

      return true;
   }

   public static boolean a(duo $$0, deg $$1, je $$2, jj $$3, boolean $$4, jj $$5) {
      if ($$2.v() < $$1.G_() || $$2.v() > $$1.an() || !$$1.A_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dhl.co) || $$0.a(dhl.pk) || $$0.a(dhl.pl) || $$0.a(dhl.to)) {
         return false;
      } else if ($$3 == jj.a && $$2.v() == $$1.G_()) {
         return false;
      } else if ($$3 == jj.b && $$2.v() == $$1.an()) {
         return false;
      } else {
         if (!$$0.a(dhl.by) && !$$0.a(dhl.br)) {
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

   private boolean a(deg $$0, je $$1, jj $$2, boolean $$3) {
      je $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dhl.bz)) {
         $$0.a($$4, dhl.a.o(), 20);
      }

      dul $$5 = new dul($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<je, duo> $$6 = Maps.newHashMap();
         List<je> $$7 = $$5.c();
         List<duo> $$8 = Lists.newArrayList();

         for (je $$9 : $$7) {
            duo $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<je> $$11 = $$5.d();
         duo[] $$12 = new duo[$$7.size() + $$11.size()];
         jj $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            je $$16 = $$11.get($$15);
            duo $$17 = $$0.a_($$16);
            drs $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dhl.a.o(), 18);
            $$0.a(dzl.f, $$16, dzl.a.a($$17));
            if (!$$17.a(awt.aL)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            je $$20 = $$7.get($$19);
            duo $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            duo $$22 = dhl.bQ.o().b(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dug.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dvq $$23 = this.n ? dvq.b : dvq.a;
            duo $$24 = dhl.bz.o().b(dui.a, $$2).b(dui.c, $$23);
            duo $$25 = dhl.bQ.o().b(dug.b, $$2).b(dug.c, this.n ? dvq.b : dvq.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dug.a($$4, $$25, $$24, $$2, true, true));
         }

         duo $$26 = dhl.a.o();

         for (je $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<je, duo> $$28 : $$6.entrySet()) {
            je $$29 = $$28.getKey();
            duo $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         erx $$31 = ert.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            duo $$33 = $$12[$$14++];
            je $$34 = $$11.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$35 = $$7.size() - 1; $$35 >= 0; $$35--) {
            $$0.a($$7.get($$35), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dhl.bz, $$31);
         }

         return true;
      }
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(duo $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
