import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dom extends dkd implements drj {
   public static final MapCodec<dom> a = b(dom::new);
   public static final dyf b = dye.n;
   public static final dyf c = dye.J;
   protected static final fcl d = fci.a(dkd.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dkd.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fcl e = fci.a(dkd.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dkd.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dom> a() {
      return a;
   }

   public dom(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());

      for (jm $$2 : $$0.f()) {
         if ($$2.o() == jm.a.b) {
            dxo $$3 = this.m().b(b, Boolean.valueOf($$2 == jm.b));
            if ($$3.a((dhc)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == etr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jm $$3 = o($$0).g();
      return dkd.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jm o(dxo $$0) {
      return $$0.c(b) ? jm.a : jm.b;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(c) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
