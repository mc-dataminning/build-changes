import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cge extends cga {
   private static final int bU = 50;
   private static final float bV = 0.35F;
   private static final int bW = 7;
   protected static final ImmutableList<bys<? extends byr<? super cge>>> e = ImmutableList.of(bys.c, bys.d, bys.b, bys.f, bys.m);
   protected static final ImmutableList<bxl<?>> bT = ImmutableList.of(
      bxl.n, bxl.v, bxl.g, bxl.h, bxl.k, bxl.l, bxl.ao, bxl.an, bxl.x, bxl.y, bxl.m, bxl.E, new bxl[]{bxl.o, bxl.p, bxl.q, bxl.t, bxl.ab, bxl.M, bxl.b}
   );

   public cge(bnw<? extends cge> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bpo.a A() {
      return cer.gm().a(bpp.n, 50.0).a(bpp.o, 0.35F).a(bpp.c, 7.0);
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      cgf.a(this);
      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(awp $$0, blu $$1) {
      this.a(bnx.a, new cpd(cpg.oX));
   }

   @Override
   protected bpj.b<cge> dP() {
      return bpj.a(bT, e);
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cgf.a(this, this.dP().a($$0));
   }

   @Override
   public bpj<cge> dO() {
      return (bpj<cge>)super.dO();
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean k(cpd $$0) {
      return $$0.a(cpg.oX) ? super.k($$0) : false;
   }

   @Override
   protected void aa() {
      this.dM().ae().a("piglinBruteBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().c();
      cgf.b(this);
      cgf.c(this);
      super.aa();
   }

   @Override
   public cgd gi() {
      return this.fY() && this.gj() ? cgd.a : cgd.f;
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof boi) {
            cgf.a(this, (boi)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected atk y() {
      return atl.ti;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.tl;
   }

   @Override
   protected atk n_() {
      return atl.tk;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.tm, 0.15F, 1.0F);
   }

   protected void gn() {
      this.b(atl.tj);
   }

   @Override
   protected void gk() {
      this.b(atl.tn);
   }
}
