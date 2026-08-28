import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cle extends cla {
   private static final int cb = 50;
   private static final float cc = 0.35F;
   private static final int cd = 7;
   protected static final ImmutableList<cdn<? extends cdm<? super cle>>> e = ImmutableList.of(cdn.c, cdn.d, cdn.b, cdn.f, cdn.m);
   protected static final ImmutableList<ccg<?>> ca = ImmutableList.of(
      ccg.n, ccg.v, ccg.g, ccg.h, ccg.k, ccg.l, ccg.ao, ccg.an, ccg.x, ccg.y, ccg.m, ccg.E, new ccg[]{ccg.o, ccg.p, ccg.q, ccg.t, ccg.ab, ccg.M, ccg.b}
   );

   public cle(bsn<? extends cle> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 20;
   }

   public static buj.a x() {
      return cjr.gt().a(buk.s, 50.0).a(buk.v, 0.35F).a(buk.c, 7.0);
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      clf.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayo $$0, bqf $$1) {
      this.a(bso.a, new cud(cug.oZ));
   }

   @Override
   protected bue.b<cle> dW() {
      return bue.a(ca, e);
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return clf.a(this, this.dW().a($$0));
   }

   @Override
   public bue<cle> dV() {
      return (bue<cle>)super.dV();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cud $$0) {
      return $$0.a(cug.oZ) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dR().ag().a("piglinBruteBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().c();
      clf.b(this);
      clf.c(this);
      super.Z();
   }

   @Override
   public cld gp() {
      return this.ge() && this.gq() ? cld.a : cld.f;
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dR().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btc) {
            clf.a(this, (btc)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avg v() {
      return avh.tP;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.tS;
   }

   @Override
   protected avg n_() {
      return avh.tR;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.tT, 0.15F, 1.0F);
   }

   protected void gu() {
      this.b(avh.tQ);
   }

   @Override
   protected void gr() {
      this.b(avh.tU);
   }
}
