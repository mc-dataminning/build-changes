import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwb extends cvv implements cwa {
   public static final MapCodec<cwb> a = b(cwb::new);

   @Override
   public MapCodec<cwb> a() {
      return a;
   }

   public cwb(diz.d $$0) {
      super($$0);
   }

   @Override
   public clf b() {
      return clf.a;
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dgj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return a($$2, dgq.o, dgj::a);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         dgo $$6 = $$1.c_($$2);
         if ($$6 instanceof dgj) {
            $$3.a((dgj)$$6);
            $$3.a(arw.ab);
         }

         return bjv.b;
      }
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if ($$4.A()) {
         dgo $$5 = $$0.c_($$1);
         if ($$5 instanceof dgj) {
            ((dgj)$$5).a($$4.y());
         }
      }
   }
}
