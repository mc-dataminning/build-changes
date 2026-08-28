import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drb extends dma implements dtj {
   public static final MapCodec<drb> a = b(drb::new);
   public static final eaq b = eap.I;

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   protected drb(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dzz $$0, dzz $$1, ja $$2) {
      return $$1.a(dmc.ag) && $$2.o() == ja.a.b;
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ewh.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(b) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }
}
