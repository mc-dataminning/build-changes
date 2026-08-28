import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dvl extends dmf {
   public static final MapCodec<dvl> a = b(dvl::new);
   public static final ebf<ja> b = dqg.e;
   public static final eay c = eax.A;
   public static final eay d = eax.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int g = 10;
   private static final Map<ja, ffk> h = ffh.c(dmf.a(6.0, 0.0, 10.0, 10.0, 16.0));

   @Override
   public MapCodec<dvl> a() {
      return a;
   }

   public dvl(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return h.get($$0.c(b));
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      ja $$3 = $$0.c(b);
      iu $$4 = $$2.a($$3.g());
      eah $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      djd $$2 = $$0.q();
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
   public void a(dja $$0, iu $$1, eah $$2, bxe $$3, czd $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dja $$0, iu $$1, eah $$2, boolean $$3, boolean $$4, int $$5, @Nullable eah $$6) {
      Optional<ja> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ja $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dmf $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         eah[] $$15 = new eah[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            iu $$17 = $$1.a($$8, $$16);
            eah $$18 = $$0.a_($$17);
            if ($$18.a(dmh.gg)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dmh.gh) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (eah)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dvk.d);
               boolean $$20 = $$18.c(dvk.b);
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
         eah $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
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
               eah $$26 = $$15[$$24];
               if ($$26 != null) {
                  eah $$27 = $$0.a_($$25);
                  if ($$27.a(dmh.gh) || $$27.a(dmh.gg)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dja $$0, iu $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awn.AO, awo.e, 0.4F, 0.6F);
         $$0.a(null, efh.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awn.AN, awo.e, 0.4F, 0.5F);
         $$0.a(null, efh.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awn.AM, awo.e, 0.4F, 0.7F);
         $$0.a(null, efh.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awn.AP, awo.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, efh.g, $$1);
      }
   }

   private static void a(dmf $$0, dja $$1, iu $$2, ja $$3) {
      ja $$4 = $$3.g();
      exw $$5 = exs.a($$1, $$4, ja.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
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
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d);
   }
}
