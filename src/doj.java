import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doj extends djl implements dqr {
   public static final MapCodec<doj> a = b(doj::new);
   public static final dxn b = dxm.J;

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   protected doj(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dww $$0, dww $$1, jn $$2) {
      return $$1.a(djn.ag) && $$2.o() == jn.a.b;
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == esz.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
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

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }
}
