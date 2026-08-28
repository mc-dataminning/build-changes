import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dwu extends dno {
   public static final MapCodec<dwu> a = b(dwu::new);
   public static final eco<jc> b = drp.e;
   public static final ech c = ecg.A;
   public static final ech d = ecg.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int g = 10;
   private static final Map<jc, fgw> h = fgt.c(dno.a(6.0, 0.0, 10.0, 10.0, 16.0));

   @Override
   public MapCodec<dwu> a() {
      return a;
   }

   public dwu(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return h.get($$0.c(b));
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      jc $$3 = $$0.c(b);
      iw $$4 = $$2.a($$3.g());
      ebq $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dkm $$2 = $$0.q();
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
   public void a(dkj $$0, iw $$1, ebq $$2, byf $$3, dak $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, boolean $$3, boolean $$4, int $$5, @Nullable ebq $$6) {
      Optional<jc> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jc $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dno $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         ebq[] $$15 = new ebq[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            iw $$17 = $$1.a($$8, $$16);
            ebq $$18 = $$0.a_($$17);
            if ($$18.a(dnq.gg)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dnq.gh) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (ebq)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dwt.d);
               boolean $$20 = $$18.c(dwt.b);
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
         ebq $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
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
               ebq $$26 = $$15[$$24];
               if ($$26 != null) {
                  ebq $$27 = $$0.a_($$25);
                  if ($$27.a(dnq.gh) || $$27.a(dnq.gg)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dkj $$0, iw $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awy.AO, awz.e, 0.4F, 0.6F);
         $$0.a(null, egq.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awy.AN, awz.e, 0.4F, 0.5F);
         $$0.a(null, egq.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awy.AM, awz.e, 0.4F, 0.7F);
         $$0.a(null, egq.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awy.AP, awz.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, egq.g, $$1);
      }
   }

   private static void a(dno $$0, dkj $$1, iw $$2, jc $$3) {
      jc $$4 = $$3.g();
      ezi $$5 = eze.a($$1, $$4, jc.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
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
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d);
   }
}
