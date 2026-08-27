import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djj extends dji {
   public static final MapCodec<djj> h = b(djj::new);
   public static final drb i = dha.aE;
   public static final dqy j = dji.d;

   @Override
   public MapCodec<djj> a() {
      return h;
   }

   protected djj(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, is.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return dmg.m($$0);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return dmg.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? ddg.a.n() : $$0;
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = ddg.cq.a($$0);
      return $$1 == null ? null : this.n().a(i, $$1.c(i));
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$0.c(j)) {
         is $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(kr.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dad $$0, in $$1, dqh $$2) {
      is $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(i, j);
   }
}
