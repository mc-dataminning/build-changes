import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnd extends clv {
   private static final String a = "Johnny";
   static final Predicate<bsx> b = $$0 -> $$0 == bsx.c || $$0 == bsx.d;
   boolean bZ;

   public cnd(bvi<? extends cnd> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new ccc<>(this, cns.class, 8.0F, 1.0, 1.2));
      this.bT.a(2, new cnd.a(this));
      this.bT.a(3, new clv.b(this));
      this.bT.a(4, new crc.a(this, 10.0F));
      this.bT.a(5, new cdf(this, 1.0, false));
      this.bU.a(1, new cen(this, crc.class).a());
      this.bU.a(2, new ceo<>(this, cpo.class, true));
      this.bU.a(3, new ceo<>(this, cov.class, true));
      this.bU.a(3, new ceo<>(this, cia.class, true));
      this.bU.a(4, new cnd.b(this));
      this.bT.a(8, new cds(this, 0.6));
      this.bT.a(9, new cdd(this, cpo.class, 3.0F, 1.0F));
      this.bT.a(10, new cdd(this, bvz.class, 8.0F));
   }

   @Override
   protected void a(arx $$0) {
      if (!this.gb() && cgt.a(this)) {
         boolean $$1 = $$0.e(this.dw());
         ((cfi)this.L()).b($$1);
      }

      super.a($$0);
   }

   public static bxe.a p() {
      return cmo.gt().a(bxf.v, 0.35F).a(bxf.m, 12.0).a(bxf.s, 24.0).a(bxf.c, 5.0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      if (this.bZ) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public clv.a m() {
      if (this.gd()) {
         return clv.a.b;
      } else {
         return this.gG() ? clv.a.g : clv.a.a;
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bZ = $$0.q("Johnny");
      }
   }

   @Override
   public awu ak_() {
      return awv.Cc;
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bwq $$4 = super.a($$0, $$1, $$2, $$3);
      ((cfi)this.L()).b(true);
      bac $$5 = $$0.H_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(bac $$0, bsy $$1) {
      if (this.gB() == null) {
         this.a(bvj.a, new cxg(cxk.pJ));
      }
   }

   @Override
   public void b(@Nullable xk $$0) {
      super.b($$0);
      if (!this.bZ && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bZ = true;
      }
   }

   @Override
   protected awu u() {
      return awv.Cb;
   }

   @Override
   protected awu o_() {
      return awv.Cd;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.Ce;
   }

   @Override
   public void a(arx $$0, int $$1, boolean $$2) {
      cxg $$3 = new cxg(cxk.pJ);
      crb $$4 = this.gB();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         alo<dey> $$6 = $$1 > $$4.a(bsx.c) ? dfe.f : dfe.e;
         dds.a($$3, $$0.K_(), $$6, $$0.d_(this.dw()), this.ae);
      }

      this.a(bvj.a, $$3);
   }

   static class a extends ccf {
      public a(bvz $$0) {
         super($$0, 6, cnd.b);
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean c() {
         cnd $$0 = (cnd)this.d;
         return $$0.gE() && super.c();
      }

      @Override
      public boolean b() {
         cnd $$0 = (cnd)this.d;
         return $$0.gE() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends ceo<bvx> {
      public b(cnd $$0) {
         super($$0, bvx.class, 0, true, true, ($$0x, $$1) -> $$0x.fM());
      }

      @Override
      public boolean b() {
         return ((cnd)this.e).bZ && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
