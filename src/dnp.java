import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnp extends dey {
   public static final MapCodec<dnp> a = b(dnp::new);
   public static final dsv b = diu.aE;
   public static final dss c = dsr.w;
   public static final dss d = dsr.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final ewj h = dey.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final ewj i = dey.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final ewj j = dey.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewj k = dey.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
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
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      je $$3 = $$0.c(b);
      iz $$4 = $$2.a($$3.g());
      dsb $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      dca $$2 = $$0.q();
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
   public void a(dbx $$0, iz $$1, dsb $$2, bto $$3, cuo $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dbx $$0, iz $$1, dsb $$2, boolean $$3, boolean $$4, int $$5, @Nullable dsb $$6) {
      Optional<je> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         je $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dey $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dsb[] $$15 = new dsb[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            iz $$17 = $$1.a($$8, $$16);
            dsb $$18 = $$0.a_($$17);
            if ($$18.a(dfa.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dfa.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dsb)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dno.d);
               boolean $$20 = $$18.c(dno.b);
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
         dsb $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
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
               dsb $$26 = $$15[$$24];
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
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dbx $$0, iz $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, avz.zH, awa.e, 0.4F, 0.6F);
         $$0.a(null, dwu.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, avz.zG, awa.e, 0.4F, 0.5F);
         $$0.a(null, dwu.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, avz.zF, awa.e, 0.4F, 0.7F);
         $$0.a(null, dwu.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, avz.zI, awa.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dwu.g, $$1);
      }
   }

   private static void a(dey $$0, dbx $$1, iz $$2, je $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
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
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dsb $$0, dbd $$1, iz $$2, je $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean e_(dsb $$0) {
      return true;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c, d);
   }
}
