import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cej extends cef {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bwx<? extends bww<? super cej>>> e = ImmutableList.of(bwx.c, bwx.d, bwx.b, bwx.f, bwx.m);
   protected static final ImmutableList<bvq<?>> bU = ImmutableList.of(
      bvq.n, bvq.v, bvq.g, bvq.h, bvq.k, bvq.l, bvq.ao, bvq.an, bvq.x, bvq.y, bvq.m, bvq.E, new bvq[]{bvq.o, bvq.p, bvq.q, bvq.t, bvq.ab, bvq.M, bvq.b}
   );

   public cej(bmc<? extends cej> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 20;
   }

   public static bnt.a A() {
      return ccw.gl().a(bnu.n, 50.0).a(bnu.o, 0.35F).a(bnu.c, 7.0);
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      cek.a(this);
      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auw $$0, bka $$1) {
      this.a(bmd.a, new cng(cnj.oX));
   }

   @Override
   protected bno.b<cej> dO() {
      return bno.a(bU, e);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return cek.a(this, this.dO().a($$0));
   }

   @Override
   public bno<cej> dN() {
      return (bno<cej>)super.dN();
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean k(cng $$0) {
      return $$0.a(cnj.oX) ? super.k($$0) : false;
   }

   @Override
   protected void aa() {
      this.dL().af().a("piglinBruteBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().c();
      cek.b(this);
      cek.c(this);
      super.aa();
   }

   @Override
   public cei gh() {
      return this.fX() && this.gi() ? cei.a : cei.f;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bmo) {
            cek.a(this, (bmo)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected ars y() {
      return art.th;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.tk;
   }

   @Override
   protected ars n_() {
      return art.tj;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.tl, 0.15F, 1.0F);
   }

   protected void gm() {
      this.a(art.ti, 1.0F, this.eX());
   }

   @Override
   protected void gj() {
      this.a(art.tm, 1.0F, this.eX());
   }
}
