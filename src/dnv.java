import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnv extends djm implements dqs {
   public static final MapCodec<dnv> a = b(dnv::new);
   public static final dxo b = dxn.n;
   public static final dxo c = dxn.J;
   protected static final fbu d = fbr.a(djm.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), djm.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fbu e = fbr.a(djm.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), djm.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   public dnv(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());

      for (jn $$2 : $$0.f()) {
         if ($$2.o() == jn.a.b) {
            dwx $$3 = this.m().b(b, Boolean.valueOf($$2 == jn.b));
            if ($$3.a((dgl)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == eta.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      jn $$3 = o($$0).g();
      return djm.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jn o(dwx $$0) {
      return $$0.c(b) ? jn.a : jn.b;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(c) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
