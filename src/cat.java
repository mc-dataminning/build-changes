import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cat extends cap {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bts<? extends btr<? super cat>>> bT = ImmutableList.of(bts.c, bts.d, bts.b, bts.f, bts.l);
   protected static final ImmutableList<bsn<?>> bU = ImmutableList.of(
      bsn.n, bsn.v, bsn.g, bsn.h, bsn.k, bsn.l, bsn.an, bsn.am, bsn.x, bsn.y, bsn.m, bsn.E, new bsn[]{bsn.o, bsn.p, bsn.q, bsn.t, bsn.aa, bsn.L, bsn.b}
   );

   public cat(bja<? extends cat> $$0, cqb $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bkr.a y() {
      return bzo.gk().a(bks.l, 50.0).a(bks.m, 0.35F).a(bks.c, 7.0);
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      cau.a(this);
      this.a($$0.D_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ash $$0, bhc $$1) {
      this.a(bjb.a, new cjl(cjo.ok));
   }

   @Override
   protected bkm.b<cat> dO() {
      return bkm.a(bU, bT);
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      return cau.a(this, this.dO().a($$0));
   }

   @Override
   public bkm<cat> dN() {
      return (bkm<cat>)super.dN();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cjl $$0) {
      return $$0.a(cjo.ok) ? super.k($$0) : false;
   }

   @Override
   protected void X() {
      this.dL().ad().a("piglinBruteBrain");
      this.dN().a((akt)this.dL(), this);
      this.dL().ad().c();
      cau.b(this);
      cau.c(this);
      super.X();
   }

   @Override
   public cas gg() {
      return this.fW() && this.gh() ? cas.a : cas.f;
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bjm) {
            cau.a(this, (bjm)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected apf w() {
      return apg.sd;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.sg;
   }

   @Override
   protected apf l_() {
      return apg.sf;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.sh, 0.15F, 1.0F);
   }

   protected void gl() {
      this.a(apg.se, 1.0F, this.eW());
   }

   @Override
   protected void gi() {
      this.a(apg.si, 1.0F, this.eW());
   }
}
