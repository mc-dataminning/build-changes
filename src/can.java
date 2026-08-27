import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class can extends caj {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<btm<? extends btl<? super can>>> bT = ImmutableList.of(btm.c, btm.d, btm.b, btm.f, btm.l);
   protected static final ImmutableList<bsh<?>> bU = ImmutableList.of(
      bsh.n, bsh.v, bsh.g, bsh.h, bsh.k, bsh.l, bsh.an, bsh.am, bsh.x, bsh.y, bsh.m, bsh.E, new bsh[]{bsh.o, bsh.p, bsh.q, bsh.t, bsh.aa, bsh.L, bsh.b}
   );

   public can(biu<? extends can> $$0, cpv $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bkl.a y() {
      return bzi.gj().a(bkm.a, 50.0).a(bkm.d, 0.35F).a(bkm.f, 7.0);
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      cao.a(this);
      this.a($$0.D_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(asc $$0, bgw $$1) {
      this.a(biv.a, new cjf(cji.ok));
   }

   @Override
   protected bkg.b<can> dO() {
      return bkg.a(bU, bT);
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      return cao.a(this, this.dO().a($$0));
   }

   @Override
   public bkg<can> dN() {
      return (bkg<can>)super.dN();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cjf $$0) {
      return $$0.a(cji.ok) ? super.k($$0) : false;
   }

   @Override
   protected void Y() {
      this.dL().ad().a("piglinBruteBrain");
      this.dN().a((akr)this.dL(), this);
      this.dL().ad().c();
      cao.b(this);
      cao.c(this);
      super.Y();
   }

   @Override
   public cam gf() {
      return this.fV() && this.gg() ? cam.a : cam.f;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bjg) {
            cao.a(this, (bjg)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected apd w() {
      return ape.sd;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.sg;
   }

   @Override
   protected apd l_() {
      return ape.sf;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.sh, 0.15F, 1.0F);
   }

   protected void gk() {
      this.a(ape.se, 1.0F, this.eW());
   }

   @Override
   protected void gh() {
      this.a(ape.si, 1.0F, this.eW());
   }
}
