import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dno extends dex {
   public static final MapCodec<dno> a = b(dno::new);
   public static final dsu b = dit.aE;
   public static final dsr c = dsq.w;
   public static final dsr d = dsq.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final ewi h = dex.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final ewi i = dex.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final ewi j = dex.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewi k = dex.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   public dno(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      switch ((je)$$0.c(b)) {
         case f:
         default:
            return k;
         case e:
            return j;
         case d:
            return i;
         case c:
            return h;
      }
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      je $$3 = $$0.c(b);
      iz $$4 = $$2.a($$3.g());
      dsa $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      dbz $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
         if ($$5.o().d()) {
            je $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, btn $$3, cun $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, boolean $$3, boolean $$4, int $$5, @Nullable dsa $$6) {
      Optional<je> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         je $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dex $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dsa[] $$15 = new dsa[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            iz $$17 = $$1.a($$8, $$16);
            dsa $$18 = $$0.a_($$17);
            if ($$18.a(dez.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dez.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dsa)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dnn.d);
               boolean $$20 = $$18.c(dnn.b);
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
         dsa $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            iz $$22 = $$1.a($$8, $$14);
            je $$23 = $$8.g();
            $$0.a($$22, $$21.a(b, $$23), 3);
            a($$11, $$0, $$22, $$23);
            a($$0, $$22, $$12, $$13, $$9, $$10);
         }

         a($$0, $$1, $$12, $$13, $$9, $$10);
         if (!$$3) {
            $$0.a($$1, $$21.a(b, $$8), 3);
            if ($$4) {
               a($$11, $$0, $$1, $$8);
            }
         }

         if ($$9 != $$12) {
            for (int $$24 = 1; $$24 < $$14; $$24++) {
               iz $$25 = $$1.a($$8, $$24);
               dsa $$26 = $$15[$$24];
               if ($$26 != null) {
                  $$0.a($$25, $$26.b(d, Boolean.valueOf($$12)), 3);
                  if (!$$0.a_($$25).i()) {
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dbw $$0, iz $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, avz.zH, awa.e, 0.4F, 0.6F);
         $$0.a(null, dwt.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, avz.zG, awa.e, 0.4F, 0.5F);
         $$0.a(null, dwt.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, avz.zF, awa.e, 0.4F, 0.7F);
         $$0.a(null, dwt.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, avz.zI, awa.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dwt.g, $$1);
      }
   }

   private static void a(dex $$0, dbw $$1, iz $$2, je $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         boolean $$5 = $$0.c(d);
         boolean $$6 = $$0.c(c);
         if ($$5 || $$6) {
            a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$6) {
            $$1.a($$2, this);
            $$1.a($$2.a($$0.c(b).g()), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dsa $$0, dbc $$1, iz $$2, je $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean e_(dsa $$0) {
      return true;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c, d);
   }
}
