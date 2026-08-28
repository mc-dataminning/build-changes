import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dql extends dma implements dtj {
   public static final MapCodec<dql> a = b(dql::new);
   public static final eaq b = eap.m;
   public static final eaq c = eap.I;
   private static final ffc d = fez.a(dma.b(4.0, 7.0, 9.0), dma.b(6.0, 0.0, 7.0));
   private static final ffc e = d.a(0.0, 0.0625, 0.0).d();

   @Override
   public MapCodec<dql> a() {
      return a;
   }

   public dql(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());

      for (ja $$2 : $$0.f()) {
         if ($$2.o() == ja.a.b) {
            dzz $$3 = this.m().b(b, Boolean.valueOf($$2 == ja.b));
            if ($$3.a((diy)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == ewh.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      ja $$3 = o($$0).g();
      return dma.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ja o(dzz $$0) {
      return $$0.c(b) ? ja.a : ja.b;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(c) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
