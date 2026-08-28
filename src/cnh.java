import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnh extends clz {
   private static final String a = "Johnny";
   static final Predicate<bsv> b = $$0 -> $$0 == bsv.c || $$0 == bsv.d;
   boolean bF;

   public cnh(bvi<? extends cnh> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new ccd<>(this, cnw.class, 8.0F, 1.0, 1.2));
      this.bC.a(2, new cnh.a(this));
      this.bC.a(3, new clz.b(this));
      this.bC.a(4, new crf.a(this, 10.0F));
      this.bC.a(5, new cdg(this, 1.0, false));
      this.bD.a(1, new ceo(this, crf.class).a());
      this.bD.a(2, new cep<>(this, cpr.class, true));
      this.bD.a(3, new cep<>(this, coy.class, true));
      this.bD.a(3, new cep<>(this, cib.class, true));
      this.bD.a(4, new cnh.b(this));
      this.bC.a(8, new cdt(this, 0.6));
      this.bC.a(9, new cde(this, cpr.class, 3.0F, 1.0F));
      this.bC.a(10, new cde(this, bwa.class, 8.0F));
   }

   @Override
   protected void a(ard $$0) {
      if (!this.gh() && cgu.a(this)) {
         boolean $$1 = $$0.e(this.du());
         ((cfj)this.O()).b($$1);
      }

      super.a($$0);
   }

   public static bxf.a m() {
      return cms.gv().a(bxg.v, 0.35F).a(bxg.m, 12.0).a(bxg.s, 24.0).a(bxg.c, 5.0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.bF) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public clz.a j() {
      if (this.gj()) {
         return clz.a.b;
      } else {
         return this.gI() ? clz.a.g : clz.a.a;
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bF = $$0.q("Johnny");
      }
   }

   @Override
   public avz ah_() {
      return awa.Cl;
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      bwr $$4 = super.a($$0, $$1, $$2, $$3);
      ((cfj)this.O()).b(true);
      azh $$5 = $$0.C_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azh $$0, bsw $$1) {
      if (this.gD() == null) {
         this.a(bvj.a, new cxh(cxl.pL));
      }
   }

   @Override
   public void b(@Nullable wp $$0) {
      super.b($$0);
      if (!this.bF && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bF = true;
      }
   }

   @Override
   protected avz u() {
      return awa.Ck;
   }

   @Override
   protected avz l_() {
      return awa.Cm;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.Cn;
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
      cxh $$3 = new cxh(cxl.pL);
      cre $$4 = this.gD();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         akt<dez> $$6 = $$1 > $$4.a(bsv.c) ? dff.f : dff.e;
         ddt.a($$3, $$0.F_(), $$6, $$0.d_(this.du()), this.ae);
      }

      this.a(bvj.a, $$3);
   }

   static class a extends ccg {
      public a(bwa $$0) {
         super($$0, 6, cnh.b);
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean c() {
         cnh $$0 = (cnh)this.d;
         return $$0.gG() && super.c();
      }

      @Override
      public boolean b() {
         cnh $$0 = (cnh)this.d;
         return $$0.gG() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cep<bvy> {
      public b(cnh $$0) {
         super($$0, bvy.class, 0, true, true, ($$0x, $$1) -> $$0x.fO());
      }

      @Override
      public boolean b() {
         return ((cnh)this.e).bF && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
