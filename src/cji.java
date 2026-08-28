import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cji extends cho implements bwx<jq<chz>> {
   protected static final ImmutableList<cgi<? extends cgh<? super cji>>> bZ = ImmutableList.of(cgi.c, cgi.f, cgi.v, cgi.s, cgi.w);
   protected static final ImmutableList<cfb<?>> ca = ImmutableList.of(
      cfb.n, cfb.g, cfb.h, cfb.m, cfb.E, cfb.t, cfb.r, cfb.S, cfb.T, cfb.o, cfb.O, cfb.P, new cfb[]{cfb.R, cfb.x, cfb.y, cfb.B, cfb.X, cfb.Y, cfb.Z, cfb.aa}
   );
   private static final aks<jq<chz>> ch = akw.a(cji.class, aku.z);
   private static final aks<OptionalInt> ci = akw.a(cji.class, aku.v);
   private static final int cj = 5;
   public static final String cb = "variant";
   private static final alo<chz> ck = chz.b;
   public final but cd = new but();
   public final but ce = new but();
   public final but cf = new but();
   public final but cg = new but();

   public cji(bvi<? extends cho> $$0, dgz $$1) {
      super($$0, $$1);
      this.bP = new cji.a(this);
      this.a(euh.j, 4.0F);
      this.a(euh.e, -1.0F);
      this.bQ = new cca(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bwz.b<cji> ed() {
      return bwz.a(ca, bZ);
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return cjj.a(this.ed().a($$0));
   }

   @Override
   public bwz<cji> ec() {
      return (bwz<cji>)super.ec();
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(ch, ma.aj.b(ck));
      $$0.a(ci, OptionalInt.empty());
   }

   public void p() {
      this.al.a(ci, OptionalInt.empty());
   }

   public Optional<bvb> t() {
      return this.al.a(ci).stream().mapToObj(this.dW()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bvb $$0) {
      this.al.a(ci, OptionalInt.of($$0.ar()));
   }

   @Override
   public int ac() {
      return 35;
   }

   @Override
   public int aa() {
      return 5;
   }

   public jq<chz> x() {
      return this.al.a(ch);
   }

   public void j(jq<chz> $$0) {
      this.al.a(ch, $$0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("variant", this.x().e().orElse(ck).a().toString());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      Optional.ofNullable(alp.c($$0.l("variant"))).map($$0x -> alo.a(mb.F, $$0x)).flatMap(ma.aj::a).ifPresent(this::j);
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("frogBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cjj.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dW().B_()) {
         this.cg.a(this.bm() && !this.aT.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(aks<?> $$0) {
      if (aq.equals($$0)) {
         bwj $$1 = this.aw();
         if ($$1 == bwj.g) {
            this.cd.a(this.af);
         } else {
            this.cd.a();
         }

         if ($$1 == bwj.i) {
            this.ce.a(this.af);
         } else {
            this.ce.a();
         }

         if ($$1 == bwj.j) {
            this.cf.a(this.af);
         } else {
            this.cf.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.cd.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aT.a($$1, 0.4F, this.e_() ? 3.0F : 1.0F);
   }

   @Override
   public void gu() {
      this.dW().a(null, this, awv.kn, aww.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      cji $$2 = bvi.ac.a($$0, bvh.e);
      if ($$2 != null) {
         cjj.a($$2, $$0.H_());
      }

      return $$2;
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(arx $$0, cho $$1) {
      this.a($$0, $$1, null);
      this.ec().a(cfb.Y, bba.a);
   }

   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      jq<dib> $$4 = $$0.t(this.dw());
      if ($$4.a(axj.ai)) {
         this.j(ma.aj.b(chz.d));
      } else if ($$4.a(axj.aj)) {
         this.j(ma.aj.b(chz.c));
      } else {
         this.j(ma.aj.b(ck));
      }

      cjj.a(this, $$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxe.a go() {
      return cho.gt().a(bxf.v, 1.0).a(bxf.s, 10.0).a(bxf.c, 10.0).a(bxf.B, 1.0);
   }

   @Nullable
   @Override
   protected awu u() {
      return awv.kl;
   }

   @Nullable
   @Override
   protected awu e(btr $$0) {
      return awv.ko;
   }

   @Nullable
   @Override
   protected awu o_() {
      return awv.km;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.kr, 0.15F, 1.0F);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 5;
   }

   @Override
   public void a_(fbr $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bwb.a, this.dz());
         this.h(this.dz().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bvx $$0) {
      if ($$0 instanceof cmx $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.aq().a(axo.n);
   }

   @Override
   protected cfj b(dgz $$0) {
      return new cji.c(this, $$0);
   }

   @Nullable
   @Override
   public bvx O_() {
      return this.O();
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.aq);
   }

   public static boolean c(bvi<? extends cho> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.a_($$3.e()).a(axk.ci) && a($$1, $$3);
   }

   class a extends cbx {
      a(final bvz $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cji.this.t().isEmpty();
      }
   }

   static class b extends etz {
      private final jh.a a = new jh.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public euc a() {
         return !this.c.bj() ? super.a() : this.c(new jh(azu.a(this.c.cR().a), azu.a(this.c.cR().b), azu.a(this.c.cR().c)));
      }

      @Override
      public euh a(euj $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dxo $$4 = $$0.a(this.a);
         return $$4.a(axk.bT) ? euh.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cfg {
      c(cji $$0, dgz $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(euh $$0) {
         return $$0 != euh.k && super.b($$0);
      }

      @Override
      protected eug a(int $$0) {
         this.o = new cji.b(true);
         this.o.a(true);
         return new eug(this.o, $$0);
      }
   }
}
