import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsv extends dsd implements dqs {
   public static final MapCodec<dsv> a = b(dsv::new);
   public static final dxo c = dxn.J;

   @Override
   protected MapCodec<? extends dsv> a() {
      return a;
   }

   protected dsv(dww.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(eta.c)));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(c) ? eta.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c);
   }
}
