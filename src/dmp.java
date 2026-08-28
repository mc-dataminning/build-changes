import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmp extends dij implements dpk {
   public static final MapCodec<dmp> a = b(dmp::new);
   public static final dwf b = dwe.j;
   public static final dwf c = dwe.C;
   protected static final fal d = fai.a(dij.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dij.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fal e = fai.a(dij.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dij.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());

      for (jm $$2 : $$0.f()) {
         if ($$2.o() == jm.a.b) {
            dvo $$3 = this.m().b(b, Boolean.valueOf($$2 == jm.b));
            if ($$3.a((dfi)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == erp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jm $$3 = o($$0).g();
      return dij.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jm o(dvo $$0) {
      return $$0.c(b) ? jm.a : jm.b;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(c) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
