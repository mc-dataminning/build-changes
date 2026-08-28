import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dlh extends djp {
   public static final MapCodec<dlh> a = b(dlh::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dyf> c = List.of(dye.bs, dye.bt, dye.bu, dye.bv, dye.bw, dye.bx);

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   public dlh(dxn.d $$0) {
      super($$0);
      dxo $$1 = this.F.b().b(dob.aF, jm.c);

      for (dyf $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if ($$2.c_($$3) instanceof duz $$7) {
         if (!$$0.a(axt.bb)) {
            return bta.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bta.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bta.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bta.a;
            }
         }
      } else {
         return bta.e;
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$1.c_($$2) instanceof duz $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bta.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bta.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bta.a;
         }
      } else {
         return bta.e;
      }
   }

   private OptionalInt a(fbn $$0, dxo $$1) {
      return a($$0, $$1.c(dob.aF)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<fbq> a(fbn $$0, jm $$1) {
      jm $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         jh $$3 = $$0.b().a($$2);
         fbr $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new fbq((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new fbq((float)$$5, (float)$$6));
            case e -> Optional.of(new fbq((float)$$7, (float)$$6));
            case f -> Optional.of(new fbq((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dgz $$0, jh $$1, cpo $$2, duz $$3, cxg $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(axf.c.b($$4.h()));
         awu $$6 = $$4.a(cxk.vv) ? awv.fc : awv.fb;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, aww.e, 1.0F, 1.0F);
      }
   }

   private static void a(dgz $$0, jh $$1, cpo $$2, duz $$3, int $$4) {
      if (!$$0.C) {
         cxg $$5 = $$3.a($$4, 1);
         awu $$6 = $$5.a(cxk.vv) ? awv.ff : awv.fe;
         $$0.a(null, $$1, $$6, aww.e, 1.0F, 1.0F);
         if (!$$2.gi().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, eck.c, $$1);
      }
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new duz($$0, $$1);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(dob.aF);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         boolean $$9;
         label32: {
            if ($$1.c_($$2) instanceof duz $$6 && !$$6.c()) {
               for (int $$7 = 0; $$7 < 6; $$7++) {
                  cxg $$8 = $$6.a($$7);
                  if (!$$8.f()) {
                     bsw.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
                  }
               }

               $$6.a();
               $$9 = true;
               break label32;
            }

            $$9 = false;
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$9) {
            $$1.c($$2, this);
         }
      }
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(dob.aF, $$0.g().g());
   }

   @Override
   public dxo a(dxo $$0, dqv $$1) {
      return $$0.b(dob.aF, $$1.a($$0.c(dob.aF)));
   }

   @Override
   public dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(dob.aF)));
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      if ($$1.B_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof duz $$3 ? $$3.j() + 1 : 0;
      }
   }
}
