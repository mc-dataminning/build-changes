import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dil extends dik {
   public static final MapCodec<dil> h = b(dil::new);
   public static final dqc i = dgc.aE;
   public static final dpz j = dik.d;

   @Override
   public MapCodec<dil> a() {
      return h;
   }

   protected dil(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ij.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return dli.m($$0);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return dli.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dcj.a.n() : $$0;
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = dcj.cq.a($$0);
      return $$1 == null ? null : this.n().a(i, $$1.c(i));
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$0.c(j)) {
         ij $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(kh.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(czg $$0, id $$1, dpi $$2) {
      ij $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(i, j);
   }
}
