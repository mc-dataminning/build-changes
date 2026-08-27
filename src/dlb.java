import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlb extends dkj implements diy {
   public static final MapCodec<dlb> a = b(dlb::new);
   public static final dpq c = dpp.C;

   @Override
   protected MapCodec<? extends dlb> a() {
      return a;
   }

   protected dlb(doy.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(ekt.c)));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(c) ? ekt.c.a(true) : super.c_($$0);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }
}
