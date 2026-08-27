import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cea extends cdw {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bws<? extends bwr<? super cea>>> bT = ImmutableList.of(bws.c, bws.d, bws.b, bws.f, bws.l);
   protected static final ImmutableList<bvm<?>> bU = ImmutableList.of(
      bvm.n, bvm.v, bvm.g, bvm.h, bvm.k, bvm.l, bvm.an, bvm.am, bvm.x, bvm.y, bvm.m, bvm.E, new bvm[]{bvm.o, bvm.p, bvm.q, bvm.t, bvm.aa, bvm.L, bvm.b}
   );

   public cea(bly<? extends cea> $$0, cto $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bnp.a A() {
      return cco.gk().a(bnq.l, 50.0).a(bnq.m, 0.35F).a(bnq.c, 7.0);
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      ceb.a(this);
      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auu $$0, bjy $$1) {
      this.a(blz.a, new cmx(cna.oV));
   }

   @Override
   protected bnk.b<cea> dP() {
      return bnk.a(bU, bT);
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return ceb.a(this, this.dP().a($$0));
   }

   @Override
   public bnk<cea> dO() {
      return (bnk<cea>)super.dO();
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean k(cmx $$0) {
      return $$0.a(cna.oV) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dM().af().a("piglinBruteBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      ceb.b(this);
      ceb.c(this);
      super.Z();
   }

   @Override
   public cdz gg() {
      return this.fW() && this.gh() ? cdz.a : cdz.f;
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bmk) {
            ceb.a(this, (bmk)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected arq y() {
      return arr.sS;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.sV;
   }

   @Override
   protected arq n_() {
      return arr.sU;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.sW, 0.15F, 1.0F);
   }

   protected void gl() {
      this.a(arr.sT, 1.0F, this.eX());
   }

   @Override
   protected void gi() {
      this.a(arr.sX, 1.0F, this.eX());
   }
}
