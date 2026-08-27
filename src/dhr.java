import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhr extends dea implements dlb {
   public static final MapCodec<dhr> a = b(dhr::new);
   private static final dru c = drt.C;
   protected static final evf b = dea.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   protected dhr(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(c) ? emx.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      drd $$1 = super.a($$0);
      if ($$1 != null) {
         emw $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == emx.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.c();
      drd $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, it.a);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == it.b && !this.a($$0, $$3, $$4)) {
         return dec.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, emx.c, emx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
