import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cku extends ckc implements cju, cli {
   private static final akj<Boolean> d = akn.a(cku.class, akl.k);
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
   protected static final ImmutableList<? extends cdz<? extends cdy<? super cku>>> b = ImmutableList.of(cdz.c, cdz.d);
   protected static final ImmutableList<? extends ccs<?>> c = ImmutableList.of(ccs.g, ccs.h, ccs.k, ccs.l, ccs.n, ccs.m, ccs.E, ccs.t, ccs.o, ccs.p);

   public cku(bsz<? extends cku> $$0, dbx $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected buq.b<cku> dT() {
      return buq.a(c, b);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      buq<cku> $$1 = this.dT().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(col.a));
      $$1.b(col.b);
      $$1.f();
      return $$1;
   }

   private static void a(buq<cku> $$0) {
      $$0.a(col.a, 0, ImmutableList.of(new bwn(45, 90), new bwr()));
   }

   private static void b(buq<cku> $$0) {
      $$0.a(
         col.b,
         10,
         ImmutableList.of(
            bxt.a(cku::gs),
            bxh.a(8.0F, bqe.a(30, 60)),
            new bxe(ImmutableList.of(Pair.of(bwz.a(0.4F), 2), Pair.of(bxo.a(0.4F, 3), 2), Pair.of(new bvr(30, 60), 1)))
         )
      );
   }

   private static void c(buq<cku> $$0) {
      $$0.a(col.k, 10, ImmutableList.of(bxm.a(1.0F), byu.a(cku::u, bwo.a(40)), byu.a(cku::p_, bwo.a(15)), bxw.a()), ccs.o);
   }

   private Optional<? extends bto> gs() {
      return this.dS().c(ccs.h).orElse(ccu.a()).a(this::j);
   }

   private boolean j(bto $$0) {
      bsz<?> $$1 = $$0.ak();
      return $$1 != bsz.bt && $$1 != bsz.x && cdy.c(this, $$0);
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

   public static buv.a s() {
      return ckc.gw().a(buw.q, 40.0).a(buw.r, 0.3F).a(buw.n, 0.6F).a(buw.d, 1.0).a(buw.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(bst $$0) {
      if (!($$0 instanceof bto)) {
         return false;
      } else {
         this.ch = 10;
         this.dP().a(this, (byte)4);
         this.b(avz.Dl);
         return cli.a(this, (bto)$$0);
      }
   }

   @Override
   public boolean a(cmw $$0) {
      return !this.gd();
   }

   @Override
   protected void e(bto $$0) {
      if (!this.p_()) {
         cli.b(this, $$0);
      }
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bto) {
         bto $$3 = (bto)$$0.d();
         if (this.c($$3) && !bvj.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bto $$0) {
      this.bD.b(ccs.E);
      this.bD.a(ccs.o, $$0, 200L);
   }

   @Override
   public buq<cku> dS() {
      return (buq<cku>)super.dS();
   }

   protected void y() {
      col $$0 = this.bD.g().orElse(null);
      this.bD.a(ImmutableList.of(col.k, col.b));
      col $$1 = this.bD.g().orElse(null);
      if ($$1 == col.k && $$0 != col.k) {
         this.gr();
      }

      this.v(this.bD.a(ccs.o));
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
         this.f(buw.c).a(0.5);
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
         return this.bD.a(ccs.o) ? avz.Dk : avz.Dj;
      }
   }

   @Override
   protected avy d(brm $$0) {
      return avz.Dn;
   }

   @Override
   protected avy o_() {
      return avz.Dm;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.Do, 0.15F, 1.0F);
   }

   protected void gr() {
      this.b(avz.Dk);
   }

   @Nullable
   @Override
   public bto p() {
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
