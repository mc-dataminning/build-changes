import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class col extends cnt implements cpd {
   private static final akh<Boolean> bF = akl.a(col.class, akj.k);
   private static final int bG = 40;
   private static final int bH = 1;
   private static final float bI = 0.6F;
   private static final int bJ = 6;
   private static final float bK = 0.5F;
   private static final int bL = 40;
   private static final int bM = 15;
   private static final int bN = 200;
   private static final float bO = 0.3F;
   private static final float bP = 0.4F;
   private int bQ;
   protected static final ImmutableList<? extends chi<? extends chh<? super col>>> a = ImmutableList.of(chi.c, chi.d);
   protected static final ImmutableList<? extends cgb<?>> b = ImmutableList.of(cgb.g, cgb.h, cgb.k, cgb.l, cgb.o, cgb.n, cgb.F, cgb.u, cgb.p, cgb.q);

   public col(bwj<? extends col> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 5;
   }

   @Override
   protected bxz.b<col> ec() {
      return bxz.a(b, a);
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      bxz<col> $$1 = this.ec().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(csl.a));
      $$1.b(csl.b);
      $$1.f();
      return $$1;
   }

   private static void a(bxz<col> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new bzw(45, 90), new caa()));
   }

   private static void b(bxz<col> $$0) {
      $$0.a(
         csl.b,
         10,
         ImmutableList.of(
            cbc.a(($$0x, $$1) -> $$1.g($$0x)),
            caq.a(8.0F, btj.a(30, 60)),
            new can(ImmutableList.of(Pair.of(cai.a(0.4F), 2), Pair.of(cax.a(0.4F, 3), 2), Pair.of(new bza(30, 60), 1)))
         )
      );
   }

   private static void c(bxz<col> $$0) {
      $$0.a(csl.k, 10, ImmutableList.of(cav.a(1.0F), ccd.a(col::m, bzx.a(40)), ccd.a(col::n_, bzx.a(15)), cbf.a()), cgb.p);
   }

   private Optional<? extends bwz> g(aro $$0) {
      return this.eb().c(cgb.h).orElse(cgd.a()).a($$1 -> this.c($$0, $$1));
   }

   private boolean c(aro $$0, bwz $$1) {
      bwj<?> $$2 = $$1.aq();
      return $$2 != bwj.bN && $$2 != bwj.E && chh.c($$0, this, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (bF.equals($$0)) {
         this.i_();
      }
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bye.a j() {
      return cnt.gt().a(byf.s, 40.0).a(byf.v, 0.3F).a(byf.p, 0.6F).a(byf.d, 1.0).a(byf.c, 6.0);
   }

   public boolean m() {
      return !this.n_();
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      if ($$1 instanceof bwz $$2) {
         this.bQ = 10;
         $$0.a(this, (byte)4);
         this.b(awl.En);
         return cpd.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void d(bwz $$0) {
      if (!this.n_()) {
         cpd.a(this, $$0);
      }
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwz $$4) {
         if (this.c($$4) && !bys.a(this, $$4, 4.0)) {
            this.i($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void i(bwz $$0) {
      this.bs.b(cgb.F);
      this.bs.a(cgb.p, $$0, 200L);
   }

   @Override
   public bxz<col> eb() {
      return (bxz<col>)super.eb();
   }

   protected void n() {
      csl $$0 = this.bs.g().orElse(null);
      this.bs.a(ImmutableList.of(csl.k, csl.b));
      csl $$1 = this.bs.g().orElse(null);
      if ($$1 == csl.k && $$0 != csl.k) {
         this.t();
      }

      this.v(this.bs.a(cgb.p));
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("zoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      this.n();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bF, $$0);
      if (!this.dV().C && $$0) {
         this.g(byf.c).a(0.5);
      }
   }

   @Override
   public boolean n_() {
      return this.au().a(bF);
   }

   @Override
   public void k_() {
      if (this.bQ > 0) {
         this.bQ--;
      }

      super.k_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bQ = 10;
         this.b(awl.En);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bQ;
   }

   @Override
   protected awk u() {
      if (this.dV().C) {
         return null;
      } else {
         return this.bs.a(cgb.p) ? awl.Em : awl.El;
      }
   }

   @Override
   protected awk e(bup $$0) {
      return awl.Ep;
   }

   @Override
   protected awk l_() {
      return awl.Eo;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.Eq, 0.15F, 1.0F);
   }

   protected void t() {
      this.b(awl.Em);
   }

   @Nullable
   @Override
   public bwz f() {
      return this.Q();
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
