import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dge extends dem {
   public static final MapCodec<dge> a = b(dge::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dsu> c = List.of(dst.bp, dst.bq, dst.br, dst.bs, dst.bt, dst.bu);

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   public dge(dsc.d $$0) {
      super($$0);
      dsd $$1 = this.E.b().a(diw.aE, je.c);

      for (dsu $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$2.c_($$3) instanceof dpr $$7) {
         if (!$$0.a(awy.aW)) {
            return bqx.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqx.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqx.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqx.a($$2.B);
            }
         }
      } else {
         return bqx.e;
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.c_($$2) instanceof dpr $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqv.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqv.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqv.a($$1.B);
         }
      } else {
         return bqv.e;
      }
   }

   private OptionalInt a(evo $$0, dsd $$1) {
      return a($$0, $$1.c(diw.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<evr> a(evo $$0, je $$1) {
      je $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iz $$3 = $$0.a().a($$2);
         evs $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new evr((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new evr((float)$$5, (float)$$6));
            case e -> Optional.of(new evr((float)$$7, (float)$$6));
            case f -> Optional.of(new evr((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dbz $$0, iz $$1, cmy $$2, dpr $$3, cuq $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(awk.c.b($$4.g()));
         avz $$6 = $$4.a(cut.uw) ? awa.fa : awa.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(dbz $$0, iz $$1, cmy $$2, dpr $$3, int $$4) {
      if (!$$0.B) {
         cuq $$5 = $$3.a($$4, 1);
         avz $$6 = $$5.a(cut.uw) ? awa.fd : awa.fc;
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         if (!$$2.gc().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dww.c, $$1);
      }
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpr($$0, $$1);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(diw.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dpr $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cuq $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bqr.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(diw.aE, $$0.g().g());
   }

   @Override
   public dsd a(dsd $$0, dln $$1) {
      return $$0.a(diw.aE, $$1.a($$0.c(diw.aE)));
   }

   @Override
   public dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(diw.aE)));
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dpr $$3 ? $$3.j() + 1 : 0;
      }
   }
}
