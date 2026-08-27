import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ddc extends dbk {
   public static final MapCodec<ddc> a = b(ddc::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dpq> c = List.of(dpp.bp, dpp.bq, dpp.br, dpp.bs, dpp.bt, dpp.bu);

   @Override
   public MapCodec<ddc> a() {
      return a;
   }

   public ddc(doy.d $$0) {
      super($$0);
      doz $$1 = this.E.b().a(dft.aE, ih.c);

      for (dpq $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$2.c_($$3) instanceof dmo $$7) {
         if (!$$0.a(avk.av)) {
            return boc.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return boc.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return boc.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return boc.a($$2.B);
            }
         }
      } else {
         return boc.e;
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.c_($$2) instanceof dmo $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return boa.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return boa.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return boa.a($$1.B);
         }
      } else {
         return boa.d;
      }
   }

   private OptionalInt a(erw $$0, doz $$1) {
      return a($$0, $$1.c(dft.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<erz> a(erw $$0, ih $$1) {
      ih $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ib $$3 = $$0.a().a($$2);
         esa $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new erz((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new erz((float)$$5, (float)$$6));
            case e -> Optional.of(new erz((float)$$7, (float)$$6));
            case f -> Optional.of(new erz((float)(1.0 - $$7), (float)$$6));
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

   private static void a(cyx $$0, ib $$1, cjt $$2, dmo $$3, crj $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(auw.c.b($$4.f()));
         aul $$6 = $$4.a(crm.uu) ? aum.fa : aum.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, aun.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.f(1);
         }
      }
   }

   private static void a(cyx $$0, ib $$1, cjt $$2, dmo $$3, int $$4) {
      if (!$$0.B) {
         crj $$5 = $$3.a($$4, 1);
         aul $$6 = $$5.a(crm.uu) ? aum.fd : aum.fc;
         $$0.a(null, $$1, $$6, aun.e, 1.0F, 1.0F);
         if (!$$2.fZ().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dts.c, $$1);
      }
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmo($$0, $$1);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(dft.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dmo $$6 && !$$6.ah_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               crj $$8 = $$6.a($$7);
               if (!$$8.d()) {
                  bnw.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(dft.aE, $$0.g().g());
   }

   @Override
   public doz a(doz $$0, dik $$1) {
      return $$0.a(dft.aE, $$1.a($$0.c(dft.aE)));
   }

   @Override
   public doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(dft.aE)));
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dmo $$3 ? $$3.j() + 1 : 0;
      }
   }
}
