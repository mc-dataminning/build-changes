import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ccn extends ccj {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bvm<? extends bvl<? super ccn>>> bT = ImmutableList.of(bvm.c, bvm.d, bvm.b, bvm.f, bvm.l);
   protected static final ImmutableList<buh<?>> bU = ImmutableList.of(
      buh.n, buh.v, buh.g, buh.h, buh.k, buh.l, buh.an, buh.am, buh.x, buh.y, buh.m, buh.E, new buh[]{buh.o, buh.p, buh.q, buh.t, buh.aa, buh.L, buh.b}
   );

   public ccn(bku<? extends ccn> $$0, csa $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bml.a A() {
      return cbi.gl().a(bmm.l, 50.0).a(bmm.m, 0.35F).a(bmm.c, 7.0);
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      cco.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ats $$0, biv $$1) {
      this.a(bkv.a, new clj(clm.oV));
   }

   @Override
   protected bmg.b<ccn> dQ() {
      return bmg.a(bU, bT);
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      return cco.a(this, this.dQ().a($$0));
   }

   @Override
   public bmg<ccn> dP() {
      return (bmg<ccn>)super.dP();
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean k(clj $$0) {
      return $$0.a(clm.oV) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dN().ae().a("piglinBruteBrain");
      this.dP().a((ame)this.dN(), this);
      this.dN().ae().c();
      cco.b(this);
      cco.c(this);
      super.Z();
   }

   @Override
   public ccm gh() {
      return this.fX() && this.gi() ? ccm.a : ccm.f;
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof blg) {
            cco.a(this, (blg)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected aqq y() {
      return aqr.sx;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.sA;
   }

   @Override
   protected aqq m_() {
      return aqr.sz;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.sB, 0.15F, 1.0F);
   }

   protected void gm() {
      this.a(aqr.sy, 1.0F, this.eY());
   }

   @Override
   protected void gj() {
      this.a(aqr.sC, 1.0F, this.eY());
   }
}
