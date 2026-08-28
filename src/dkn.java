import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkn extends dqd implements dqs {
   public static final MapCodec<dkn> a = b(dkn::new);
   public static final dxo b = dxn.J;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fbu e = djm.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fbu f = djm.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fbu g = djm.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jn.a.b));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      switch ((jn.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eta.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(b) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
