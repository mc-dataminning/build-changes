import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ddz extends dch {
   public static final MapCodec<ddz> a = b(ddz::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dqp> c = List.of(dqo.bp, dqo.bq, dqo.br, dqo.bs, dqo.bt, dqo.bu);

   @Override
   public MapCodec<ddz> a() {
      return a;
   }

   public ddz(dpx.d $$0) {
      super($$0);
      dpy $$1 = this.E.b().a(dgr.aE, ir.c);

      for (dqp $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$2.c_($$3) instanceof dnm $$7) {
         if (!$$0.a(avw.av)) {
            return bos.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bos.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bos.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bos.a($$2.B);
            }
         }
      } else {
         return bos.e;
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.c_($$2) instanceof dnm $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return boq.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return boq.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return boq.a($$1.B);
         }
      } else {
         return boq.d;
      }
   }

   private OptionalInt a(etb $$0, dpy $$1) {
      return a($$0, $$1.c(dgr.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<ete> a(etb $$0, ir $$1) {
      ir $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         im $$3 = $$0.a().a($$2);
         etf $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ete((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ete((float)$$5, (float)$$6));
            case e -> Optional.of(new ete((float)$$7, (float)$$6));
            case f -> Optional.of(new ete((float)(1.0 - $$7), (float)$$6));
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

   private static void a(czu $$0, im $$1, ckl $$2, dnm $$3, csd $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(avj.c.b($$4.f()));
         auy $$6 = $$4.a(csg.uw) ? auz.fa : auz.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, ava.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.f(1);
         }
      }
   }

   private static void a(czu $$0, im $$1, ckl $$2, dnm $$3, int $$4) {
      if (!$$0.B) {
         csd $$5 = $$3.a($$4, 1);
         auy $$6 = $$5.a(csg.uw) ? auz.fd : auz.fc;
         $$0.a(null, $$1, $$6, ava.e, 1.0F, 1.0F);
         if (!$$2.ga().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dur.c, $$1);
      }
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dnm($$0, $$1);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(dgr.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dnm $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               csd $$8 = $$6.a($$7);
               if (!$$8.d()) {
                  bom.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(dgr.aE, $$0.g().g());
   }

   @Override
   public dpy a(dpy $$0, dji $$1) {
      return $$0.a(dgr.aE, $$1.a($$0.c(dgr.aE)));
   }

   @Override
   public dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(dgr.aE)));
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dnm $$3 ? $$3.j() + 1 : 0;
      }
   }
}
