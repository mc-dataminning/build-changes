import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckn extends cjf {
   private static final String b = "Johnny";
   static final Predicate<bqm> e = $$0 -> $$0 == bqm.c || $$0 == bqm.d;
   boolean bY;

   public ckn(bsv<? extends ckn> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cac(this));
      this.bS.a(1, new ckn.a(this));
      this.bS.a(2, new cjf.b(this));
      this.bS.a(3, new coe.a(this, 10.0F));
      this.bS.a(4, new cas(this, 1.0, false));
      this.bT.a(1, new cca(this, coe.class).a());
      this.bT.a(2, new ccb<>(this, cms.class, true));
      this.bT.a(3, new ccb<>(this, cma.class, true));
      this.bT.a(3, new ccb<>(this, cfm.class, true));
      this.bT.a(4, new ckn.b(this));
      this.bS.a(8, new cbf(this, 0.6));
      this.bS.a(9, new caq(this, cms.class, 3.0F, 1.0F));
      this.bS.a(10, new caq(this, btm.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.gg() && ceg.a(this)) {
         boolean $$0 = ((arb)this.dP()).e(this.dp());
         ((ccv)this.K()).b($$0);
      }

      super.Z();
   }

   public static bur.a u() {
      return cjy.gw().a(bus.r, 0.35F).a(bus.k, 12.0).a(bus.q, 24.0).a(bus.c, 5.0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cjf.a s() {
      if (this.gi()) {
         return cjf.a.b;
      } else {
         return this.gJ() ? cjf.a.g : cjf.a.a;
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public avv ae_() {
      return avw.Bj;
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      bud $$4 = super.a($$0, $$1, $$2, $$3);
      ((ccv)this.K()).b(true);
      azc $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azc $$0, bqn $$1) {
      if (this.gE() == null) {
         this.a(bsw.a, new cuk(cun.pd));
      }
   }

   @Override
   public void b(@Nullable xl $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected avv v() {
      return avw.Bi;
   }

   @Override
   protected avv o_() {
      return avw.Bk;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.Bl;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cuk $$2 = new cuk(cun.pd);
      cod $$3 = this.gE();
      int $$4 = 1;
      if ($$0 > $$3.a(bqm.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ah.i() <= $$3.v();
      if ($$5) {
         $$2.a(czy.n, $$4);
      }

      this.a(bsw.a, $$2);
   }

   static class a extends bzs {
      public a(btm $$0) {
         super($$0, 6, ckn.e);
         this.a(EnumSet.of(cai.a.a));
      }

      @Override
      public boolean b() {
         ckn $$0 = (ckn)this.d;
         return $$0.gH() && super.b();
      }

      @Override
      public boolean a() {
         ckn $$0 = (ckn)this.d;
         return $$0.gH() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends ccb<btk> {
      public b(ckn $$0) {
         super($$0, btk.class, 0, true, true, btk::fH);
      }

      @Override
      public boolean a() {
         return ((ckn)this.e).bY && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
