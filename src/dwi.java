import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dwi extends dnc {
   public static final MapCodec<dwi> a = b(dwi::new);
   public static final ecc<jb> b = drd.e;
   public static final ebv c = ebu.A;
   public static final ebv d = ebu.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int g = 10;
   private static final Map<jb, fgk> h = fgh.c(dnc.a(6.0, 0.0, 10.0, 10.0, 16.0));

   @Override
   public MapCodec<dwi> a() {
      return a;
   }

   public dwi(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return h.get($$0.c(b));
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      jb $$3 = $$0.c(b);
      iv $$4 = $$2.a($$3.g());
      ebe $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dka $$2 = $$0.q();
      iv $$3 = $$0.a();
      jb[] $$4 = $$0.f();

      for (jb $$5 : $$4) {
         if ($$5.o().d()) {
            jb $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bxu $$3, czy $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(djx $$0, iv $$1, ebe $$2, boolean $$3, boolean $$4, int $$5, @Nullable ebe $$6) {
      Optional<jb> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jb $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dnc $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         ebe[] $$15 = new ebe[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            iv $$17 = $$1.a($$8, $$16);
            ebe $$18 = $$0.a_($$17);
            if ($$18.a(dne.gg)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dne.gh) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (ebe)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dwh.d);
               boolean $$20 = $$18.c(dwh.b);
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
         ebe $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            iv $$22 = $$1.a($$8, $$14);
            jb $$23 = $$8.g();
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
               iv $$25 = $$1.a($$8, $$24);
               ebe $$26 = $$15[$$24];
               if ($$26 != null) {
                  ebe $$27 = $$0.a_($$25);
                  if ($$27.a(dne.gh) || $$27.a(dne.gg)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(djx $$0, iv $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awp.AO, awq.e, 0.4F, 0.6F);
         $$0.a(null, ege.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awp.AN, awq.e, 0.4F, 0.5F);
         $$0.a(null, ege.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awp.AM, awq.e, 0.4F, 0.7F);
         $$0.a(null, ege.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awp.AP, awq.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, ege.g, $$1);
      }
   }

   private static void a(dnc $$0, djx $$1, iv $$2, jb $$3) {
      jb $$4 = $$3.g();
      eyw $$5 = eys.a($$1, $$4, jb.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
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
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d);
   }
}
