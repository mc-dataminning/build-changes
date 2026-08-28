import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlm extends dmf implements dtq {
   public static final MapCodec<dlm> a = b(dlm::new);
   public static final eay b = eax.I;

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   protected dlm(eag.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(eah $$0) {
      return $$0.y().c();
   }

   @Override
   protected dss a_(eah $$0) {
      return dss.a;
   }

   @Override
   protected float c(eah $$0, dig $$1, iu $$2) {
      return 1.0F;
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

   @Nullable
   @Override
   public eah a(dcw $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ewp.c));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   public czd a(@Nullable bxe $$0, djb $$1, iu $$2, eah $$3) {
      if ($$0 instanceof crc $$4 && $$4.b()) {
         return dtq.super.a($$0, $$1, $$2, $$3);
      }

      return czd.k;
   }

   @Override
   public boolean a(@Nullable bxe $$0, dig $$1, iu $$2, eah $$3, ewn $$4) {
      if ($$0 instanceof crc $$5 && $$5.b()) {
         return dtq.super.a($$0, $$1, $$2, $$3, $$4);
      }

      return false;
   }
}
