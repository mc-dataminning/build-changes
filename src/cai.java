import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cai extends cae {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bth<? extends btg<? super cai>>> bT = ImmutableList.of(bth.c, bth.d, bth.b, bth.f, bth.l);
   protected static final ImmutableList<bsc<?>> bU = ImmutableList.of(
      bsc.n, bsc.v, bsc.g, bsc.h, bsc.k, bsc.l, bsc.an, bsc.am, bsc.x, bsc.y, bsc.m, bsc.E, new bsc[]{bsc.o, bsc.p, bsc.q, bsc.t, bsc.aa, bsc.L, bsc.b}
   );

   public cai(bip<? extends cai> $$0, cpq $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bkg.a t() {
      return bzd.gg().a(bkh.a, 50.0).a(bkh.d, 0.35F).a(bkh.f, 7.0);
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      caj.a(this);
      this.a($$0.y_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(arx $$0, bgr $$1) {
      this.a(biq.a, new cja(cjd.ok));
   }

   @Override
   protected bkb.b<cai> dN() {
      return bkb.a(bU, bT);
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      return caj.a(this, this.dN().a($$0));
   }

   @Override
   public bkb<cai> dM() {
      return (bkb<cai>)super.dM();
   }

   @Override
   public boolean p() {
      return false;
   }

   @Override
   public boolean k(cja $$0) {
      return $$0.a(cjd.ok) ? super.k($$0) : false;
   }

   @Override
   protected void V() {
      this.dK().ad().a("piglinBruteBrain");
      this.dM().a((akn)this.dK(), this);
      this.dK().ad().c();
      caj.b(this);
      caj.c(this);
      super.V();
   }

   @Override
   public cah gc() {
      return this.fS() && this.gd() ? cah.a : cah.f;
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bjb) {
            caj.a(this, (bjb)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected aoy r() {
      return aoz.sd;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.sg;
   }

   @Override
   protected aoy h_() {
      return aoz.sf;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.sh, 0.15F, 1.0F);
   }

   protected void gh() {
      this.a(aoz.se, 1.0F, this.eV());
   }

   @Override
   protected void ge() {
      this.a(aoz.si, 1.0F, this.eV());
   }
}
