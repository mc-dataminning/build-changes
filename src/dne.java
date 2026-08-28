import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dne extends dij implements dpk {
   public static final MapCodec<dne> a = b(dne::new);
   public static final dwf b = dwe.C;

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   protected dne(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dvo $$0, dvo $$1, jm $$2) {
      return $$1.a(dil.ac) && $$2.o() == jm.a.b;
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erp.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(b) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }
}
