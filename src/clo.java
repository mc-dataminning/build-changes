import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clo extends cji {
   private static final int bI = 0;
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int bJ = 0;
   protected static final ImmutableList<cif<? extends cie<? super clo>>> e = ImmutableList.of(cif.c, cif.d, cif.f, cif.s);
   protected static final ImmutableList<cgy<?>> f = ImmutableList.of(cgy.o, cgy.h, cgy.n, cgy.F, cgy.u, cgy.L, cgy.Q, cgy.S, cgy.P, cgy.s, cgy.aa);

   public clo(bxe<? extends cji> $$0, djz $$1) {
      super($$0, $$1);
      this.bC = new cdx(this, 85, 10, 0.02F, 0.1F, true);
      this.bB = new cdw(this, 10);
   }

   @Override
   protected chg b(djz $$0) {
      return new chi(this, $$0);
   }

   @Override
   protected byw.b<clo> ed() {
      return byw.a(f, e);
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return clp.a(this.ed().a($$0));
   }

   @Override
   public byw<clo> ec() {
      return (byw<clo>)super.ec();
   }

   @Override
   protected awq t() {
      return awr.Ay;
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("tadpoleBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      clp.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bzb.a x() {
      return cjm.gz().a(bzc.v, 1.0).a(bzc.s, 6.0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.c(this.bJ + 1);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Age", this.bJ);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c($$0.b("Age", 0));
   }

   @Nullable
   @Override
   protected awq u() {
      return null;
   }

   @Nullable
   @Override
   protected awq e(bvk $$0) {
      return awr.AA;
   }

   @Nullable
   @Override
   protected awq l_() {
      return awr.Ax;
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return but.a;
      } else {
         return cjo.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void a_(daa $$0) {
      cjo.a(this, $$0);
      dci.a(kl.Z, $$0, $$0x -> $$0x.a("Age", this.gu()));
   }

   @Override
   public void d(ua $$0) {
      cjo.a(this, $$0);
      $$0.e("Age").ifPresent(this::c);
   }

   @Override
   public daa W_() {
      return new daa(dae.rA);
   }

   @Override
   public awq n() {
      return awr.do;
   }

   private boolean j(daa $$0) {
      return $$0.a(axo.aq);
   }

   private void a(crz $$0, daa $$1) {
      this.b($$0, $$1);
      this.b(bwl.d_(this.gw()));
      this.dV().a(lz.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(crz $$0, daa $$1) {
      $$1.a(1, $$0);
   }

   private int gu() {
      return this.bJ;
   }

   private void b(int $$0) {
      this.c(this.bJ + $$0 * 20);
   }

   private void c(int $$0) {
      this.bJ = $$0;
      if (this.bJ >= a) {
         this.gv();
      }
   }

   private void gv() {
      if (this.dV() instanceof aru $$0) {
         this.a(bxe.ac, bwp.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dV().d_($$1.dv()), bxd.i, null);
            $$1.gc();
            $$1.a(this.a(this.at()));
            this.a(awr.Az, 0.15F, 1.0F);
         });
      }
   }

   private int gw() {
      return Math.max(0, a - this.bJ);
   }

   @Override
   public boolean eo() {
      return false;
   }
}
