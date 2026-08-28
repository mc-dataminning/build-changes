import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dmy extends dlg {
   public static final MapCodec<dmy> a = b(dmy::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<eaf> c = List.of(eae.bs, eae.bt, eae.bu, eae.bv, eae.bw, eae.bx);

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   public dmy(dzn.d $$0) {
      super($$0);
      dzo $$1 = this.B.b().b(dpt.e, ja.c);

      for (eaf $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if ($$2.c_($$3) instanceof dwx $$7) {
         if (!$$0.a(axi.aZ)) {
            return bty.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bty.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bty.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bty.a;
            }
         }
      } else {
         return bty.e;
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$1.c_($$2) instanceof dwx $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bty.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bty.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bty.a;
         }
      } else {
         return bty.e;
      }
   }

   private OptionalInt a(fds $$0, dzo $$1) {
      return a($$0, $$1.c(dpt.e)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<fdv> a(fds $$0, ja $$1) {
      ja $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iu $$3 = $$0.b().a($$2);
         fdw $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new fdv((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new fdv((float)$$5, (float)$$6));
            case e -> Optional.of(new fdv((float)$$7, (float)$$6));
            case f -> Optional.of(new fdv((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dip $$0, iu $$1, cqs $$2, dwx $$3, cys $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(awv.c.b($$4.h()));
         awk $$6 = $$4.a(cyw.vz) ? awl.fc : awl.fb;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awm.e, 1.0F, 1.0F);
      }
   }

   private static void a(dip $$0, iu $$1, cqs $$2, dwx $$3, int $$4) {
      if (!$$0.C) {
         cys $$5 = $$3.a($$4, 1);
         awk $$6 = $$5.a(cyw.vz) ? awl.ff : awl.fe;
         $$0.a(null, $$1, $$6, awm.e, 1.0F, 1.0F);
         if (!$$2.gi().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, eeo.c, $$1);
      }
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwx($$0, $$1);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(dpt.e);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      btu.a($$0, $$1, $$2);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(dpt.e, $$0.g().g());
   }

   @Override
   public dzo a(dzo $$0, dsm $$1) {
      return $$0.b(dpt.e, $$1.a($$0.c(dpt.e)));
   }

   @Override
   public dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(dpt.e)));
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      if ($$1.w_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dwx $$3 ? $$3.j() + 1 : 0;
      }
   }
}
