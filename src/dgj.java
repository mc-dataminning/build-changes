import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dgj extends der {
   public static final MapCodec<dgj> a = b(dgj::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dsy> c = List.of(dsx.bp, dsx.bq, dsx.br, dsx.bs, dsx.bt, dsx.bu);

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public dgj(dsg.d $$0) {
      super($$0);
      dsh $$1 = this.E.b().a(djb.aE, jf.c);

      for (dsy $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$2.c_($$3) instanceof dpw $$7) {
         if (!$$0.a(awd.aW)) {
            return bqf.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqf.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqf.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqf.a($$2.B);
            }
         }
      } else {
         return bqf.e;
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.c_($$2) instanceof dpw $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqd.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqd.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqd.a($$1.B);
         }
      } else {
         return bqd.e;
      }
   }

   private OptionalInt a(evv $$0, dsh $$1) {
      return a($$0, $$1.c(djb.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<evy> a(evv $$0, jf $$1) {
      jf $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ja $$3 = $$0.a().a($$2);
         evz $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new evy((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new evy((float)$$5, (float)$$6));
            case e -> Optional.of(new evy((float)$$7, (float)$$6));
            case f -> Optional.of(new evy((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dcd $$0, ja $$1, cmh $$2, dpw $$3, cua $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(avp.c.b($$4.g()));
         ave $$6 = $$4.a(cud.uw) ? avf.fa : avf.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, avg.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(dcd $$0, ja $$1, cmh $$2, dpw $$3, int $$4) {
      if (!$$0.B) {
         cua $$5 = $$3.a($$4, 1);
         ave $$6 = $$5.a(cud.uw) ? avf.fd : avf.fc;
         $$0.a(null, $$1, $$6, avg.e, 1.0F, 1.0F);
         if (!$$2.fY().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dxa.c, $$1);
      }
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpw($$0, $$1);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(djb.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dpw $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cua $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bpz.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(djb.aE, $$0.g().g());
   }

   @Override
   public dsh a(dsh $$0, dls $$1) {
      return $$0.a(djb.aE, $$1.a($$0.c(djb.aE)));
   }

   @Override
   public dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(djb.aE)));
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dpw $$3 ? $$3.j() + 1 : 0;
      }
   }
}
