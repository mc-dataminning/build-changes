import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cho extends cgg {
   private static final String b = "Johnny";
   static final Predicate<bnx> e = $$0 -> $$0 == bnx.c || $$0 == bnx.d;
   boolean bX;

   public cho(bqb<? extends cho> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxf(this));
      this.bR.a(1, new cho.a(this));
      this.bR.a(2, new cgg.b(this));
      this.bR.a(3, new clf.a(this, 10.0F));
      this.bR.a(4, new bxv(this, 1.0, false));
      this.bS.a(1, new bzd(this, clf.class).a());
      this.bS.a(2, new bze<>(this, cjt.class, true));
      this.bS.a(3, new bze<>(this, cjb.class, true));
      this.bS.a(3, new bze<>(this, ccp.class, true));
      this.bS.a(4, new cho.b(this));
      this.bR.a(8, new byi(this, 0.6));
      this.bR.a(9, new bxt(this, cjt.class, 3.0F, 1.0F));
      this.bR.a(10, new bxt(this, bqq.class, 8.0F));
   }

   @Override
   protected void Y() {
      if (!this.gd() && cbj.a(this)) {
         boolean $$0 = ((aps)this.dM()).e(this.dm());
         ((bzy)this.K()).b($$0);
      }

      super.Y();
   }

   public static bru.a u() {
      return cgz.gt().a(brv.r, 0.35F).a(brv.k, 12.0).a(brv.q, 24.0).a(brv.c, 5.0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      if (this.bX) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cgg.a r() {
      if (this.gf()) {
         return cgg.a.b;
      } else {
         return this.gE() ? cgg.a.g : cgg.a.a;
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bX = $$0.q("Johnny");
      }
   }

   @Override
   public aul ae_() {
      return aum.AQ;
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      brg $$4 = super.a($$0, $$1, $$2, $$3);
      ((bzy)this.K()).b(true);
      axr $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(axr $$0, bny $$1) {
      if (this.gB() == null) {
         this.a(bqc.a, new crj(crm.pc));
      }
   }

   @Override
   public void b(@Nullable wg $$0) {
      super.b($$0);
      if (!this.bX && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bX = true;
      }
   }

   @Override
   protected aul v() {
      return aum.AP;
   }

   @Override
   protected aul o_() {
      return aum.AR;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.AS;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      crj $$2 = new crj(crm.pc);
      cle $$3 = this.gB();
      int $$4 = 1;
      if ($$0 > $$3.a(bnx.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         $$2.a(cwt.n, $$4);
      }

      this.a(bqc.a, $$2);
   }

   static class a extends bwv {
      public a(bqq $$0) {
         super($$0, 6, cho.e);
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean b() {
         cho $$0 = (cho)this.d;
         return $$0.gC() && super.b();
      }

      @Override
      public boolean a() {
         cho $$0 = (cho)this.d;
         return $$0.gC() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends bze<bqo> {
      public b(cho $$0) {
         super($$0, bqo.class, 0, true, true, bqo::fE);
      }

      @Override
      public boolean a() {
         return ((cho)this.e).bX && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
