import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwq extends cwk implements cwp {
   public static final MapCodec<cwq> a = b(cwq::new);

   @Override
   public MapCodec<cwq> a() {
      return a;
   }

   public cwq(djo.d $$0) {
      super($$0);
   }

   @Override
   public clv b() {
      return clv.a;
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dgy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$2, dhf.o, dgy::a);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         dhd $$5 = $$1.c_($$2);
         if ($$5 instanceof dgy) {
            $$3.a((dgy)$$5);
            $$3.a(asd.ab);
         }

         return bkc.b;
      }
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if ($$4.A()) {
         dhd $$5 = $$0.c_($$1);
         if ($$5 instanceof dgy) {
            ((dgy)$$5).a($$4.y());
         }
      }
   }
}
