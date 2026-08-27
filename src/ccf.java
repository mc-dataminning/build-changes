import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class ccf extends cbn implements cbf, ccl {
   private static final afs<Boolean> d = afv.a(ccf.class, afu.k);
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
   protected static final ImmutableList<? extends bvr<? extends bvq<? super ccf>>> b = ImmutableList.of(bvr.c, bvr.d);
   protected static final ImmutableList<? extends bum<?>> c = ImmutableList.of(bum.g, bum.h, bum.k, bum.l, bum.n, bum.m, bum.E, bum.t, bum.o, bum.p);

   public ccf(bkz<? extends ccf> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bml.b<ccf> dQ() {
      return bml.a(c, b);
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      bml<ccf> $$1 = this.dQ().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cfk.a));
      $$1.b(cfk.b);
      $$1.f();
      return $$1;
   }

   private static void a(bml<ccf> $$0) {
      $$0.a(cfk.a, 0, ImmutableList.of(new boh(45, 90), new bol()));
   }

   private static void b(bml<ccf> $$0) {
      $$0.a(
         cfk.b,
         10,
         ImmutableList.of(
            bpn.a(ccf::gh),
            bpb.a(8.0F, bim.a(30, 60)),
            new boy(ImmutableList.of(Pair.of(bot.a(0.4F), 2), Pair.of(bpi.a(0.4F, 3), 2), Pair.of(new bnm(30, 60), 1)))
         )
      );
   }

   private static void c(bml<ccf> $$0) {
      $$0.a(cfk.k, 10, ImmutableList.of(bpg.a(1.0F), bqo.a(ccf::w, boi.a(40)), bqo.a(ccf::o_, boi.a(15)), bpq.a()), bum.o);
   }

   private Optional<? extends bll> gh() {
      return this.dP().c(bum.h).orElse(buo.a()).a(this::j);
   }

   private boolean j(bll $$0) {
      bkz<?> $$1 = $$0.ai();
      return $$1 != bkz.bo && $$1 != bkz.u && bvq.c(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, false);
   }

   @Override
   public void a(afs<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.k_();
      }
   }

   public static bmq.a u() {
      return cbn.gl().a(bmr.l, 40.0).a(bmr.m, 0.3F).a(bmr.i, 0.6F).a(bmr.d, 1.0).a(bmr.c, 6.0);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   public boolean C(bkv $$0) {
      if (!($$0 instanceof bll)) {
         return false;
      } else {
         this.cc = 10;
         this.dN().a(this, (byte)4);
         this.a(aqv.BC, 1.0F, this.eY());
         return ccl.a(this, (bll)$$0);
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return !this.fT();
   }

   @Override
   protected void e(bll $$0) {
      if (!this.o_()) {
         ccl.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bll) {
         bll $$3 = (bll)$$0.d();
         if (this.c($$3) && !bne.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bll $$0) {
      this.bz.b(bum.E);
      this.bz.a(bum.o, $$0, 200L);
   }

   @Override
   public bml<ccf> dP() {
      return (bml<ccf>)super.dP();
   }

   protected void A() {
      cfk $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cfk.k, cfk.b));
      cfk $$1 = this.bz.g().orElse(null);
      if ($$1 == cfk.k && $$0 != cfk.k) {
         this.gg();
      }

      this.v(this.bz.a(bum.o));
   }

   @Override
   protected void Z() {
      this.dN().ae().a("zoglinBrain");
      this.dP().a((ami)this.dN(), this);
      this.dN().ae().c();
      this.A();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (!this.dN().B && $$0) {
         this.a(bmr.c).a(0.5);
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
         this.a(aqv.BC, 1.0F, this.eY());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gf() {
      return this.cc;
   }

   @Override
   protected aqu y() {
      if (this.dN().B) {
         return null;
      } else {
         return this.bz.a(bum.o) ? aqv.BB : aqv.BA;
      }
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.BE;
   }

   @Override
   protected aqu n_() {
      return aqv.BD;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.BF, 0.15F, 1.0F);
   }

   protected void gg() {
      this.a(aqv.BB, 1.0F, this.eY());
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }

   @Override
   public blq eT() {
      return blq.b;
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
