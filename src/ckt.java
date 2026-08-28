import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckt extends ckb implements cjt, clh {
   private static final akj<Boolean> d = akn.a(ckt.class, akl.k);
   private static final int e = 40;
   private static final int bY = 1;
   private static final float bZ = 0.6F;
   private static final int ca = 6;
   private static final float cb = 0.5F;
   private static final int cc = 40;
   private static final int cd = 15;
   private static final int ce = 200;
   private static final float cf = 0.3F;
   private static final float cg = 0.4F;
   private int ch;
   protected static final ImmutableList<? extends cdy<? extends cdx<? super ckt>>> b = ImmutableList.of(cdy.c, cdy.d);
   protected static final ImmutableList<? extends ccr<?>> c = ImmutableList.of(ccr.g, ccr.h, ccr.k, ccr.l, ccr.n, ccr.m, ccr.E, ccr.t, ccr.o, ccr.p);

   public ckt(bsy<? extends ckt> $$0, dbw $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bup.b<ckt> dT() {
      return bup.a(c, b);
   }

   @Override
   protected bup<?> a(Dynamic<?> $$0) {
      bup<ckt> $$1 = this.dT().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cok.a));
      $$1.b(cok.b);
      $$1.f();
      return $$1;
   }

   private static void a(bup<ckt> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bwm(45, 90), new bwq()));
   }

   private static void b(bup<ckt> $$0) {
      $$0.a(
         cok.b,
         10,
         ImmutableList.of(
            bxs.a(ckt::gs),
            bxg.a(8.0F, bqd.a(30, 60)),
            new bxd(ImmutableList.of(Pair.of(bwy.a(0.4F), 2), Pair.of(bxn.a(0.4F, 3), 2), Pair.of(new bvq(30, 60), 1)))
         )
      );
   }

   private static void c(bup<ckt> $$0) {
      $$0.a(cok.k, 10, ImmutableList.of(bxl.a(1.0F), byt.a(ckt::u, bwn.a(40)), byt.a(ckt::p_, bwn.a(15)), bxv.a()), ccr.o);
   }

   private Optional<? extends btn> gs() {
      return this.dS().c(ccr.h).orElse(cct.a()).a(this::j);
   }

   private boolean j(btn $$0) {
      bsy<?> $$1 = $$0.ak();
      return $$1 != bsy.bt && $$1 != bsy.x && cdx.c(this, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static buu.a s() {
      return ckb.gw().a(buv.q, 40.0).a(buv.r, 0.3F).a(buv.n, 0.6F).a(buv.d, 1.0).a(buv.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(bss $$0) {
      if (!($$0 instanceof btn)) {
         return false;
      } else {
         this.ch = 10;
         this.dP().a(this, (byte)4);
         this.b(avz.Dl);
         return clh.a(this, (btn)$$0);
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return !this.gd();
   }

   @Override
   protected void e(btn $$0) {
      if (!this.p_()) {
         clh.b(this, $$0);
      }
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof btn) {
         btn $$3 = (btn)$$0.d();
         if (this.c($$3) && !bvi.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(btn $$0) {
      this.bD.b(ccr.E);
      this.bD.a(ccr.o, $$0, 200L);
   }

   @Override
   public bup<ckt> dS() {
      return (bup<ckt>)super.dS();
   }

   protected void y() {
      cok $$0 = this.bD.g().orElse(null);
      this.bD.a(ImmutableList.of(cok.k, cok.b));
      cok $$1 = this.bD.g().orElse(null);
      if ($$1 == cok.k && $$0 != cok.k) {
         this.gr();
      }

      this.v(this.bD.a(ccr.o));
   }

   @Override
   protected void Z() {
      this.dP().ag().a("zoglinBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(d, $$0);
      if (!this.dP().B && $$0) {
         this.f(buv.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.ap().a(d);
   }

   @Override
   public void n_() {
      if (this.ch > 0) {
         this.ch--;
      }

      super.n_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ch = 10;
         this.b(avz.Dl);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gq() {
      return this.ch;
   }

   @Override
   protected avy v() {
      if (this.dP().B) {
         return null;
      } else {
         return this.bD.a(ccr.o) ? avz.Dk : avz.Dj;
      }
   }

   @Override
   protected avy d(brl $$0) {
      return avz.Dn;
   }

   @Override
   protected avy o_() {
      return avz.Dm;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.Do, 0.15F, 1.0F);
   }

   protected void gr() {
      this.b(avz.Dk);
   }

   @Nullable
   @Override
   public btn p() {
      return this.N();
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
