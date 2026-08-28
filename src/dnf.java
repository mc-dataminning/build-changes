import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnf extends djm implements dqs {
   public static final MapCodec<dnf> a = b(dnf::new);
   private static final dxo c = dxn.J;
   protected static final fbu b = djm.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   protected dnf(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(c) ? eta.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      dwx $$1 = super.a($$0);
      if ($$1 != null) {
         esz $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == eta.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.d();
      dwx $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jn.a);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4 == jn.b && !this.a($$0, $$1, $$3)) {
         return djo.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, eta.c, eta.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
