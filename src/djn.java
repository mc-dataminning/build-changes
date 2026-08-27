import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djn extends dbc {
   public static final MapCodec<djn> c = b(djn::new);

   @Override
   public MapCodec<djn> a() {
      return c;
   }

   protected djn(dph.d $$0) {
      super($$0);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dob($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$0, $$2, dmq.B);
   }

   @Override
   protected void a(czg $$0, id $$1, cka $$2) {
      dmo $$3 = $$0.c_($$1);
      if ($$3 instanceof dob) {
         $$2.a((boj)$$3);
         $$2.a(auz.at);
      }
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, auo.xO, aup.e, 1.0F, 1.0F, false);
         }

         $$1.a(kn.ac, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
