import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnl extends deu {
   public static final MapCodec<dnl> a = b(dnl::new);
   public static final dsr b = diq.aE;
   public static final dso c = dsn.w;
   public static final dso d = dsn.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final ewf h = deu.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final ewf i = deu.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final ewf j = deu.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewf k = deu.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   public dnl(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
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
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      je $$3 = $$0.c(b);
      iz $$4 = $$2.a($$3.g());
      drx $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = this.n().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      dbw $$2 = $$0.q();
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
   public void a(dbt $$0, iz $$1, drx $$2, btk $$3, cuk $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dbt $$0, iz $$1, drx $$2, boolean $$3, boolean $$4, int $$5, @Nullable drx $$6) {
      Optional<je> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         je $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         deu $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         drx[] $$15 = new drx[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            iz $$17 = $$1.a($$8, $$16);
            drx $$18 = $$0.a_($$17);
            if ($$18.a(dew.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dew.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (drx)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dnk.d);
               boolean $$20 = $$18.c(dnk.b);
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
         drx $$21 = $$11.n().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
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
               drx $$26 = $$15[$$24];
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
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dbt $$0, iz $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, avw.zH, avx.e, 0.4F, 0.6F);
         $$0.a(null, dwq.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, avw.zG, avx.e, 0.4F, 0.5F);
         $$0.a(null, dwq.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, avw.zF, avx.e, 0.4F, 0.7F);
         $$0.a(null, dwq.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, avw.zI, avx.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dwq.g, $$1);
      }
   }

   private static void a(deu $$0, dbt $$1, iz $$2, je $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
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
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(drx $$0, daz $$1, iz $$2, je $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c, d);
   }
}
