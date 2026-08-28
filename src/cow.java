import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cow extends cod implements cpn {
   private static final akj<Boolean> bG = akn.a(cow.class, akl.k);
   private static final int bH = 40;
   private static final int bI = 1;
   private static final float bJ = 0.6F;
   private static final int bK = 6;
   private static final float bL = 0.5F;
   private static final int bM = 40;
   private static final int bN = 15;
   private static final int bO = 200;
   private static final float bP = 0.3F;
   private static final float bQ = 0.4F;
   private int bR;
   protected static final ImmutableList<? extends chn<? extends chm<? super cow>>> a = ImmutableList.of(chn.c, chn.d);
   protected static final ImmutableList<? extends cgg<?>> b = ImmutableList.of(cgg.g, cgg.h, cgg.k, cgg.l, cgg.o, cgg.n, cgg.F, cgg.u, cgg.p, cgg.q);

   public cow(bwo<? extends cow> $$0, dja $$1) {
      super($$0, $$1);
      this.by = 5;
   }

   @Override
   protected bye.b<cow> ed() {
      return bye.a(b, a);
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      bye<cow> $$1 = this.ed().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(csw.a));
      $$1.b(csw.b);
      $$1.f();
      return $$1;
   }

   private static void a(bye<cow> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cab(45, 90), new caf()));
   }

   private static void b(bye<cow> $$0) {
      $$0.a(
         csw.b,
         10,
         ImmutableList.of(
            cbh.a(($$0x, $$1) -> $$1.g($$0x)),
            cav.a(8.0F, bto.a(30, 60)),
            new cas(ImmutableList.of(Pair.of(can.a(0.4F), 2), Pair.of(cbc.a(0.4F, 3), 2), Pair.of(new bzf(30, 60), 1)))
         )
      );
   }

   private static void c(bye<cow> $$0) {
      $$0.a(csw.k, 10, ImmutableList.of(cba.a(1.0F), cci.a(cow::m, cac.a(40)), cci.a(cow::n_, cac.a(15)), cbk.a()), cgg.p);
   }

   private Optional<? extends bxe> g(arq $$0) {
      return this.ec().c(cgg.h).orElse(cgi.a()).a($$1 -> this.c($$0, $$1));
   }

   private boolean c(arq $$0, bxe $$1) {
      bwo<?> $$2 = $$1.aq();
      return $$2 != bwo.bN && $$2 != bwo.E && chm.c($$0, this, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, false);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (bG.equals($$0)) {
         this.i_();
      }
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static byj.a j() {
      return cod.gu().a(byk.s, 40.0).a(byk.v, 0.3F).a(byk.p, 0.6F).a(byk.d, 1.0).a(byk.c, 6.0);
   }

   public boolean m() {
      return !this.n_();
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      if ($$1 instanceof bxe $$2) {
         this.bR = 10;
         $$0.a(this, (byte)4);
         this.b(awn.Et);
         return cpn.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void d(bxe $$0) {
      if (!this.n_()) {
         cpn.a(this, $$0);
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxe $$4) {
         if (this.c($$4) && !byx.a(this, $$4, 4.0)) {
            this.i($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void i(bxe $$0) {
      this.bs.b(cgg.F);
      this.bs.a(cgg.p, $$0, 200L);
   }

   @Override
   public bye<cow> ec() {
      return (bye<cow>)super.ec();
   }

   protected void n() {
      csw $$0 = this.bs.g().orElse(null);
      this.bs.a(ImmutableList.of(csw.k, csw.b));
      csw $$1 = this.bs.g().orElse(null);
      if ($$1 == csw.k && $$0 != csw.k) {
         this.t();
      }

      this.v(this.bs.a(cgg.p));
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("zoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      this.n();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bG, $$0);
      if (!this.dV().C && $$0) {
         this.g(byk.c).a(0.5);
      }
   }

   @Override
   public boolean n_() {
      return this.au().a(bG);
   }

   @Override
   public void k_() {
      if (this.bR > 0) {
         this.bR--;
      }

      super.k_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bR = 10;
         this.b(awn.Et);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bR;
   }

   @Override
   protected awm u() {
      if (this.dV().C) {
         return null;
      } else {
         return this.bs.a(cgg.p) ? awn.Es : awn.Er;
      }
   }

   @Override
   protected awm e(buu $$0) {
      return awn.Ev;
   }

   @Override
   protected awm l_() {
      return awn.Eu;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.Ew, 0.15F, 1.0F);
   }

   protected void t() {
      this.b(awn.Es);
   }

   @Nullable
   @Override
   public bxe f() {
      return this.Q();
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
