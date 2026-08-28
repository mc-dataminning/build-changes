import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class doj extends dmq {
   public static final MapCodec<doj> a = b(doj::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<ebx> c = List.of(ebw.bs, ebw.bt, ebw.bu, ebw.bv, ebw.bw, ebw.bx);

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   public doj(ebf.d $$0) {
      super($$0);
      ebg $$1 = this.C.b().b(drf.e, jc.c);

      for (ebx $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if ($$2.c_($$3) instanceof dyo $$7) {
         if (!$$0.a(axo.bb)) {
            return but.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return but.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return but.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return but.a;
            }
         }
      } else {
         return but.e;
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$1.c_($$2) instanceof dyo $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return but.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return but.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return but.a;
         }
      } else {
         return but.e;
      }
   }

   private OptionalInt a(ffo $$0, ebg $$1) {
      return a($$0, $$1.c(drf.e)).map($$0x -> {
         int $$1x = $$0x.k >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.j);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<ffr> a(ffo $$0, jc $$1) {
      jc $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iw $$3 = $$0.b().a($$2);
         ffs $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ffr((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ffr((float)$$5, (float)$$6));
            case e -> Optional.of(new ffr((float)$$7, (float)$$6));
            case f -> Optional.of(new ffr((float)(1.0 - $$7), (float)$$6));
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

   private static void a(djz $$0, iw $$1, crz $$2, dyo $$3, daa $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(axb.c.b($$4.h()));
         awq $$6 = $$4.a(dae.vG) ? awr.fe : awr.fd;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, aws.e, 1.0F, 1.0F);
      }
   }

   private static void a(djz $$0, iw $$1, crz $$2, dyo $$3, int $$4) {
      if (!$$0.C) {
         daa $$5 = $$3.a($$4, 1);
         awq $$6 = $$5.a(dae.vG) ? awr.fh : awr.fg;
         $$0.a(null, $$1, $$6, aws.e, 1.0F, 1.0F);
         if (!$$2.gj().g($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, egg.c, $$1);
      }
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyo($$0, $$1);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(drf.e);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(drf.e, $$0.g().g());
   }

   @Override
   public ebg a(ebg $$0, dty $$1) {
      return $$0.b(drf.e, $$1.a($$0.c(drf.e)));
   }

   @Override
   public ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(drf.e)));
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      if ($$1.A_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dyo $$3 ? $$3.j() + 1 : 0;
      }
   }
}
