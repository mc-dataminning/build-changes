import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dha extends dfi {
   public static final MapCodec<dha> a = b(dha::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dtr> c = List.of(dtq.bp, dtq.bq, dtq.br, dtq.bs, dtq.bt, dtq.bu);

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   public dha(dsz.d $$0) {
      super($$0);
      dta $$1 = this.E.b().a(djs.aE, ji.c);

      for (dtr $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$2.c_($$3) instanceof dqo $$7) {
         if (!$$0.a(awm.aV)) {
            return bqs.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqs.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqs.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqs.a($$2.B);
            }
         }
      } else {
         return bqs.e;
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.c_($$2) instanceof dqo $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqq.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqq.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqq.a($$1.B);
         }
      } else {
         return bqq.e;
      }
   }

   private OptionalInt a(ews $$0, dta $$1) {
      return a($$0, $$1.c(djs.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<ewv> a(ews $$0, ji $$1) {
      ji $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         jd $$3 = $$0.a().a($$2);
         eww $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ewv((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ewv((float)$$5, (float)$$6));
            case e -> Optional.of(new ewv((float)$$7, (float)$$6));
            case f -> Optional.of(new ewv((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dcu $$0, jd $$1, cmv $$2, dqo $$3, cuo $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(avy.c.b($$4.g()));
         avn $$6 = $$4.a(cur.uw) ? avo.fa : avo.eZ;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, avp.e, 1.0F, 1.0F);
      }
   }

   private static void a(dcu $$0, jd $$1, cmv $$2, dqo $$3, int $$4) {
      if (!$$0.B) {
         cuo $$5 = $$3.a($$4, 1);
         avn $$6 = $$5.a(cur.uw) ? avo.fd : avo.fc;
         $$0.a(null, $$1, $$6, avp.e, 1.0F, 1.0F);
         if (!$$2.fZ().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dxw.c, $$1);
      }
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqo($$0, $$1);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(djs.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dqo $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cuo $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bqm.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(djs.aE, $$0.g().g());
   }

   @Override
   public dta a(dta $$0, dmk $$1) {
      return $$0.a(djs.aE, $$1.a($$0.c(djs.aE)));
   }

   @Override
   public dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(djs.aE)));
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dqo $$3 ? $$3.j() + 1 : 0;
      }
   }
}
