import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwm extends bux implements bkk<bvi> {
   public static final cmm bT = cmm.a(cjo.qc);
   protected static final ImmutableList<bts<? extends btr<? super bwm>>> bU = ImmutableList.of(bts.c, bts.f, bts.t, bts.r, bts.u);
   protected static final ImmutableList<bsn<?>> bW = ImmutableList.of(
      bsn.n, bsn.g, bsn.h, bsn.m, bsn.E, bsn.t, bsn.r, bsn.R, bsn.S, bsn.o, bsn.N, bsn.O, new bsn[]{bsn.Q, bsn.x, bsn.y, bsn.B, bsn.W, bsn.X, bsn.Y, bsn.Z}
   );
   private static final aef<bvi> cc = aei.a(bwm.class, aeh.x);
   private static final aef<OptionalInt> cd = aei.a(bwm.class, aeh.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bis bY = new bis();
   public final bis bZ = new bis();
   public final bis ca = new bis();
   public final bis cb = new bis();

   public bwm(bja<? extends bux> $$0, cqb $$1) {
      super($$0, $$1);
      this.bK = new bwm.a(this);
      this.a(ear.j, 4.0F);
      this.a(ear.e, -1.0F);
      this.bL = new bpm(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bkm.b<bwm> dO() {
      return bkm.a(bW, bU);
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      return bwn.a(this.dO().a($$0));
   }

   @Override
   public bkm<bwm> dN() {
      return (bkm<bwm>)super.dN();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, bvi.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<biw> t() {
      return this.an.b(cd).stream().mapToObj(this.dL()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(biw $$0) {
      this.an.b(cd, OptionalInt.of($$0.ah()));
   }

   @Override
   public int fH() {
      return 35;
   }

   @Override
   public int Z() {
      return 5;
   }

   public bvi y() {
      return this.an.b(cc);
   }

   public void a(bvi $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("variant", jb.al.b(this.y()).toString());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      bvi $$1 = jb.al.a(aez.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void X() {
      this.dL().ad().a("frogBrain");
      this.dN().a((akt)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("frogActivityUpdate");
      bwn.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   public void l() {
      if (this.dL().w_()) {
         this.cb.a(this.ba() && !this.aQ.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(aef<?> $$0) {
      if (as.equals($$0)) {
         bjy $$1 = this.an();
         if ($$1 == bjy.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bjy.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bjy.j) {
            this.ca.a(this.ah);
         } else {
            this.ca.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.bY.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aQ.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bir a(akt $$0, bir $$1) {
      bwm $$2 = bja.O.a((cqb)$$0);
      if ($$2 != null) {
         bwn.a($$2, $$0.D_());
      }

      return $$2;
   }

   @Override
   public boolean m_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(akt $$0, bux $$1) {
      this.a($$0, $$1, null);
      this.dN().a(bsn.X, atc.a);
   }

   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      he<cqz> $$5 = $$0.s(this.dl());
      if ($$5.a(apu.ah)) {
         this.a(bvi.c);
      } else if ($$5.a(apu.ai)) {
         this.a(bvi.b);
      } else {
         this.a(bvi.a);
      }

      bwn.a(this, $$0.D_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bkr.a ge() {
      return bjo.A().a(bks.m, 1.0).a(bks.l, 10.0).a(bks.c, 10.0);
   }

   @Nullable
   @Override
   protected apf w() {
      return apg.iE;
   }

   @Nullable
   @Override
   protected apf d(bhu $$0) {
      return apg.iH;
   }

   @Nullable
   @Override
   protected apf l_() {
      return apg.iF;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.iK, 0.15F, 1.0F);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   protected void W() {
      super.W();
      abc.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void h(ehh $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(bjs.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   public static boolean j(bjm $$0) {
      if ($$0 instanceof bzx $$1 && $$1.gf() != 1) {
         return false;
      }

      return $$0.ag().a(apy.n);
   }

   @Override
   protected bsv b(cqb $$0) {
      return new bwm.c(this, $$0);
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(cjl $$0) {
      return bT.a($$0);
   }

   public static boolean c(bja<? extends bux> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.a_($$3.d()).a(apv.bY) && a($$1, $$3);
   }

   class a extends bpj {
      a(bjo $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bwm.this.t().isEmpty();
      }
   }

   static class b extends eap {
      private final gw.a l = new gw.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eat a() {
         return !this.b.aX() ? super.a() : this.c(new gw(asb.a(this.b.cG().a), asb.a(this.b.cG().b), asb.a(this.b.cG().c)));
      }

      @Override
      public ear a(cph $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dfd $$4 = $$0.a_(this.l);
         return $$4.a(apv.bK) ? ear.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bss {
      c(bwm $$0, cqb $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(ear $$0) {
         return $$0 != ear.k && super.b($$0);
      }

      @Override
      protected eax a(int $$0) {
         this.o = new bwm.b(true);
         this.o.a(true);
         return new eax(this.o, $$0);
      }
   }
}
