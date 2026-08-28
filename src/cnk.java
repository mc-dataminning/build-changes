import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnk extends cms implements cob {
   private static final ajx<Boolean> bF = akb.a(cnk.class, ajz.k);
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
   protected static final ImmutableList<? extends cgj<? extends cgi<? super cnk>>> a = ImmutableList.of(cgj.c, cgj.d);
   protected static final ImmutableList<? extends cfc<?>> b = ImmutableList.of(cfc.g, cfc.h, cfc.k, cfc.l, cfc.n, cfc.m, cfc.E, cfc.t, cfc.o, cfc.p);

   public cnk(bvi<? extends cnk> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 5;
   }

   @Override
   protected bxa.b<cnk> eb() {
      return bxa.a(b, a);
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      bxa<cnk> $$1 = this.eb().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cri.a));
      $$1.b(cri.b);
      $$1.f();
      return $$1;
   }

   private static void a(bxa<cnk> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new byx(45, 90), new bzb()));
   }

   private static void b(bxa<cnk> $$0) {
      $$0.a(
         cri.b,
         10,
         ImmutableList.of(
            cad.a(($$0x, $$1) -> $$1.g($$0x)),
            bzr.a(8.0F, bsj.a(30, 60)),
            new bzo(ImmutableList.of(Pair.of(bzj.a(0.4F), 2), Pair.of(bzy.a(0.4F, 3), 2), Pair.of(new byb(30, 60), 1)))
         )
      );
   }

   private static void c(bxa<cnk> $$0) {
      $$0.a(cri.k, 10, ImmutableList.of(bzw.a(1.0F), cbe.a(cnk::m, byy.a(40)), cbe.a(cnk::n_, byy.a(15)), cag.a()), cfc.o);
   }

   private Optional<? extends bvy> g(ard $$0) {
      return this.ea().c(cfc.h).orElse(cfe.a()).a($$1 -> this.b($$0, $$1));
   }

   private boolean b(ard $$0, bvy $$1) {
      bvi<?> $$2 = $$1.aq();
      return $$2 != bvi.bM && $$2 != bvi.E && cgi.c($$0, this, $$1);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (bF.equals($$0)) {
         this.i_();
      }
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxf.a j() {
      return cms.gv().a(bxg.s, 40.0).a(bxg.v, 0.3F).a(bxg.p, 0.6F).a(bxg.d, 1.0).a(bxg.c, 6.0);
   }

   public boolean m() {
      return !this.n_();
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      if ($$1 instanceof bvy $$2) {
         this.bQ = 10;
         $$0.a(this, (byte)4);
         this.b(awa.En);
         return cob.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void e(bvy $$0) {
      if (!this.n_()) {
         cob.a(this, $$0);
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvy $$4) {
         if (this.c($$4) && !bxt.a(this, $$4, 4.0)) {
            this.j($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void j(bvy $$0) {
      this.bs.b(cfc.E);
      this.bs.a(cfc.o, $$0, 200L);
   }

   @Override
   public bxa<cnk> ea() {
      return (bxa<cnk>)super.ea();
   }

   protected void n() {
      cri $$0 = this.bs.g().orElse(null);
      this.bs.a(ImmutableList.of(cri.k, cri.b));
      cri $$1 = this.bs.g().orElse(null);
      if ($$1 == cri.k && $$0 != cri.k) {
         this.t();
      }

      this.v(this.bs.a(cfc.o));
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("zoglinBrain");
      this.ea().a($$0, this);
      $$1.c();
      this.n();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bF, $$0);
      if (!this.dU().C && $$0) {
         this.g(bxg.c).a(0.5);
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
         this.b(awa.En);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bQ;
   }

   @Override
   protected avz u() {
      if (this.dU().C) {
         return null;
      } else {
         return this.bs.a(cfc.o) ? awa.Em : awa.El;
      }
   }

   @Override
   protected avz e(btp $$0) {
      return awa.Ep;
   }

   @Override
   protected avz l_() {
      return awa.Eo;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.Eq, 0.15F, 1.0F);
   }

   protected void t() {
      this.b(awa.Em);
   }

   @Nullable
   @Override
   public bvy f() {
      return this.Q();
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
