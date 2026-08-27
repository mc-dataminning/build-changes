import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class cdh extends ccp implements cch, cdu {
   private static final agm<Boolean> d = agp.a(cdh.class, ago.k);
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
   protected static final ImmutableList<? extends bwt<? extends bws<? super cdh>>> b = ImmutableList.of(bwt.c, bwt.d);
   protected static final ImmutableList<? extends bvn<?>> c = ImmutableList.of(bvn.g, bvn.h, bvn.k, bvn.l, bvn.n, bvn.m, bvn.E, bvn.t, bvn.o, bvn.p);

   public cdh(blz<? extends cdh> $$0, ctp $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bnl.b<cdh> dP() {
      return bnl.a(c, b);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      bnl<cdh> $$1 = this.dP().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cgu.a));
      $$1.b(cgu.b);
      $$1.f();
      return $$1;
   }

   private static void a(bnl<cdh> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bpi(45, 90), new bpm()));
   }

   private static void b(bnl<cdh> $$0) {
      $$0.a(
         cgu.b,
         10,
         ImmutableList.of(
            bqo.a(cdh::gg),
            bqc.a(8.0F, bjm.a(30, 60)),
            new bpz(ImmutableList.of(Pair.of(bpu.a(0.4F), 2), Pair.of(bqj.a(0.4F, 3), 2), Pair.of(new bom(30, 60), 1)))
         )
      );
   }

   private static void c(bnl<cdh> $$0) {
      $$0.a(cgu.k, 10, ImmutableList.of(bqh.a(1.0F), brp.a(cdh::w, bpj.a(40)), brp.a(cdh::o_, bpj.a(15)), bqr.a()), bvn.o);
   }

   private Optional<? extends bml> gg() {
      return this.dO().c(bvn.h).orElse(bvp.a()).a(this::j);
   }

   private boolean j(bml $$0) {
      blz<?> $$1 = $$0.ai();
      return $$1 != blz.bq && $$1 != blz.v && bws.c(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, false);
   }

   @Override
   public void a(agm<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.k_();
      }
   }

   public static bnq.a u() {
      return ccp.gk().a(bnr.l, 40.0).a(bnr.m, 0.3F).a(bnr.i, 0.6F).a(bnr.d, 1.0).a(bnr.c, 6.0);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   public boolean C(blv $$0) {
      if (!($$0 instanceof bml)) {
         return false;
      } else {
         this.cc = 10;
         this.dM().a(this, (byte)4);
         this.a(ars.BY, 1.0F, this.eX());
         return cdu.a(this, (bml)$$0);
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return !this.fS();
   }

   @Override
   protected void e(bml $$0) {
      if (!this.o_()) {
         cdu.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bml) {
         bml $$3 = (bml)$$0.d();
         if (this.c($$3) && !boe.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bml $$0) {
      this.bz.b(bvn.E);
      this.bz.a(bvn.o, $$0, 200L);
   }

   @Override
   public bnl<cdh> dO() {
      return (bnl<cdh>)super.dO();
   }

   protected void A() {
      cgu $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cgu.k, cgu.b));
      cgu $$1 = this.bz.g().orElse(null);
      if ($$1 == cgu.k && $$0 != cgu.k) {
         this.gf();
      }

      this.v(this.bz.a(bvn.o));
   }

   @Override
   protected void Z() {
      this.dM().af().a("zoglinBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      this.A();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (!this.dM().B && $$0) {
         this.a(bnr.c).a(0.5);
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
         this.a(ars.BY, 1.0F, this.eX());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ge() {
      return this.cc;
   }

   @Override
   protected arr y() {
      if (this.dM().B) {
         return null;
      } else {
         return this.bz.a(bvn.o) ? ars.BX : ars.BW;
      }
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.Ca;
   }

   @Override
   protected arr n_() {
      return ars.BZ;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.Cb, 0.15F, 1.0F);
   }

   protected void gf() {
      this.a(ars.BX, 1.0F, this.eX());
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public bmq eS() {
      return bmq.b;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
