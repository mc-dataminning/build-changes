import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dly extends dkg {
   public static final MapCodec<dly> a = b(dly::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dzd> c = List.of(dzc.bs, dzc.bt, dzc.bu, dzc.bv, dzc.bw, dzc.bx);

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   public dly(dyl.d $$0) {
      super($$0);
      dym $$1 = this.B.b().b(dot.e, jo.c);

      for (dzd $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if ($$2.c_($$3) instanceof dvv $$7) {
         if (!$$0.a(axi.aZ)) {
            return btq.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return btq.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return btq.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return btq.a;
            }
         }
      } else {
         return btq.e;
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$1.c_($$2) instanceof dvv $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return btq.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return btq.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return btq.a;
         }
      } else {
         return btq.e;
      }
   }

   private OptionalInt a(fcq $$0, dym $$1) {
      return a($$0, $$1.c(dot.e)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<fct> a(fcq $$0, jo $$1) {
      jo $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         jj $$3 = $$0.b().a($$2);
         fcu $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new fct((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new fct((float)$$5, (float)$$6));
            case e -> Optional.of(new fct((float)$$7, (float)$$6));
            case f -> Optional.of(new fct((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dhp $$0, jj $$1, cqi $$2, dvv $$3, cxy $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(awu.c.b($$4.h()));
         awj $$6 = $$4.a(cyc.vz) ? awk.fc : awk.fb;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awl.e, 1.0F, 1.0F);
      }
   }

   private static void a(dhp $$0, jj $$1, cqi $$2, dvv $$3, int $$4) {
      if (!$$0.C) {
         cxy $$5 = $$3.a($$4, 1);
         awj $$6 = $$5.a(cyc.vz) ? awk.ff : awk.fe;
         $$0.a(null, $$1, $$6, awl.e, 1.0F, 1.0F);
         if (!$$2.gi().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, edm.c, $$1);
      }
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvv($$0, $$1);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(dot.e);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(dot.e, $$0.g().g());
   }

   @Override
   public dym a(dym $$0, drm $$1) {
      return $$0.b(dot.e, $$1.a($$0.c(dot.e)));
   }

   @Override
   public dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(dot.e)));
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      if ($$1.w_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dvv $$3 ? $$3.j() + 1 : 0;
      }
   }
}
