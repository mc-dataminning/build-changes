import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cob extends cnj implements cot {
   private static final akg<Boolean> bE = akk.a(cob.class, aki.k);
   private static final int bF = 40;
   private static final int bG = 1;
   private static final float bH = 0.6F;
   private static final int bI = 6;
   private static final float bJ = 0.5F;
   private static final int bK = 40;
   private static final int bL = 15;
   private static final int bM = 200;
   private static final float bN = 0.3F;
   private static final float bO = 0.4F;
   private int bP;
   protected static final ImmutableList<? extends cha<? extends cgz<? super cob>>> a = ImmutableList.of(cha.c, cha.d);
   protected static final ImmutableList<? extends cft<?>> b = ImmutableList.of(cft.g, cft.h, cft.k, cft.l, cft.o, cft.n, cft.F, cft.u, cft.p, cft.q);

   public cob(bwb<? extends cob> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 5;
   }

   @Override
   protected bxr.b<cob> ec() {
      return bxr.a(b, a);
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      bxr<cob> $$1 = this.ec().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(crz.a));
      $$1.b(crz.b);
      $$1.f();
      return $$1;
   }

   private static void a(bxr<cob> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new bzo(45, 90), new bzs()));
   }

   private static void b(bxr<cob> $$0) {
      $$0.a(
         crz.b,
         10,
         ImmutableList.of(
            cau.a(($$0x, $$1) -> $$1.g($$0x)),
            cai.a(8.0F, btb.a(30, 60)),
            new caf(ImmutableList.of(Pair.of(caa.a(0.4F), 2), Pair.of(cap.a(0.4F, 3), 2), Pair.of(new bys(30, 60), 1)))
         )
      );
   }

   private static void c(bxr<cob> $$0) {
      $$0.a(crz.k, 10, ImmutableList.of(can.a(1.0F), cbv.a(cob::m, bzp.a(40)), cbv.a(cob::n_, bzp.a(15)), cax.a()), cft.p);
   }

   private Optional<? extends bwr> g(arn $$0) {
      return this.eb().c(cft.h).orElse(cfv.a()).a($$1 -> this.b($$0, $$1));
   }

   private boolean b(arn $$0, bwr $$1) {
      bwb<?> $$2 = $$1.aq();
      return $$2 != bwb.bM && $$2 != bwb.E && cgz.c($$0, this, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bE, false);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (bE.equals($$0)) {
         this.i_();
      }
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxw.a j() {
      return cnj.gt().a(bxx.s, 40.0).a(bxx.v, 0.3F).a(bxx.p, 0.6F).a(bxx.d, 1.0).a(bxx.c, 6.0);
   }

   public boolean m() {
      return !this.n_();
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      if ($$1 instanceof bwr $$2) {
         this.bP = 10;
         $$0.a(this, (byte)4);
         this.b(awk.En);
         return cot.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void e(bwr $$0) {
      if (!this.n_()) {
         cot.a(this, $$0);
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwr $$4) {
         if (this.c($$4) && !byk.a(this, $$4, 4.0)) {
            this.j($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void j(bwr $$0) {
      this.br.b(cft.F);
      this.br.a(cft.p, $$0, 200L);
   }

   @Override
   public bxr<cob> eb() {
      return (bxr<cob>)super.eb();
   }

   protected void n() {
      crz $$0 = this.br.g().orElse(null);
      this.br.a(ImmutableList.of(crz.k, crz.b));
      crz $$1 = this.br.g().orElse(null);
      if ($$1 == crz.k && $$0 != crz.k) {
         this.t();
      }

      this.v(this.br.a(cft.p));
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("zoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      this.n();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bE, $$0);
      if (!this.dV().C && $$0) {
         this.g(bxx.c).a(0.5);
      }
   }

   @Override
   public boolean n_() {
      return this.au().a(bE);
   }

   @Override
   public void k_() {
      if (this.bP > 0) {
         this.bP--;
      }

      super.k_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bP = 10;
         this.b(awk.En);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bP;
   }

   @Override
   protected awj u() {
      if (this.dV().C) {
         return null;
      } else {
         return this.br.a(cft.p) ? awk.Em : awk.El;
      }
   }

   @Override
   protected awj e(buh $$0) {
      return awk.Ep;
   }

   @Override
   protected awj l_() {
      return awk.Eo;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.Eq, 0.15F, 1.0F);
   }

   protected void t() {
      this.b(awk.Em);
   }

   @Nullable
   @Override
   public bwr f() {
      return this.Q();
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
