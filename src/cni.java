import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cni extends cne {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   private static final double cc = 12.0;
   protected static final ImmutableList<cfp<? extends cfo<? super cni>>> e = ImmutableList.of(cfp.c, cfp.d, cfp.b, cfp.f, cfp.m);
   protected static final ImmutableList<cei<?>> bY = ImmutableList.of(
      cei.n, cei.v, cei.g, cei.h, cei.k, cei.l, cei.ao, cei.an, cei.x, cei.y, cei.m, cei.E, new cei[]{cei.o, cei.p, cei.q, cei.t, cei.ab, cei.M, cei.b}
   );

   public cni(bup<? extends cni> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bwl.a y() {
      return clv.gB().a(bwm.s, 50.0).a(bwm.v, 0.35F).a(bwm.c, 7.0).a(bwm.m, 12.0);
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      cnj.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, bsf $$1) {
      this.a(buq.a, new cwf(cwj.pa));
   }

   @Override
   protected bwg.b<cni> ef() {
      return bwg.a(bY, e);
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return cnj.a(this, this.ef().a($$0));
   }

   @Override
   public bwg<cni> ee() {
      return (bwg<cni>)super.ee();
   }

   @Override
   public boolean q() {
      return false;
   }

   @Override
   public boolean i(cwf $$0) {
      return $$0.a(cwj.pa) ? super.i($$0) : false;
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("piglinBruteBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.c();
      cnj.b(this);
      cnj.c(this);
      super.ac();
   }

   @Override
   public cnh gx() {
      return this.gk() && this.gy() ? cnh.a : cnh.f;
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dY().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bve) {
            cnj.a(this, (bve)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected awn w() {
      return awo.tO;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.tR;
   }

   @Override
   protected awn o_() {
      return awo.tQ;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.tS, 0.15F, 1.0F);
   }

   protected void gC() {
      this.b(awo.tP);
   }

   @Override
   protected void gz() {
      this.b(awo.tT);
   }
}
