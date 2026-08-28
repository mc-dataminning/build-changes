import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dgc extends dek {
   public static final MapCodec<dgc> a = b(dgc::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dss> c = List.of(dsr.bp, dsr.bq, dsr.br, dsr.bs, dsr.bt, dsr.bu);

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   public dgc(dsa.d $$0) {
      super($$0);
      dsb $$1 = this.E.b().a(diu.aE, je.c);

      for (dss $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if ($$2.c_($$3) instanceof dpp $$7) {
         if (!$$0.a(awx.aW)) {
            return bqv.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqv.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqv.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqv.a($$2.B);
            }
         }
      } else {
         return bqv.e;
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.c_($$2) instanceof dpp $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqt.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqt.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqt.a($$1.B);
         }
      } else {
         return bqt.e;
      }
   }

   private OptionalInt a(evm $$0, dsb $$1) {
      return a($$0, $$1.c(diu.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<evp> a(evm $$0, je $$1) {
      je $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iz $$3 = $$0.a().a($$2);
         evq $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new evp((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new evp((float)$$5, (float)$$6));
            case e -> Optional.of(new evp((float)$$7, (float)$$6));
            case f -> Optional.of(new evp((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dbx $$0, iz $$1, cmw $$2, dpp $$3, cuo $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(awj.c.b($$4.g()));
         avy $$6 = $$4.a(cur.uw) ? avz.fa : avz.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, awa.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(dbx $$0, iz $$1, cmw $$2, dpp $$3, int $$4) {
      if (!$$0.B) {
         cuo $$5 = $$3.a($$4, 1);
         avy $$6 = $$5.a(cur.uw) ? avz.fd : avz.fc;
         $$0.a(null, $$1, $$6, awa.e, 1.0F, 1.0F);
         if (!$$2.gc().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dwu.c, $$1);
      }
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpp($$0, $$1);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(diu.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dpp $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cuo $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bqp.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(diu.aE, $$0.g().g());
   }

   @Override
   public dsb a(dsb $$0, dll $$1) {
      return $$0.a(diu.aE, $$1.a($$0.c(diu.aE)));
   }

   @Override
   public dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(diu.aE)));
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dpp $$3 ? $$3.j() + 1 : 0;
      }
   }
}
