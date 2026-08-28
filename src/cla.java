import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cla extends ckw {
   private static final int cb = 50;
   private static final float cc = 0.35F;
   private static final int cd = 7;
   protected static final ImmutableList<cdj<? extends cdi<? super cla>>> e = ImmutableList.of(cdj.c, cdj.d, cdj.b, cdj.f, cdj.m);
   protected static final ImmutableList<ccc<?>> ca = ImmutableList.of(
      ccc.n, ccc.v, ccc.g, ccc.h, ccc.k, ccc.l, ccc.ao, ccc.an, ccc.x, ccc.y, ccc.m, ccc.E, new ccc[]{ccc.o, ccc.p, ccc.q, ccc.t, ccc.ab, ccc.M, ccc.b}
   );

   public cla(bsj<? extends cla> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 20;
   }

   public static buf.a y() {
      return cjn.gt().a(bug.s, 50.0).a(bug.v, 0.35F).a(bug.c, 7.0);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      clb.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(aym $$0, bqb $$1) {
      this.a(bsk.a, new cua(cud.oY));
   }

   @Override
   protected bua.b<cla> dU() {
      return bua.a(ca, e);
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return clb.a(this, this.dU().a($$0));
   }

   @Override
   public bua<cla> dT() {
      return (bua<cla>)super.dT();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cua $$0) {
      return $$0.a(cud.oY) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("piglinBruteBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().c();
      clb.b(this);
      clb.c(this);
      super.Z();
   }

   @Override
   public ckz gp() {
      return this.ge() && this.gq() ? ckz.a : ckz.f;
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bsy) {
            clb.a(this, (bsy)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected ave v() {
      return avf.tP;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.tS;
   }

   @Override
   protected ave o_() {
      return avf.tR;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.tT, 0.15F, 1.0F);
   }

   protected void gu() {
      this.b(avf.tQ);
   }

   @Override
   protected void gr() {
      this.b(avf.tU);
   }
}
