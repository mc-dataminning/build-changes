import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drh extends dmf implements dtq {
   public static final MapCodec<drh> a = b(drh::new);
   public static final eay b = eax.I;

   @Override
   public MapCodec<drh> a() {
      return a;
   }

   protected drh(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(eah $$0, eah $$1, ja $$2) {
      return $$1.a(dmh.ag) && $$2.o() == ja.a.b;
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ewp.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(b) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }
}
