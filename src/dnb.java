import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dnb extends dss implements dtj {
   public static final MapCodec<dnb> a = b(dnb::new);
   public static final eaq b = eap.I;
   private static final Map<ja.a, ffc> e = fez.b(dma.a(3.0, 3.0, 16.0));

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   public dnb(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(d, ja.a.b));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e.get($$0.c(d));
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
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b).a(d);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(b) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
