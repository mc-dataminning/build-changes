import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dbg extends czo {
   public static final MapCodec<dbg> a = b(dbg::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dns> c = List.of(dnr.bp, dnr.bq, dnr.br, dnr.bs, dnr.bt, dnr.bu);

   @Override
   public MapCodec<dbg> a() {
      return a;
   }

   public dbg(dna.d $$0) {
      super($$0);
      dnb $$1 = this.E.b().a(ddx.aE, ih.c);

      for (dns $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$2.c_($$3) instanceof dkr $$7) {
         if (!$$0.a(auv.av)) {
            return bnf.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bnf.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bnf.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bnf.a($$2.B);
            }
         }
      } else {
         return bnf.e;
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.c_($$2) instanceof dkr $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bnd.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bnd.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bnd.a($$1.B);
         }
      } else {
         return bnd.d;
      }
   }

   private OptionalInt a(epp $$0, dnb $$1) {
      return a($$0, $$1.c(ddx.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<eps> a(epp $$0, ih $$1) {
      ih $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ib $$3 = $$0.a().a($$2);
         ept $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new eps((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new eps((float)$$5, (float)$$6));
            case e -> Optional.of(new eps((float)$$7, (float)$$6));
            case f -> Optional.of(new eps((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(float $$0) {
      float $$1 = 0.0625F;
      float $$2 = 0.375F;
      if ($$0 < 0.375F) {
         return 0;
      } else {
         float $$3 = 0.6875F;
         return $$0 < 0.6875F ? 1 : 2;
      }
   }

   private static void a(cxb $$0, ib $$1, ciu $$2, dkr $$3, cqm $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(aui.c.b($$4.d()));
         atx $$6 = $$4.a(cqp.uu) ? aty.eZ : aty.eY;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, atz.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cxb $$0, ib $$1, ciu $$2, dkr $$3, int $$4) {
      if (!$$0.B) {
         cqm $$5 = $$3.a($$4, 1);
         atx $$6 = $$5.a(cqp.uu) ? aty.fc : aty.fb;
         $$0.a(null, $$1, $$6, atz.e, 1.0F, 1.0F);
         if (!$$2.fZ().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, drp.c, $$1);
      }
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkr($$0, $$1);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(ddx.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dkr $$6 && !$$6.ai_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cqm $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bmz.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(ddx.aE, $$0.g().g());
   }

   @Override
   public dnb a(dnb $$0, dgo $$1) {
      return $$0.a(ddx.aE, $$1.a($$0.c(ddx.aE)));
   }

   @Override
   public dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(ddx.aE)));
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dkr $$3 ? $$3.j() + 1 : 0;
      }
   }
}
