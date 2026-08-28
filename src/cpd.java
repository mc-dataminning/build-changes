import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpd extends cnu {
   private static final String a = "Johnny";
   static final Predicate<bud> b = $$0 -> $$0 == bud.c || $$0 == bud.d;
   boolean bG;

   public cpd(bwr<? extends cpd> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cdm<>(this, cps.class, 8.0F, 1.0, 1.2));
      this.bD.a(2, new cpd.a(this));
      this.bD.a(3, new cnu.b(this));
      this.bD.a(4, new ctd.a(this, 10.0F));
      this.bD.a(5, new cep(this, 1.0, false));
      this.bE.a(1, new cfx(this, ctd.class).a());
      this.bE.a(2, new cfy<>(this, crm.class, true));
      this.bE.a(3, new cfy<>(this, cqt.class, true));
      this.bE.a(3, new cfy<>(this, cjp.class, true));
      this.bE.a(4, new cpd.b(this));
      this.bD.a(8, new cfc(this, 0.6));
      this.bD.a(9, new cen(this, crm.class, 3.0F, 1.0F));
      this.bD.a(10, new cen(this, bxl.class, 8.0F));
   }

   @Override
   protected void a(arq $$0) {
      if (!this.gi() && cid.a(this)) {
         boolean $$1 = $$0.e(this.du());
         ((cgs)this.O()).b($$1);
      }

      super.a($$0);
   }

   public static byo.a m() {
      return coo.gw().a(byp.v, 0.35F).a(byp.m, 12.0).a(byp.s, 24.0).a(byp.c, 5.0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.bG) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cnu.a j() {
      if (this.gk()) {
         return cnu.a.b;
      } else {
         return this.gJ() ? cnu.a.g : cnu.a.a;
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bG = $$0.o("Johnny");
      }
   }

   @Override
   public awm ae_() {
      return awn.Cr;
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      byb $$4 = super.a($$0, $$1, $$2, $$3);
      ((cgs)this.O()).b(true);
      azv $$5 = $$0.C_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      if (this.gE() == null) {
         this.a(bws.a, new czn(czr.pS));
      }
   }

   @Override
   public void b(@Nullable wy $$0) {
      super.b($$0);
      if (!this.bG && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bG = true;
      }
   }

   @Override
   protected awm u() {
      return awn.Cq;
   }

   @Override
   protected awm l_() {
      return awn.Cs;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.Ct;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
      czn $$3 = new czn(czr.pS);
      ctc $$4 = this.gE();
      boolean $$5 = this.ae.i() <= $$4.s();
      if ($$5) {
         alf<dhi> $$6 = $$1 > $$4.a(bud.c) ? dho.f : dho.e;
         dgc.a($$3, $$0.F_(), $$6, $$0.d_(this.du()), this.ae);
      }

      this.a(bws.a, $$3);
   }

   static class a extends cdp {
      public a(bxl $$0) {
         super($$0, 6, cpd.b);
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean c() {
         cpd $$0 = (cpd)this.d;
         return $$0.gH() && super.c();
      }

      @Override
      public boolean b() {
         cpd $$0 = (cpd)this.d;
         return $$0.gH() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cfy<bxj> {
      public b(cpd $$0) {
         super($$0, bxj.class, 0, true, true, ($$0x, $$1) -> $$0x.fL());
      }

      @Override
      public boolean b() {
         return ((cpd)this.e).bG && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
