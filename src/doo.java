import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doo extends don {
   public static final MapCodec<doo> h = b(doo::new);
   public static final dwl<jm> i = dme.aF;
   public static final dwf j = don.d;

   @Override
   public MapCodec<doo> a() {
      return h;
   }

   protected doo(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jm.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return drl.o($$0);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return drl.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4.g() == $$0.c(i) && !$$0.a($$1, $$3) ? dil.a.m() : $$0;
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = dil.cq.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$0.c(j)) {
         jm $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ln.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dff $$0, jh $$1, dvo $$2) {
      jm $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected esw a(dff $$0, dvo $$1) {
      return ess.a($$0, $$1.c(i).g(), jm.b);
   }
}
