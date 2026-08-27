import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ddl extends dbt {
   public static final MapCodec<ddl> a = b(ddl::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dpz> c = List.of(dpy.bp, dpy.bq, dpy.br, dpy.bs, dpy.bt, dpy.bu);

   @Override
   public MapCodec<ddl> a() {
      return a;
   }

   public ddl(dph.d $$0) {
      super($$0);
      dpi $$1 = this.E.b().a(dgc.aE, ij.c);

      for (dpz $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$2.c_($$3) instanceof dmx $$7) {
         if (!$$0.a(avm.av)) {
            return boh.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return boh.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return boh.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return boh.a($$2.B);
            }
         }
      } else {
         return boh.e;
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.c_($$2) instanceof dmx $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bof.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bof.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bof.a($$1.B);
         }
      } else {
         return bof.d;
      }
   }

   private OptionalInt a(esf $$0, dpi $$1) {
      return a($$0, $$1.c(dgc.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<esi> a(esf $$0, ij $$1) {
      ij $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         id $$3 = $$0.a().a($$2);
         esj $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new esi((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new esi((float)$$5, (float)$$6));
            case e -> Optional.of(new esi((float)$$7, (float)$$6));
            case f -> Optional.of(new esi((float)(1.0 - $$7), (float)$$6));
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

   private static void a(czg $$0, id $$1, cka $$2, dmx $$3, crs $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(auz.c.b($$4.f()));
         aun $$6 = $$4.a(crv.uu) ? auo.fa : auo.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, aup.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.f(1);
         }
      }
   }

   private static void a(czg $$0, id $$1, cka $$2, dmx $$3, int $$4) {
      if (!$$0.B) {
         crs $$5 = $$3.a($$4, 1);
         aun $$6 = $$5.a(crv.uu) ? auo.fd : auo.fc;
         $$0.a(null, $$1, $$6, aup.e, 1.0F, 1.0F);
         if (!$$2.fZ().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dub.c, $$1);
      }
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dmx($$0, $$1);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(dgc.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dmx $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               crs $$8 = $$6.a($$7);
               if (!$$8.d()) {
                  bob.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(dgc.aE, $$0.g().g());
   }

   @Override
   public dpi a(dpi $$0, dit $$1) {
      return $$0.a(dgc.aE, $$1.a($$0.c(dgc.aE)));
   }

   @Override
   public dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(dgc.aE)));
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dmx $$3 ? $$3.j() + 1 : 0;
      }
   }
}
