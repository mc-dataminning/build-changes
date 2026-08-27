import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgn extends cfg {
   private static final String b = "Johnny";
   static final Predicate<bmz> e = $$0 -> $$0 == bmz.c || $$0 == bmz.d;
   boolean bX;

   public cgn(bpc<? extends cgn> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bwf(this));
      this.bR.a(1, new cgn.a(this));
      this.bR.a(2, new cfg.b(this));
      this.bR.a(3, new cke.a(this, 10.0F));
      this.bR.a(4, new bwv(this, 1.0, false));
      this.bS.a(1, new byd(this, cke.class).a());
      this.bS.a(2, new bye<>(this, cis.class, true));
      this.bS.a(3, new bye<>(this, cia.class, true));
      this.bS.a(3, new bye<>(this, cbp.class, true));
      this.bS.a(4, new cgn.b(this));
      this.bR.a(8, new bxi(this, 0.6));
      this.bR.a(9, new bwt(this, cis.class, 3.0F, 1.0F));
      this.bR.a(10, new bwt(this, bpq.class, 8.0F));
   }

   @Override
   protected void Y() {
      if (!this.gd() && caj.a(this)) {
         boolean $$0 = ((apf)this.dM()).e(this.dm());
         ((byy)this.K()).b($$0);
      }

      super.Y();
   }

   public static bqu.a s() {
      return cfy.gt().a(bqv.r, 0.35F).a(bqv.k, 12.0).a(bqv.q, 24.0).a(bqv.c, 5.0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      if (this.bX) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cfg.a r() {
      if (this.gf()) {
         return cfg.a.b;
      } else {
         return this.gE() ? cfg.a.g : cfg.a.a;
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
      return aty.AI;
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      bqg $$4 = super.a($$0, $$1, $$2, $$3);
      ((byy)this.K()).b(true);
      axd $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(axd $$0, bna $$1) {
      if (this.gB() == null) {
         this.a(bpd.a, new cqk(cqn.pc));
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
      return aty.AH;
   }

   @Override
   protected atx n_() {
      return aty.AJ;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.AK;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cqk $$2 = new cqk(cqn.pc);
      ckd $$3 = this.gB();
      int $$4 = 1;
      if ($$0 > $$3.a(bmz.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         $$2.a(cux.n, $$4);
      }

      this.a(bpd.a, $$2);
   }

   static class a extends bvv {
      public a(bpq $$0) {
         super($$0, 6, cgn.e);
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public boolean b() {
         cgn $$0 = (cgn)this.d;
         return $$0.gC() && super.b();
      }

      @Override
      public boolean a() {
         cgn $$0 = (cgn)this.d;
         return $$0.gC() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends bye<bpo> {
      public b(cgn $$0) {
         super($$0, bpo.class, 0, true, true, bpo::fE);
      }

      @Override
      public boolean a() {
         return ((cgn)this.e).bX && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
