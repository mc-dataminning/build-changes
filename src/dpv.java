import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpv extends dpm {
   public static final MapCodec<dpv> e = b(dpv::new);

   @Override
   public MapCodec<? extends dpv> a() {
      return e;
   }

   public dpv(dzn.d $$0) {
      super($$0);
   }

   public static dzo b() {
      return dlw.J.m();
   }

   @Override
   public void a(dip $$0, cqs $$1, iu $$2, dzo $$3, @Nullable dwn $$4, cys $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dfh.a($$5, axc.s)) {
         if ($$0.B_().i()) {
            $$0.a($$2, false);
            return;
         }

         dzo $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$1.a(diy.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dzo $$0, dip $$1, iu $$2) {
      if ($$1.B_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
