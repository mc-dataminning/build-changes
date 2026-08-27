import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cap extends cal {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bto<? extends btn<? super cap>>> bT = ImmutableList.of(bto.c, bto.d, bto.b, bto.f, bto.l);
   protected static final ImmutableList<bsj<?>> bU = ImmutableList.of(
      bsj.n, bsj.v, bsj.g, bsj.h, bsj.k, bsj.l, bsj.an, bsj.am, bsj.x, bsj.y, bsj.m, bsj.E, new bsj[]{bsj.o, bsj.p, bsj.q, bsj.t, bsj.aa, bsj.L, bsj.b}
   );

   public cap(biw<? extends cap> $$0, cpx $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bkn.a y() {
      return bzk.gj().a(bko.a, 50.0).a(bko.d, 0.35F).a(bko.f, 7.0);
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      caq.a(this);
      this.a($$0.D_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ase $$0, bgy $$1) {
      this.a(bix.a, new cjh(cjk.ok));
   }

   @Override
   protected bki.b<cap> dO() {
      return bki.a(bU, bT);
   }

   @Override
   protected bki<?> a(Dynamic<?> $$0) {
      return caq.a(this, this.dO().a($$0));
   }

   @Override
   public bki<cap> dN() {
      return (bki<cap>)super.dN();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cjh $$0) {
      return $$0.a(cjk.ok) ? super.k($$0) : false;
   }

   @Override
   protected void X() {
      this.dL().ad().a("piglinBruteBrain");
      this.dN().a((aks)this.dL(), this);
      this.dL().ad().c();
      caq.b(this);
      caq.c(this);
      super.X();
   }

   @Override
   public cao gf() {
      return this.fV() && this.gg() ? cao.a : cao.f;
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bji) {
            caq.a(this, (bji)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected ape w() {
      return apf.sd;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.sg;
   }

   @Override
   protected ape l_() {
      return apf.sf;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.sh, 0.15F, 1.0F);
   }

   protected void gk() {
      this.a(apf.se, 1.0F, this.eW());
   }

   @Override
   protected void gh() {
      this.a(apf.si, 1.0F, this.eW());
   }
}
