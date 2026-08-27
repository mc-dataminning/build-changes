import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class cdb extends ccj implements ccb, cdn {
   private static final agj<Boolean> d = agm.a(cdb.class, agl.k);
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
   protected static final ImmutableList<? extends bwn<? extends bwm<? super cdb>>> b = ImmutableList.of(bwn.c, bwn.d);
   protected static final ImmutableList<? extends bvh<?>> c = ImmutableList.of(bvh.g, bvh.h, bvh.k, bvh.l, bvh.n, bvh.m, bvh.E, bvh.t, bvh.o, bvh.p);

   public cdb(blt<? extends cdb> $$0, cti $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bnf.b<cdb> dP() {
      return bnf.a(c, b);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      bnf<cdb> $$1 = this.dP().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cgn.a));
      $$1.b(cgn.b);
      $$1.f();
      return $$1;
   }

   private static void a(bnf<cdb> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bpc(45, 90), new bpg()));
   }

   private static void b(bnf<cdb> $$0) {
      $$0.a(
         cgn.b,
         10,
         ImmutableList.of(
            bqi.a(cdb::gg),
            bpw.a(8.0F, bjg.a(30, 60)),
            new bpt(ImmutableList.of(Pair.of(bpo.a(0.4F), 2), Pair.of(bqd.a(0.4F, 3), 2), Pair.of(new bog(30, 60), 1)))
         )
      );
   }

   private static void c(bnf<cdb> $$0) {
      $$0.a(cgn.k, 10, ImmutableList.of(bqb.a(1.0F), brj.a(cdb::w, bpd.a(40)), brj.a(cdb::o_, bpd.a(15)), bql.a()), bvh.o);
   }

   private Optional<? extends bmf> gg() {
      return this.dO().c(bvh.h).orElse(bvj.a()).a(this::j);
   }

   private boolean j(bmf $$0) {
      blt<?> $$1 = $$0.ai();
      return $$1 != blt.bq && $$1 != blt.v && bwm.c(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, false);
   }

   @Override
   public void a(agj<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.k_();
      }
   }

   public static bnk.a u() {
      return ccj.gk().a(bnl.l, 40.0).a(bnl.m, 0.3F).a(bnl.i, 0.6F).a(bnl.d, 1.0).a(bnl.c, 6.0);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   public boolean C(blp $$0) {
      if (!($$0 instanceof bmf)) {
         return false;
      } else {
         this.cc = 10;
         this.dM().a(this, (byte)4);
         this.a(arm.BY, 1.0F, this.eX());
         return cdn.a(this, (bmf)$$0);
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return !this.fS();
   }

   @Override
   protected void e(bmf $$0) {
      if (!this.o_()) {
         cdn.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bmf) {
         bmf $$3 = (bmf)$$0.d();
         if (this.c($$3) && !bny.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bmf $$0) {
      this.bz.b(bvh.E);
      this.bz.a(bvh.o, $$0, 200L);
   }

   @Override
   public bnf<cdb> dO() {
      return (bnf<cdb>)super.dO();
   }

   protected void A() {
      cgn $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cgn.k, cgn.b));
      cgn $$1 = this.bz.g().orElse(null);
      if ($$1 == cgn.k && $$0 != cgn.k) {
         this.gf();
      }

      this.v(this.bz.a(bvh.o));
   }

   @Override
   protected void Z() {
      this.dM().af().a("zoglinBrain");
      this.dO().a((amz)this.dM(), this);
      this.dM().af().c();
      this.A();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (!this.dM().B && $$0) {
         this.a(bnl.c).a(0.5);
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
         this.a(arm.BY, 1.0F, this.eX());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ge() {
      return this.cc;
   }

   @Override
   protected arl y() {
      if (this.dM().B) {
         return null;
      } else {
         return this.bz.a(bvh.o) ? arm.BX : arm.BW;
      }
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.Ca;
   }

   @Override
   protected arl n_() {
      return arm.BZ;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.Cb, 0.15F, 1.0F);
   }

   protected void gf() {
      this.a(arm.BX, 1.0F, this.eX());
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a(this);
   }

   @Override
   public bmk eS() {
      return bmk.b;
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
