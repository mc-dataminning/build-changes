import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class drq extends dgx {
   public static final MapCodec<drq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, drq::new)
   );
   public static final dso c = dsn.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final ewf h = deu.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final ewf i = deu.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewf j = deu.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final ewf k = deu.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final ewf l = deu.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final ewf m = deu.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<drq> a() {
      return b;
   }

   public drq(boolean $$0, drw.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, je.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
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
         return ewc.b();
      }
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, btk $$3, cuk $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(dbt $$0, iz $$1, drx $$2) {
      je $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dru($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         iz $$5 = $$1.a($$3, 2);
         drx $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dew.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof drt $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Z() == $$9.l() || ((arb)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dcj $$0, iz $$1, je $$2) {
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
   protected boolean a(drx $$0, dbt $$1, iz $$2, int $$3, int $$4) {
      je $$5 = $$0.c(a);
      drx $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, avw.tX, avx.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dwq.a, $$2, dwq.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dpc $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof drt) {
            ((drt)$$8).k();
         }

         drx $$9 = dew.bQ.n().a(drp.b, $$5).a(drp.c, this.n ? dsz.b : dsz.a);
         $$1.a($$2, $$9, 20);
         $$1.a(drp.a($$2, $$9, this.n().a(a, je.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            iz $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            drx $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dew.bQ) && $$1.c_($$10) instanceof drt $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != env.a && !$$11.a(dew.by) && !$$11.a(dew.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, avw.tW, avx.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dwq.e, $$2, dwq.a.a($$9));
      }

      return true;
   }

   public static boolean a(drx $$0, dbt $$1, iz $$2, je $$3, boolean $$4, je $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.am() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dew.co) || $$0.a(dew.pk) || $$0.a(dew.pl) || $$0.a(dew.to)) {
         return false;
      } else if ($$3 == je.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == je.b && $$2.v() == $$1.am() - 1) {
         return false;
      } else {
         if (!$$0.a(dew.by) && !$$0.a(dew.br)) {
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

   private boolean a(dbt $$0, iz $$1, je $$2, boolean $$3) {
      iz $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dew.bz)) {
         $$0.a($$4, dew.a.n(), 20);
      }

      dru $$5 = new dru($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<iz, drx> $$6 = Maps.newHashMap();
         List<iz> $$7 = $$5.c();
         List<drx> $$8 = Lists.newArrayList();

         for (iz $$9 : $$7) {
            drx $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<iz> $$11 = $$5.d();
         drx[] $$12 = new drx[$$7.size() + $$11.size()];
         je $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            iz $$16 = $$11.get($$15);
            drx $$17 = $$0.a_($$16);
            dpc $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dew.a.n(), 18);
            $$0.a(dwq.f, $$16, dwq.a.a($$17));
            if (!$$17.a(awl.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            iz $$20 = $$7.get($$19);
            drx $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            drx $$22 = dew.bQ.n().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(drp.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dsz $$23 = this.n ? dsz.b : dsz.a;
            drx $$24 = dew.bz.n().a(drr.a, $$2).a(drr.c, $$23);
            drx $$25 = dew.bQ.n().a(drp.b, $$2).a(drp.c, this.n ? dsz.b : dsz.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(drp.a($$4, $$25, $$24, $$2, true, true));
         }

         drx $$26 = dew.a.n();

         for (iz $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<iz, drx> $$28 : $$6.entrySet()) {
            iz $$29 = $$28.getKey();
            drx $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            drx $$32 = $$12[$$14++];
            iz $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dew.bz);
         }

         return true;
      }
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean f_(drx $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
