import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dxk extends dmi {
   public static final MapCodec<dxk> b = b(dxk::new);
   public static final dyo<dys> c = dyg.bj;
   public static final dyh d = dyg.B;
   public static final int e = 4;
   private static final fcr f = dke.c(16.0, 0.0, 4.0);
   private static final Map<jn, fcr> g = fco.d(fco.a(f, dke.c(4.0, 4.0, 16.0)));
   private static final Map<jn, fcr> h = fco.d(fco.a(f, dke.c(4.0, 4.0, 20.0)));

   @Override
   protected MapCodec<dxk> a() {
      return b;
   }

   public dxk(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, jn.c).b(c, dys.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxq $$0) {
      return true;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return ($$0.c(d) ? g : h).get($$0.c(a));
   }

   private boolean a(dxq $$0, dxq $$1) {
      dke $$2 = $$0.c(c) == dys.a ? dkg.bF : dkg.by;
      return $$1.a($$2) && $$1.c(dxj.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      if (!$$0.C && $$3.gn()) {
         ji $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      ji $$4 = $$2.a($$0.c(a).g());
      if (this.a($$0, $$1.a_($$4))) {
         $$1.b($$4, true);
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      dxq $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dkg.bX) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if ($$0.a((dhc)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, eva.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh($$2.c(c) == dys.b ? dkg.by : dkg.bF);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
