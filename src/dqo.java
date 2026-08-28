import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqo extends dqn {
   public static final MapCodec<dqo> f = b(dqo::new);
   public static final dyo<jn> g = dod.e;
   public static final dyh h = dqn.b;

   @Override
   public MapCodec<dqo> a() {
      return f;
   }

   protected dqo(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(g, jn.c).b(h, Boolean.valueOf(true)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return dtm.o($$0);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return dtm.b($$1, $$2, $$0.c(g));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dkg.a.m() : $$0;
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = dkg.cx.a($$0);
      return $$1 == null ? null : this.m().b(g, $$1.c(g));
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$0.c(h)) {
         jn $$4 = $$0.c(g).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lo.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dgz $$0, ji $$1, dxq $$2) {
      jn $$3 = $$2.c(g).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(h) && $$0.c(g) != $$3 ? 15 : 0;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(g, h);
   }

   @Nullable
   @Override
   protected eve a(dgz $$0, dxq $$1) {
      return eva.a($$0, $$1.c(g).g(), jn.b);
   }
}
