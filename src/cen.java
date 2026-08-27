import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cen extends cct implements bsd<cde> {
   public static final cwd bY = cwd.a(csg.qQ);
   protected static final ImmutableList<cbo<? extends cbn<? super cen>>> bZ = ImmutableList.of(cbo.c, cbo.f, cbo.v, cbo.s, cbo.w);
   protected static final ImmutableList<cah<?>> cb = ImmutableList.of(
      cah.n, cah.g, cah.h, cah.m, cah.E, cah.t, cah.r, cah.S, cah.T, cah.o, cah.O, cah.P, new cah[]{cah.R, cah.x, cah.y, cah.B, cah.X, cah.Y, cah.Z, cah.aa}
   );
   private static final ajk<cde> ch = ajo.a(cen.class, ajm.z);
   private static final ajk<OptionalInt> ci = ajo.a(cen.class, ajm.v);
   private static final int cj = 5;
   public static final String cc = "variant";
   public final bqg cd = new bqg();
   public final bqg ce = new bqg();
   public final bqg cf = new bqg();
   public final bqg cg = new bqg();

   public cen(bqr<? extends cct> $$0, czu $$1) {
      super($$0, $$1);
      this.bO = new cen.a(this);
      this.a(emi.j, 4.0F);
      this.a(emi.e, -1.0F);
      this.bP = new bxg(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bsf.b<cen> dR() {
      return bsf.a(cb, bZ);
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return ceo.a(this.dR().a($$0));
   }

   @Override
   public bsf<cen> dQ() {
      return (bsf<cen>)super.dQ();
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(ch, cde.a);
      $$0.a(ci, OptionalInt.empty());
   }

   @Override
   public void r() {
      this.ao.a(ci, OptionalInt.empty());
   }

   public Optional<bql> u() {
      return this.ao.a(ci).stream().mapToObj(this.dN()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bql $$0) {
      this.ao.a(ci, OptionalInt.of($$0.aj()));
   }

   @Override
   public int fO() {
      return 35;
   }

   @Override
   public int aa() {
      return 5;
   }

   public cde y() {
      return this.ao.a(ch);
   }

   public void a(cde $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("variant", lc.al.b(this.y()).toString());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      cde $$1 = lc.al.a(akf.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void Y() {
      this.dN().af().a("frogBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("frogActivityUpdate");
      ceo.a(this);
      this.dN().af().c();
      super.Y();
   }

   @Override
   public void l() {
      if (this.dN().x_()) {
         this.cg.a(this.bf() && !this.aV.c(), this.ai);
      }

      super.l();
   }

   @Override
   public void a(ajk<?> $$0) {
      if (at.equals($$0)) {
         brp $$1 = this.ap();
         if ($$1 == brp.g) {
            this.cd.a(this.ai);
         } else {
            this.cd.a();
         }

         if ($$1 == brp.i) {
            this.ce.a(this.ai);
         } else {
            this.ce.a();
         }

         if ($$1 == brp.j) {
            this.cf.a(this.ai);
         } else {
            this.cf.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.cd.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aV.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bqf a(aqe $$0, bqf $$1) {
      cen $$2 = bqr.R.a((czu)$$0);
      if ($$2 != null) {
         ceo.a($$2, $$0.E_());
      }

      return $$2;
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(aqe $$0, cct $$1) {
      this.a($$0, $$1, null);
      this.dQ().a(cah.Y, ayy.a);
   }

   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      iv<dat> $$4 = $$0.t(this.dn());
      if ($$4.a(avn.ai)) {
         this.a(cde.c);
      } else if ($$4.a(avn.aj)) {
         this.a(cde.b);
      } else {
         this.a(cde.a);
      }

      ceo.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bsk.a gp() {
      return brg.A().a(bsl.r, 1.0).a(bsl.q, 10.0).a(bsl.c, 10.0).a(bsl.v, 1.0);
   }

   @Nullable
   @Override
   protected auy v() {
      return auz.jG;
   }

   @Nullable
   @Override
   protected auy d(bpj $$0) {
      return auz.jJ;
   }

   @Nullable
   @Override
   protected auy o_() {
      return auz.jH;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.jM, 0.15F, 1.0F);
   }

   @Override
   public boolean cA() {
      return false;
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(etf $$0) {
      if (this.cY() && this.bc()) {
         this.a(this.fl(), $$0);
         this.a(brj.a, this.dq());
         this.g(this.dq().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bre $$0) {
      if ($$0 instanceof cia $$1 && $$1.gq() != 1) {
         return false;
      }

      return $$0.ai().a(avr.n);
   }

   @Override
   protected cap b(czu $$0) {
      return new cen.c(this, $$0);
   }

   @Override
   public boolean o(csd $$0) {
      return bY.a($$0);
   }

   public static boolean c(bqr<? extends cct> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.a_($$3.d()).a(avo.ca) && a($$1, $$3);
   }

   class a extends bxd {
      a(brg $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cen.this.u().isEmpty();
      }
   }

   static class b extends ema {
      private final im.a l = new im.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public emd a() {
         return !this.b.bc() ? super.a() : this.c(new im(axw.a(this.b.cI().a), axw.a(this.b.cI().b), axw.a(this.b.cI().c)));
      }

      @Override
      public emi a(emk $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dpy $$4 = $$0.a(this.l);
         return $$4.a(avo.bL) ? emi.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cam {
      c(cen $$0, czu $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(emi $$0) {
         return $$0 != emi.k && super.b($$0);
      }

      @Override
      protected emh a(int $$0) {
         this.o = new cen.b(true);
         this.o.a(true);
         return new emh(this.o, $$0);
      }
   }
}
