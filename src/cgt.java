import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgt extends cgp {
   private static final int bW = 50;
   private static final float bX = 0.35F;
   private static final int bY = 7;
   protected static final ImmutableList<bzh<? extends bzg<? super cgt>>> e = ImmutableList.of(bzh.c, bzh.d, bzh.b, bzh.f, bzh.m);
   protected static final ImmutableList<bya<?>> bV = ImmutableList.of(
      bya.n, bya.v, bya.g, bya.h, bya.k, bya.l, bya.ao, bya.an, bya.x, bya.y, bya.m, bya.E, new bya[]{bya.o, bya.p, bya.q, bya.t, bya.ab, bya.M, bya.b}
   );

   public cgt(bol<? extends cgt> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 20;
   }

   public static bqd.a A() {
      return cfg.gr().a(bqe.n, 50.0).a(bqe.o, 0.35F).a(bqe.c, 7.0);
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      cgu.a(this);
      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(awt $$0, bmj $$1) {
      this.a(bom.a, new cpq(cpt.oX));
   }

   @Override
   protected bpy.b<cgt> dN() {
      return bpy.a(bV, e);
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return cgu.a(this, this.dN().a($$0));
   }

   @Override
   public bpy<cgt> dM() {
      return (bpy<cgt>)super.dM();
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean k(cpq $$0) {
      return $$0.a(cpt.oX) ? super.k($$0) : false;
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("piglinBruteBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().c();
      cgu.b(this);
      cgu.c(this);
      super.aa();
   }

   @Override
   public cgs gn() {
      return this.gd() && this.go() ? cgs.a : cgs.f;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dJ().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof box) {
            cgu.a(this, (box)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected ato y() {
      return atp.ti;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.tl;
   }

   @Override
   protected ato n_() {
      return atp.tk;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.tm, 0.15F, 1.0F);
   }

   protected void gs() {
      this.b(atp.tj);
   }

   @Override
   protected void gp() {
      this.b(atp.tn);
   }
}
