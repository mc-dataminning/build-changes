import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cfy extends cee implements btn<ja<cep>> {
   protected static final ImmutableList<ccy<? extends ccx<? super cfy>>> ch = ImmutableList.of(ccy.c, ccy.f, ccy.v, ccy.s, ccy.w);
   protected static final ImmutableList<cbr<?>> ci = ImmutableList.of(
      cbr.n, cbr.g, cbr.h, cbr.m, cbr.E, cbr.t, cbr.r, cbr.S, cbr.T, cbr.o, cbr.O, cbr.P, new cbr[]{cbr.R, cbr.x, cbr.y, cbr.B, cbr.X, cbr.Y, cbr.Z, cbr.aa}
   );
   private static final ajy<ja<cep>> cp = akc.a(cfy.class, aka.z);
   private static final ajy<OptionalInt> cq = akc.a(cfy.class, aka.v);
   private static final int cr = 5;
   public static final String ck = "variant";
   private static final aks<cep> cs = cep.a;
   public final brq cl = new brq();
   public final brq cm = new brq();
   public final brq cn = new brq();
   public final brq co = new brq();

   public cfy(bsb<? extends cee> $$0, dca $$1) {
      super($$0, $$1);
      this.bX = new cfy.a(this);
      this.a(epv.j, 4.0F);
      this.a(epv.e, -1.0F);
      this.bY = new byq(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected btp.b<cfy> ea() {
      return btp.a(ci, ch);
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return cfz.a(this.ea().a($$0));
   }

   @Override
   public btp<cfy> dZ() {
      return (btp<cfy>)super.dZ();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cp, lh.al.g(cs));
      $$0.a(cq, OptionalInt.empty());
   }

   @Override
   public void r() {
      this.as.a(cq, OptionalInt.empty());
   }

   public Optional<brv> t() {
      return this.as.a(cq).stream().mapToObj(this.dU()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(brv $$0) {
      this.as.a(cq, OptionalInt.of($$0.al()));
   }

   @Override
   public int ac() {
      return 35;
   }

   @Override
   public int aa() {
      return 5;
   }

   public ja<cep> x() {
      return this.as.a(cp);
   }

   @Override
   public void i(ja<cep> $$0) {
      this.as.a(cp, $$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("variant", this.x().e().orElse(cs).a().toString());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      Optional.ofNullable(akt.a($$0.l("variant"))).map($$0x -> aks.a(li.B, $$0x)).flatMap(lh.al::b).ifPresent(this::i);
   }

   @Override
   protected void Y() {
      this.dU().ag().a("frogBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().c();
      this.dU().ag().a("frogActivityUpdate");
      cfz.a(this);
      this.dU().ag().c();
      super.Y();
   }

   @Override
   public void l() {
      if (this.dU().x_()) {
         this.co.a(this.bl() && !this.bf.c(), this.am);
      }

      super.l();
   }

   @Override
   public void a(ajy<?> $$0) {
      if (ax.equals($$0)) {
         bsz $$1 = this.ar();
         if ($$1 == bsz.g) {
            this.cl.a(this.am);
         } else {
            this.cl.a();
         }

         if ($$1 == bsz.i) {
            this.cm.a(this.am);
         } else {
            this.cm.a();
         }

         if ($$1 == bsz.j) {
            this.cn.a(this.am);
         } else {
            this.cn.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.cl.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.bf.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      cfy $$2 = bsb.T.a((dca)$$0);
      if ($$2 != null) {
         cfz.a($$2, $$0.F_());
      }

      return $$2;
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(aqt $$0, cee $$1) {
      this.a($$0, $$1, null);
      this.dZ().a(cbr.Y, azo.a);
   }

   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ja<dcz> $$4 = $$0.t(this.du());
      if ($$4.a(awd.am)) {
         this.i(lh.al.g(cep.c));
      } else if ($$4.a(awd.an)) {
         this.i(lh.al.g(cep.b));
      } else {
         this.i(lh.al.g(cs));
      }

      cfz.a(this, $$0.F_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static btu.a gy() {
      return bsq.A().a(btv.r, 1.0).a(btv.q, 10.0).a(btv.c, 10.0).a(btv.v, 1.0);
   }

   @Nullable
   @Override
   protected avn u() {
      return avo.jY;
   }

   @Nullable
   @Override
   protected avn d(bqt $$0) {
      return avo.kb;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.jZ;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.ke, 0.15F, 1.0F);
   }

   @Override
   public boolean cH() {
      return false;
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(ewu $$0) {
      if (this.df() && this.bi()) {
         this.a(this.fw(), $$0);
         this.a(bst.a, this.dx());
         this.g(this.dx().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bso $$0) {
      if ($$0 instanceof cjn $$1 && $$1.gz() != 1) {
         return false;
      }

      return $$0.ak().a(awh.n);
   }

   @Override
   protected cbz b(dca $$0) {
      return new cfy.c(this, $$0);
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.al);
   }

   public static boolean c(bsb<? extends cee> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.a_($$3.d()).a(awe.cj) && a($$1, $$3);
   }

   class a extends byn {
      a(bsq $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cfy.this.t().isEmpty();
      }
   }

   static class b extends epn {
      private final ir.a l = new ir.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public epq a() {
         return !this.b.bi() ? super.a() : this.c(new ir(aym.a(this.b.cP().a), aym.a(this.b.cP().b), aym.a(this.b.cP().c)));
      }

      @Override
      public epv a(epx $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dtc $$4 = $$0.a(this.l);
         return $$4.a(awe.bU) ? epv.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cbw {
      c(cfy $$0, dca $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(epv $$0) {
         return $$0 != epv.k && super.b($$0);
      }

      @Override
      protected epu a(int $$0) {
         this.o = new cfy.b(true);
         this.o.a(true);
         return new epu(this.o, $$0);
      }
   }
}
