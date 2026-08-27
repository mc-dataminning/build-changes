import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class cbs extends cba implements cas, cby {
   private static final afm<Boolean> d = afp.a(cbs.class, afo.k);
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
   protected static final ImmutableList<? extends bve<? extends bvd<? super cbs>>> b = ImmutableList.of(bve.c, bve.d);
   protected static final ImmutableList<? extends btz<?>> c = ImmutableList.of(btz.g, btz.h, btz.k, btz.l, btz.n, btz.m, btz.E, btz.t, btz.o, btz.p);

   public cbs(bkm<? extends cbs> $$0, crs $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bly.b<cbs> dO() {
      return bly.a(c, b);
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      bly<cbs> $$1 = this.dO().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cex.a));
      $$1.b(cex.b);
      $$1.f();
      return $$1;
   }

   private static void a(bly<cbs> $$0) {
      $$0.a(cex.a, 0, ImmutableList.of(new bnu(45, 90), new bny()));
   }

   private static void b(bly<cbs> $$0) {
      $$0.a(
         cex.b,
         10,
         ImmutableList.of(
            bpa.a(cbs::gg),
            boo.a(8.0F, bib.a(30, 60)),
            new bol(ImmutableList.of(Pair.of(bog.a(0.4F), 2), Pair.of(bov.a(0.4F, 3), 2), Pair.of(new bmz(30, 60), 1)))
         )
      );
   }

   private static void c(bly<cbs> $$0) {
      $$0.a(cex.k, 10, ImmutableList.of(bot.a(1.0F), bqb.a(cbs::t, bnv.a(40)), bqb.a(cbs::n_, bnv.a(15)), bpd.a()), btz.o);
   }

   private Optional<? extends bky> gg() {
      return this.dN().c(btz.h).orElse(bub.a()).a(this::j);
   }

   private boolean j(bky $$0) {
      bkm<?> $$1 = $$0.ag();
      return $$1 != bkm.bo && $$1 != bkm.u && bvd.c(this, $$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, false);
   }

   @Override
   public void a(afm<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static bmd.a s() {
      return cba.gk().a(bme.l, 40.0).a(bme.m, 0.3F).a(bme.i, 0.6F).a(bme.d, 1.0).a(bme.c, 6.0);
   }

   public boolean t() {
      return !this.n_();
   }

   @Override
   public boolean C(bki $$0) {
      if (!($$0 instanceof bky)) {
         return false;
      } else {
         this.cc = 10;
         this.dL().a(this, (byte)4);
         this.a(aqn.Bb, 1.0F, this.eW());
         return cby.a(this, (bky)$$0);
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return !this.fS();
   }

   @Override
   protected void e(bky $$0) {
      if (!this.n_()) {
         cby.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bky) {
         bky $$3 = (bky)$$0.d();
         if (this.c($$3) && !bmr.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bky $$0) {
      this.bz.b(btz.E);
      this.bz.a(btz.o, $$0, 200L);
   }

   @Override
   public bly<cbs> dN() {
      return (bly<cbs>)super.dN();
   }

   protected void y() {
      cex $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cex.k, cex.b));
      cex $$1 = this.bz.g().orElse(null);
      if ($$1 == cex.k && $$0 != cex.k) {
         this.gf();
      }

      this.v(this.bz.a(btz.o));
   }

   @Override
   protected void X() {
      this.dL().ad().a("zoglinBrain");
      this.dN().a((ama)this.dL(), this);
      this.dL().ad().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (!this.dL().B && $$0) {
         this.a(bme.c).a(0.5);
      }
   }

   @Override
   public boolean n_() {
      return this.al().b(d);
   }

   @Override
   public void c_() {
      if (this.cc > 0) {
         this.cc--;
      }

      super.c_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cc = 10;
         this.a(aqn.Bb, 1.0F, this.eW());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ge() {
      return this.cc;
   }

   @Override
   protected aqm w() {
      if (this.dL().B) {
         return null;
      } else {
         return this.bz.a(btz.o) ? aqn.Ba : aqn.AZ;
      }
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.Bd;
   }

   @Override
   protected aqm m_() {
      return aqn.Bc;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.Be, 0.15F, 1.0F);
   }

   protected void gf() {
      this.a(aqn.Ba, 1.0F, this.eW());
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }

   @Override
   public bld eR() {
      return bld.b;
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
