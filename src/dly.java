import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dly extends dqa implements dmd, dtj {
   public static final MapCodec<dly> a = b(dly::new);
   private static final eaq b = eap.I;
   private static final Map<ja, ffc> c = fez.c(dma.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   protected dly(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(e, ja.c));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c.get($$0.c(e));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, e);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(b) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.e();
      dzz $$4 = $$1.a_($$3);
      dzz $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axc.bA)) && ($$5.a(this) || $$5.a(dmc.tk));
   }

   protected static boolean a(diw $$0, iu $$1, ewg $$2, ja $$3) {
      dzz $$4 = dmc.tl.m().b(b, Boolean.valueOf($$2.a(ewh.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if (($$4 == ja.a || $$4 == ja.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(b)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      Optional<iu> $$3 = l.a($$0, $$1, $$2.b(), ja.b, dmc.tk);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iu $$4 = $$3.get().d();
         dzz $$5 = $$0.a_($$4);
         return dlx.a((dix)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      Optional<iu> $$4 = l.a($$0, $$2, $$3.b(), ja.b, dmc.tk);
      if (!$$4.isEmpty()) {
         iu $$5 = $$4.get();
         iu $$6 = $$5.d();
         ja $$7 = $$3.c(e);
         a($$0, $$5, $$0.b_($$5), $$7);
         dlx.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy(dmc.tk);
   }
}
