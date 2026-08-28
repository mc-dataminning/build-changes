import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckq extends cji {
   private static final String b = "Johnny";
   static final Predicate<bqp> e = $$0 -> $$0 == bqp.c || $$0 == bqp.d;
   boolean bY;

   public ckq(bsy<? extends ckq> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new caf(this));
      this.bS.a(1, new ckq.a(this));
      this.bS.a(2, new cji.b(this));
      this.bS.a(3, new coh.a(this, 10.0F));
      this.bS.a(4, new cav(this, 1.0, false));
      this.bT.a(1, new ccd(this, coh.class).a());
      this.bT.a(2, new cce<>(this, cmv.class, true));
      this.bT.a(3, new cce<>(this, cmd.class, true));
      this.bT.a(3, new cce<>(this, cfp.class, true));
      this.bT.a(4, new ckq.b(this));
      this.bS.a(8, new cbi(this, 0.6));
      this.bS.a(9, new cat(this, cmv.class, 3.0F, 1.0F));
      this.bS.a(10, new cat(this, btp.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.gg() && cej.a(this)) {
         boolean $$0 = ((are)this.dP()).e(this.dp());
         ((ccy)this.K()).b($$0);
      }

      super.Z();
   }

   public static buu.a u() {
      return ckb.gw().a(buv.r, 0.35F).a(buv.k, 12.0).a(buv.q, 24.0).a(buv.c, 5.0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cji.a s() {
      if (this.gi()) {
         return cji.a.b;
      } else {
         return this.gJ() ? cji.a.g : cji.a.a;
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
   public avy ae_() {
      return avz.Bj;
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      bug $$4 = super.a($$0, $$1, $$2, $$3);
      ((ccy)this.K()).b(true);
      azf $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azf $$0, bqq $$1) {
      if (this.gE() == null) {
         this.a(bsz.a, new cun(cuq.pd));
      }
   }

   @Override
   public void b(@Nullable xo $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected avy v() {
      return avz.Bi;
   }

   @Override
   protected avy o_() {
      return avz.Bk;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.Bl;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cun $$2 = new cun(cuq.pd);
      cog $$3 = this.gE();
      int $$4 = 1;
      if ($$0 > $$3.a(bqp.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ah.i() <= $$3.v();
      if ($$5) {
         $$2.a(dab.n, $$4);
      }

      this.a(bsz.a, $$2);
   }

   static class a extends bzv {
      public a(btp $$0) {
         super($$0, 6, ckq.e);
         this.a(EnumSet.of(cal.a.a));
      }

      @Override
      public boolean b() {
         ckq $$0 = (ckq)this.d;
         return $$0.gH() && super.b();
      }

      @Override
      public boolean a() {
         ckq $$0 = (ckq)this.d;
         return $$0.gH() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends cce<btn> {
      public b(ckq $$0) {
         super($$0, btn.class, 0, true, true, btn::fH);
      }

      @Override
      public boolean a() {
         return ((ckq)this.e).bY && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
