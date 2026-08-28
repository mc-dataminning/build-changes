import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drn extends dqv implements dpk {
   public static final MapCodec<drn> a = b(drn::new);
   public static final dwf c = dwe.C;

   @Override
   protected MapCodec<? extends drn> a() {
      return a;
   }

   protected drn(dvn.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(erp.c)));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(c) ? erp.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }
}
