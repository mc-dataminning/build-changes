import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnu extends djl implements dqr {
   public static final MapCodec<dnu> a = b(dnu::new);
   public static final dxn b = dxm.n;
   public static final dxn c = dxm.J;
   protected static final fbt d = fbq.a(djl.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), djl.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fbt e = fbq.a(djl.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), djl.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());

      for (jn $$2 : $$0.f()) {
         if ($$2.o() == jn.a.b) {
            dww $$3 = this.m().b(b, Boolean.valueOf($$2 == jn.b));
            if ($$3.a((dgk)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == esz.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      jn $$3 = o($$0).g();
      return djl.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jn o(dww $$0) {
      return $$0.c(b) ? jn.a : jn.b;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(c) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
