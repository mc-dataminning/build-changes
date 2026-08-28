import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cqr extends cqn {
   private static final int f = 50;
   private static final float bI = 0.35F;
   private static final int bJ = 7;
   private static final double bK = 12.0;
   protected static final ImmutableList<cif<? extends cie<? super cqr>>> d = ImmutableList.of(cif.c, cif.d, cif.b, cif.f, cif.m);
   protected static final ImmutableList<cgy<?>> e = ImmutableList.of(
      cgy.o, cgy.w, cgy.g, cgy.h, cgy.k, cgy.l, cgy.ap, cgy.ao, cgy.y, cgy.z, cgy.n, cgy.F, new cgy[]{cgy.p, cgy.q, cgy.r, cgy.u, cgy.ac, cgy.N, cgy.b}
   );

   public cqr(bxe<? extends cqr> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 20;
   }

   public static bzb.a n() {
      return cpb.gx().a(bzc.s, 50.0).a(bzc.v, 0.35F).a(bzc.c, 7.0).a(bzc.m, 12.0);
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      cqs.a(this);
      this.a($$0.G_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azz $$0, bur $$1) {
      this.a(bxf.a, new daa(dae.pN));
   }

   @Override
   protected byw.b<cqr> ed() {
      return byw.a(e, d);
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return cqs.a(this, this.ed().a($$0));
   }

   @Override
   public byw<cqr> ec() {
      return (byw<cqr>)super.ec();
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean c(aru $$0, daa $$1) {
      return $$1.a(dae.pN) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("piglinBruteBrain");
      this.ec().a($$0, this);
      $$1.c();
      cqs.b(this);
      cqs.c(this);
      super.a($$0);
   }

   @Override
   public cqq x() {
      return this.gl() && this.gu() ? cqq.a : cqq.f;
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxw $$4) {
         cqs.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected awq u() {
      return awr.uD;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.uG;
   }

   @Override
   protected awq l_() {
      return awr.uF;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.uH, 0.15F, 1.0F);
   }

   protected void gy() {
      this.b(awr.uE);
   }

   @Override
   protected void gv() {
      this.b(awr.uI);
   }
}
