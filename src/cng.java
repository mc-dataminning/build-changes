import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cng extends cmo implements cny {
   private static final aks<Boolean> bZ = akw.a(cng.class, aku.k);
   private static final int ca = 40;
   private static final int cb = 1;
   private static final float cc = 0.6F;
   private static final int cd = 6;
   private static final float ce = 0.5F;
   private static final int cf = 40;
   private static final int cg = 15;
   private static final int ch = 200;
   private static final float ci = 0.3F;
   private static final float cj = 0.4F;
   private int ck;
   protected static final ImmutableList<? extends cgi<? extends cgh<? super cng>>> a = ImmutableList.of(cgi.c, cgi.d);
   protected static final ImmutableList<? extends cfb<?>> b = ImmutableList.of(cfb.g, cfb.h, cfb.k, cfb.l, cfb.n, cfb.m, cfb.E, cfb.t, cfb.o, cfb.p);

   public cng(bvi<? extends cng> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   protected bwz.b<cng> ed() {
      return bwz.a(b, a);
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      bwz<cng> $$1 = this.ed().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(crf.a));
      $$1.b(crf.b);
      $$1.f();
      return $$1;
   }

   private static void a(bwz<cng> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new byw(45, 90), new bza()));
   }

   private static void b(bwz<cng> $$0) {
      $$0.a(
         crf.b,
         10,
         ImmutableList.of(
            cac.a(($$0x, $$1) -> $$1.g($$0x)),
            bzq.a(8.0F, bsl.a(30, 60)),
            new bzn(ImmutableList.of(Pair.of(bzi.a(0.4F), 2), Pair.of(bzx.a(0.4F, 3), 2), Pair.of(new bya(30, 60), 1)))
         )
      );
   }

   private static void c(bwz<cng> $$0) {
      $$0.a(crf.k, 10, ImmutableList.of(bzv.a(1.0F), cbd.a(cng::p, byx.a(40)), cbd.a(cng::e_, byx.a(15)), caf.a()), cfb.o);
   }

   private Optional<? extends bvx> g(arx $$0) {
      return this.ec().c(cfb.h).orElse(cfd.a()).a($$1 -> this.b($$0, $$1));
   }

   private boolean b(arx $$0, bvx $$1) {
      bvi<?> $$2 = $$1.aq();
      return $$2 != bvi.bN && $$2 != bvi.F && cgh.c($$0, this, $$1);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   @Override
   public void a(aks<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.m_();
      }
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.s, 40.0).a(bxf.v, 0.3F).a(bxf.p, 0.6F).a(bxf.d, 1.0).a(bxf.c, 6.0);
   }

   public boolean p() {
      return !this.e_();
   }

   @Override
   public boolean c(arx $$0, bvb $$1) {
      if ($$1 instanceof bvx $$2) {
         this.ck = 10;
         $$0.a(this, (byte)4);
         this.b(awv.Ee);
         return cny.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void e(bvx $$0) {
      if (!this.e_()) {
         cny.a(this, $$0);
      }
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvx $$4) {
         if (this.c($$4) && !bxs.a(this, $$4, 4.0)) {
            this.j($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void j(bvx $$0) {
      this.bF.b(cfb.E);
      this.bF.a(cfb.o, $$0, 200L);
   }

   @Override
   public bwz<cng> ec() {
      return (bwz<cng>)super.ec();
   }

   protected void t() {
      crf $$0 = this.bF.g().orElse(null);
      this.bF.a(ImmutableList.of(crf.k, crf.b));
      crf $$1 = this.bF.g().orElse(null);
      if ($$1 == crf.k && $$0 != crf.k) {
         this.go();
      }

      this.w(this.bF.a(cfb.o));
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("zoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bZ, $$0);
      if (!this.dW().C && $$0) {
         this.g(bxf.c).a(0.5);
      }
   }

   @Override
   public boolean e_() {
      return this.au().a(bZ);
   }

   @Override
   public void d_() {
      if (this.ck > 0) {
         this.ck--;
      }

      super.d_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(awv.Ee);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int x() {
      return this.ck;
   }

   @Override
   protected awu u() {
      if (this.dW().C) {
         return null;
      } else {
         return this.bF.a(cfb.o) ? awv.Ed : awv.Ec;
      }
   }

   @Override
   protected awu e(btr $$0) {
      return awv.Eg;
   }

   @Override
   protected awu o_() {
      return awv.Ef;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.Eh, 0.15F, 1.0F);
   }

   protected void go() {
      this.b(awv.Ed);
   }

   @Nullable
   @Override
   public bvx O_() {
      return this.O();
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      if (this.e_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
