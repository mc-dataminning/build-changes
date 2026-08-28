import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqu extends dql {
   public static final MapCodec<dqu> e = b(dqu::new);

   @Override
   public MapCodec<? extends dqu> a() {
      return e;
   }

   public dqu(eas.d $$0) {
      super($$0);
   }

   public static eat b() {
      return dmt.J.m();
   }

   @Override
   public void a(djm $$0, crm $$1, iv $$2, eat $$3, @Nullable dxr $$4, czn $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dgc.a($$5, axe.s)) {
         if ($$0.B_().i()) {
            $$0.a($$2, false);
            return;
         }

         eat $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.a(djv.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(eat $$0, djm $$1, iv $$2) {
      if ($$1.B_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
