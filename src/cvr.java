import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvr extends cvl implements cvq {
   public static final MapCodec<cvr> a = b(cvr::new);

   @Override
   public MapCodec<cvr> a() {
      return a;
   }

   public cvr(dio.d $$0) {
      super($$0);
   }

   @Override
   public ckv b() {
      return ckv.a;
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dfy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$2, dgf.o, dfy::a);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         dgd $$6 = $$1.c_($$2);
         if ($$6 instanceof dfy) {
            $$3.a((dfy)$$6);
            $$3.a(arm.ab);
         }

         return bjl.b;
      }
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if ($$4.A()) {
         dgd $$5 = $$0.c_($$1);
         if ($$5 instanceof dfy) {
            ((dfy)$$5).a($$4.y());
         }
      }
   }
}
