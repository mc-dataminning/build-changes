import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cug extends cso {
   public static final MapCodec<cug> a = b(cug::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dfu> c = List.of(dft.bp, dft.bq, dft.br, dft.bs, dft.bt, dft.bu);

   @Override
   public MapCodec<cug> a() {
      return a;
   }

   public cug(dfc.d $$0) {
      super($$0);
      dfd $$1 = this.E.b().a(cww.aE, ha.c);

      for (dfu $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.c_($$2) instanceof ddi $$6) {
         Optional<ehg> $$8 = a($$5, $$0.c(cww.aE));
         if ($$8.isEmpty()) {
            return bhe.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(c.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bhe.a($$1.B);
            } else {
               cjl $$10 = $$3.b($$4);
               if ($$10.a(aqd.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bhe.a($$1.B);
               } else {
                  return bhe.b;
               }
            }
         }
      } else {
         return bhe.d;
      }
   }

   private static Optional<ehg> a(ehd $$0, ha $$1) {
      ha $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         gw $$3 = $$0.a().a($$2);
         ehh $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ehg((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ehg((float)$$5, (float)$$6));
            case e -> Optional.of(new ehg((float)$$7, (float)$$6));
            case f -> Optional.of(new ehg((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(ehg $$0) {
      int $$1 = $$0.j >= 0.5F ? 0 : 1;
      int $$2 = a($$0.i);
      return $$2 + $$1 * 3;
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

   private static void a(cqb $$0, gw $$1, cca $$2, ddi $$3, cjl $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(apq.c.b($$4.d()));
         apf $$6 = $$4.a(cjo.tC) ? apg.et : apg.es;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, aph.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cqb $$0, gw $$1, cca $$2, ddi $$3, int $$4) {
      if (!$$0.B) {
         cjl $$5 = $$3.a($$4, 1);
         apf $$6 = $$5.a(cjo.tC) ? apg.ew : apg.ev;
         $$0.a(null, $$1, $$6, aph.e, 1.0F, 1.0F);
         if (!$$2.fS().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, djn.c, $$1);
      }
   }

   @Nullable
   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddi($$0, $$1);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(cww.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof ddi $$6 && !$$6.af_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cjl $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bha.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(cww.aE, $$0.g().g());
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(cww.aE, $$1.a($$0.c(cww.aE)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(cww.aE)));
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      if ($$1.w_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof ddi $$3 ? $$3.g() + 1 : 0;
      }
   }
}
