import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cec extends cci implements brs<cct> {
   public static final cvp bX = cvp.a(crv.qP);
   protected static final ImmutableList<cbd<? extends cbc<? super cec>>> bY = ImmutableList.of(cbd.c, cbd.f, cbd.v, cbd.s, cbd.w);
   protected static final ImmutableList<bzw<?>> ca = ImmutableList.of(
      bzw.n, bzw.g, bzw.h, bzw.m, bzw.E, bzw.t, bzw.r, bzw.S, bzw.T, bzw.o, bzw.O, bzw.P, new bzw[]{bzw.R, bzw.x, bzw.y, bzw.B, bzw.X, bzw.Y, bzw.Z, bzw.aa}
   );
   private static final aja<cct> cg = aje.a(cec.class, ajc.y);
   private static final aja<OptionalInt> ch = aje.a(cec.class, ajc.u);
   private static final int ci = 5;
   public static final String cb = "variant";
   public final bpv cc = new bpv();
   public final bpv cd = new bpv();
   public final bpv ce = new bpv();
   public final bpv cf = new bpv();

   public cec(bqg<? extends cci> $$0, czg $$1) {
      super($$0, $$1);
      this.bN = new cec.a(this);
      this.a(els.j, 4.0F);
      this.a(els.e, -1.0F);
      this.bO = new bwv(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bru.b<cec> dQ() {
      return bru.a(ca, bY);
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return ced.a(this.dQ().a($$0));
   }

   @Override
   public bru<cec> dP() {
      return (bru<cec>)super.dP();
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(cg, cct.a);
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void r() {
      this.an.a(ch, OptionalInt.empty());
   }

   public Optional<bqa> u() {
      return this.an.a(ch).stream().mapToObj(this.dM()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bqa $$0) {
      this.an.a(ch, OptionalInt.of($$0.aj()));
   }

   @Override
   public int fN() {
      return 35;
   }

   @Override
   public int aa() {
      return 5;
   }

   public cct y() {
      return this.an.a(cg);
   }

   public void a(cct $$0) {
      this.an.a(cg, $$0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("variant", kt.al.b(this.y()).toString());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      cct $$1 = kt.al.a(ajv.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void Y() {
      this.dM().af().a("frogBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("frogActivityUpdate");
      ced.a(this);
      this.dM().af().c();
      super.Y();
   }

   @Override
   public void l() {
      if (this.dM().x_()) {
         this.cf.a(this.bf() && !this.aT.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(aja<?> $$0) {
      if (as.equals($$0)) {
         bre $$1 = this.ap();
         if ($$1 == bre.g) {
            this.cc.a(this.ah);
         } else {
            this.cc.a();
         }

         if ($$1 == bre.i) {
            this.cd.a(this.ah);
         } else {
            this.cd.a();
         }

         if ($$1 == bre.j) {
            this.ce.a(this.ah);
         } else {
            this.ce.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.cc.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aT.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bpu a(apu $$0, bpu $$1) {
      cec $$2 = bqg.R.a((czg)$$0);
      if ($$2 != null) {
         ced.a($$2, $$0.E_());
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
   public void a(apu $$0, cci $$1) {
      this.a($$0, $$1, null);
      this.dP().a(bzw.Y, ayo.a);
   }

   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      in<daf> $$4 = $$0.t(this.dm());
      if ($$4.a(avd.ai)) {
         this.a(cct.c);
      } else if ($$4.a(avd.aj)) {
         this.a(cct.b);
      } else {
         this.a(cct.a);
      }

      ced.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static brz.a gn() {
      return bqv.A().a(bsa.r, 1.0).a(bsa.q, 10.0).a(bsa.c, 10.0).a(bsa.v, 1.0);
   }

   @Nullable
   @Override
   protected aun v() {
      return auo.jG;
   }

   @Nullable
   @Override
   protected aun d(boy $$0) {
      return auo.jJ;
   }

   @Nullable
   @Override
   protected aun o_() {
      return auo.jH;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.jM, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(esj $$0) {
      if (this.cX() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bqy.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bqt $$0) {
      if ($$0 instanceof chp $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.ai().a(avh.n);
   }

   @Override
   protected cae b(czg $$0) {
      return new cec.c(this, $$0);
   }

   @Override
   public boolean o(crs $$0) {
      return bX.a($$0);
   }

   public static boolean c(bqg<? extends cci> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.a_($$3.d()).a(ave.ca) && a($$1, $$3);
   }

   class a extends bws {
      a(bqv $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cec.this.u().isEmpty();
      }
   }

   static class b extends elk {
      private final id.a l = new id.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eln a() {
         return !this.b.bc() ? super.a() : this.c(new id(axm.a(this.b.cH().a), axm.a(this.b.cH().b), axm.a(this.b.cH().c)));
      }

      @Override
      public els a(elu $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dpi $$4 = $$0.a(this.l);
         return $$4.a(ave.bL) ? els.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cab {
      c(cec $$0, czg $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(els $$0) {
         return $$0 != els.k && super.b($$0);
      }

      @Override
      protected elr a(int $$0) {
         this.o = new cec.b(true);
         this.o.a(true);
         return new elr(this.o, $$0);
      }
   }
}
