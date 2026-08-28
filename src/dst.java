import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dst extends dsb implements dqq {
   public static final MapCodec<dst> a = b(dst::new);
   public static final dxm c = dxl.J;

   @Override
   protected MapCodec<? extends dst> a() {
      return a;
   }

   protected dst(dwu.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(esy.c)));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(c) ? esy.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }
}
