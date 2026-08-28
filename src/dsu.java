import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsu extends dsc implements dqr {
   public static final MapCodec<dsu> a = b(dsu::new);
   public static final dxn c = dxm.J;

   @Override
   protected MapCodec<? extends dsu> a() {
      return a;
   }

   protected dsu(dwv.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(esz.c)));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(c) ? esz.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c);
   }
}
