import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class daj extends cyr {
   public static final MapCodec<daj> a = b(daj::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dmv> c = List.of(dmu.bp, dmu.bq, dmu.br, dmu.bs, dmu.bt, dmu.bu);

   @Override
   public MapCodec<daj> a() {
      return a;
   }

   public daj(dmd.d $$0) {
      super($$0);
      dme $$1 = this.E.b().a(dda.aE, ih.c);

      for (dmv $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$2.c_($$3) instanceof dju $$7) {
         if (!$$0.a(aum.av)) {
            return bmn.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bmn.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bmn.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bmn.a($$2.B);
            }
         }
      } else {
         return bmn.e;
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.c_($$2) instanceof dju $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bml.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bml.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bml.a($$1.B);
         }
      } else {
         return bml.d;
      }
   }

   private OptionalInt a(eor $$0, dme $$1) {
      return a($$0, $$1.c(dda.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<eou> a(eor $$0, ih $$1) {
      ih $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ib $$3 = $$0.a().a($$2);
         eov $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new eou((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new eou((float)$$5, (float)$$6));
            case e -> Optional.of(new eou((float)$$7, (float)$$6));
            case f -> Optional.of(new eou((float)(1.0 - $$7), (float)$$6));
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

   private static void a(cwe $$0, ib $$1, cia $$2, dju $$3, cpq $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(atz.c.b($$4.d()));
         ato $$6 = $$4.a(cpt.us) ? atp.eS : atp.eR;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, atq.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cwe $$0, ib $$1, cia $$2, dju $$3, int $$4) {
      if (!$$0.B) {
         cpq $$5 = $$3.a($$4, 1);
         ato $$6 = $$5.a(cpt.us) ? atp.eV : atp.eU;
         $$0.a(null, $$1, $$6, atq.e, 1.0F, 1.0F);
         if (!$$2.fV().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dqr.c, $$1);
      }
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new dju($$0, $$1);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(dda.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dju $$6 && !$$6.aj_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cpq $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bmh.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(dda.aE, $$0.g().g());
   }

   @Override
   public dme a(dme $$0, dfr $$1) {
      return $$0.a(dda.aE, $$1.a($$0.c(dda.aE)));
   }

   @Override
   public dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(dda.aE)));
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      if ($$1.y_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dju $$3 ? $$3.j() + 1 : 0;
      }
   }
}
