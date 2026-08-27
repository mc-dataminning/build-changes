import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dfe extends ddm {
   public static final MapCodec<dfe> a = b(dfe::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dru> c = List.of(drt.bp, drt.bq, drt.br, drt.bs, drt.bt, drt.bu);

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   public dfe(drc.d $$0) {
      super($$0);
      drd $$1 = this.E.b().a(dhw.aE, it.c);

      for (dru $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$2.c_($$3) instanceof dor $$7) {
         if (!$$0.a(awf.aW)) {
            return bpy.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bpy.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bpy.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bpy.a($$2.B);
            }
         }
      } else {
         return bpy.e;
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.c_($$2) instanceof dor $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bpw.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bpw.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bpw.a($$1.B);
         }
      } else {
         return bpw.d;
      }
   }

   private OptionalInt a(eui $$0, drd $$1) {
      return a($$0, $$1.c(dhw.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<eul> a(eui $$0, it $$1) {
      it $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         io $$3 = $$0.a().a($$2);
         eum $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new eul((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new eul((float)$$5, (float)$$6));
            case e -> Optional.of(new eul((float)$$7, (float)$$6));
            case f -> Optional.of(new eul((float)(1.0 - $$7), (float)$$6));
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

   private static void a(daz $$0, io $$1, cly $$2, dor $$3, ctq $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(avs.c.b($$4.g()));
         avh $$6 = $$4.a(ctt.uw) ? avi.fa : avi.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, avj.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(daz $$0, io $$1, cly $$2, dor $$3, int $$4) {
      if (!$$0.B) {
         ctq $$5 = $$3.a($$4, 1);
         avh $$6 = $$5.a(ctt.uw) ? avi.fd : avi.fc;
         $$0.a(null, $$1, $$6, avj.e, 1.0F, 1.0F);
         if (!$$2.gc().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dvw.c, $$1);
      }
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new dor($$0, $$1);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(dhw.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dor $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               ctq $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bps.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(dhw.aE, $$0.g().g());
   }

   @Override
   public drd a(drd $$0, dkn $$1) {
      return $$0.a(dhw.aE, $$1.a($$0.c(dhw.aE)));
   }

   @Override
   public drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(dhw.aE)));
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dor $$3 ? $$3.j() + 1 : 0;
      }
   }
}
