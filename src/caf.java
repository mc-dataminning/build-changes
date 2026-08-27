import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class caf extends cab {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bte<? extends btd<? super caf>>> bT = ImmutableList.of(bte.c, bte.d, bte.b, bte.f, bte.l);
   protected static final ImmutableList<brz<?>> bU = ImmutableList.of(
      brz.n, brz.v, brz.g, brz.h, brz.k, brz.l, brz.an, brz.am, brz.x, brz.y, brz.m, brz.E, new brz[]{brz.o, brz.p, brz.q, brz.t, brz.aa, brz.L, brz.b}
   );

   public caf(bim<? extends caf> $$0, cpl $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bkd.a t() {
      return bza.gg().a(bke.a, 50.0).a(bke.d, 0.35F).a(bke.f, 7.0);
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      cag.a(this);
      this.a($$0.y_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      this.a(bin.a, new cix(cja.ok));
   }

   @Override
   protected bjy.b<caf> dN() {
      return bjy.a(bU, bT);
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      return cag.a(this, this.dN().a($$0));
   }

   @Override
   public bjy<caf> dM() {
      return (bjy<caf>)super.dM();
   }

   @Override
   public boolean p() {
      return false;
   }

   @Override
   public boolean k(cix $$0) {
      return $$0.a(cja.ok) ? super.k($$0) : false;
   }

   @Override
   protected void V() {
      this.dK().ad().a("piglinBruteBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      cag.b(this);
      cag.c(this);
      super.V();
   }

   @Override
   public cae gc() {
      return this.fS() && this.gd() ? cae.a : cae.f;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof biy) {
            cag.a(this, (biy)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected aov r() {
      return aow.sd;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.sg;
   }

   @Override
   protected aov h_() {
      return aow.sf;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.sh, 0.15F, 1.0F);
   }

   protected void gh() {
      this.a(aow.se, 1.0F, this.eV());
   }

   @Override
   protected void ge() {
      this.a(aow.si, 1.0F, this.eV());
   }
}
