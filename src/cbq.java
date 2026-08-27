import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cbq extends cbm {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bup<? extends buo<? super cbq>>> bT = ImmutableList.of(bup.c, bup.d, bup.b, bup.f, bup.l);
   protected static final ImmutableList<btk<?>> bU = ImmutableList.of(
      btk.n, btk.v, btk.g, btk.h, btk.k, btk.l, btk.an, btk.am, btk.x, btk.y, btk.m, btk.E, new btk[]{btk.o, btk.p, btk.q, btk.t, btk.aa, btk.L, btk.b}
   );

   public cbq(bjx<? extends cbq> $$0, cqz $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static blo.a y() {
      return cal.gk().a(blp.l, 50.0).a(blp.m, 0.35F).a(blp.c, 7.0);
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      cbr.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ate $$0, bhz $$1) {
      this.a(bjy.a, new ckj(ckm.ok));
   }

   @Override
   protected blj.b<cbq> dO() {
      return blj.a(bU, bT);
   }

   @Override
   protected blj<?> a(Dynamic<?> $$0) {
      return cbr.a(this, this.dO().a($$0));
   }

   @Override
   public blj<cbq> dN() {
      return (blj<cbq>)super.dN();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(ckj $$0) {
      return $$0.a(ckm.ok) ? super.k($$0) : false;
   }

   @Override
   protected void X() {
      this.dL().ad().a("piglinBruteBrain");
      this.dN().a((alq)this.dL(), this);
      this.dL().ad().c();
      cbr.b(this);
      cbr.c(this);
      super.X();
   }

   @Override
   public cbp gg() {
      return this.fW() && this.gh() ? cbp.a : cbp.f;
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bkj) {
            cbr.a(this, (bkj)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected aqc w() {
      return aqd.sf;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.si;
   }

   @Override
   protected aqc m_() {
      return aqd.sh;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.sj, 0.15F, 1.0F);
   }

   protected void gl() {
      this.a(aqd.sg, 1.0F, this.eW());
   }

   @Override
   protected void gi() {
      this.a(aqd.sk, 1.0F, this.eW());
   }
}
