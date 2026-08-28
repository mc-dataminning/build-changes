import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtl extends dma implements dtj {
   public static final MapCodec<dtl> a = b(dtl::new);
   public static final eax<ebh> b = eap.bk;
   public static final eaq c = eap.I;
   private static final ffc d = dma.b(16.0, 0.0, 8.0);
   private static final ffc e = dma.b(16.0, 8.0, 16.0);

   @Override
   public MapCodec<? extends dtl> a() {
      return a;
   }

   public dtl(dzy.d $$0) {
      super($$0);
      this.l(this.m().b(b, ebh.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dzz $$0) {
      return $$0.c(b) != ebh.c;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return switch ((ebh)$$0.c(b)) {
         case a -> e;
         case b -> d;
         case c -> fez.b();
      };
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      iu $$1 = $$0.a();
      dzz $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, ebh.c).b(c, Boolean.valueOf(false));
      } else {
         ewg $$3 = $$0.q().b_($$1);
         dzz $$4 = this.m().b(b, ebh.b).b(c, Boolean.valueOf($$3.a() == ewh.c));
         ja $$5 = $$0.k();
         return $$5 != ja.a && ($$5 == ja.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, ebh.a);
      }
   }

   @Override
   protected boolean a(dzz $$0, dcr $$1) {
      cyy $$2 = $$1.n();
      ebh $$3 = $$0.c(b);
      if ($$3 == ebh.c || !$$2.a(this.h())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         ja $$5 = $$1.k();
         return $$3 == ebh.b ? $$5 == ja.b || $$4 && $$5.o().d() : $$5 == ja.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(c) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(diw $$0, iu $$1, dzz $$2, ewg $$3) {
      return $$2.c(b) != ebh.c ? dtj.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable bxc $$0, dib $$1, iu $$2, dzz $$3, ewf $$4) {
      return $$3.c(b) != ebh.c ? dtj.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axh.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
