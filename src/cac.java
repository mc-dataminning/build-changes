import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class cac extends bzk implements bzc, cai {
   private static final aeg<Boolean> d = aej.a(cac.class, aei.k);
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
   protected static final ImmutableList<? extends bto<? extends btn<? super cac>>> b = ImmutableList.of(bto.c, bto.d);
   protected static final ImmutableList<? extends bsj<?>> c = ImmutableList.of(bsj.g, bsj.h, bsj.k, bsj.l, bsj.n, bsj.m, bsj.E, bsj.t, bsj.o, bsj.p);

   public cac(biw<? extends cac> $$0, cpx $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bki.b<cac> dO() {
      return bki.a(c, b);
   }

   @Override
   protected bki<?> a(Dynamic<?> $$0) {
      bki<cac> $$1 = this.dO().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cdh.a));
      $$1.b(cdh.b);
      $$1.f();
      return $$1;
   }

   private static void a(bki<cac> $$0) {
      $$0.a(cdh.a, 0, ImmutableList.of(new bme(45, 90), new bmi()));
   }

   private static void b(bki<cac> $$0) {
      $$0.a(
         cdh.b,
         10,
         ImmutableList.of(
            bnk.a(cac::gf),
            bmy.a(8.0F, bgl.a(30, 60)),
            new bmv(ImmutableList.of(Pair.of(bmq.a(0.4F), 2), Pair.of(bnf.a(0.4F, 3), 2), Pair.of(new blj(30, 60), 1)))
         )
      );
   }

   private static void c(bki<cac> $$0) {
      $$0.a(cdh.k, 10, ImmutableList.of(bnd.a(1.0F), bol.a(cac::t, bmf.a(40)), bol.a(cac::m_, bmf.a(15)), bnn.a()), bsj.o);
   }

   private Optional<? extends bji> gf() {
      return this.dN().c(bsj.h).orElse(bsl.a()).a(this::j);
   }

   private boolean j(bji $$0) {
      biw<?> $$1 = $$0.ag();
      return $$1 != biw.bo && $$1 != biw.u && btn.c(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, false);
   }

   @Override
   public void a(aeg<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.i_();
      }
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.a, 40.0).a(bko.d, 0.3F).a(bko.c, 0.6F).a(bko.g, 1.0).a(bko.f, 6.0);
   }

   public boolean t() {
      return !this.m_();
   }

   @Override
   public boolean C(bis $$0) {
      if (!($$0 instanceof bji)) {
         return false;
      } else {
         this.cc = 10;
         this.dL().a(this, (byte)4);
         this.a(apf.AW, 1.0F, this.eW());
         return cai.a(this, (bji)$$0);
      }
   }

   @Override
   public boolean a(cbw $$0) {
      return !this.fR();
   }

   @Override
   protected void e(bji $$0) {
      if (!this.m_()) {
         cai.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bji) {
         bji $$3 = (bji)$$0.d();
         if (this.c($$3) && !blb.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bji $$0) {
      this.bz.b(bsj.E);
      this.bz.a(bsj.o, $$0, 200L);
   }

   @Override
   public bki<cac> dN() {
      return (bki<cac>)super.dN();
   }

   protected void y() {
      cdh $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cdh.k, cdh.b));
      cdh $$1 = this.bz.g().orElse(null);
      if ($$1 == cdh.k && $$0 != cdh.k) {
         this.ge();
      }

      this.v(this.bz.a(bsj.o));
   }

   @Override
   protected void X() {
      this.dL().ad().a("zoglinBrain");
      this.dN().a((aks)this.dL(), this);
      this.dL().ad().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (!this.dL().B && $$0) {
         this.a(bko.f).a(0.5);
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
         this.a(apf.AW, 1.0F, this.eW());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gd() {
      return this.cc;
   }

   @Override
   protected ape w() {
      if (this.dL().B) {
         return null;
      } else {
         return this.bz.a(bsj.o) ? apf.AV : apf.AU;
      }
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.AY;
   }

   @Override
   protected ape l_() {
      return apf.AX;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.AZ, 0.15F, 1.0F);
   }

   protected void ge() {
      this.a(apf.AV, 1.0F, this.eW());
   }

   @Override
   protected void W() {
      super.W();
      abd.a(this);
   }

   @Override
   public bjn eR() {
      return bjn.b;
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      if (this.m_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
