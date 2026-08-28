import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cop extends cng {
   private static final String a = "Johnny";
   static final Predicate<bty> b = $$0 -> $$0 == bty.c || $$0 == bty.d;
   boolean bF;

   public cop(bwm<? extends cop> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cds(this));
      this.bC.a(1, new cdf<>(this, cpe.class, 8.0F, 1.0, 1.2));
      this.bC.a(2, new cop.a(this));
      this.bC.a(3, new cng.b(this));
      this.bC.a(4, new cso.a(this, 10.0F));
      this.bC.a(5, new cei(this, 1.0, false));
      this.bD.a(1, new cfq(this, cso.class).a());
      this.bD.a(2, new cfr<>(this, cqy.class, true));
      this.bD.a(3, new cfr<>(this, cqf.class, true));
      this.bD.a(3, new cfr<>(this, cjg.class, true));
      this.bD.a(4, new cop.b(this));
      this.bC.a(8, new cev(this, 0.6));
      this.bC.a(9, new ceg(this, cqy.class, 3.0F, 1.0F));
      this.bC.a(10, new ceg(this, bxe.class, 8.0F));
   }

   @Override
   protected void a(arq $$0) {
      if (!this.gf() && chw.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((cgl)this.O()).b($$1);
      }

      super.a($$0);
   }

   public static byh.a m() {
      return cnz.gt().a(byi.v, 0.35F).a(byi.m, 12.0).a(byi.s, 24.0).a(byi.c, 5.0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.bF) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cng.a j() {
      if (this.gh()) {
         return cng.a.b;
      } else {
         return this.gG() ? cng.a.g : cng.a.a;
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bF = $$0.q("Johnny");
      }
   }

   @Override
   public awm ad_() {
      return awn.Co;
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      bxu $$4 = super.a($$0, $$1, $$2, $$3);
      ((cgl)this.O()).b(true);
      azv $$5 = $$0.C_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azv $$0, btz $$1) {
      if (this.gB() == null) {
         this.a(bwn.a, new cyy(czc.pP));
      }
   }

   @Override
   public void b(@Nullable wy $$0) {
      super.b($$0);
      if (!this.bF && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bF = true;
      }
   }

   @Override
   protected awm u() {
      return awn.Cn;
   }

   @Override
   protected awm l_() {
      return awn.Cp;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.Cq;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
      cyy $$3 = new cyy(czc.pP);
      csn $$4 = this.gB();
      boolean $$5 = this.ae.i() <= $$4.s();
      if ($$5) {
         alf<dgt> $$6 = $$1 > $$4.a(bty.c) ? dgz.f : dgz.e;
         dfn.a($$3, $$0.F_(), $$6, $$0.d_(this.dv()), this.ae);
      }

      this.a(bwn.a, $$3);
   }

   static class a extends cdi {
      public a(bxe $$0) {
         super($$0, 6, cop.b);
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean c() {
         cop $$0 = (cop)this.d;
         return $$0.gE() && super.c();
      }

      @Override
      public boolean b() {
         cop $$0 = (cop)this.d;
         return $$0.gE() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cfr<bxc> {
      public b(cop $$0) {
         super($$0, bxc.class, 0, true, true, ($$0x, $$1) -> $$0x.fL());
      }

      @Override
      public boolean b() {
         return ((cop)this.e).bF && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
