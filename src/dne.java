import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dne extends djl implements dqr {
   public static final MapCodec<dne> a = b(dne::new);
   private static final dxn c = dxm.J;
   protected static final fbt b = djl.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   protected dne(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(c) ? esz.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dww $$1 = super.a($$0);
      if ($$1 != null) {
         esy $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == esz.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.d();
      dww $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jn.a);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 == jn.b && !this.a($$0, $$1, $$3)) {
         return djn.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, esz.c, esz.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
