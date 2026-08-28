import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dgl extends det {
   public static final MapCodec<dgl> a = b(dgl::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dtb> c = List.of(dta.bp, dta.bq, dta.br, dta.bs, dta.bt, dta.bu);

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   public dgl(dsj.d $$0) {
      super($$0);
      dsk $$1 = this.E.b().a(djd.aE, jf.c);

      for (dtb $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$2.c_($$3) instanceof dpy $$7) {
         if (!$$0.a(awf.aW)) {
            return bqi.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqi.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqi.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqi.a($$2.B);
            }
         }
      } else {
         return bqi.e;
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.c_($$2) instanceof dpy $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqg.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqg.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqg.a($$1.B);
         }
      } else {
         return bqg.e;
      }
   }

   private OptionalInt a(ewb $$0, dsk $$1) {
      return a($$0, $$1.c(djd.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<ewe> a(ewb $$0, jf $$1) {
      jf $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ja $$3 = $$0.a().a($$2);
         ewf $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ewe((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ewe((float)$$5, (float)$$6));
            case e -> Optional.of(new ewe((float)$$7, (float)$$6));
            case f -> Optional.of(new ewe((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dcf $$0, ja $$1, cmk $$2, dpy $$3, cuc $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(avr.c.b($$4.g()));
         avg $$6 = $$4.a(cuf.uw) ? avh.fa : avh.eZ;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, avi.e, 1.0F, 1.0F);
      }
   }

   private static void a(dcf $$0, ja $$1, cmk $$2, dpy $$3, int $$4) {
      if (!$$0.B) {
         cuc $$5 = $$3.a($$4, 1);
         avg $$6 = $$5.a(cuf.uw) ? avh.fd : avh.fc;
         $$0.a(null, $$1, $$6, avi.e, 1.0F, 1.0F);
         if (!$$2.fZ().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dxg.c, $$1);
      }
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dpy($$0, $$1);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(djd.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dpy $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cuc $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bqc.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(djd.aE, $$0.g().g());
   }

   @Override
   public dsk a(dsk $$0, dlu $$1) {
      return $$0.a(djd.aE, $$1.a($$0.c(djd.aE)));
   }

   @Override
   public dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(djd.aE)));
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dpy $$3 ? $$3.j() + 1 : 0;
      }
   }
}
