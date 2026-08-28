import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlw extends dlm {
   public static final MapCodec<dlw> a = b(dlw::new);
   public static final eax<ja> b = dqa.e;
   public static final eax<ean> c = eap.Y;
   public static final eaq d = eap.A;
   private static final ffc f = fez.a(dma.b(6.0, 6.0, 13.0), dma.b(8.0, 4.0, 6.0));
   private static final ffc g = fez.a(f, dma.b(2.0, 13.0, 16.0));
   private static final Map<ja.a, ffc> h = fez.a(dma.a(16.0, 16.0, 8.0));
   private static final Map<ja.a, ffc> i = fez.a(fez.a(f, dma.a(2.0, 16.0, 13.0, 15.0)));
   private static final Map<ja, ffc> C = fez.c(fez.a(f, dma.a(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int e = 1;

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   public dlw(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, ean.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(div $$0, dzz $$1, fee $$2, crs $$3) {
      cqy $$6 = $$3.q() instanceof cqy $$5 ? $$5 : null;
      this.a($$0, $$1, $$2, $$6, true);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      return (bub)(this.a($$1, $$0, $$4, $$3, true) ? bub.a : bub.e);
   }

   public boolean a(div $$0, dzz $$1, fee $$2, @Nullable cqy $$3, boolean $$4) {
      ja $$5 = $$2.c();
      iu $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awx.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dzz $$0, ja $$1, double $$2) {
      if ($$1.o() != ja.a.b && !($$2 > 0.8124F)) {
         ja $$3 = $$0.c(b);
         ean $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(div $$0, iu $$1, @Nullable ja $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bwd $$0, div $$1, iu $$2, @Nullable ja $$3) {
      dwx $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dwv) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dwv)$$4).a($$3);
         $$1.a(null, $$2, awn.bZ, awo.e, 2.0F, 1.0F);
         $$1.a($$0, eez.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ffc o(dzz $$0) {
      ja $$1 = $$0.c(b);

      return switch ((ean)$$0.c(c)) {
         case a -> (ffc)h.get($$1.o());
         case c -> (ffc)C.get($$1);
         case d -> (ffc)i.get($$1.o());
         case b -> g;
      };
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.o($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      ja $$1 = $$0.k();
      iu $$2 = $$0.a();
      div $$3 = $$0.q();
      ja.a $$4 = $$1.o();
      if ($$4 == ja.a.b) {
         dzz $$5 = this.m().b(c, $$1 == ja.a ? ean.b : ean.a).b(b, $$0.g());
         if ($$5.a((diy)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ja.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), ja.f) && $$3.a_($$2.i()).c($$3, $$2.i(), ja.e)
            || $$4 == ja.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), ja.d) && $$3.a_($$2.g()).c($$3, $$2.g(), ja.c);
         dzz $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? ean.d : ean.c);
         if ($$7.a((diy)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), ja.b);
         $$7 = $$7.b(c, $$8 ? ean.a : ean.b);
         if ($$7.a((diy)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, dio $$3, BiConsumer<cyy, iu> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      ean $$8 = $$0.c(c);
      ja $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != ean.d) {
         return dmc.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == ean.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, ean.c).b(b, $$4.g());
            }

            if ($$8 == ean.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, ean.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      ja $$3 = q($$0).g();
      return $$3 == ja.b ? dma.a($$1, $$2.d(), ja.a) : dov.b($$1, $$2, $$3);
   }

   private static ja q(dzz $$0) {
      switch ((ean)$$0.c(c)) {
         case a:
            return ja.b;
         case b:
            return ja.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dwv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$2, dwz.F, $$0.C ? dwv::a : dwv::b);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   public dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
