import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cld extends ckz {
   private static final int cb = 50;
   private static final float cc = 0.35F;
   private static final int cd = 7;
   protected static final ImmutableList<cdm<? extends cdl<? super cld>>> e = ImmutableList.of(cdm.c, cdm.d, cdm.b, cdm.f, cdm.m);
   protected static final ImmutableList<ccf<?>> ca = ImmutableList.of(
      ccf.n, ccf.v, ccf.g, ccf.h, ccf.k, ccf.l, ccf.ao, ccf.an, ccf.x, ccf.y, ccf.m, ccf.E, new ccf[]{ccf.o, ccf.p, ccf.q, ccf.t, ccf.ab, ccf.M, ccf.b}
   );

   public cld(bsm<? extends cld> $$0, dcf $$1) {
      super($$0, $$1);
      this.bP = 20;
   }

   public static bui.a y() {
      return cjq.gu().a(buj.s, 50.0).a(buj.v, 0.35F).a(buj.c, 7.0);
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      cle.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayo $$0, bqe $$1) {
      this.a(bsn.a, new cuc(cuf.oZ));
   }

   @Override
   protected bud.b<cld> dV() {
      return bud.a(ca, e);
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return cle.a(this, this.dV().a($$0));
   }

   @Override
   public bud<cld> dU() {
      return (bud<cld>)super.dU();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cuc $$0) {
      return $$0.a(cuf.oZ) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("piglinBruteBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      cle.b(this);
      cle.c(this);
      super.Z();
   }

   @Override
   public clc gq() {
      return this.gf() && this.gr() ? clc.a : clc.f;
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dQ().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btb) {
            cle.a(this, (btb)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avg v() {
      return avh.tP;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.tS;
   }

   @Override
   protected avg o_() {
      return avh.tR;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.tT, 0.15F, 1.0F);
   }

   protected void gv() {
      this.b(avh.tQ);
   }

   @Override
   protected void gs() {
      this.b(avh.tU);
   }
}
