import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cfj extends cer implements cej, cfx {
   private static final aie<Boolean> d = aih.a(cfj.class, aig.k);
   private static final int e = 40;
   private static final int bT = 1;
   private static final float bU = 0.6F;
   private static final int bV = 6;
   private static final float bW = 0.5F;
   private static final int bX = 40;
   private static final int bY = 15;
   private static final int bZ = 200;
   private static final float ca = 0.3F;
   private static final float cb = 0.4F;
   private int cc;
   protected static final ImmutableList<? extends bys<? extends byr<? super cfj>>> b = ImmutableList.of(bys.c, bys.d);
   protected static final ImmutableList<? extends bxl<?>> c = ImmutableList.of(bxl.g, bxl.h, bxl.k, bxl.l, bxl.n, bxl.m, bxl.E, bxl.t, bxl.o, bxl.p);

   public cfj(bnw<? extends cfj> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bpj.b<cfj> dP() {
      return bpj.a(c, b);
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      bpj<cfj> $$1 = this.dP().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(ciy.a));
      $$1.b(ciy.b);
      $$1.f();
      return $$1;
   }

   private static void a(bpj<cfj> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new brg(45, 90), new brk()));
   }

   private static void b(bpj<cfj> $$0) {
      $$0.a(
         ciy.b,
         10,
         ImmutableList.of(
            bsm.a(cfj::gi),
            bsa.a(8.0F, blh.a(30, 60)),
            new brx(ImmutableList.of(Pair.of(brs.a(0.4F), 2), Pair.of(bsh.a(0.4F, 3), 2), Pair.of(new bqk(30, 60), 1)))
         )
      );
   }

   private static void c(bpj<cfj> $$0) {
      $$0.a(ciy.k, 10, ImmutableList.of(bsf.a(1.0F), btn.a(cfj::w, brh.a(40)), btn.a(cfj::o_, brh.a(15)), bsp.a()), bxl.o);
   }

   private Optional<? extends boi> gi() {
      return this.dO().c(bxl.h).orElse(bxn.a()).a(this::j);
   }

   private boolean j(boi $$0) {
      bnw<?> $$1 = $$0.ai();
      return $$1 != bnw.br && $$1 != bnw.w && byr.c(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, false);
   }

   @Override
   public void a(aie<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.k_();
      }
   }

   public static bpo.a u() {
      return cer.gm().a(bpp.n, 40.0).a(bpp.o, 0.3F).a(bpp.k, 0.6F).a(bpp.d, 1.0).a(bpp.c, 6.0);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   public boolean B(bnq $$0) {
      if (!($$0 instanceof boi)) {
         return false;
      } else {
         this.cc = 10;
         this.dM().a(this, (byte)4);
         this.b(atl.Co);
         return cfx.a(this, (boi)$$0);
      }
   }

   @Override
   public boolean a(chl $$0) {
      return !this.fU();
   }

   @Override
   protected void e(boi $$0) {
      if (!this.o_()) {
         cfx.b(this, $$0);
      }
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof boi) {
         boi $$3 = (boi)$$0.d();
         if (this.c($$3) && !bqc.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(boi $$0) {
      this.bz.b(bxl.E);
      this.bz.a(bxl.o, $$0, 200L);
   }

   @Override
   public bpj<cfj> dO() {
      return (bpj<cfj>)super.dO();
   }

   protected void A() {
      ciy $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(ciy.k, ciy.b));
      ciy $$1 = this.bz.g().orElse(null);
      if ($$1 == ciy.k && $$0 != ciy.k) {
         this.gh();
      }

      this.v(this.bz.a(bxl.o));
   }

   @Override
   protected void aa() {
      this.dM().ae().a("zoglinBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().c();
      this.A();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (!this.dM().B && $$0) {
         this.f(bpp.c).a(0.5);
      }
   }

   @Override
   public boolean o_() {
      return this.an().b(d);
   }

   @Override
   public void d_() {
      if (this.cc > 0) {
         this.cc--;
      }

      super.d_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cc = 10;
         this.b(atl.Co);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gg() {
      return this.cc;
   }

   @Override
   protected atk y() {
      if (this.dM().B) {
         return null;
      } else {
         return this.bz.a(bxl.o) ? atl.Cn : atl.Cm;
      }
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.Cq;
   }

   @Override
   protected atk n_() {
      return atl.Cp;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.Cr, 0.15F, 1.0F);
   }

   protected void gh() {
      this.b(atl.Cn);
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
