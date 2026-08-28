import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class duu extends dlu {
   public static final MapCodec<duu> a = b(duu::new);
   public static final eam<ja> b = dpt.e;
   public static final eaf c = eae.A;
   public static final eaf d = eae.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int g = 10;
   private static final Map<ja, feq> h = fen.c(dlu.a(6.0, 0.0, 10.0, 10.0, 16.0));

   @Override
   public MapCodec<duu> a() {
      return a;
   }

   public duu(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return h.get($$0.c(b));
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      ja $$3 = $$0.c(b);
      iu $$4 = $$2.a($$3.g());
      dzo $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dis $$2 = $$0.q();
      iu $$3 = $$0.a();
      ja[] $$4 = $$0.f();

      for (ja $$5 : $$4) {
         if ($$5.o().d()) {
            ja $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwz $$3, cys $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dip $$0, iu $$1, dzo $$2, boolean $$3, boolean $$4, int $$5, @Nullable dzo $$6) {
      Optional<ja> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ja $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dlu $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dzo[] $$15 = new dzo[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            iu $$17 = $$1.a($$8, $$16);
            dzo $$18 = $$0.a_($$17);
            if ($$18.a(dlw.gc)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dlw.gd) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dzo)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dut.d);
               boolean $$20 = $$18.c(dut.b);
               $$13 |= $$19 && $$20;
               $$15[$$16] = $$18;
               if ($$16 == $$5) {
                  $$0.a($$1, $$11, 10);
                  $$12 &= $$19;
               }
            }
         }

         $$12 &= $$14 > 1;
         $$13 &= $$12;
         dzo $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            iu $$22 = $$1.a($$8, $$14);
            ja $$23 = $$8.g();
            $$0.a($$22, $$21.b(b, $$23), 3);
            a($$11, $$0, $$22, $$23);
            a($$0, $$22, $$12, $$13, $$9, $$10);
         }

         a($$0, $$1, $$12, $$13, $$9, $$10);
         if (!$$3) {
            $$0.a($$1, $$21.b(b, $$8), 3);
            if ($$4) {
               a($$11, $$0, $$1, $$8);
            }
         }

         if ($$9 != $$12) {
            for (int $$24 = 1; $$24 < $$14; $$24++) {
               iu $$25 = $$1.a($$8, $$24);
               dzo $$26 = $$15[$$24];
               if ($$26 != null) {
                  dzo $$27 = $$0.a_($$25);
                  if ($$27.a(dlw.gd) || $$27.a(dlw.gc)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dip $$0, iu $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awl.AI, awm.e, 0.4F, 0.6F);
         $$0.a(null, eeo.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awl.AH, awm.e, 0.4F, 0.5F);
         $$0.a(null, eeo.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awl.AG, awm.e, 0.4F, 0.7F);
         $$0.a(null, eeo.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awl.AJ, awm.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, eeo.g, $$1);
      }
   }

   private static void a(dlu $$0, dip $$1, iu $$2, ja $$3) {
      ja $$4 = $$3.g();
      exd $$5 = ewz.a($$1, $$4, ja.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = $$0.c(c);
         if ($$4 || $$5) {
            a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$5) {
            a(this, $$1, $$2, $$0.c(b));
         }
      }
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d);
   }
}
