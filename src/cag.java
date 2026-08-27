import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cag extends cac {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<btf<? extends bte<? super cag>>> bT = ImmutableList.of(btf.c, btf.d, btf.b, btf.f, btf.l);
   protected static final ImmutableList<bsa<?>> bU = ImmutableList.of(
      bsa.n, bsa.v, bsa.g, bsa.h, bsa.k, bsa.l, bsa.an, bsa.am, bsa.x, bsa.y, bsa.m, bsa.E, new bsa[]{bsa.o, bsa.p, bsa.q, bsa.t, bsa.aa, bsa.L, bsa.b}
   );

   public cag(bim<? extends cag> $$0, cpm $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bke.a t() {
      return bzb.gf().a(bkf.a, 50.0).a(bkf.d, 0.35F).a(bkf.f, 7.0);
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      cah.a(this);
      this.a($$0.y_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      this.a(bin.a, new ciy(cjb.ok));
   }

   @Override
   protected bjz.b<cag> dN() {
      return bjz.a(bU, bT);
   }

   @Override
   protected bjz<?> a(Dynamic<?> $$0) {
      return cah.a(this, this.dN().a($$0));
   }

   @Override
   public bjz<cag> dM() {
      return (bjz<cag>)super.dM();
   }

   @Override
   public boolean p() {
      return false;
   }

   @Override
   public boolean k(ciy $$0) {
      return $$0.a(cjb.ok) ? super.k($$0) : false;
   }

   @Override
   protected void V() {
      this.dK().ad().a("piglinBruteBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      cah.b(this);
      cah.c(this);
      super.V();
   }

   @Override
   public caf gb() {
      return this.fS() && this.gc() ? caf.a : caf.f;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof biy) {
            cah.a(this, (biy)$$0.d());
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
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.sh, 0.15F, 1.0F);
   }

   protected void gg() {
      this.a(aow.se, 1.0F, this.eV());
   }

   @Override
   protected void gd() {
      this.a(aow.si, 1.0F, this.eV());
   }
}
