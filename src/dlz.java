import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlz extends dij implements dpk {
   public static final MapCodec<dlz> a = b(dlz::new);
   private static final dwf c = dwe.C;
   protected static final fal b = dij.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   protected dlz(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(c) ? erp.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = super.a($$0);
      if ($$1 != null) {
         ero $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == erp.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.d();
      dvo $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jm.a);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$4 == jm.b && !this.a($$0, $$1, $$3)) {
         return dil.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, erp.c, erp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
