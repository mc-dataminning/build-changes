import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doe extends dnm implements dmb {
   public static final MapCodec<doe> a = b(doe::new);
   public static final dsu c = dst.C;

   @Override
   protected MapCodec<? extends doe> a() {
      return a;
   }

   protected doe(dsc.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(enx.c)));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(c) ? enx.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c);
   }
}
