import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class coi extends cna {
   private static final String a = "Johnny";
   static final Predicate<btv> b = $$0 -> $$0 == btv.c || $$0 == btv.d;
   boolean bF;

   public coi(bwj<? extends coi> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new cdc<>(this, coy.class, 8.0F, 1.0, 1.2));
      this.bC.a(2, new coi.a(this));
      this.bC.a(3, new cna.b(this));
      this.bC.a(4, new csi.a(this, 10.0F));
      this.bC.a(5, new cef(this, 1.0, false));
      this.bD.a(1, new cfn(this, csi.class).a());
      this.bD.a(2, new cfo<>(this, cqs.class, true));
      this.bD.a(3, new cfo<>(this, cpz.class, true));
      this.bD.a(3, new cfo<>(this, cja.class, true));
      this.bD.a(4, new coi.b(this));
      this.bC.a(8, new ces(this, 0.6));
      this.bC.a(9, new ced(this, cqs.class, 3.0F, 1.0F));
      this.bC.a(10, new ced(this, bxb.class, 8.0F));
   }

   @Override
   protected void a(aro $$0) {
      if (!this.gf() && cht.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((cgi)this.O()).b($$1);
      }

      super.a($$0);
   }

   public static bye.a m() {
      return cnt.gt().a(byf.v, 0.35F).a(byf.m, 12.0).a(byf.s, 24.0).a(byf.c, 5.0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.bF) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cna.a j() {
      if (this.gh()) {
         return cna.a.b;
      } else {
         return this.gG() ? cna.a.g : cna.a.a;
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bF = $$0.q("Johnny");
      }
   }

   @Override
   public awk ad_() {
      return awl.Cl;
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      bxr $$4 = super.a($$0, $$1, $$2, $$3);
      ((cgi)this.O()).b(true);
      azt $$5 = $$0.C_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azt $$0, btw $$1) {
      if (this.gB() == null) {
         this.a(bwk.a, new cys(cyw.pN));
      }
   }

   @Override
   public void b(@Nullable ww $$0) {
      super.b($$0);
      if (!this.bF && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bF = true;
      }
   }

   @Override
   protected awk u() {
      return awl.Ck;
   }

   @Override
   protected awk l_() {
      return awl.Cm;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.Cn;
   }

   @Override
   public void a(aro $$0, int $$1, boolean $$2) {
      cys $$3 = new cys(cyw.pN);
      csh $$4 = this.gB();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         ald<dgn> $$6 = $$1 > $$4.a(btv.c) ? dgt.f : dgt.e;
         dfh.a($$3, $$0.F_(), $$6, $$0.d_(this.dv()), this.ae);
      }

      this.a(bwk.a, $$3);
   }

   static class a extends cdf {
      public a(bxb $$0) {
         super($$0, 6, coi.b);
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean c() {
         coi $$0 = (coi)this.d;
         return $$0.gE() && super.c();
      }

      @Override
      public boolean b() {
         coi $$0 = (coi)this.d;
         return $$0.gE() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cfo<bwz> {
      public b(coi $$0) {
         super($$0, bwz.class, 0, true, true, ($$0x, $$1) -> $$0x.fL());
      }

      @Override
      public boolean b() {
         return ((coi)this.e).bF && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
