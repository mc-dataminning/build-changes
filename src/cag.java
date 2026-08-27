import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class cag extends bzo implements bzg, cam {
   private static final aef<Boolean> d = aei.a(cag.class, aeh.k);
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
   protected static final ImmutableList<? extends bts<? extends btr<? super cag>>> b = ImmutableList.of(bts.c, bts.d);
   protected static final ImmutableList<? extends bsn<?>> c = ImmutableList.of(bsn.g, bsn.h, bsn.k, bsn.l, bsn.n, bsn.m, bsn.E, bsn.t, bsn.o, bsn.p);

   public cag(bja<? extends cag> $$0, cqb $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bkm.b<cag> dO() {
      return bkm.a(c, b);
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      bkm<cag> $$1 = this.dO().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cdl.a));
      $$1.b(cdl.b);
      $$1.f();
      return $$1;
   }

   private static void a(bkm<cag> $$0) {
      $$0.a(cdl.a, 0, ImmutableList.of(new bmi(45, 90), new bmm()));
   }

   private static void b(bkm<cag> $$0) {
      $$0.a(
         cdl.b,
         10,
         ImmutableList.of(
            bno.a(cag::gg),
            bnc.a(8.0F, bgp.a(30, 60)),
            new bmz(ImmutableList.of(Pair.of(bmu.a(0.4F), 2), Pair.of(bnj.a(0.4F, 3), 2), Pair.of(new bln(30, 60), 1)))
         )
      );
   }

   private static void c(bkm<cag> $$0) {
      $$0.a(cdl.k, 10, ImmutableList.of(bnh.a(1.0F), bop.a(cag::t, bmj.a(40)), bop.a(cag::m_, bmj.a(15)), bnr.a()), bsn.o);
   }

   private Optional<? extends bjm> gg() {
      return this.dN().c(bsn.h).orElse(bsp.a()).a(this::j);
   }

   private boolean j(bjm $$0) {
      bja<?> $$1 = $$0.ag();
      return $$1 != bja.bo && $$1 != bja.u && btr.c(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, false);
   }

   @Override
   public void a(aef<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.i_();
      }
   }

   public static bkr.a s() {
      return bzo.gk().a(bks.l, 40.0).a(bks.m, 0.3F).a(bks.i, 0.6F).a(bks.d, 1.0).a(bks.c, 6.0);
   }

   public boolean t() {
      return !this.m_();
   }

   @Override
   public boolean C(biw $$0) {
      if (!($$0 instanceof bjm)) {
         return false;
      } else {
         this.cc = 10;
         this.dL().a(this, (byte)4);
         this.a(apg.AW, 1.0F, this.eW());
         return cam.a(this, (bjm)$$0);
      }
   }

   @Override
   public boolean a(cca $$0) {
      return !this.fS();
   }

   @Override
   protected void e(bjm $$0) {
      if (!this.m_()) {
         cam.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bjm) {
         bjm $$3 = (bjm)$$0.d();
         if (this.c($$3) && !blf.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bjm $$0) {
      this.bz.b(bsn.E);
      this.bz.a(bsn.o, $$0, 200L);
   }

   @Override
   public bkm<cag> dN() {
      return (bkm<cag>)super.dN();
   }

   protected void y() {
      cdl $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cdl.k, cdl.b));
      cdl $$1 = this.bz.g().orElse(null);
      if ($$1 == cdl.k && $$0 != cdl.k) {
         this.gf();
      }

      this.v(this.bz.a(bsn.o));
   }

   @Override
   protected void X() {
      this.dL().ad().a("zoglinBrain");
      this.dN().a((akt)this.dL(), this);
      this.dL().ad().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (!this.dL().B && $$0) {
         this.a(bks.c).a(0.5);
      }
   }

   @Override
   public boolean m_() {
      return this.al().b(d);
   }

   @Override
   public void b_() {
      if (this.cc > 0) {
         this.cc--;
      }

      super.b_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cc = 10;
         this.a(apg.AW, 1.0F, this.eW());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ge() {
      return this.cc;
   }

   @Override
   protected apf w() {
      if (this.dL().B) {
         return null;
      } else {
         return this.bz.a(bsn.o) ? apg.AV : apg.AU;
      }
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.AY;
   }

   @Override
   protected apf l_() {
      return apg.AX;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.AZ, 0.15F, 1.0F);
   }

   protected void gf() {
      this.a(apg.AV, 1.0F, this.eW());
   }

   @Override
   protected void W() {
      super.W();
      abc.a(this);
   }

   @Override
   public bjr eR() {
      return bjr.b;
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      if (this.m_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
