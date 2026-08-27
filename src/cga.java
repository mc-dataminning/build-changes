import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cga extends cfw {
   private static final int bU = 50;
   private static final float bV = 0.35F;
   private static final int bW = 7;
   protected static final ImmutableList<byo<? extends byn<? super cga>>> e = ImmutableList.of(byo.c, byo.d, byo.b, byo.f, byo.m);
   protected static final ImmutableList<bxh<?>> bT = ImmutableList.of(
      bxh.n, bxh.v, bxh.g, bxh.h, bxh.k, bxh.l, bxh.ao, bxh.an, bxh.x, bxh.y, bxh.m, bxh.E, new bxh[]{bxh.o, bxh.p, bxh.q, bxh.t, bxh.ab, bxh.M, bxh.b}
   );

   public cga(bnu<? extends cga> $$0, cvn $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bpk.a A() {
      return cen.gm().a(bpl.n, 50.0).a(bpl.o, 0.35F).a(bpl.c, 7.0);
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      cgb.a(this);
      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(awo $$0, bls $$1) {
      this.a(bnv.a, new coz(cpc.oX));
   }

   @Override
   protected bpf.b<cga> dP() {
      return bpf.a(bT, e);
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return cgb.a(this, this.dP().a($$0));
   }

   @Override
   public bpf<cga> dO() {
      return (bpf<cga>)super.dO();
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean k(coz $$0) {
      return $$0.a(cpc.oX) ? super.k($$0) : false;
   }

   @Override
   protected void aa() {
      this.dM().af().a("piglinBruteBrain");
      this.dO().a((aov)this.dM(), this);
      this.dM().af().c();
      cgb.b(this);
      cgb.c(this);
      super.aa();
   }

   @Override
   public cfz gi() {
      return this.fY() && this.gj() ? cfz.a : cfz.f;
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bog) {
            cgb.a(this, (bog)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected atj y() {
      return atk.th;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.tk;
   }

   @Override
   protected atj n_() {
      return atk.tj;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.tl, 0.15F, 1.0F);
   }

   protected void gn() {
      this.b(atk.ti);
   }

   @Override
   protected void gk() {
      this.b(atk.tm);
   }
}
