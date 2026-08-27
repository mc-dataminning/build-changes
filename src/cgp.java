import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgp extends cfh {
   private static final String b = "Johnny";
   static final Predicate<bna> e = $$0 -> $$0 == bna.c || $$0 == bna.d;
   boolean bX;

   public cgp(bpd<? extends cgp> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bwg(this));
      this.bR.a(1, new cgp.a(this));
      this.bR.a(2, new cfh.b(this));
      this.bR.a(3, new ckg.a(this, 10.0F));
      this.bR.a(4, new bww(this, 1.0, false));
      this.bS.a(1, new bye(this, ckg.class).a());
      this.bS.a(2, new byf<>(this, ciu.class, true));
      this.bS.a(3, new byf<>(this, cic.class, true));
      this.bS.a(3, new byf<>(this, cbq.class, true));
      this.bS.a(4, new cgp.b(this));
      this.bR.a(8, new bxj(this, 0.6));
      this.bR.a(9, new bwu(this, ciu.class, 3.0F, 1.0F));
      this.bR.a(10, new bwu(this, bpr.class, 8.0F));
   }

   @Override
   protected void Y() {
      if (!this.gd() && cak.a(this)) {
         boolean $$0 = ((apf)this.dM()).e(this.dm());
         ((byz)this.K()).b($$0);
      }

      super.Y();
   }

   public static bqv.a s() {
      return cga.gt().a(bqw.r, 0.35F).a(bqw.k, 12.0).a(bqw.q, 24.0).a(bqw.c, 5.0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      if (this.bX) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cfh.a r() {
      if (this.gf()) {
         return cfh.a.b;
      } else {
         return this.gE() ? cfh.a.g : cfh.a.a;
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bX = $$0.q("Johnny");
      }
   }

   @Override
   public atx ae_() {
      return aty.AN;
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      bqh $$4 = super.a($$0, $$1, $$2, $$3);
      ((byz)this.K()).b(true);
      axd $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(axd $$0, bnb $$1) {
      if (this.gB() == null) {
         this.a(bpe.a, new cqm(cqp.pc));
      }
   }

   @Override
   public void b(@Nullable vu $$0) {
      super.b($$0);
      if (!this.bX && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bX = true;
      }
   }

   @Override
   protected atx v() {
      return aty.AM;
   }

   @Override
   protected atx n_() {
      return aty.AO;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.AP;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cqm $$2 = new cqm(cqp.pc);
      ckf $$3 = this.gB();
      int $$4 = 1;
      if ($$0 > $$3.a(bna.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         $$2.a(cuz.n, $$4);
      }

      this.a(bpe.a, $$2);
   }

   static class a extends bvw {
      public a(bpr $$0) {
         super($$0, 6, cgp.e);
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean b() {
         cgp $$0 = (cgp)this.d;
         return $$0.gC() && super.b();
      }

      @Override
      public boolean a() {
         cgp $$0 = (cgp)this.d;
         return $$0.gC() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends byf<bpp> {
      public b(cgp $$0) {
         super($$0, bpp.class, 0, true, true, bpp::fE);
      }

      @Override
      public boolean a() {
         return ((cgp)this.e).bX && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
