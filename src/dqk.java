import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dqk extends dma implements dtj {
   public static final MapCodec<dqk> a = b(dqk::new);
   public static final eax<ja> b = dqa.e;
   public static final eaq c = eap.I;
   public static final Map<ja, ffc> d = fez.c(dma.c(16.0, 13.0, 16.0));

   @Override
   public MapCodec<dqk> a() {
      return a;
   }

   protected dqk(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d.get($$0.c(b));
   }

   private boolean a(dib $$0, iu $$1, ja $$2) {
      dzz $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      ja $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dmc.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, ewh.c, ewh.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      if (!$$0.c()) {
         dzz $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dzz $$2 = this.m();
      diy $$3 = $$0.q();
      iu $$4 = $$0.a();
      ewg $$5 = $$0.q().b_($$0.a());

      for (ja $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == ewh.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(c) ? ewh.c.a(false) : super.b_($$0);
   }
}
