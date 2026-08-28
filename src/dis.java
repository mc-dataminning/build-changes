import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dis extends djl implements dqr {
   public static final MapCodec<dis> a = b(dis::new);
   public static final dxn b = dxm.J;

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   protected dis(dwv.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dww $$0) {
      return $$0.y().c();
   }

   @Override
   protected dpw a_(dww $$0) {
      return dpw.a;
   }

   @Override
   protected float c(dww $$0, dfm $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(b) ? esz.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == esz.c));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   public cwo a(@Nullable cow $$0, dgi $$1, ji $$2, dww $$3) {
      return $$0 != null && $$0.b() ? dqr.super.a($$0, $$1, $$2, $$3) : cwo.j;
   }

   @Override
   public boolean a(@Nullable cow $$0, dfm $$1, ji $$2, dww $$3, esx $$4) {
      return $$0 != null && $$0.b() ? dqr.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
