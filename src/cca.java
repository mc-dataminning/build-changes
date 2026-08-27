import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class cca extends cbi implements cba, ccg {
   private static final afo<Boolean> d = afr.a(cca.class, afq.k);
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
   protected static final ImmutableList<? extends bvm<? extends bvl<? super cca>>> b = ImmutableList.of(bvm.c, bvm.d);
   protected static final ImmutableList<? extends buh<?>> c = ImmutableList.of(buh.g, buh.h, buh.k, buh.l, buh.n, buh.m, buh.E, buh.t, buh.o, buh.p);

   public cca(bku<? extends cca> $$0, csa $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bmg.b<cca> dQ() {
      return bmg.a(c, b);
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      bmg<cca> $$1 = this.dQ().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cff.a));
      $$1.b(cff.b);
      $$1.f();
      return $$1;
   }

   private static void a(bmg<cca> $$0) {
      $$0.a(cff.a, 0, ImmutableList.of(new boc(45, 90), new bog()));
   }

   private static void b(bmg<cca> $$0) {
      $$0.a(
         cff.b,
         10,
         ImmutableList.of(
            bpi.a(cca::gh),
            bow.a(8.0F, bii.a(30, 60)),
            new bot(ImmutableList.of(Pair.of(boo.a(0.4F), 2), Pair.of(bpd.a(0.4F, 3), 2), Pair.of(new bnh(30, 60), 1)))
         )
      );
   }

   private static void c(bmg<cca> $$0) {
      $$0.a(cff.k, 10, ImmutableList.of(bpb.a(1.0F), bqj.a(cca::w, bod.a(40)), bqj.a(cca::n_, bod.a(15)), bpl.a()), buh.o);
   }

   private Optional<? extends blg> gh() {
      return this.dP().c(buh.h).orElse(buj.a()).a(this::j);
   }

   private boolean j(blg $$0) {
      bku<?> $$1 = $$0.ai();
      return $$1 != bku.bo && $$1 != bku.u && bvl.c(this, $$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, false);
   }

   @Override
   public void a(afo<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.l, 40.0).a(bmm.m, 0.3F).a(bmm.i, 0.6F).a(bmm.d, 1.0).a(bmm.c, 6.0);
   }

   public boolean w() {
      return !this.n_();
   }

   @Override
   public boolean C(bkq $$0) {
      if (!($$0 instanceof blg)) {
         return false;
      } else {
         this.cc = 10;
         this.dN().a(this, (byte)4);
         this.a(aqr.BC, 1.0F, this.eY());
         return ccg.a(this, (blg)$$0);
      }
   }

   @Override
   public boolean a(cdu $$0) {
      return !this.fT();
   }

   @Override
   protected void e(blg $$0) {
      if (!this.n_()) {
         ccg.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof blg) {
         blg $$3 = (blg)$$0.d();
         if (this.c($$3) && !bmz.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(blg $$0) {
      this.bz.b(buh.E);
      this.bz.a(buh.o, $$0, 200L);
   }

   @Override
   public bmg<cca> dP() {
      return (bmg<cca>)super.dP();
   }

   protected void A() {
      cff $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cff.k, cff.b));
      cff $$1 = this.bz.g().orElse(null);
      if ($$1 == cff.k && $$0 != cff.k) {
         this.gg();
      }

      this.v(this.bz.a(buh.o));
   }

   @Override
   protected void Z() {
      this.dN().ae().a("zoglinBrain");
      this.dP().a((ame)this.dN(), this);
      this.dN().ae().c();
      this.A();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (!this.dN().B && $$0) {
         this.a(bmm.c).a(0.5);
      }
   }

   @Override
   public boolean n_() {
      return this.an().b(d);
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
         this.a(aqr.BC, 1.0F, this.eY());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gf() {
      return this.cc;
   }

   @Override
   protected aqq y() {
      if (this.dN().B) {
         return null;
      } else {
         return this.bz.a(buh.o) ? aqr.BB : aqr.BA;
      }
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.BE;
   }

   @Override
   protected aqq m_() {
      return aqr.BD;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.BF, 0.15F, 1.0F);
   }

   protected void gg() {
      this.a(aqr.BB, 1.0F, this.eY());
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }

   @Override
   public bll eT() {
      return bll.b;
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
