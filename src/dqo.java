import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqo extends djv implements djo, doe {
   public static final MapCodec<dqo> a = b(dqo::new);
   protected static final float b = 6.0F;
   protected static final fbt c = djl.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dqo> a() {
      return a;
   }

   protected dqo(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.c($$1, $$2, jn.b) && !$$0.a(djn.ll);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      dww $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return $$0.a_($$1.d()).a(djn.J);
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   protected esy b_(dww $$0) {
      return esz.c.a(false);
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      dww $$4 = djn.bE.m();
      dww $$5 = $$4.b(drw.d, dxr.a);
      ji $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cow $$0, dfm $$1, ji $$2, dww $$3, esx $$4) {
      return false;
   }

   @Override
   public boolean a(dgi $$0, ji $$1, dww $$2, esy $$3) {
      return false;
   }
}
