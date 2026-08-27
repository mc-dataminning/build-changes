import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ccs extends cco {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bvr<? extends bvq<? super ccs>>> bT = ImmutableList.of(bvr.c, bvr.d, bvr.b, bvr.f, bvr.l);
   protected static final ImmutableList<bum<?>> bU = ImmutableList.of(
      bum.n, bum.v, bum.g, bum.h, bum.k, bum.l, bum.an, bum.am, bum.x, bum.y, bum.m, bum.E, new bum[]{bum.o, bum.p, bum.q, bum.t, bum.aa, bum.L, bum.b}
   );

   public ccs(bkz<? extends ccs> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bmq.a A() {
      return cbn.gl().a(bmr.l, 50.0).a(bmr.m, 0.35F).a(bmr.c, 7.0);
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      cct.a(this);
      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(atw $$0, biz $$1) {
      this.a(bla.a, new clo(clr.oV));
   }

   @Override
   protected bml.b<ccs> dQ() {
      return bml.a(bU, bT);
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      return cct.a(this, this.dQ().a($$0));
   }

   @Override
   public bml<ccs> dP() {
      return (bml<ccs>)super.dP();
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean k(clo $$0) {
      return $$0.a(clr.oV) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dN().ae().a("piglinBruteBrain");
      this.dP().a((ami)this.dN(), this);
      this.dN().ae().c();
      cct.b(this);
      cct.c(this);
      super.Z();
   }

   @Override
   public ccr gh() {
      return this.fX() && this.gi() ? ccr.a : ccr.f;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bll) {
            cct.a(this, (bll)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected aqu y() {
      return aqv.sx;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.sA;
   }

   @Override
   protected aqu n_() {
      return aqv.sz;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.sB, 0.15F, 1.0F);
   }

   protected void gm() {
      this.a(aqv.sy, 1.0F, this.eY());
   }

   @Override
   protected void gj() {
      this.a(aqv.sC, 1.0F, this.eY());
   }
}
