import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxd extends cvl {
   public static final MapCodec<cxd> a = b(cxd::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<djg> c = List.of(djf.bp, djf.bq, djf.br, djf.bs, djf.bt, djf.bu);

   @Override
   public MapCodec<cxd> a() {
      return a;
   }

   public cxd(dio.d $$0) {
      super($$0);
      dip $$1 = this.E.b().a(czu.aE, ia.c);

      for (djg $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.c_($$2) instanceof dgm $$6) {
         Optional<ela> $$8 = a($$5, $$0.c(czu.aE));
         if ($$8.isEmpty()) {
            return bjl.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(c.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bjl.a($$1.B);
            } else {
               cmh $$10 = $$3.b($$4);
               if ($$10.a(arz.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bjl.a($$1.B);
               } else {
                  return bjl.b;
               }
            }
         }
      } else {
         return bjl.d;
      }
   }

   private static Optional<ela> a(ekx $$0, ia $$1) {
      ia $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         hv $$3 = $$0.a().a($$2);
         elb $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ela((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ela((float)$$5, (float)$$6));
            case e -> Optional.of(new ela((float)$$7, (float)$$6));
            case f -> Optional.of(new ela((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(ela $$0) {
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

   private static void a(csy $$0, hv $$1, cer $$2, dgm $$3, cmh $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(arm.c.b($$4.d()));
         arb $$6 = $$4.a(cmk.up) ? arc.eC : arc.eB;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, ard.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(csy $$0, hv $$1, cer $$2, dgm $$3, int $$4) {
      if (!$$0.B) {
         cmh $$5 = $$3.a($$4, 1);
         arb $$6 = $$5.a(cmk.up) ? arc.eF : arc.eE;
         $$0.a(null, $$1, $$6, ard.e, 1.0F, 1.0F);
         if (!$$2.fS().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dmz.c, $$1);
      }
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgm($$0, $$1);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(czu.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dgm $$6 && !$$6.ai_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cmh $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bjh.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(czu.aE, $$0.g().g());
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(czu.aE, $$1.a($$0.c(czu.aE)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(czu.aE)));
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      if ($$1.y_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dgm $$3 ? $$3.g() + 1 : 0;
      }
   }
}
