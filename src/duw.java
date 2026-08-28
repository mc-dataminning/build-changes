import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class duw extends dkb {
   public static final MapCodec<duw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), t()).apply($$0, duw::new)
   );
   public static final dvu c = dvt.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final fab h = dhy.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final fab i = dhy.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fab j = dhy.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final fab k = dhy.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final fab l = dhy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final fab m = dhy.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<duw> a() {
      return b;
   }

   public duw(boolean $$0, dvc.d $$1) {
      super($$1);
      this.l(this.F.b().b(a, jl.c).b(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      if ($$0.c(c)) {
         switch ((jl)$$0.c(a)) {
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
         return ezy.b();
      }
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, buv $$3, cvx $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(dev $$0, jg $$1, dvd $$2) {
      jl $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dva($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         jg $$5 = $$1.a($$3, 2);
         dvd $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dia.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof duz $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.aa() == $$9.u() || ((arm)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dfm $$0, jg $$1, jl $$2) {
      for (jl $$3 : jl.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jl.a)) {
         return true;
      } else {
         jg $$4 = $$1.d();

         for (jl $$5 : jl.values()) {
            if ($$5 != jl.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dvd $$0, dev $$1, jg $$2, int $$3, int $$4) {
      jl $$5 = $$0.c(a);
      dvd $$6 = $$0.b(c, Boolean.valueOf(true));
      if (!$$1.C) {
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
         $$1.a(null, $$2, awk.tZ, awl.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(eaa.a, $$2, eaa.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dsg $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof duz) {
            ((duz)$$8).k();
         }

         dvd $$9 = dia.bQ.m().b(duv.b, $$5).b(duv.c, this.n ? dwf.b : dwf.a);
         $$1.a($$2, $$9, 20);
         $$1.a(duv.a($$2, $$9, this.m().b(a, jl.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            jg $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dvd $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dia.bQ) && $$1.c_($$10) instanceof duz $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != erj.a && !$$11.a(dia.by) && !$$11.a(dia.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awk.tY, awl.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(eaa.e, $$2, eaa.a.a($$9));
      }

      return true;
   }

   public static boolean a(dvd $$0, dev $$1, jg $$2, jl $$3, boolean $$4, jl $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.an() || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dia.co) || $$0.a(dia.pk) || $$0.a(dia.pl) || $$0.a(dia.to)) {
         return false;
      } else if ($$3 == jl.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == jl.b && $$2.v() == $$1.an()) {
         return false;
      } else {
         if (!$$0.a(dia.by) && !$$0.a(dia.br)) {
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

   private boolean a(dev $$0, jg $$1, jl $$2, boolean $$3) {
      jg $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dia.bz)) {
         $$0.a($$4, dia.a.m(), 20);
      }

      dva $$5 = new dva($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<jg, dvd> $$6 = Maps.newHashMap();
         List<jg> $$7 = $$5.c();
         List<dvd> $$8 = Lists.newArrayList();

         for (jg $$9 : $$7) {
            dvd $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<jg> $$11 = $$5.d();
         dvd[] $$12 = new dvd[$$7.size() + $$11.size()];
         jl $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            jg $$16 = $$11.get($$15);
            dvd $$17 = $$0.a_($$16);
            dsg $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dia.a.m(), 18);
            $$0.a(eaa.f, $$16, eaa.a.a($$17));
            if (!$$17.a(awz.aL)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            jg $$20 = $$7.get($$19);
            dvd $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dvd $$22 = dia.bQ.m().b(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(duv.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dwf $$23 = this.n ? dwf.b : dwf.a;
            dvd $$24 = dia.bz.m().b(dux.a, $$2).b(dux.c, $$23);
            dvd $$25 = dia.bQ.m().b(duv.b, $$2).b(duv.c, this.n ? dwf.b : dwf.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(duv.a($$4, $$25, $$24, $$2, true, true));
         }

         dvd $$26 = dia.a.m();

         for (jg $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<jg, dvd> $$28 : $$6.entrySet()) {
            jg $$29 = $$28.getKey();
            dvd $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         esm $$31 = esi.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            dvd $$33 = $$12[$$14++];
            jg $$34 = $$11.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$35 = $$7.size() - 1; $$35 >= 0; $$35--) {
            $$0.a($$7.get($$35), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dia.bz, $$31);
         }

         return true;
      }
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dvd $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
