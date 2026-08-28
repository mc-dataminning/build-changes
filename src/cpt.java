import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpt extends cpb implements cqk {
   private static final akn<Boolean> e = akr.a(cpt.class, akp.k);
   private static final int f = 40;
   private static final int bI = 1;
   private static final float bJ = 0.6F;
   private static final int bK = 6;
   private static final float bL = 0.5F;
   private static final int bM = 40;
   private static final int bN = 15;
   private static final int bO = 200;
   private static final float bP = 0.3F;
   private static final float bQ = 0.4F;
   private static final boolean bR = false;
   private int bS;
   protected static final ImmutableList<? extends cif<? extends cie<? super cpt>>> a = ImmutableList.of(cif.c, cif.d);
   protected static final ImmutableList<? extends cgy<?>> b = ImmutableList.of(cgy.g, cgy.h, cgy.k, cgy.l, cgy.o, cgy.n, cgy.F, cgy.u, cgy.p, cgy.q);

   public cpt(bxe<? extends cpt> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @Override
   protected byw.b<cpt> ed() {
      return byw.a(b, a);
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      byw<cpt> $$1 = this.ed().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(ctt.a));
      $$1.b(ctt.b);
      $$1.f();
      return $$1;
   }

   private static void a(byw<cpt> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new cat(45, 90), new cax()));
   }

   private static void b(byw<cpt> $$0) {
      $$0.a(
         ctt.b,
         10,
         ImmutableList.of(
            cbz.a(($$0x, $$1) -> $$1.g($$0x)),
            cbn.a(8.0F, bue.a(30, 60)),
            new cbk(ImmutableList.of(Pair.of(cbf.a(0.4F), 2), Pair.of(cbu.a(0.4F, 3), 2), Pair.of(new bzx(30, 60), 1)))
         )
      );
   }

   private static void c(byw<cpt> $$0) {
      $$0.a(ctt.k, 10, ImmutableList.of(cbs.a(1.0F), cda.a(cpt::m, cau.a(40)), cda.a(cpt::n_, cau.a(15)), ccc.a()), cgy.p);
   }

   private Optional<? extends bxw> g(aru $$0) {
      return this.ec().c(cgy.h).orElse(cha.a()).a($$1 -> this.c($$0, $$1));
   }

   private boolean c(aru $$0, bxw $$1) {
      bxe<?> $$2 = $$1.an();
      return $$2 != bxe.bO && $$2 != bxe.F && cie.c($$0, this, $$1);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void a(akn<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.i_();
      }
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      if ($$0.G_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bzb.a j() {
      return cpb.gx().a(bzc.s, 40.0).a(bzc.v, 0.3F).a(bzc.p, 0.6F).a(bzc.d, 1.0).a(bzc.c, 6.0);
   }

   public boolean m() {
      return !this.n_();
   }

   @Override
   public boolean c(aru $$0, bwv $$1) {
      if ($$1 instanceof bxw $$2) {
         this.bS = 10;
         $$0.a(this, (byte)4);
         this.b(awr.En);
         return cqk.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void d(bxw $$0) {
      if (!this.n_()) {
         cqk.a(this, $$0);
      }
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxw $$4) {
         if (this.c($$4) && !bzp.a(this, $$4, 4.0)) {
            this.i($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void i(bxw $$0) {
      this.bs.b(cgy.F);
      this.bs.a(cgy.p, $$0, 200L);
   }

   @Override
   public byw<cpt> ec() {
      return (byw<cpt>)super.ec();
   }

   protected void n() {
      ctt $$0 = this.bs.g().orElse(null);
      this.bs.a(ImmutableList.of(ctt.k, ctt.b));
      ctt $$1 = this.bs.g().orElse(null);
      if ($$1 == ctt.k && $$0 != ctt.k) {
         this.t();
      }

      this.v(this.bs.a(cgy.p));
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("zoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      this.n();
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(e, $$0);
      if (!this.dV().C && $$0) {
         this.g(bzc.c).a(0.5);
      }
   }

   @Override
   public boolean n_() {
      return this.ar().a(e);
   }

   @Override
   public void k_() {
      if (this.bS > 0) {
         this.bS--;
      }

      super.k_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bS = 10;
         this.b(awr.En);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bS;
   }

   @Override
   protected awq u() {
      if (this.dV().C) {
         return null;
      } else {
         return this.bs.a(cgy.p) ? awr.Em : awr.El;
      }
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.Ep;
   }

   @Override
   protected awq l_() {
      return awr.Eo;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.Eq, 0.15F, 1.0F);
   }

   protected void t() {
      this.b(awr.Em);
   }

   @Nullable
   @Override
   public bxw f() {
      return this.Q();
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.b("IsBaby", false));
   }
}
