import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dwk extends dne {
   public static final MapCodec<dwk> a = b(dwk::new);
   public static final ece<jc> b = drf.e;
   public static final ebx c = ebw.A;
   public static final ebx d = ebw.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int g = 10;
   private static final Map<jc, fgm> h = fgj.c(dne.a(6.0, 0.0, 10.0, 10.0, 16.0));

   @Override
   public MapCodec<dwk> a() {
      return a;
   }

   public dwk(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return h.get($$0.c(b));
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      jc $$3 = $$0.c(b);
      iw $$4 = $$2.a($$3.g());
      ebg $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dkc $$2 = $$0.q();
      iw $$3 = $$0.a();
      jc[] $$4 = $$0.f();

      for (jc $$5 : $$4) {
         if ($$5.o().d()) {
            jc $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bxw $$3, daa $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(djz $$0, iw $$1, ebg $$2, boolean $$3, boolean $$4, int $$5, @Nullable ebg $$6) {
      Optional<jc> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jc $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dne $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         ebg[] $$15 = new ebg[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            iw $$17 = $$1.a($$8, $$16);
            ebg $$18 = $$0.a_($$17);
            if ($$18.a(dng.gg)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dng.gh) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (ebg)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dwj.d);
               boolean $$20 = $$18.c(dwj.b);
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
         ebg $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            iw $$22 = $$1.a($$8, $$14);
            jc $$23 = $$8.g();
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
               iw $$25 = $$1.a($$8, $$24);
               ebg $$26 = $$15[$$24];
               if ($$26 != null) {
                  ebg $$27 = $$0.a_($$25);
                  if ($$27.a(dng.gh) || $$27.a(dng.gg)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(djz $$0, iw $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awr.AO, aws.e, 0.4F, 0.6F);
         $$0.a(null, egg.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awr.AN, aws.e, 0.4F, 0.5F);
         $$0.a(null, egg.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awr.AM, aws.e, 0.4F, 0.7F);
         $$0.a(null, egg.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awr.AP, aws.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, egg.g, $$1);
      }
   }

   private static void a(dne $$0, djz $$1, iw $$2, jc $$3) {
      jc $$4 = $$3.g();
      eyy $$5 = eyu.a($$1, $$4, jc.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
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
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d);
   }
}
